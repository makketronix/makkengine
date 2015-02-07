package com.makketronix.makkengine.makkobjects;

import com.makketronix.makkengine.abstractobjects.MakkEnums;

// OpenGL 2.0 rendering interface
interface IGLRender20 {
   /** Assign Vertex shader */
   public void fillVShader(String shaderCode);
   
   /** Assign Fragment Shader */
   public void fillFShader(String shaderCode);
	     
   /** This must be called before draw(). Compile, link . . . */
   public void prepareShader(MakkEnums shaderType);
	   
   /** This function will draw the vertices */
   public void draw();
		     
   /** Clean the GPU */
   public void destroyBuffers();
		     
}
