package com.makketronix.makkengine.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.MappedByteBuffer;
import java.nio.ShortBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;


import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.util.Log;

public class objUtility {
	
	private static final String TAG = "objUtility";
	public static final int aPositionHandler = 1;
	public static final int aNormalHandler = 4;
	public static final int aColorHandler = 2;
	
	public static final int aTextureHandler = 3;
	public static final int aTexturePositionHandler = 5;
	
    /**
     * Utility method for compiling a OpenGL shader.
     *
     * <p><strong>Note:</strong> When developing shaders, use the checkGlError()
     * method to debug shader coding errors.</p>
     *
     * @param type - Vertex or fragment shader type.
     * @param shaderCode - String containing the shader code.
     * @return - Returns an id for the shader.
     */
    public static int loadShader(int type, String shaderCode){

        // create a vertex shader type (GLES20.GL_VERTEX_SHADER)
        // or a fragment shader type (GLES20.GL_FRAGMENT_SHADER)
        int shader = GLES20.glCreateShader(type);

        // add the source code to the shader and compile it
        GLES20.glShaderSource(shader, shaderCode);
        GLES20.glCompileShader(shader);

        return shader;
    }
    
    /**
     * Utility method for debugging OpenGL calls. Provide the name of the call
     * just after making it:
     *
     * <pre>
     * mColorHandle = GLES20.glGetUniformLocation(mProgram, "vColor");
     * MyGLRenderer.checkGlError("glGetUniformLocation");</pre>
     *
     * If the operation is not successful, the check throws an error.
     *
     * @param glOperation - Name of the OpenGL call to check.
     */
     public static void checkGlError(String glOperation) {
         int error;

         while ((error = GLES20.glGetError()) != GLES20.GL_NO_ERROR) {
             Log.e(TAG , glOperation + ": glError " + error);
             throw new RuntimeException(glOperation + ": glError " + error);
         }
     }
     
     
     /**
      * Read file into string from resources
      * 
      */
     public static String readTextFileFromRawResource(final Context context,
             final int resourceId)
     {
         final InputStream inputStream = context.getResources().openRawResource(
                 resourceId);
         final InputStreamReader inputStreamReader = new InputStreamReader(
                 inputStream);
         final BufferedReader bufferedReader = new BufferedReader(
                 inputStreamReader);
  
         String nextLine;
         final StringBuilder body = new StringBuilder();
  
         try
         {
             while ((nextLine = bufferedReader.readLine()) != null)
             {
                 body.append(nextLine);
                 body.append('\n');
             }
         }
         catch (IOException e)
         {
             return null;
         }
  
         return body.toString();
     }
     
     
 	/**
     * Helper function to compile a shader.
     *
     * @param shaderType The shader type.
     * @param shaderSource The shader source code.
     * @return An OpenGL handle to the shader.
     */
     public static int compileShader(final int shaderType, final String shaderSource)
     {
    	 int shaderHandle = GLES20.glCreateShader(shaderType);

    	 if (shaderHandle != 0)
    	 {
		     // Pass in the shader source.
		     GLES20.glShaderSource(shaderHandle, shaderSource);

		     // Compile the shader.
		     GLES20.glCompileShader(shaderHandle);

		     // Get the compilation status.
		     final int[] compileStatus = new int[1];
		     GLES20.glGetShaderiv(shaderHandle, GLES20.GL_COMPILE_STATUS, compileStatus, 0);

		     // If the compilation failed, delete the shader.
		     if (compileStatus[0] == 0)
		     {
			     Log.e(TAG, "Error compiling shader: " + GLES20.glGetShaderInfoLog(shaderHandle));
			     GLES20.glDeleteShader(shaderHandle);
			     shaderHandle = 0;
			 }
    	 }

	     if (shaderHandle == 0)
	     {	
	    	 throw new RuntimeException("Error creating shader.");
	     }

	     return shaderHandle;
     }
     
