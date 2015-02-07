package com.makketronix.makkengine.makkobjects;

import java.util.ArrayList;
import java.util.List;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;

import com.makketronix.makkengine.abstractobjects.MakkEnums;
import com.makketronix.makkengine.utils.objUtility;

public class MakkObject {
	
	/**
	 * When set to TRUE, sprites will change every x seconds.
	 */
	public MakkEnums autoSprite = MakkEnums.FALSE;
	
	/**
	 * Used for automatic sprite animation. autoSprite has to be true.
	 */
	public float animateDt = 0.0f;
	private float localDt;
	/**
	 * The physics parameters of the object
	 */
	public PhysicsObject mPhysics;
	//TODO make a list for sprite
	List<ShapeData> mShapeDataList = new ArrayList<ShapeData>();
	private int shapeIndex = 0;
	
	
	/** An Object Label
	 *  String label for the object.
	 *  */
	public String Label;
	

	/** This is static. ViewPort * Projection */
    public static float[] mVPMatrix = new float[16];
    
    /** Model Matrix */
    public float[] mMMatrix = new float[16];
    
    /** This is static. Projection Matrix */
    public static float[] mProjectionMatrix = new float[16];
    
	/** vertex Shader code goes here */
    public String vertexShaderCode;	
    
    /** fragment Shader code goes here */
    public String fragmentShaderCode;	
    
    /** Flag to indicate shader was compiled */
    public MakkEnums isShaderPrepared;		
    
    /** 
     * Position to u_LightPos in shader
     * Used in default shader
     *  */
    public int mu_LightPosHandle;
    
    /** 
     * handle to a_Position in shader.
     * Used in default shader
     *  */
    public int ma_PositionHandle; 		
    
    /** 
     * handle to a_Color.
     * Used in default shader */
    protected int ma_ColorHandle;
    
    /** 
     * handle to a_Texture.
     * Used in default shader
     *   */
    protected int ma_TextureHandle;
    
    /** handle to a_Normals.
     * Used in default shader. */
    protected int ma_NormalsHandle;
    
    /** handle to u_color.
     * Used in default shader */
    protected int mu_ColorHandle;
    
    /** handle to u_VPMatrix.
     * Used in default shader */
    protected int mu_VPMatrixHandle;
    
    /** handle to u_MMatrix
     * Used in default shader */
    protected int mu_MMatrixHandle;
    
    /** compiled program */
    protected int mProgram; 
    
    /** compiled default program */
    protected static int mDefaultProgram;
    
    /** compiled CustumProgram */
    protected int mCustomProgram;
    
    /** Program type: Custom or not. DEFAULT or CUSTOM */
    protected MakkEnums programType;
    
	/** This is the handle to sampler 2D which should be loaded 1 time.
	 * Used in default shader */
	protected int mu_TextureUniformHandle;
	
	/** This is a handle to our texture data, mCubeTextureCoordinates.
	 * Used in default shader */
	protected int ma_TextureCoordinateHandle;
	 
	/** Size of the texture coordinate data in elements. 2D */
	protected final int mTextureCoordinateDataSize = 2;
	 
	/** This is a handle to the texture location. Binding this to OPENGL will cause
	 *  subsequent commands to affect the texture location bound by this handler.
	 *  */
	protected int mTextureDataHandle;
	
	/** This will indicate that object has to be rendered. Default is TRUE.
	 *  This allows "turning off" objects */
	public MakkEnums renderThis = MakkEnums.TRUE;
		
	/** Number of coordinates per vertices = 3 by default */
	public final  int COORDS_PER_VERTEX = 3;
	
	/** Handle to draw order */
	public int ma_drawOrderHandle;
	
	/** Buffers for VICTIN (Vertices, , Indices, Colors,Textures, Ignore, Normals) */
	public int[] buffers = new int[5];
	
//	private int isFirst = 0;
	
    // Set color for drawing the primitive
    public float[] color;
    
    float dir = 1;

	public MakkObject() {

	}

	public void fillVShader(String shaderCode) {

		vertexShaderCode = shaderCode;		// Strings are immutable
	}

	public void fillFShader(String shaderCode) {

		fragmentShaderCode = shaderCode;		// Strings are immutable
	}

