package com.makketronix.makkengine.testobjects;

import com.makketronix.makkengine.abstractobjects.ObjectsEnum;
import com.makketronix.makkengine.makkobjects.ShapeData;

public class Arrow extends ShapeData {

	@Override
	public float[] setVertices(){
		float[] verts = {
			-0.135712f, -1.057531f, -0.007294f, 
			-0.135712f, -1.057531f, 0.007294f, 
			-0.252295f, -1.058833f, 0.007294f, 
			-0.016214f, -0.975113f, 0.002188f, 
			0.016377f, -0.975113f, 0.002188f, 
			0.016377f, -0.975113f, -0.002188f, 
			0.135874f, -1.057531f, 0.007294f, 
			0.135874f, -1.376127f, 0.007294f, 
			0.135874f, -1.376127f, -0.007294f, 
			-0.135712f, -1.376127f, 0.007294f, 
			-0.135712f, -1.376127f, -0.007294f, 
			0.135874f, -1.376127f, 0.007294f, 
			-0.016214f, -0.975113f, -0.002188f, 
			0.135874f, -1.057531f, 0.007294f, 
			-0.135712f, -1.376127f, 0.007294f, 
			-0.135712f, -1.057531f, 0.007294f, 
			0.135874f, -1.057531f, -0.007294f, 
			0.251642f, -1.057031f, -0.007294f, 
			-0.252295f, -1.058833f, 0.007294f, 
			-0.252295f, -1.039931f, 0.007294f, 
			-0.252295f, -1.039931f, -0.007294f, 
			-0.252295f, -1.058833f, -0.007294f, 
			-0.252295f, -1.039931f, -0.007294f, 
			-0.252295f, -1.058833f, 0.007294f, 
			0.251642f, -1.038129f, 0.007294f, 
			0.251642f, -1.057031f, 0.007294f, 
			0.251642f, -1.057031f, -0.007294f, 
			0.251642f, -1.057031f, 0.007294f, 
			-0.135712f, -1.858835f, 0.007294f, 
			-0.135712f, -1.492984f, 0.007294f, 
			-0.135712f, -1.492984f, -0.007294f, 
			-0.135712f, -1.492984f, 0.007294f, 
			0.135874f, -1.492984f, 0.007294f, 
			0.135874f, -1.492984f, -0.007294f, 
			0.135874f, -1.492984f, 0.007294f, 
			0.135874f, -1.858835f, 0.007294f, 
			0.135874f, -1.858835f, -0.007294f, 
			0.135874f, -1.858835f, 0.007294f, 
			-0.135712f, -1.858835f, -0.007294f, 
			-0.135712f, -1.492984f, 0.007294f, 
			-0.135712f, -2.350074f, 0.007294f, 
			-0.135712f, -1.984223f, 0.007294f, 
			-0.135712f, -1.984223f, -0.007294f, 
			0.135874f, -1.984223f, 0.007294f, 
			0.135874f, -1.984223f, -0.007294f, 
			0.135874f, -1.984223f, 0.007294f, 
			0.135874f, -2.350074f, 0.007294f, 
			0.135874f, -2.350074f, -0.007294f, 
			-0.135712f, -2.350074f, 0.007294f, 
			-0.135712f, -2.350074f, -0.007294f, 
			-0.135712f, -1.984223f, -0.007294f, 
			0.135874f, -1.984223f, -0.007294f, 
			-0.252295f, -1.058833f, -0.007294f, 
			0.135874f, -1.376127f, -0.007294f, 
			0.251642f, -1.057031f, 0.007294f, 
			-0.135712f, -1.376127f, -0.007294f, 
			-0.135712f, -1.376127f, 0.007294f, 
			-0.252295f, -1.058833f, -0.007294f, 
			-0.252295f, -1.039931f, 0.007294f, 
			-0.252295f, -1.058833f, 0.007294f, 
			0.251642f, -1.038129f, -0.007294f, 
			0.251642f, -1.038129f, -0.007294f, 
			0.251642f, -1.057031f, -0.007294f, 
			0.251642f, -1.038129f, -0.007294f, 
			0.135874f, -1.492984f, -0.007294f, 
			0.135874f, -1.858835f, -0.007294f, 
			-0.135712f, -1.858835f, 0.007294f, 
			0.135874f, -1.984223f, -0.007294f
			};

		return verts;
	}


