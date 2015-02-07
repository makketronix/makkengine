package com.makketronix.makkengine.makkobjects;

public class GLTextureObject{

//   // Constants
//   //--Constants--//
//    public final static int CHAR_START = 32;           // First Character (ASCII Code)
//    public final static int CHAR_END = 126;            // Last Character (ASCII Code)
//    public final static int CHAR_CNT = ( ( ( CHAR_END - CHAR_START ) + 1 ) + 1 );  // Character Count (Including Character to use for Unknown)
//
//    public final static int CHAR_NONE = 32;            // Character to Use for Unknown (ASCII Code)
//    public final static int CHAR_UNKNOWN = ( CHAR_CNT - 1 );  // Index of the Unknown Character
//
//    public final static int FONT_SIZE_MIN = 6;         // Minumum Font Size (Pixels)
//    public final static int FONT_SIZE_MAX = 180;       // Maximum Font Size (Pixels)
//
//    public final static int CHAR_BATCH_SIZE = 100;     // Number of Characters to Render Per Batch
//    
//    
//	   //--Constants--//
//	   final static int VERTEX_SIZE = 4;                  // Vertex Size (in Components) ie. (X,Y,U,V)
//	   final static int VERTICES_PER_SPRITE = 4;          // Vertices Per Sprite
//	   final static int INDICES_PER_SPRITE = 6;           // Indices Per Sprite
//    
//    TextureRegion textureRgn;                          // Full Texture Region
//    TextureRegion[] charRgn;                           // Region of Each Character (Texture Coordinates)
//
//    
//// Texture members
//   //--Members--//
//    GL10 gl;                                           // GL10 Instance
//    AssetManager assets;                               // Asset Manager
//
//    int fontPadX, fontPadY;                            // Font Padding (Pixels; On Each Side, ie. Doubled on Both X+Y Axis)
//
//    float fontHeight;                                  // Font Height (Actual; Pixels)
//    float fontAscent;                                  // Font Ascent (Above Baseline; Pixels)
//    float fontDescent;                                 // Font Descent (Below Baseline; Pixels)
//
//    int textureId;                                     // Font Texture ID [NOTE: Public for Testing Purposes Only!]
//    int textureSize;                                   // Texture Size for Font (Square) [NOTE: Public for Testing Purposes Only!]
//
//
//    float charWidthMax;                                // Character Width (Maximum; Pixels)
//    float charHeight;                                  // Character Height (Maximum; Pixels)
//    final float[] charWidths;                          // Width of Each Character (Actual; Pixels)
//
//	int cellWidth, cellHeight;                         // Character Cell Width/Height
//	int rowCnt, colCnt;                                // Number of Rows/Columns
//
//	float scaleX, scaleY;                              // Font Scale (X,Y Axis)
//	float spaceX;                                      // Additional (X,Y Axis) Spacing 
//
//	   
//
//	
//	/** Identifier */
//	public String TAG;
//	
//	/** Model Matrix */
//	public float[] MMatrix = new float[16];
//	
//	/** Vertices draw order length */
//	protected int drawOrderLength;
//	
//	/** Identifier int */
//	public int iTag;
//	
//	/** ViewPort * Projection */
//    public static float[] mVPMatrix = new float[16];
//    
//    /** Viewport Matrix */
//    public static float[] mViewMatrix = new float[16];
//    
//    /** Projection Matrix */
//    public static float[] mProjectionMatrix = new float[16];
//    
//	/** vertex Shader code goes here */
//    protected String vertexShaderCode;	
//    
//    /** fragment Shader code goes here */
//    protected String fragmentShaderCode;	
//    
//    /** Flag to indicate shader was compiled */
//    protected int isShaderPrepared;		  
//    
//    /** handle to a_Position in shader */
//    protected int ma_PositionHandle; 		
//    
//    /** handle to a_Texture if used */
//    protected int ma_TextureHandle;
//
//    /** handle to u_VPMatrix in shader */
//    protected int mu_VPMatrixHandle;
//    
//    /** handle to u_MMatrix */
//    protected int mu_MMatrixHandle;
//    
//    /** compiled program */
//    protected int mProgram; 
//    
//    /** compiled default program */
//    protected static int mDefaultProgram;
//    
//    /** compiled CustumProgram */
//    protected int mCustomProgram;
//    
//    /** Program type: Custom or not. 0 is Default. 1 is custom */
//    protected int programType;
//    
//	/** This is the handle to sampler 2D which should be loaded 1 time. */
//	protected int mu_TextureUniformHandle;
//	
//	/** This is a handle to our texture data, mCubeTextureCoordinates. */
//	protected int ma_TextureCoordinateHandle;
//	 
//	/** Size of the texture coordinate data in elements. 2D */
//	protected final int mTextureCoordinateDataSize = 2;
//	 
//	/** This is a handle to the texture location. Binding this to OPENGL will cause
//	 *  subsequent commands to affect the texture location bound by this handler.
//	 *  */
//	protected int mTextureDataHandle;
//	
//	/** This will indicate that object has to be rendered. Default is 1. This allows "turning off" objects */
//	public int renderThis = 1;
//		
//	/** Number of coordinates per vertices = 3 by deafult */
//	public final  int COORDS_PER_VERTEX = 3;
//	
//	/** Handle to draw order */
//	public int ma_drawOrderHandle;
//	
//	/** Buffers for position and texture, and order */
//	public int[] buffers = new int[3];
//	
//	private int isFirst = 0;
//	
//    // Set color for drawing the primitive
//    public float[] color;
//    
//    float dir = 1;
//    
//    int maxSprites;                                    // Maximum Sprites Allowed in Buffer
//    int numSprites;                                    // Number of Sprites Currently in Buffer
//    int bufferIndex;
//    int textureIndex;
//    int iIndex;
//    float vertices[];
//    short[] indices;
//    float textures[];
//   
//	
//	public GLTextureObject(GL10 gl, AssetManager assetManager){
//		maxSprites= 100;
//		numSprites = 0;
//		iIndex = 0;
//		bufferIndex = 0;
//		textureIndex = 0;
//		assets = assetManager;
//		this.gl = gl;
//
//	    charWidths = new float[CHAR_CNT];               // Create the Array of Character Widths
//
//	    // initialize remaining members
//	    fontPadX = 0;
//	    fontPadY = 0;
//
//	    fontHeight = 0.0f;
//	    fontAscent = 0.0f;
//	    fontDescent = 0.0f;
//
//	    textureId = -1;
//	    textureSize = 0;
//
//	    charWidthMax = 0;
//	    charHeight = 0;
//
//	    cellWidth = 0;
//	    cellHeight = 0;
//	    rowCnt = 0;
//	    colCnt = 0;
//
//	    scaleX = 1.0f;                                  // Default Scale = 1 (Unscaled)
//	    scaleY = 1.0f;                                  // Default Scale = 1 (Unscaled)
//	    spaceX = 0.0f;
//	    charRgn = new TextureRegion[CHAR_CNT];          // Create the Array of Character Regions
//		
//	}
//	
//	 /**
//     * This function will make the object use the common shader
//     * 
//     */
//    public void fillVShader(){
//    	
//    	Context  context = MainActivity.xt;
//    	vertexShaderCode = objUtility.readTextFileFromRawResource(context, R.raw.vertexcode_default);
//
//    }
//    
//    /**
//     * This function will make the object use the customn shader
//     * 
//     */
//    public void fillVShader(int resourceID){
//    	
//    	Context  context = MainActivity.xt;
//    	vertexShaderCode = objUtility.readTextFileFromRawResource(context, resourceID);
//
//    }
// 
//    /**
//     * This function will make the object use the common shader 
//     * 
//     */
//    public void fillFShader(){
//    	Context  context 	= MainActivity.xt;
//    	
//    	fragmentShaderCode 	= objUtility.readTextFileFromRawResource(context, R.raw.fragmentcode_default);
//
//    }
//    
//    /**
//     * This function will make the object use the common shader 
//     * 
//     */
//    public void fillFShader(int resourceID){
//    	Context  context = MainActivity.xt;
//    	fragmentShaderCode = objUtility.readTextFileFromRawResource(context, resourceID);
//
//    }
//    
//    
//    /** 
//     * This must be called before draw() or drawDefault() and after fill_x_Shaders if overloaded
//     * type 0 means default shader. Uses static program
//     * type 1 is custom shader.
//     * 
//     */
//    
//    public void prepareShader(int type){
//    
//    	
//    	if( type == 0 && mProgram > 0){          // was mProgram instead
//            	isShaderPrepared = 1;
//    			return;
//
//    	}
//    	programType = type;
//    	
//    	if( mDefaultProgram == 0){			// We compile if we haven't compiled yet.
//    													// NOTE: ONLY FOR DEFAULT SHADER> CUSTOM IS ALWAYS COMPILED
//	        int vertexShader = objUtility.compileShader(GLES20.GL_VERTEX_SHADER, vertexShaderCode);
//	        int fragmentShader = objUtility.compileShader(GLES20.GL_FRAGMENT_SHADER, fragmentShaderCode);
//	        
//	        
//	        if( type == 0){
//	        	String[] params = {"a_Position","a_TexCoordinate"};
//	        	mDefaultProgram = objUtility.createAndLinkProgram(vertexShader, fragmentShader, params);
//	       }
//	        else{
//	        	String[] params = {"a_Position","a_TexCoordinate"};
//	        	mCustomProgram = objUtility.createAndLinkTextureProgram(vertexShader, fragmentShader, params);
//             // create OpenGL program executables     	
//	        }
//    	}
//        isShaderPrepared = 1;
//        
//        // Try to create the buffers.
//        GLES20.glGenBuffers(buffers.length, buffers, 0);
//
//        ma_PositionHandle = buffers[0];
//
//        ma_TextureHandle = buffers[1];
//       
//        
//        // Empty the buffers.
//    //    enableDefaultArrays();
//    }
//    
//   public void drawSprite(float x, float y, float width, float height, float depth, TextureRegion region)  {
//	   	  
//	      if ( numSprites == maxSprites )  {              // IF Sprite Buffer is Full
//	    	                               	// Stop. Render only 100 chars.
//	         // NOTE: leave current texture bound!!
//	         numSprites = 0;                              // Empty Sprite Counter
//	         bufferIndex = 0;                             // Reset Buffer Index (Empty)
//	         textureIndex = 0;
//	         iIndex = 0;
//	         return;    
//	      }
//
//	      float halfWidth = width / 2.0f;                 // Calculate Half Width
//	      float halfHeight = height / 2.0f;               // Calculate Half Height
//	      float x1 = x - 1*halfWidth;                       // Calculate Left X
//	      float y1 = y - 1*halfHeight;                      // Calculate Bottom Y
//	      float x2 = x + halfWidth;                       // Calculate Right X
//	      float y2 = y + 1*halfHeight;                      // Calculate Top Y
//	     
//	      
//
//	//      vertices = new float[maxSprites * VERTICES_PER_SPRITE * VERTEX_SIZE];
//
//	 
//	      indices[iIndex++] = (short) (bufferIndex/3+0);
//	      indices[iIndex++] = (short) (bufferIndex/3+1);
//	      indices[iIndex++] = (short) (bufferIndex/3+2);
//	      indices[iIndex++] = (short) (bufferIndex/3+0);
//	      indices[iIndex++] = (short) (bufferIndex/3+2);
//	      indices[iIndex++] = (short) (bufferIndex/3+3);
//
//	      vertices[bufferIndex++] = x1/textureSize*1;               // Add X for Vertex 0
//	      vertices[bufferIndex++] = y1/textureSize*1;               // Add Y for Vertex 0
//	      vertices[bufferIndex++] = depth;
//	      textures[textureIndex++] = region.u1;        // Add U for Vertex 0
//	      textures[textureIndex++] = region.v2;        // Add V for Vertex 0
//
//
//	      vertices[bufferIndex++] = x2/textureSize*1;               // Add X for Vertex 1
//	      vertices[bufferIndex++] = y1/textureSize*1;               // Add Y for Vertex 1
//	      vertices[bufferIndex++] = depth;
//	      textures[textureIndex++] = region.u2;        // Add U for Vertex 0
//	      textures[textureIndex++] = region.v2;        // Add V for Vertex 0
//
//	      vertices[bufferIndex++] = x2/textureSize*1;               // Add X for Vertex 2
//	      vertices[bufferIndex++] = y2/textureSize*1;               // Add Y for Vertex 2
//	      vertices[bufferIndex++] = depth;
//	      textures[textureIndex++] = region.u2;        // Add U for Vertex 0
//	      textures[textureIndex++] = region.v1;        // Add V for Vertex 0
//
//	      vertices[bufferIndex++] = x1/textureSize*1;               // Add X for Vertex 3
//	      vertices[bufferIndex++] = y2/textureSize*1;               // Add Y for Vertex 3
//	      vertices[bufferIndex++] = depth;
//	      textures[textureIndex++] = region.u1;        // Add U for Vertex 0
//	      textures[textureIndex++] = region.v1;        // Add V for Vertex 0  
//	      
//	 /*     vertices[bufferIndex++] = x1/UIVars.width;               // Add X for Vertex 0
//	      vertices[bufferIndex++] = y1/UIVars.height*UIVars.ratio;               // Add Y for Vertex 0
//	      vertices[bufferIndex++] = depth;
//	      textures[textureIndex++] = region.u1;        // Add U for Vertex 0
//	      textures[textureIndex++] = region.v2;        // Add V for Vertex 0
//
//
//	      vertices[bufferIndex++] = x2/UIVars.width/UIVars.ratio;               // Add X for Vertex 1
//	      vertices[bufferIndex++] = y1/UIVars.height*UIVars.ratio;               // Add Y for Vertex 1
//	      vertices[bufferIndex++] = depth;
//	      textures[textureIndex++] = region.u2;        // Add U for Vertex 0
//	      textures[textureIndex++] = region.v2;        // Add V for Vertex 0
//
//	      vertices[bufferIndex++] = x2/UIVars.width/UIVars.ratio;               // Add X for Vertex 2
//	      vertices[bufferIndex++] = y2/UIVars.height;               // Add Y for Vertex 2
//	      vertices[bufferIndex++] = depth;
//	      textures[textureIndex++] = region.u2;        // Add U for Vertex 0
//	      textures[textureIndex++] = region.v1;        // Add V for Vertex 0
//
//	      vertices[bufferIndex++] = x1/UIVars.width;               // Add X for Vertex 3
//	      vertices[bufferIndex++] = y2/UIVars.height;               // Add Y for Vertex 3
//	      vertices[bufferIndex++] = depth;
//	      textures[textureIndex++] = region.u1;        // Add U for Vertex 0
//	      textures[textureIndex++] = region.v1;        // Add V for Vertex 0  */
//	      
//	      
//	//      vertices[bufferIndex++] = x1/UIVars.width;               // Add X for Vertex 0
//	//      vertices[bufferIndex++] = y1/UIVars.height;               // Add Y for Vertex 0
//	//      vertices[bufferIndex++] = depth;
//	//      textures[textureIndex++] = region.u1;        // Add U for Vertex 0
//	//      textures[textureIndex++] = region.v2;        // Add V for Vertex 0
////	      textures[textureIndex++] = region.u1;        // Add U for Vertex 0
////	  	  textures[textureIndex++] = region.v2;        // Add V for Vertex 0
//	      
//
//	//      vertices[bufferIndex++] = x1/UIVars.width;               // Add X for Vertex 1
//	//      vertices[bufferIndex++] = y2/UIVars.height;               // Add Y for Vertex 1
////	      vertices[bufferIndex++] = depth;
//	//      textures[textureIndex++] = region.u2;        // Add U for Vertex 1
//	//      textures[textureIndex++] = region.v2;        // Add V for Vertex 1
////	      textures[textureIndex++] = region.u1;        // Add U for Vertex 0
////	  	  textures[textureIndex++] = region.v1;        // Add V for Vertex 0
//
////	      vertices[bufferIndex++] =x2/UIVars.width;               // Add X for Vertex 2
////	      vertices[bufferIndex++] =y2/UIVars.height;               // Add Y for Vertex 2
////	      vertices[bufferIndex++] = depth;
//	//      textures[textureIndex++] = region.u2;        // Add U for Vertex 2
//	//      textures[textureIndex++] = region.v1;        // Add V for Vertex 2
////	      textures[textureIndex++] = region.u2;        // Add U for Vertex 0
////	  	  textures[textureIndex++] = region.v1;        // Add V for Vertex 0
//	  	  
////	      vertices[bufferIndex++] = x2/UIVars.width;               // Add X for Vertex 3
////	      vertices[bufferIndex++] = y1/UIVars.height;               // Add Y for Vertex 3
////	      vertices[bufferIndex++] = depth;
//	 //     textures[textureIndex++] = region.u1;        // Add U for Vertex 3
//	  //    textures[textureIndex++] = region.v1;        // Add V for Vertex 3
////	      textures[textureIndex++] = region.u2;        // Add U for Vertex 0
////	  	  textures[textureIndex++] = region.v2;        // Add V for Vertex 0
//	      
//	 //     bufferIndex = 0;
//	//      textureIndex = 0;
//	//      iIndex = 0;
//	      numSprites++;                                   // Increment Sprite Count
//	   }
//    
//    
//    public void setTextureData(String text, float x, float y, float depth){
//    	
//    	scaleX = 1f;
//    	scaleY = 1f;
//        float chrHeight = cellHeight * scaleY;          // Calculate Scaled Character Height
//        float chrWidth = cellWidth * scaleX;            // Calculate Scaled Character Width
//        int len = text.length();                        // Get String Length
//	    
//        vertices = new float[(len+1) * VERTICES_PER_SPRITE*3];
//        textures = new float[(len+1) * 4*2];
//        
//   //     vertices = new float[VERTICES_PER_SPRITE*3];
//  //      textures = new float[4*2];
//        
//        indices = new short[len*6+6];
//      //  indices = new short[6];
//        textureIndex = 0;
//        bufferIndex = 0;
//        iIndex = 0;
//        
//        
//        x += ( chrWidth / 2.0f ) - ( fontPadX * scaleX );  // Adjust Start X
//        y += ( chrHeight / 2.0f ) - ( fontPadY * scaleY );  // Adjust Start Y
//
//    //    x = 0;
//    //    drawSprite( 0, 0, UIVars.width, UIVars.height, 0f, this.textureRgn )	;
//        int kk = 0;
//        for ( int i = 0; i < len; i++ )  {              // FOR Each Character in String
//           int c = (int)text.charAt( i ) - CHAR_START;  // Calculate Character Index (Offset by First Char in Font)
//           if ( c < 0 || c >= CHAR_CNT )                // IF Character Not In Font
//              c = CHAR_UNKNOWN;                         // Set to Unknown Character Index
//     //      if(c > 0){
//        	 Log.e("k", Integer.toString(kk));
//        	 kk+=1;
//           	
//        	   drawSprite( x, y,chrWidth, chrHeight, 0, charRgn[c] );  // Draw the Character
//      //  	   drawSprite( x, y, chrWidth, chrHeight, depth, charRgn[c] );  // Draw the Character
//      //    }
//     //      float factor = (UIVars.ratio > 1)?UIVars.ratio:1/UIVars.ratio;
//     //      x += ( charWidths[c] + spaceX) * scaleX*1.0f+2;    // Advance X Position by Scaled Character Width
//            x += ( charWidths[c]+ spaceX) * scaleX*1.0f;
//           
//        }
//        
//  //      float vertices[] = {-0.0076000006f, -0.008400002f, 0.0f, 0.0604f, -0.008400002f, 0.0f, 0.0604f, 0.0836f, 0.0f, -0.0076000006f, 0.0836f, 0.0f, 0.024400001f, -0.008400002f, 0.0f, 0.0924f, -0.008400002f, 0.0f, 0.0924f, 0.0836f, 0.0f, 0.024400001f, 0.0836f, 0.0f};
//        
//  //      float textures[] = {0.46484375f, 0.35546875f, 0.52734375f, 0.35546875f, 0.52734375f, 0.26953125f, 0.46484375f, 0.26953125f, 0.796875f, 0.4453125f, 0.859375f, 0.4453125f, 0.859375f, 0.359375f, 0.796875f, 0.359375f};
//    //    short indices[] = {0, 1, 2, 0, 2, 3, 4, 5, 6, 4, 6, 7};
//    //    short indices[] = {4, 5, 6, 4, 6, 7, 0, 1, 2, 0, 2, 3};
//        /*  	float vertices[] = { 
//
//				-1f, -1f, 0f,
//				 1f, -1f, 0f, 
//				 1f, 1f, 0f,
//				 -1f, 1f, 0f
//    	};
//    	
//    	float textures[] = {
//                0.0f, 1.0f,
//                1.0f, 1.0f,
//                1.0f, 0.0f,
//                0.0f, 0.0f
//    	};
//    	
//    	short order[] = {0, 1, 2, 0, 2, 3}; */
//    	
//    	FloatBuffer verticesBuffer = objUtility.doTheBuffer(vertices);
//    	
//    	FloatBuffer texturesBuffer = objUtility.doTheBuffer(textures);
//    	ShortBuffer drawOrder = objUtility.doTheBuffer(indices);
//    	
//    	drawOrderLength = drawOrder.capacity();
//   	
//    	Matrix.setIdentityM(MMatrix, 0);
//    	
//    	GLES20.glBindTexture( GL10.GL_TEXTURE_2D, textureId );  // Bind Texture
//    	GLES20.glTexParameterf( GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MIN_FILTER, GL10.GL_NEAREST );  // Set Minification Filter
//    	GLES20.glTexParameterf( GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MAG_FILTER, GL10.GL_LINEAR );  // Set Magnification Filter
//    	GLES20.glTexParameterf( GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_WRAP_S, GL10.GL_CLAMP_TO_EDGE );  // Set U Wrapping
//    	GLES20.glTexParameterf( GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_WRAP_T, GL10.GL_CLAMP_TO_EDGE );  // Set V Wrapping
//    	
//        GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, buffers[0]);
//        GLES20.glBufferData(GLES20.GL_ARRAY_BUFFER, verticesBuffer.capacity()*4, verticesBuffer, GLES20.GL_DYNAMIC_DRAW);
//        GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, 0);
//        objUtility.checkGlError("11");
//        
//        GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, buffers[1]);
//        GLES20.glBufferData(GLES20.GL_ARRAY_BUFFER, texturesBuffer.capacity()*4, texturesBuffer, GLES20.GL_DYNAMIC_DRAW);
//        GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, 0);
//        objUtility.checkGlError("12");
//        
//        GLES20.glBindBuffer(GLES20.GL_ELEMENT_ARRAY_BUFFER, buffers[2]);
//        GLES20.glBufferData(GLES20.GL_ELEMENT_ARRAY_BUFFER, drawOrder.capacity()*2, drawOrder, GLES20.GL_DYNAMIC_DRAW);
//        GLES20.glBindBuffer(GLES20.GL_ELEMENT_ARRAY_BUFFER, 0);
//        
//
//        GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, 0);
//        GLES20.glBindBuffer(GLES20.GL_ELEMENT_ARRAY_BUFFER, 0);
//        objUtility.checkGlError("13");
//        gl.glBindTexture( GL10.GL_TEXTURE_2D, 0 );  // Bind Texture
//        
//    }
//    
//    /** This function will draw the vertices */
//    
//    public void draw(){
//    	
//    	if( isShaderPrepared == 0){
//    		Log.e("Primitive", "Illegal use of default shaders");
//    		return;
//    	}
//    	if( renderThis == 0){
//    		return;
//    	}
//
//      	mProgram = (programType == 0)? mDefaultProgram : mCustomProgram;
//      	 objUtility.checkGlError("1");
//        // Add program to OpenGL environment
//        GLES20.glUseProgram(mProgram);
//
//
//        // get handle to shape's transformation matrix
//        mu_VPMatrixHandle = GLES20.glGetUniformLocation(mProgram, "u_VPMatrix");
//        mu_MMatrixHandle = GLES20.glGetUniformLocation(mProgram, "u_MMatrix");
//        // enable textures
//        mu_TextureUniformHandle = GLES20.glGetUniformLocation(mProgram, "u_Texture");
//        
//
//        // Bind buffer, enable vertex attrib array and set how vao interprets buffer using vertex attrib pointer
//     	GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, buffers[0]);
//     	GLES20.glEnableVertexAttribArray(objUtility.aTexturePositionHandler);
//        GLES20.glVertexAttribPointer(
//        		objUtility.aTexturePositionHandler, COORDS_PER_VERTEX, // attribute, 3
//                GLES20.GL_FLOAT, false, // floats not normalized
//                12, 0);	 // stride = 3 vertices * 4 bytes per vertex, no offset    
//        
//    	
//     	GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, buffers[1]);
//     	GLES20.glEnableVertexAttribArray(objUtility.aTextureHandler);
//        GLES20.glVertexAttribPointer(
//        		objUtility.aTextureHandler, 2, // attribute, 3
//                GLES20.GL_FLOAT, false, // floats not normalized
//                8, 0);	 // stride = 2 vertices * 4 bytes per vertex, no offset    
//
//        
//        // Apply the projection and view transformation
//        GLES20.glUniformMatrix4fv(mu_VPMatrixHandle, 1, false, mVPMatrix, 0);
//        objUtility.checkGlError("9");
//
//        GLES20.glUniformMatrix4fv(mu_MMatrixHandle, 1, false, MMatrix,0);
//        objUtility.checkGlError("10");
//   
//        
//        // Set the active texture unit to texture unit 0.
//        GLES20.glActiveTexture(GLES20.GL_TEXTURE0);
//  //      gl.glBindTexture( GLES20.GL_TEXTURE_2D, mTextureDataHandle );  // Bind Texture
//        gl.glBindTexture( GLES20.GL_TEXTURE_2D, textureId );  // Bind Texture
//        
////        gl.glTexParameterf( GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MIN_FILTER, GL10.GL_NEAREST );  // Set Minification Filter
// //       gl.glTexParameterf( GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MAG_FILTER, GL10.GL_LINEAR );  // Set Magnification Filter
// //       gl.glTexParameterf( GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_WRAP_S, GL10.GL_CLAMP_TO_EDGE );  // Set U Wrapping
// //       gl.glTexParameterf( GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_WRAP_T, GL10.GL_CLAMP_TO_EDGE );  // Set V Wrapping
//      	// Tell the texture uniform sampler to use this texture in the shader by binding to texture unit 0.
//        GLES20.glUniform1i(mu_TextureUniformHandle, 0); 
//        
//        
//
//        GLES20.glEnable (GLES20.GL_BLEND);
//        GLES20.glBlendFunc (GLES20.GL_SRC_ALPHA, GLES20.GL_ONE_MINUS_SRC_ALPHA);
//  //      GLES20.glBlendFunc (GLES20.GL_ONE_MINUS_SRC_ALPHA, GLES20.GL_SRC_ALPHA); This makes alpha of 1 transparent!!
//        
//        
//        GLES20.glBindBuffer(GLES20.GL_ELEMENT_ARRAY_BUFFER, buffers[2]);
//        GLES20.glDrawElements(GLES20.GL_TRIANGLES, drawOrderLength, GLES20.GL_UNSIGNED_SHORT, 0);
//
//        GLES20.glDisable (GLES20.GL_BLEND);
//
//
//        GLES20.glBindBuffer(GLES20.GL_ELEMENT_ARRAY_BUFFER, 0);
//        GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER, 0);
//
//    }
//    
//    public void enableDefaultHandles(){
//        
//        // get handle to shape's transformation matrix
//        mu_VPMatrixHandle = GLES20.glGetUniformLocation(mProgram, "u_VPMatrix");
//        objUtility.checkGlError("glGetUniformLocation");
// 
//        mu_MMatrixHandle = GLES20.glGetUniformLocation(mProgram, "u_MMatrix");
//        objUtility.checkGlError("glGetUniformLocation_Model");	
//    	
//    }
//    
//    /** Enables handles to the texture stuff */
//    public void enableTextureHandles(){
//        mu_TextureUniformHandle = GLES20.glGetUniformLocation(mProgram, "u_Texture");
//        ma_TextureCoordinateHandle = GLES20.glGetAttribLocation(mProgram, "a_TexCoordinate");
//        
//        // Set the active texture unit to texture unit 0.
//        GLES20.glActiveTexture(GLES20.GL_TEXTURE0);
//        objUtility.checkGlError("1");	
//
//    	GLES20.glTexParameterf( GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MIN_FILTER, GL10.GL_NEAREST );  // Set Minification Filter
//    	GLES20.glTexParameterf( GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MAG_FILTER, GL10.GL_LINEAR );  // Set Magnification Filter
//    	GLES20.glTexParameterf( GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_WRAP_S, GL10.GL_CLAMP_TO_EDGE );  // Set U Wrapping
//    	GLES20.glTexParameterf( GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_WRAP_T, GL10.GL_CLAMP_TO_EDGE );  // Set V Wrapping
//        objUtility.checkGlError("2");	
//      	// Tell the texture uniform sampler to use this texture in the shader by binding to texture unit 0.
//        GLES20.glUniform1i(mu_TextureUniformHandle, 0); 
//        objUtility.checkGlError("3");	
//        
//  //    	FloatBuffer textBuffer = objUtility.doTheBuffer(CharTextureCoords);
//      	
//  //    	GLES20.glVertexAttribPointer(ma_TextureCoordinateHandle, mTextureCoordinateDataSize, GLES20.GL_FLOAT, false, 0, textBuffer);
//    	
//    	
//    }
//    
//    public boolean loadTextureFonts(String file, int size, int padX, int padY){
//    	
//        // setup requested values
//        fontPadX = padX;                                // Set Requested X Axis Padding
//        fontPadY = padY;                                // Set Requested Y Axis Padding
//
//        // load the font and setup paint instance for drawing
//        Typeface tf = Typeface.createFromAsset( assets, file );  // Create the Typeface from Font File
//        Paint paint = new Paint();                      // Create Android Paint Instance
//        paint.setAntiAlias( true );                     // Enable Anti Alias
//        paint.setTextSize(size );                      // Set Text Size
//        paint.setColor( 0xffffffff );                   // Set ARGB (White, Opaque)
//        paint.setTypeface( tf );                        // Set Typeface
//
//        // get font metrics
//        Paint.FontMetrics fm = paint.getFontMetrics();  // Get Font Metrics
//        fontHeight = (float)Math.ceil( Math.abs( fm.bottom ) + Math.abs( fm.top ) );  // Calculate Font Height
//        fontAscent = (float)Math.ceil( Math.abs( fm.ascent ) );  // Save Font Ascent
//        fontDescent = (float)Math.ceil( Math.abs( fm.descent ) );  // Save Font Descent
//
//        // determine the width of each character (including unknown character)
//        // also determine the maximum character width
//        char[] s = new char[2];                         // Create Character Array
//        charWidthMax = charHeight = 0;                  // Reset Character Width/Height Maximums
//        float[] w = new float[2];                       // Working Width Value
//        int cnt = 0;                                    // Array Counter
//        for ( char c = CHAR_START; c <= CHAR_END; c++ )  {  // FOR Each Character
//           s[0] = c;                                    // Set Character
//           paint.getTextWidths( s, 0, 1, w );           // Get Character Bounds
//           charWidths[cnt] = w[0];                      // Get Width
//           if ( charWidths[cnt] > charWidthMax )        // IF Width Larger Than Max Width
//              charWidthMax = charWidths[cnt];           // Save New Max Width
//           cnt++;                                       // Advance Array Counter
//        }
//        s[0] = CHAR_NONE;                               // Set Unknown Character
//        paint.getTextWidths( s, 0, 1, w );              // Get Character Bounds
//        charWidths[cnt] = w[0];                         // Get Width
//        if ( charWidths[cnt] > charWidthMax )           // IF Width Larger Than Max Width
//           charWidthMax = charWidths[cnt];              // Save New Max Width
//        cnt++;                                          // Advance Array Counter
//
//        // set character height to font height
//        charHeight = fontHeight;                        // Set Character Height
//
//        // find the maximum size, validate, and setup cell sizes
//        cellWidth = (int)charWidthMax + ( 2 * fontPadX );  // Set Cell Width
//        cellHeight = (int)charHeight + ( 2 * fontPadY );  // Set Cell Height
//        int maxSize = cellWidth > cellHeight ? cellWidth : cellHeight;  // Save Max Size (Width/Height)
//        if ( maxSize < FONT_SIZE_MIN || maxSize > FONT_SIZE_MAX )  // IF Maximum Size Outside Valid Bounds
//           return false;                                // Return Error
//
//        // set texture size based on max font size (width or height)
//        // NOTE: these values are fixed, based on the defined characters. when
//        // changing start/end characters (CHAR_START/CHAR_END) this will need adjustment too!
//        if ( maxSize <= 24 )                            // IF Max Size is 18 or Less
//           textureSize = 256;                           // Set 256 Texture Size
//        else if ( maxSize <= 40 )                       // ELSE IF Max Size is 40 or Less
//           textureSize = 512;                           // Set 512 Texture Size
//        else if ( maxSize <= 80 )                       // ELSE IF Max Size is 80 or Less
//           textureSize = 1024;                          // Set 1024 Texture Size
//        else                                            // ELSE IF Max Size is Larger Than 80 (and Less than FONT_SIZE_MAX)
//           textureSize = 2048;                          // Set 2048 Texture Size
//
//        // create an empty bitmap (alpha only)
//        Bitmap bitmap = Bitmap.createBitmap( textureSize, textureSize, Bitmap.Config.ALPHA_8 );  // Create Bitmap
//        Canvas canvas = new Canvas( bitmap );           // Create Canvas for Rendering to Bitmap
//        bitmap.eraseColor( 0x11110000 );                // Set Transparent Background (ARGB)
//
//        // calculate rows/columns
//        // NOTE: while not required for anything, these may be useful to have :)
//        colCnt = textureSize / cellWidth;               // Calculate Number of Columns
//        rowCnt = (int)Math.ceil( (float)CHAR_CNT / (float)colCnt );  // Calculate Number of Rows
//
//        // render each of the characters to the canvas (ie. build the font map)
//        float x = fontPadX;                             // Set Start Position (X)
//        float y = ( cellHeight - 1 ) - fontDescent - fontPadY;  // Set Start Position (Y)
//        for ( char c = CHAR_START; c <= CHAR_END; c++ )  {  // FOR Each Character
//           s[0] = c;                                    // Set Character to Draw
//           canvas.drawText( s, 0, 1, x, y, paint );     // Draw Character
//           x += cellWidth;                              // Move to Next Character
//           if ( ( x + cellWidth - fontPadX ) > textureSize )  {  // IF End of Line Reached
//              x = fontPadX;                             // Set X for New Row
//              y += cellHeight;                          // Move Down a Row
//           }
//        }
//        s[0] = CHAR_NONE;                               // Set Character to Use for NONE
//        canvas.drawText( s, 0, 1, x, y, paint );        // Draw Character
//
//        // generate a new texture
//        int[] textureIds = new int[1];                  // Array to Get Texture Id
//        gl.glGenTextures( 1, textureIds, 0 );           // Generate New Texture
//        textureId = textureIds[0];                      // Save Texture Id
//
//        // setup filters for texture
//        gl.glBindTexture( GL10.GL_TEXTURE_2D, textureId );  // Bind Texture
//        gl.glTexParameterf( GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MIN_FILTER, GL10.GL_NEAREST );  // Set Minification Filter
//        gl.glTexParameterf( GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MAG_FILTER, GL10.GL_LINEAR );  // Set Magnification Filter
//        gl.glTexParameterf( GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_WRAP_S, GL10.GL_CLAMP_TO_EDGE );  // Set U Wrapping
//        gl.glTexParameterf( GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_WRAP_T, GL10.GL_CLAMP_TO_EDGE );  // Set V Wrapping
//
//        // load the generated bitmap onto the texture
//        GLUtils.texImage2D( GL10.GL_TEXTURE_2D, 0, bitmap, 0 );  // Load Bitmap to Texture
//        gl.glBindTexture( GL10.GL_TEXTURE_2D, 0 );      // Unbind Texture
//
//        // release the bitmap
//        bitmap.recycle();                               // Release the Bitmap
//
//        // setup the array of character texture regions
//        x = 0;                                          // Initialize X
//        y = 0;                                          // Initialize Y
//        for ( int c = 0; c < CHAR_CNT; c++ )  {         // FOR Each Character (On Texture)
//           charRgn[c] = new TextureRegion( textureSize, textureSize, x, y, cellWidth-1, cellHeight-1 );  // Create Region for Character
//           x += cellWidth;                              // Move to Next Char (Cell)
//           if ( x + cellWidth > textureSize )  {
//              x = 0;                                    // Reset X Position to Start
//              y += cellHeight;                          // Move to Next Row (Cell)
//           }
//        }
//
//        // create full texture region
//        textureRgn = new TextureRegion( textureSize, textureSize, 0, 0, textureSize, textureSize );  // Create Full Texture Region
//
//        // return success
//        return true;  
//    	
//    	
//    }
//    
//    
//    /**
//     * Disables handles to a_Position, a_TextureCoordinate
//     */
//    
//    public void disableDefaultArrays(){
//        // Disable vertex array
//        GLES20.glDisableVertexAttribArray(ma_PositionHandle);
//        GLES20.glDisableVertexAttribArray(ma_TextureCoordinateHandle);
//
//    	
//    	
//    }
//    
//    public void destroyBuffers(){
//    	GLES20.glDeleteBuffers(buffers.length, buffers, 0);
//    	
//    }
//    
//    public void clearShaderFlag(){
//    	isShaderPrepared = 0;
//    	mProgram = 0;
//
//    }
//    
//    public static void clearStaticShaders(){
//    	mDefaultProgram = 0;
//    	
//    }
//    
//	public int loadTexture( int resourceId) {
//		
//		// TODO Auto-generated method stub
//		// TODO Auto-generated method stub
//		final int[] textureHandle = new int[1];
//		GLES20.glGenTextures(1, textureHandle, 0); 
//		
//		if (textureHandle[0] != 0)
//	    {
//			
//			Context context = MainActivity.xt;
//	        final BitmapFactory.Options options = new BitmapFactory.Options();
//
//	        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), resourceId, options);
//	//        bitmap = objUtility.convertToMutable(context, bitmap);
//
//	 
//	        // Bind to the texture in OpenGL
//	        GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, textureHandle[0]);
//	 
//	        // Set filtering
//	        GLES20.glTexParameterf(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MIN_FILTER, GLES20.GL_LINEAR);
//	        GLES20.glTexParameterf(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MAG_FILTER, GLES20.GL_LINEAR);
//	 
//	        // Load the bitmap into the bound texture.
//	        GLUtils.texImage2D(GLES20.GL_TEXTURE_2D, 0, bitmap, 0);
//	 
//	        // Recycle the bitmap, since its data has been loaded into OpenGL.
//	        bitmap.recycle();
//	    }
//	 
//	    if (textureHandle[0] == 0)
//	    {
//	        throw new RuntimeException("Error loading texture.");
//	    }
//	 
//	    mTextureDataHandle = textureHandle[0];
//	    return textureHandle[0];
//	}
    
    

}
