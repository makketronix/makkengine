package com.makketronix.makkengine.testobjects;

import com.makketronix.makkengine.makkobjects.ShapeData;


public class ButtomSide extends ShapeData {


	@Override
	public float[] setVertices(){
		float[] verts = {
			-7.639056f, -4.452460f, 0.185144f, 
			-7.639056f, -0.006712f, 0.185144f, 
			-7.639056f, -0.006712f, -0.184993f, 
			7.627096f, -0.006712f, 0.185144f, 
			7.627096f, -0.006712f, -0.184993f, 
			7.627096f, -4.452460f, 0.185144f, 
			7.627096f, -4.452460f, -0.184993f, 
			-7.639056f, -4.452460f, -0.184993f, 
			7.627096f, -4.452460f, 0.185144f, 
			-7.639056f, -4.452460f, -0.184993f, 
			7.627096f, -4.452460f, 0.185144f, 
			7.627096f, -0.006712f, 0.185144f, 
			-7.639056f, -0.006712f, 0.185144f, 
			-7.639056f, -4.452460f, 0.185144f
			};

		return verts;
	}


	@Override
	public float[] setNormals(){
		float[] normals = {
			-0.577349f, -0.577349f, 0.577349f, 
			-0.577349f, 0.577349f, 0.577349f, 
			-0.577349f, 0.577349f, -0.577349f, 
			0.577349f, 0.577349f, 0.577349f, 
			0.577349f, 0.577349f, -0.577349f, 
			0.577349f, -0.577349f, 0.577349f, 
			0.577349f, -0.577349f, -0.577349f, 
			-0.577349f, -0.577349f, -0.577349f, 
			0.577349f, -0.577349f, 0.577349f, 
			-0.577349f, -0.577349f, -0.577349f, 
			0.577349f, -0.577349f, 0.577349f, 
			0.577349f, 0.577349f, 0.577349f, 
			-0.577349f, 0.577349f, 0.577349f, 
			-0.577349f, -0.577349f, 0.577349f
			};

		return normals;
	}


	@Override
	public float[] setColors(){
		float[] colors = {
			0.529f, 0.451f, 0.624f, 
			0.490f, 0.498f, 0.706f, 
			0.451f, 0.549f, 0.796f, 
			0.651f, 0.306f, 0.341f, 
			0.451f, 0.549f, 0.796f, 
			0.510f, 0.478f, 0.667f, 
			0.455f, 0.545f, 0.792f, 
			0.451f, 0.549f, 0.796f, 
			0.510f, 0.475f, 0.667f, 
			0.451f, 0.549f, 0.800f, 
			0.800f, 0.122f, 0.000f, 
			0.800f, 0.122f, 0.000f, 
			0.800f, 0.122f, 0.000f, 
			0.800f, 0.125f, 0.004f
			};

		return colors;
	}


	@Override
	public short[] setDrawOrder(){
		short[] order = {
			1, 3, 4, 
			3, 5, 6, 
			0, 7, 8, 
			9, 2, 4, 
			10, 11, 12, 
			7, 0, 2, 
			2, 1, 4, 
			4, 3, 6, 
			8, 7, 6, 
			6, 9, 4, 
			13, 10, 12
			};

		return order;
	}

	@Override
	public float[] setTextures() {
		// TODO Auto-generated method stub
		float[] coor = {0};
		return coor;
	}

	@Override
	public short[][] setCoarseAndMap() {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	protected void initObject() {
		// TODO Auto-generated method stub
		
	}

}