	@Override
	public float[] setNormals(){
		float[] normals = {
			-0.301737f, -0.266457f, -0.915372f, 
			-0.301737f, -0.266457f, 0.915372f, 
			-0.570391f, -0.578997f, 0.582537f, 
			-0.095950f, 0.749260f, 0.655263f, 
			0.093600f, 0.748985f, 0.655904f, 
			0.093600f, 0.748985f, -0.655904f, 
			0.306345f, -0.267647f, 0.913480f, 
			0.577349f, -0.577349f, 0.577349f, 
			0.577349f, -0.577349f, -0.577349f, 
			-0.577349f, -0.577349f, 0.577349f, 
			-0.577349f, -0.577349f, -0.577349f, 
			0.577349f, -0.577349f, 0.577349f, 
			-0.095950f, 0.749260f, -0.655263f, 
			0.306345f, -0.267647f, 0.913480f, 
			-0.577349f, -0.577349f, 0.577349f, 
			-0.301737f, -0.266457f, 0.915372f, 
			0.306345f, -0.267647f, -0.913480f, 
			0.574419f, -0.574145f, -0.583392f, 
			-0.570391f, -0.578997f, 0.582537f, 
			-0.633808f, 0.487930f, 0.600116f, 
			-0.633808f, 0.487930f, -0.600116f, 
			-0.570391f, -0.578997f, -0.582537f, 
			-0.633808f, 0.487930f, -0.600116f, 
			-0.570391f, -0.578997f, 0.582537f, 
			0.632496f, 0.490097f, 0.599750f, 
			0.574419f, -0.574145f, 0.583392f, 
			0.574419f, -0.574145f, -0.583392f, 
			0.574419f, -0.574145f, 0.583392f, 
			-0.577349f, -0.577349f, 0.577349f, 
			-0.577349f, 0.577349f, 0.577349f, 
			-0.577349f, 0.577349f, -0.577349f, 
			-0.577349f, 0.577349f, 0.577349f, 
			0.577349f, 0.577349f, 0.577349f, 
			0.577349f, 0.577349f, -0.577349f, 
			0.577349f, 0.577349f, 0.577349f, 
			0.577349f, -0.577349f, 0.577349f, 
			0.577349f, -0.577349f, -0.577349f, 
			0.577349f, -0.577349f, 0.577349f, 
			-0.577349f, -0.577349f, -0.577349f, 
			-0.577349f, 0.577349f, 0.577349f, 
			-0.577349f, -0.577349f, 0.577349f, 
			-0.577349f, 0.577349f, 0.577349f, 
			-0.577349f, 0.577349f, -0.577349f, 
			0.577349f, 0.577349f, 0.577349f, 
			0.577349f, 0.577349f, -0.577349f, 
			0.577349f, 0.577349f, 0.577349f, 
			0.577349f, -0.577349f, 0.577349f, 
			0.577349f, -0.577349f, -0.577349f, 
			-0.577349f, -0.577349f, 0.577349f, 
			-0.577349f, -0.577349f, -0.577349f, 
			-0.577349f, 0.577349f, -0.577349f, 
			0.577349f, 0.577349f, -0.577349f, 
			-0.570391f, -0.578997f, -0.582537f, 
			0.577349f, -0.577349f, -0.577349f, 
			0.574419f, -0.574145f, 0.583392f, 
			-0.577349f, -0.577349f, -0.577349f, 
			-0.577349f, -0.577349f, 0.577349f, 
			-0.570391f, -0.578997f, -0.582537f, 
			-0.633808f, 0.487930f, 0.600116f, 
			-0.570391f, -0.578997f, 0.582537f, 
			0.632496f, 0.490097f, -0.599750f, 
			0.632496f, 0.490097f, -0.599750f, 
			0.574419f, -0.574145f, -0.583392f, 
			0.632496f, 0.490097f, -0.599750f, 
			0.577349f, 0.577349f, -0.577349f, 
			0.577349f, -0.577349f, -0.577349f, 
			-0.577349f, -0.577349f, 0.577349f, 
			0.577349f, 0.577349f, -0.577349f
			};

		return normals;
	}


