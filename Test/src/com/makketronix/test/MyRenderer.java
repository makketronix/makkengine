package com.makketronix.test;

import java.util.ArrayList;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import com.makketronix.makkengine.abstractobjects.ObjectsEnum;
import com.makketronix.makkengine.makkobjects.EnvironmentGE;
import com.makketronix.makkengine.makkobjects.MainEnvironment;
import com.makketronix.makkengine.makkobjects.MakkEnv;
import com.makketronix.makkengine.makkobjects.MakkObject;
import com.makketronix.makkengine.makkobjects.PhysicsObject;
import com.makketronix.makkengine.testobjects.Arrow;
import com.makketronix.makkengine.testobjects.ButtomSide;
import com.makketronix.makkengine.testobjects.Cannon;
import com.makketronix.makkengine.testobjects.Rectangle;
import com.makketronix.makkengine.testobjects.Tee;
import com.makketronix.makkengine.testobjects.Triangle;
import com.makketronix.makkengine.testobjects.Turtle;
import com.makketronix.makkengine.testobjects.TurtleSprite_1;
import com.makketronix.makkengine.testobjects.TurtleSprite_2;
import com.makketronix.makkengine.ui.UIVars;
import com.makketronix.makkengine.utils.objUtility;




import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.opengl.GLSurfaceView.Renderer;
import android.util.Log;

public class MyRenderer implements Renderer {
	
	ArrayList<MakkObject> objList;
	ArrayList<MakkObject> supportList;
	
	
	MakkEnv mainEnv = new MakkEnv(objList);
	MakkEnv otherEnv = new MakkEnv(supportList);
	
	float[] tempM = new float[16];
	float[] tempO = new float[3];
	float[] tempLocal = new float[3];
	MakkObject tempList;
	float avg;
	float counter = 1f;
	float z;
//	GLTextureObject fontTexture;
//	GLTextureObject gameOverText;

	public MyRenderer(Context context){
	      super();
	}
	
	
	@Override
	public void onDrawFrame(GL10 gl) {
		GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT | GLES20.GL_DEPTH_BUFFER_BIT);
		GLES20.glEnable(GLES20.GL_DEPTH_TEST);
		MainEnvironment.stepAll(0.01f);
		double[] f = {1.0, 1.0, 0.0};
		MainEnvironment.envList.get(0).setForce(f);
	}

	@Override
	public void onSurfaceChanged(GL10 arg0, int width, int height) {
		// TODO Auto-generated method stub
        GLES20.glViewport(0, 0, width, height);
        UIVars.ratio = (float) width/height;
        UIVars.width = width;
        UIVars.height = height;
        
       // this projection matrix is applied to object coordinates
       // in the onDrawFrame() method
        float[] temp = new float[16];
        if( width > height){
        	Matrix.frustumM(temp, 0, -5/7f*5, 5/7f*5, -5, 5, 5/7f*5, 255);     	
        }
        else{
       		Matrix.frustumM(temp, 0, -5/7f*5, 5/7f*5, -5, 5, 5/7f*5, 255);
        }
        UIVars.setC1();
        Matrix.setLookAtM(MakkObject.mVPMatrix, 0, UIVars.cameraX, UIVars.cameraY, UIVars.cameraZ, 0f, 0f, 0f, 0f, 15f, 0f);
//               
//        // Take care of objects
        MakkObject.mProjectionMatrix = temp;
        Matrix.multiplyMM(MakkObject.mVPMatrix, 0, MakkObject.mProjectionMatrix, 0, MakkObject.mVPMatrix, 0);

	}

	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig arg1) {
		// TODO Auto-generated method stub
		
  //      UIVars.setC1();
		GLES20.glClearColor(0.1f ,0.1f ,0.1f ,1f);
		GLES20.glEnable(GLES20.GL_DEPTH_TEST);

		loadGraphics();			// We are here because we lost graphics, probably GLbuffers and code too, or first time. Load 
		
	}
	
	public void loadGraphics(){
//		
		MakkObject.clearStaticShaders();			// Just to be sure we are compiling when necessary.
//		
		if(objList != null || supportList != null){
			objList.clear();
			supportList.clear();
			cleanup();
		}
		objList = null;
		supportList = null;
		objList 	= new ArrayList<MakkObject>();
		supportList = new ArrayList<MakkObject>();
		MainEnvironment.clearEnviornments();
		MakkObject tempO;
		tempO = new MakkObject();
		double[] zero={0.0, 0.0, 0.0};
		tempO.setPhysics(new PhysicsObject(zero, zero, zero,zero, 1.0));
		tempO.setGLData(new Tee());
		tempO.fillFShader(objUtility.readTextFileFromRawResource(MainApp.getInstance(), R.raw.fragmentcode_default));
		tempO.fillVShader(objUtility.readTextFileFromRawResource(MainApp.getCurrentActivity(), R.raw.vertexcode_default));
		tempO.prepareShader();
		tempO.resetMMatrix();
		objList.add(tempO);
		
		double[] f = {-10.0, 0.0, 0.0};
		tempO = new MakkObject();
		tempO.setPhysics(new PhysicsObject(zero, zero, zero,f, 10.0));
		tempO.setGLData(new Tee());
		tempO.fillFShader(objUtility.readTextFileFromRawResource(MainApp.getInstance(), R.raw.fragmentcode_default));
		tempO.fillVShader(objUtility.readTextFileFromRawResource(MainApp.getCurrentActivity(), R.raw.vertexcode_default));
		tempO.prepareShader();
		tempO.resetMMatrix();
		objList.add(tempO);
		
		
		MainEnvironment.addEnvironment(objList);
		
		
	}
	
//	
//
//	/** Destroys GPU buffers */
	public void cleanup(){
		
		for(int i = 0; i < objList.size(); i++){
			for(int j = 0; j < objList.size(); j++){
				objList.get(j).destroyBuffers();
			}
			
		}

		for(int i = 0; i < supportList.size(); i++){
			for(int j = 0; j < supportList.size(); j++){
				supportList.get(j).destroyBuffers();
			}
			
		}
		
		
	}

}