	/**
	 * Make sure to call fillVShader and fillFShader before using this.
	 */
	public void prepareShader() {
		
    int vertexShader = objUtility.compileShader(GLES20.GL_VERTEX_SHADER, vertexShaderCode);
    int fragmentShader = objUtility.compileShader(GLES20.GL_FRAGMENT_SHADER, fragmentShaderCode);
    
    String[] params = {"a_Position", "a_Color","a_Textures", "a_Normals"};
	mProgram = objUtility.createAndLinkProgram(vertexShader, fragmentShader, params);
	
    // Try to create the buffers.
    GLES20.glGenBuffers(buffers.length, buffers, 0);

    GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, buffers[0]);
    GLES20.glBufferData(
    		GLES20.GL_ARRAY_BUFFER, 
    		mShapeDataList.get(shapeIndex).verticesBuffer.capacity()*Float.SIZE/8, 
    		mShapeDataList.get(shapeIndex).verticesBuffer, 
    		GLES20.GL_STATIC_DRAW);
    GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, 0);
    ma_PositionHandle = buffers[0];
    
    GLES20.glBindBuffer(GLES20.GL_ELEMENT_ARRAY_BUFFER, buffers[1]);
    GLES20.glBufferData(
    		GLES20.GL_ELEMENT_ARRAY_BUFFER, 
    		mShapeDataList.get(shapeIndex).drawOrderBuffer.capacity()*Short.SIZE/8, 
    		mShapeDataList.get(shapeIndex).drawOrderBuffer, 
    		GLES20.GL_STATIC_DRAW);
    GLES20.glBindBuffer(GLES20.GL_ELEMENT_ARRAY_BUFFER, 0);
//       ma_drawOrderHandle = buffers[1];
    
    GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, buffers[2]);
    GLES20.glBufferData(
    		GLES20.GL_ARRAY_BUFFER, 
    		mShapeDataList.get(shapeIndex).colorsBuffer.capacity()*Float.SIZE/8, 
    		mShapeDataList.get(shapeIndex).colorsBuffer, 
    		GLES20.GL_STATIC_DRAW);
    GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, 0);
    ma_ColorHandle = buffers[2];
    
    GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, buffers[3]);
    GLES20.glBufferData(
    		GLES20.GL_ARRAY_BUFFER, 
    		mShapeDataList.get(shapeIndex).texturesBuffer.capacity()*Float.SIZE/8, 
    		mShapeDataList.get(shapeIndex).texturesBuffer, 
    		GLES20.GL_STATIC_DRAW);
    
    GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, 0);
//       ma_TextureHandle = buffers[3];
    
    GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, buffers[4]);
    GLES20.glBufferData(
    		GLES20.GL_ARRAY_BUFFER, 
    		mShapeDataList.get(shapeIndex).normalsBuffer.capacity()*Float.SIZE/8,
    		mShapeDataList.get(shapeIndex).normalsBuffer, GLES20.GL_STATIC_DRAW);
    
    GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, 0);
