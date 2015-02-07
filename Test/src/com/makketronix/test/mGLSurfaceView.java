package com.makketronix.test;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

public class mGLSurfaceView extends GLSurfaceView {
	
	MyRenderer mRenderer;
	float X[] = new float[2];
	float Y[] = new float[2];

	public mGLSurfaceView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		
        // Create an OpenGL ES 2.0 context.
        setEGLContextClientVersion(2);

        // Set the Renderer for drawing on the GLSurfaceView
        mRenderer = new MyRenderer(context);
  //      mRenderer.setContextView(context);
        setRenderer(mRenderer);
	}
	
	//TODO Override performClick
	 @Override
	 public boolean onTouchEvent(MotionEvent e) {
	        // MotionEvent reports input details from the touch screen
	        // and other input controls. In this case, you are only
	        // interested in events where the touch position changed.

	        float x = e.getX();
	        float y = -e.getY();

	        switch (e.getAction()) {
	            case MotionEvent.ACTION_MOVE:	      
	                break;
	                
	            case MotionEvent.ACTION_DOWN:	          
	            	break;
	            	
	            case MotionEvent.ACTION_UP:    
	        }
	        
	        return true;
	}	
}