	@Override
	public float[] setColors(){
		float[] colors = {
			0.678f, 0.325f, 0.000f, 
			0.678f, 0.329f, 0.004f, 
			0.702f, 0.373f, 0.071f, 
			0.922f, 0.718f, 0.000f, 
			0.922f, 0.718f, 0.000f, 
			0.922f, 0.718f, 0.000f, 
			0.682f, 0.333f, 0.000f, 
			0.490f, 0.235f, 0.000f, 
			0.529f, 0.263f, 0.016f, 
			0.694f, 0.361f, 0.051f, 
			0.678f, 0.329f, 0.004f, 
			0.682f, 0.333f, 0.012f, 
			0.922f, 0.718f, 0.000f, 
			0.678f, 0.325f, 0.000f, 
			0.718f, 0.412f, 0.125f, 
			0.678f, 0.325f, 0.000f, 
			0.678f, 0.325f, 0.000f, 
			0.678f, 0.325f, 0.000f, 
			0.678f, 0.325f, 0.004f, 
			0.694f, 0.357f, 0.047f, 
			0.678f, 0.325f, 0.000f, 
			0.682f, 0.329f, 0.000f, 
			0.682f, 0.329f, 0.000f, 
			0.694f, 0.353f, 0.000f, 
			0.922f, 0.718f, 0.000f, 
			0.686f, 0.337f, 0.000f, 
			0.729f, 0.408f, 0.000f, 
			0.682f, 0.333f, 0.000f, 
			0.000f, 0.145f, 0.651f, 
			0.494f, 0.251f, 0.008f, 
			0.490f, 0.243f, 0.000f, 
			0.490f, 0.243f, 0.000f, 
			0.490f, 0.243f, 0.000f, 
			0.490f, 0.243f, 0.000f, 
			0.490f, 0.235f, 0.000f, 
			0.000f, 0.173f, 0.490f, 
			0.035f, 0.204f, 0.510f, 
			0.000f, 0.149f, 0.659f, 
			0.000f, 0.149f, 0.671f, 
			0.490f, 0.235f, 0.000f, 
			0.008f, 0.094f, 0.384f, 
			0.000f, 0.173f, 0.490f, 
			0.000f, 0.173f, 0.490f, 
			0.000f, 0.173f, 0.490f, 
			0.000f, 0.173f, 0.490f, 
			0.004f, 0.133f, 0.580f, 
			0.000f, 0.086f, 0.380f, 
			0.000f, 0.086f, 0.380f, 
			0.000f, 0.086f, 0.380f, 
			0.000f, 0.086f, 0.380f, 
			0.000f, 0.173f, 0.494f, 
			0.000f, 0.129f, 0.580f, 
			0.686f, 0.345f, 0.024f, 
			0.706f, 0.384f, 0.086f, 
			0.682f, 0.333f, 0.008f, 
			0.678f, 0.325f, 0.000f, 
			0.490f, 0.235f, 0.000f, 
			0.678f, 0.325f, 0.000f, 
			0.690f, 0.341f, 0.000f, 
			0.678f, 0.325f, 0.000f, 
			0.906f, 0.690f, 0.000f, 
			0.733f, 0.408f, 0.000f, 
			0.682f, 0.329f, 0.000f, 
			0.922f, 0.718f, 0.000f, 
			0.490f, 0.235f, 0.000f, 
			0.000f, 0.149f, 0.671f, 
			0.000f, 0.173f, 0.490f, 
			0.004f, 0.133f, 0.580f
			};

		return colors;
	}


	@Override
	public short[] setDrawOrder(){
		short[] order = {
			3, 4, 5, 
			6, 7, 8, 
			9, 10, 11, 
			0, 12, 5, 
			13, 4, 3, 
			14, 15, 0, 
			13, 16, 17, 
			10, 0, 16, 
			7, 13, 15, 
			18, 19, 20, 
			12, 0, 21, 
			3, 12, 22, 
			15, 3, 23, 
			24, 25, 26, 
			4, 13, 27, 
			16, 5, 17, 
			5, 4, 24, 
			28, 29, 30, 
			31, 32, 33, 
			34, 35, 36, 
			37, 28, 38, 
			38, 30, 33, 
			35, 34, 39, 
			40, 41, 42, 
			41, 43, 44, 
			45, 46, 47, 
			46, 48, 49, 
			49, 50, 51, 
			46, 43, 41, 
			52, 0, 2, 
			12, 3, 5, 
			16, 6, 8, 
			11, 10, 53, 
			16, 0, 5, 
			15, 13, 3, 
			10, 14, 0, 
			54, 13, 17, 
			53, 55, 16, 
			56, 7, 15, 
			57, 18, 20, 
			22, 12, 21, 
			58, 3, 22, 
			3, 58, 59, 
			60, 24, 26, 
			24, 4, 27, 
			5, 61, 62, 
			63, 5, 24, 
			38, 28, 30, 
			30, 31, 33, 
			64, 34, 36, 
			65, 37, 38, 
			65, 38, 33, 
			66, 37, 31, 
			49, 40, 42, 
			42, 41, 44, 
			67, 45, 47, 
			47, 46, 49, 
			47, 49, 51, 
			48, 46, 41
			};

		return order;
	}

	@Override
	public short[][] setCoarseAndMap() {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public float[] setTextures() {
		// TODO Auto-generated method stub
		float[] coor = {0};
		return coor;
	}

	@Override
	protected void initObject() {
		// TODO Auto-generated method stub
		TAG = "Arrow";
		iTag = ObjectsEnum.ARROW;
		
	}

}