 	/**
     * Helper function to compile and link a program.
     *
     * @param vertexShaderHandle An OpenGL handle to an already-compiled vertex shader.
     * @param fragmentShaderHandle An OpenGL handle to an already-compiled fragment shader.
     * @param attributes Attributes that need to be bound to the program.
     * @return An OpenGL handle to the program.
     */
     
 	public static int createAndLinkProgram(final int vertexShaderHandle, final int fragmentShaderHandle, final String[] attributes)
 	{
 		int programHandle = GLES20.glCreateProgram();
 		
 		if (programHandle != 0)
 		{
 			// Bind the vertex shader to the program.
 			GLES20.glAttachShader(programHandle, vertexShaderHandle);	
 			
 			// Bind the fragment shader to the program.
 			GLES20.glAttachShader(programHandle, fragmentShaderHandle);
 			
 			// Bind attributes
 			if (attributes != null)
 			{
 				// Remember the word: vctn like victim: vertices, colors, textures, normals. 
 				if(attributes.length != 4) Log.e("shader Names", "Victin not followed");
 		//		final int size = attributes.length;
 		//		for (int i = 0; i < size; i++)
 		//		{
 		//			GLES20.glBindAttribLocation(programHandle, i, attributes[i]);
 		//		}	
 				GLES20.glBindAttribLocation(programHandle, aPositionHandler, "a_Position");
 				GLES20.glBindAttribLocation(programHandle, aColorHandler, "a_Color");
 	//			GLES20.glBindAttribLocation(programHandle, aTextureHandler, "a_Texture");
 				GLES20.glBindAttribLocation(programHandle, aNormalHandler, "a_Normal");
 	
 				
 				
 				
 			}
 		
 			// Link the two shaders together into a program.
 			GLES20.glLinkProgram(programHandle);
 			
 			// Get the link status.
 			final int[] linkStatus = new int[1];
 			GLES20.glGetProgramiv(programHandle, GLES20.GL_LINK_STATUS, linkStatus, 0);
 		
 			// If the link failed, delete the program.
 			if (linkStatus[0] == 0)
 			{	
 				Log.e("Helper", "Error compiling program: " + GLES20.glGetProgramInfoLog(programHandle));
 				GLES20.glDeleteProgram(programHandle);
 				programHandle = 0;
 				}
 			}
 		
 			if (programHandle == 0)
 			{
 				throw new RuntimeException("Error creating program.");
 			}
 		
 		return programHandle;
 	}
 	
 	/** Same as createAndLinkProgram, but specific for texture program. It will only bind position */
 	public static int createAndLinkTextureProgram(final int vertexShaderHandle, final int fragmentShaderHandle, final String[] attributes)
 	{
 		int programHandle = GLES20.glCreateProgram();
 		
 		if (programHandle != 0)
 		{
 			// Bind the vertex shader to the program.
 			GLES20.glAttachShader(programHandle, vertexShaderHandle);	
 			
 			// Bind the fragment shader to the program.
 			GLES20.glAttachShader(programHandle, fragmentShaderHandle);
 			
 			// Bind attributes
 			if (attributes != null)
 			{
 				// Remember the word: vctn like victim: vertices, colors, textures, normals. 
 				if(attributes.length != 2) Log.e("shader Names", "Pass only a_TexturePositionHandler and a_Texture");
 	//			final int size = attributes.length;

 				GLES20.glBindAttribLocation(programHandle, aTexturePositionHandler, "a_Position");
 				GLES20.glBindAttribLocation(programHandle, aTextureHandler, "a_TexCoordinate");	
 			}
 		
 			// Link the two shaders together into a program.
 			GLES20.glLinkProgram(programHandle);
 			
 			// Get the link status.
 			final int[] linkStatus = new int[1];
 			GLES20.glGetProgramiv(programHandle, GLES20.GL_LINK_STATUS, linkStatus, 0);
 		
 			// If the link failed, delete the program.
 			if (linkStatus[0] == 0)
 			{	
 				Log.e("Helper", "Error compiling program: " + GLES20.glGetProgramInfoLog(programHandle));
 				GLES20.glDeleteProgram(programHandle);
 				programHandle = 0;
 				}
 			}
 		
 			if (programHandle == 0)
 			{
 				throw new RuntimeException("Error creating program.");
 			}
 		
 		return programHandle;
 	}
 	
