package com.makketronix.makkengine.ui;

public class UIVars {

	/** Width / Height */
	public static float ratio;
	
	/** Camera location Z */
	public static float cameraZ;
	
	/** Camera location X */
	public static float cameraX;
	
	/** Camera location Y */
	public static float cameraY;
	
	/** Camera Lookat X */
	public static float lookatX;
	
	/** Camera Lookat Y */
	public static float lookatY;
	
	/** Camera Lookat Z */
	public static float lookatZ;
	
	/** Screen width */
	public static float width;
	
	/** Screen height */
	public static float height;
	
	
	/** Sets configuration 1 for camera location x, y, z 
	 * @return */
	public static void setC1(){
		cameraZ = 10;
		cameraX = 0;
		cameraY = 0;	
	}
	
	/** Sets x, y, z to be used for camera location */
	public static void setC(float x, float y, float z){
		cameraX = x;
		cameraY = y;
		cameraZ = z;
	}
	
	/** Set x, y, z where we'd like the camera to look at */
	public static void lookAt(float x, float y, float z){
		lookatX = x;
		lookatY = y;
		lookatZ = z;
		
	}

}
