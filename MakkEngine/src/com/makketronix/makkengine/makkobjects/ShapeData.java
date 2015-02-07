package com.makketronix.makkengine.makkobjects;

import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

import com.makketronix.makkengine.abstractobjects.ObjectsEnum;
import com.makketronix.makkengine.utils.objUtility;

import android.opengl.Matrix;

public abstract class ShapeData implements IGLData {
	
	private float[] normals;
	private float[] vertices;
	private short[] drawOrder;
	private float[] colors;
	private float[] textures;
	protected int drawOrderLength;
	
	public String TAG;
	public int iTag;
	
//	protected float[] origin = {0f,0f,0f};
	public float[] MMatrix = new float[16];
	protected float[] LightPos = {0f,5.0f,4f};
	
	protected FloatBuffer normalsBuffer;
	protected FloatBuffer verticesBuffer;
	protected FloatBuffer texturesBuffer;
	protected ShortBuffer drawOrderBuffer;
	protected FloatBuffer colorsBuffer;
	
	/** This is for collision detection. 
	* The idea is to create two grids fore each object.
	* The challenge to fuse these grids with grids of other objects.
	* The indices 7, 21 must be able to fit all the objects.
	* If coarse collide, then collision. For more details, fuse fine and check collition.
	* The girds here just feed the data to the collider.
	*/
	public short[][] coarseMap;
	
	/** Map matching coarseMap. The coarseMap is nx2. n will be the index here, z indicates the angle for the normal.
	 * 
	 */
	public float[] angleMap;
	
	public ShapeData () {
		
		normals = setNormals();
		vertices = setVertices();
		textures = setTextures();
		drawOrder = setDrawOrder();
		colors = setColors();
		coarseMap = setCoarseAndMap();
		initObject();
		drawOrderLength = drawOrder.length;
		
		normalsBuffer = objUtility.doTheBuffer(normals);
		verticesBuffer = objUtility.doTheBuffer(vertices);
		texturesBuffer = objUtility.doTheBuffer(textures);
		drawOrderBuffer = objUtility.doTheBuffer(drawOrder);
		colorsBuffer = objUtility.doTheBuffer(colors);

		Matrix.setIdentityM(MMatrix, 0);
	}
	
	public FloatBuffer getColorsBuffer() {
		return colorsBuffer;
	}
//	public float[] getOrigin() {
//		return origin;
//	}
	
	/** This will set the light position too! */
//	public void setOrigin(float[] origin) {
//		this.origin = null;
//		this.origin = new float[3];
//		for(int i = 0; i < 3; i++)
//			this.origin[i] = origin[i];

//	}
	public float[] getMMatrix() {
		return MMatrix;
	}
	public void setMMatrix(float[] mMatrix) {
		MMatrix = mMatrix;
	}
	public float[] getLightPos() {
		return LightPos;
	}
	public void setLightPos(float[] lightPos) {
		for(int i = 0; i < lightPos.length; i++){
			LightPos[i] = lightPos[i];
		}
		LightPos[2] += 4;
	}
	
	public FloatBuffer getNormalsBuffer() {
		return normalsBuffer;
	}
	
	public FloatBuffer getVerticesBuffer() {
		return verticesBuffer;
	}
	
	public FloatBuffer getTexturesBuffer() {
		return texturesBuffer;
	}
	
	public ShortBuffer getDrawOrderBuffer() {
		return drawOrderBuffer;
	}
	
	/** this is just to set some initializations */
	protected void initObject(){
		
	}
	
	/** Resets MMatrix to identity. */
	public void setIdentity() {
		// TODO Auto-generated method stub
		Matrix.setIdentityM(MMatrix, 0);
	}
	
}