//       ma_NormalsHandle = buffers[4];
    
    GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, 0);
    GLES20.glBindBuffer(GLES20.GL_ELEMENT_ARRAY_BUFFER, 0);
		
	}
	
	/**
	 * If needed, you can override this function in order to create your
	 * own physics rules.
	 * This function does two things: 
	 * <b>simulate:</b>Updates position and velocity
	 * <b>draw():</b>Renders the object.
	 * 
	 * Draw is a public function. You will have to create your own simulate(dt) function.
	 * @param dt
	 */
	public void stepDt(float dt){
		simulate(dt);
		draw();
		localDt += dt;
		if(localDt >= animateDt){
			localDt = 0;
		}
		
	}

    private void simulate(float dt) {
    	mPhysics.updateAcceleration();
		mPhysics.updateVelocity(dt);
		mPhysics.updatePosition(dt);
		mPhysics.applyCrazyLogic(dt);
		Matrix.translateM(mMMatrix, 0, (float) mPhysics.x[0], (float) mPhysics.x[1], (float) mPhysics.x[2]);
	}
    
    public void setGLProgram(int program){
    	mProgram = program;
    }

	public void draw(){
    	
		if( renderThis == MakkEnums.FALSE){		// Turned off
    		return;
    	}
        // Add program to OpenGL environment
        GLES20.glUseProgram(mProgram);
        
        // TODO: These should be only for the default shader
        // TODO: If it is a custom program, call a registered callback
        enableDefaultHandles();

     	GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, buffers[0]);
     	GLES20.glEnableVertexAttribArray(objUtility.aPositionHandler);
        // Prepare the primitive's coordinate data
        GLES20.glVertexAttribPointer(
        		objUtility.aPositionHandler, COORDS_PER_VERTEX, // attribute, 3
                GLES20.GL_FLOAT, false, // floats not normalized
                12, 0);	 // stride = 3 vertices * 4 bytes per vertex, no offset     

 //   	GLES20.glEnableVertexAttribArray(ma_PositionHandle);
    	
     	GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, buffers[2]);
     	GLES20.glEnableVertexAttribArray(objUtility.aColorHandler);
        // Prepare the primitive's coordinate data
        GLES20.glVertexAttribPointer(
        		objUtility.aColorHandler, COORDS_PER_VERTEX, // attribute, 3
                GLES20.GL_FLOAT, false, // floats not normalized
                12, 0);	 // stride = 3 vertices * 4 bytes per vertex, no offset     

        // Apply the projection and view transformation
        GLES20.glUniformMatrix4fv(mu_VPMatrixHandle, 1, false, mVPMatrix, 0);

        GLES20.glUniformMatrix4fv(mu_MMatrixHandle, 1, false, mMMatrix,0);
        
        // Set the default light position
        GLES20.glUniform3fv(mu_LightPosHandle, 1, mShapeDataList.get(shapeIndex).LightPos,0);


        GLES20.glBindBuffer(GLES20.GL_ELEMENT_ARRAY_BUFFER, buffers[1]);
        GLES20.glDrawElements(GLES20.GL_TRIANGLES, mShapeDataList.get(shapeIndex).drawOrderLength, GLES20.GL_UNSIGNED_SHORT, 0);

        GLES20.glBindBuffer(GLES20.GL_ELEMENT_ARRAY_BUFFER, 0);
        GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, 0);
        
        // Disable vertex array
	//    GLES20.glDisableVertexAttribArray(ma_PositionHandle);

    }
    
    public void enableDefaultHandles(){
        // get handle to light position
        mu_LightPosHandle = GLES20.glGetUniformLocation(mProgram, "u_LightPos");
        objUtility.checkGlError("u_LightPos");	

        
        // get handle to vertex shader's a_Position member
//        ma_PositionHandle 	= GLES20.glGetAttribLocation(mProgram, "a_Position");
        
        // get handle to fragment shader's u_Color member
//        mu_ColorHandle = GLES20.glGetUniformLocation(mProgram, "u_Color");
        
        // get handle to shape's transformation matrix
        mu_VPMatrixHandle = GLES20.glGetUniformLocation(mProgram, "u_VPMatrix");
        objUtility.checkGlError("glGetUniformLocation");
        
        
        mu_MMatrixHandle = GLES20.glGetUniformLocation(mProgram, "u_MMatrix");
        objUtility.checkGlError("glGetUniformLocation_Model");	
    	
    }
    
    /** Enables handles to the texture stuff */
    public void enableTextureHandles(){
 //       mu_TextureUniformHandle = GLES20.glGetUniformLocation(mProgram, "u_Texture");
  //      ma_TextureCoordinateHandle = GLES20.glGetAttribLocation(mProgram, "a_TexCoordinate");
        
        // Set the active texture unit to texture unit 0.
//        GLES20.glActiveTexture(GLES20.GL_TEXTURE0);

 //       GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_S, GLES20.GL_CLAMP_TO_EDGE);
 //       GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_T, GLES20.GL_CLAMP_TO_EDGE);
        
      	// Tell the texture uniform sampler to use this texture in the shader by binding to texture unit 0.
  //      GLES20.glUniform1i(mu_TextureUniformHandle, 0); 
        
    //  	FloatBuffer textBuffer = objUtility.doTheBuffer(mcubeTextureCoordinates);
      	
  //    	GLES20.glVertexAttribPointer(ma_TextureCoordinateHandle, mTextureCoordinateDataSize, GLES20.GL_FLOAT, false, 0, textBuffer);
    	
    	
    }
    
    /**
     * Disables handles to a_Position, a_TextureCoordinate
     */
    
    public void disableDefaultArrays(){
        // Disable vertex array
   //     GLES20.glDisableVertexAttribArray(ma_PositionHandle);
   //     GLES20.glDisableVertexAttribArray(ma_TextureCoordinateHandle);

    }
    
    public void destroyBuffers(){
    	GLES20.glDeleteBuffers(buffers.length, buffers, 0);
    	
    }
    
    public void clearShaderFlag(){
    	isShaderPrepared = MakkEnums.DEFAULT;
    	mProgram = 0;

    }
    
    public static void clearStaticShaders(){
    	mDefaultProgram = 0;
    	
    }
    
    public void setGLData(ShapeData data){
    	mShapeDataList.add(data);
    }
    
    public void setPhysics(PhysicsObject physicsObject){
    	mPhysics = physicsObject;
    }
    
    /**
     * Force sprite to be updated
     */
    public void nextSprite(){
    	shapeIndex = nextListItem(mShapeDataList, shapeIndex);
    }
    
    private int nextListItem(List list, int index){
    	int size = list.size();
    	index++;
    	if( index >= size){
    		index = 0;
    	}
    	return index;
    }
    
    public void resetMMatrix(){
    	for(int i = 0; i < mMMatrix.length; i++){
    		mMMatrix[i] = 0.0f;
    	}
    	mMMatrix[0] = 1.0f;
    	mMMatrix[5] = 1.0f;
    	mMMatrix[10] = 1.0f;
    	mMMatrix[15] = 1.0f;
    }
    
   }