 	/** Converts image to mutable, whatever that means
 	 * 
 	 * @param context: Context
 	 * @param imgIn: Bitmap
 	 * @return mutable bitmap
 	 */
 	
    public static Bitmap convertToMutable(Context context, Bitmap imgIn) {
        try {
            //this is the file going to use temporally to save the bytes. 
            // This file will not be a image, it will store the raw image data.
            File file = new File(context.getFilesDir()  + File.separator + "temp.tmp");

            //Open an RandomAccessFile
            //Make sure you have added uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"
            //into AndroidManifest.xml file
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");

            // get the width and height of the source bitmap.
            int width = imgIn.getWidth();
            int height = imgIn.getHeight();
            android.graphics.Bitmap.Config type = imgIn.getConfig();

            //Copy the byte to the file
            //Assume source bitmap loaded using options.inPreferredConfig = Config.ARGB_8888;
            FileChannel channel = randomAccessFile.getChannel();
            MappedByteBuffer map = channel.map(MapMode.READ_WRITE, 0, imgIn.getRowBytes()*height);
            imgIn.copyPixelsToBuffer(map);
            //recycle the source bitmap, this will be no longer used.
            imgIn.recycle();
            System.gc();// try to force the bytes from the imgIn to be released

            //Create a new bitmap to load the bitmap again. Probably the memory will be available. 
            imgIn = Bitmap.createBitmap(width, height, type);
 //           int x = imgIn.getWidth();
 //           int y = imgIn.getHeight();
            map.position(0);
            //load it back from temporary 
            imgIn.copyPixelsFromBuffer(map);
  //          x = imgIn.getWidth();
  //          y = imgIn.getHeight();
            //close the temporary file and channel , then delete that also
            channel.close();
            randomAccessFile.close();

            // delete the temp file
            file.delete();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 

        return imgIn;
    }
    
    
    /** Puts float array in a floattbuffer after changing it to native ordering.
     *  It also sets postion to 0.
     * @param buffer Array of float to be put in the float buffer
     * @return the FloatBuffer with buffer in it
     */
    public static FloatBuffer doTheBuffer(float[] buffer){
    	
    	FloatBuffer rtn;
        ByteBuffer bb = ByteBuffer.allocateDirect(
                // (number of coordinate values * 4 bytes per float)
        		buffer.length * 4);
        // use the device hardware's native byte order
        bb.order(ByteOrder.nativeOrder());

        // create a floating point buffer from the ByteBuffer
        rtn = bb.asFloatBuffer();
        // add the coordinates to the FloatBuffer
        rtn.put(buffer);
       rtn.flip();
        // set the buffer to read the first coordinate
        rtn.position(0);
        return rtn;
    	
    }
    
    /** Puts short array in a shortbuffer after changing it to native ordering.
     *  It also sets postion to 0.
     * @param buffer Array of float to be put in the short buffer
     * @return the SloatBuffer with buffer in it
     */
    public static ShortBuffer doTheBuffer(short[] buffer){
    	
    	ShortBuffer rtn;
        ByteBuffer bb = ByteBuffer.allocateDirect(
                // (number of coordinate values * 4 bytes per float)
        		buffer.length * 2);
        // use the device hardware's native byte order
        bb.order(ByteOrder.nativeOrder());

        // create a floating point buffer from the ByteBuffer
        rtn = bb.asShortBuffer();
        // add the coordinates to the FloatBuffer
        rtn.put(buffer);
        rtn.flip();
        // set the buffer to read the first coordinate
        rtn.position(0);
        return rtn;
    	
    }
 	

      

}
