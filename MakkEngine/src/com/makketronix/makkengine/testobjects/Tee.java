package com.makketronix.makkengine.testobjects;

import com.makketronix.makkengine.makkobjects.ShapeData;

public class Tee extends ShapeData{

	@Override
	public float[] setVertices(){
		float[] verts = {
			-1.103211f, 0.140380f, 0.065664f, 
			-1.103211f, 1.235388f, 0.065664f, 
			-1.103211f, 1.235388f, -0.065664f, 
			0.367737f, 1.235388f, 0.065664f, 
			1.103211f, 1.235388f, 0.065664f, 
			1.103211f, 1.235388f, -0.065664f, 
			1.103211f, 0.140380f, 0.065664f, 
			1.103211f, 0.140380f, -0.065664f, 
			-1.103211f, 0.140380f, -0.065664f, 
			-0.367737f, 0.140380f, 0.065664f, 
			0.367737f, 0.140380f, -0.065664f, 
			0.367737f, 1.235388f, -0.065664f, 
			1.103211f, 1.235388f, -0.065664f, 
			-0.367737f, 0.140380f, 0.065664f, 
			-0.367737f, 1.235388f, 0.065664f, 
			-1.103211f, 1.235388f, 0.065664f, 
			-0.367737f, 1.235388f, -0.065664f, 
			0.367737f, 1.235388f, -0.065664f, 
			0.367737f, 0.140380f, 0.065664f, 
			0.367737f, 0.140380f, -0.065664f, 
			-0.367737f, 0.140380f, -0.065664f, 
			-0.367737f, -1.910574f, -0.065664f, 
			-1.103211f, 0.140380f, -0.065664f, 
			-1.103211f, 1.235388f, -0.065664f, 
			-0.367737f, 1.235388f, -0.065664f, 
			-0.367737f, 0.140380f, -0.065664f, 
			1.103211f, 0.140380f, 0.065664f, 
			0.367737f, 0.140380f, 0.065664f, 
			0.367737f, -1.910574f, 0.065664f, 
			-0.367737f, -1.910574f, 0.065664f, 
			0.367737f, 0.140380f, -0.065664f, 
			0.367737f, 0.140380f, 0.065664f, 
			0.367737f, -1.910574f, -0.065664f, 
			-0.367737f, -1.910574f, 0.065664f, 
			1.103211f, 1.235388f, -0.065664f, 
			-1.103211f, 0.140380f, 0.065664f, 
			-1.103211f, 1.235388f, -0.065664f, 
			-0.367737f, 0.140380f, 0.065664f, 
			0.367737f, 0.140380f, -0.065664f, 
			0.367737f, -1.910574f, 0.065664f
			};

		return verts;
	}


	@Override
	public float[] setNormals(){
		float[] normals = {
			-0.577349f, -0.577349f, 0.577349f, 
			-0.577349f, 0.577349f, 0.577349f, 
			-0.577349f, 0.577349f, -0.577349f, 
			0.000000f, 0.707083f, 0.707083f, 
			0.577349f, 0.577349f, 0.577349f, 
			0.577349f, 0.577349f, -0.577349f, 
			0.577349f, -0.577349f, 0.577349f, 
			0.577349f, -0.577349f, -0.577349f, 
			-0.577349f, -0.577349f, -0.577349f, 
			-0.301492f, -0.301492f, 0.904508f, 
			0.301492f, -0.301492f, -0.904508f, 
			0.000000f, 0.707083f, -0.707083f, 
			0.577349f, 0.577349f, -0.577349f, 
			-0.301492f, -0.301492f, 0.904508f, 
			0.000000f, 0.707083f, 0.707083f, 
			-0.577349f, 0.577349f, 0.577349f, 
			0.000000f, 0.707083f, -0.707083f, 
			0.000000f, 0.707083f, -0.707083f, 
			0.301492f, -0.301492f, 0.904508f, 
			0.301492f, -0.301492f, -0.904508f, 
			-0.301492f, -0.301492f, -0.904508f, 
			-0.577349f, -0.577349f, -0.577349f, 
			-0.577349f, -0.577349f, -0.577349f, 
			-0.577349f, 0.577349f, -0.577349f, 
			0.000000f, 0.707083f, -0.707083f, 
			-0.301492f, -0.301492f, -0.904508f, 
			0.577349f, -0.577349f, 0.577349f, 
			0.301492f, -0.301492f, 0.904508f, 
			0.577349f, -0.577349f, 0.577349f, 
			-0.577349f, -0.577349f, 0.577349f, 
			0.301492f, -0.301492f, -0.904508f, 
			0.301492f, -0.301492f, 0.904508f, 
			0.577349f, -0.577349f, -0.577349f, 
			-0.577349f, -0.577349f, 0.577349f, 
			0.577349f, 0.577349f, -0.577349f, 
			-0.577349f, -0.577349f, 0.577349f, 
			-0.577349f, 0.577349f, -0.577349f, 
			-0.301492f, -0.301492f, 0.904508f, 
			0.301492f, -0.301492f, -0.904508f, 
			0.577349f, -0.577349f, 0.577349f
			};

		return normals;
	}


	@Override
	public float[] setColors(){
		float[] colors = {
			0.000f, 0.071f, 0.588f, 
			0.000f, 0.451f, 0.847f, 
			0.000f, 0.447f, 0.843f, 
			0.690f, 0.945f, 1.000f, 
			0.690f, 0.945f, 1.000f, 
			0.690f, 0.945f, 1.000f, 
			0.000f, 0.043f, 0.369f, 
			0.000f, 0.043f, 0.369f, 
			0.000f, 0.071f, 0.580f, 
			0.000f, 0.094f, 0.608f, 
			0.000f, 0.043f, 0.369f, 
			0.000f, 0.043f, 0.369f, 
			0.000f, 0.043f, 0.369f, 
			0.008f, 0.102f, 0.608f, 
			0.690f, 0.945f, 1.000f, 
			0.690f, 0.945f, 1.000f, 
			0.690f, 0.945f, 1.000f, 
			0.690f, 0.945f, 1.000f, 
			0.000f, 0.533f, 1.000f, 
			0.000f, 0.525f, 0.992f, 
			0.000f, 0.075f, 0.592f, 
			0.000f, 0.043f, 0.369f, 
			0.000f, 0.043f, 0.369f, 
			0.000f, 0.043f, 0.369f, 
			0.000f, 0.043f, 0.369f, 
			0.000f, 0.043f, 0.369f, 
			0.020f, 0.102f, 0.678f, 
			0.008f, 0.537f, 1.000f, 
			0.000f, 0.043f, 0.369f, 
			0.000f, 0.043f, 0.369f, 
			0.086f, 0.153f, 0.447f, 
			0.008f, 0.055f, 0.376f, 
			0.000f, 0.043f, 0.369f, 
			0.016f, 0.059f, 0.380f, 
			0.686f, 0.941f, 0.996f, 
			0.004f, 0.075f, 0.588f, 
			0.690f, 0.945f, 1.000f, 
			0.000f, 0.071f, 0.588f, 
			0.078f, 0.145f, 0.439f, 
			0.008f, 0.051f, 0.373f
			};

		return colors;
	}


	@Override
	public short[] setDrawOrder(){
		short[] order = {
			3, 4, 5, 
			4, 6, 7, 
			0, 8, 9, 
			10, 11, 12, 
			13, 14, 15, 
			15, 14, 16, 
			14, 3, 17, 
			6, 18, 19, 
			9, 20, 21, 
			22, 23, 24, 
			25, 24, 11, 
			26, 4, 3, 
			27, 3, 14, 
			28, 29, 21, 
			30, 31, 28, 
			25, 10, 32, 
			27, 13, 33, 
			8, 0, 2, 
			17, 3, 5, 
			34, 4, 7, 
			9, 8, 20, 
			7, 10, 12, 
			35, 13, 15, 
			36, 15, 16, 
			16, 14, 17, 
			7, 6, 19, 
			29, 37, 21, 
			25, 22, 24, 
			10, 25, 11, 
			27, 26, 3, 
			13, 27, 14, 
			32, 28, 21, 
			32, 38, 28, 
			21, 25, 32, 
			39, 27, 33
			};

		return order;
	}

	@Override
	public short[][] setCoarseAndMap(){
			coarseMap = new short[106][2];
			angleMap = new float[106];
			coarseMap[0][0] = 19;	coarseMap[0][1] = 18;	angleMap[0] = 2.356f;
			coarseMap[1][0] = 20;	coarseMap[1][1] = 18;	angleMap[1] = 1.571f;
			coarseMap[2][0] = 21;	coarseMap[2][1] = 18;	angleMap[2] = 1.571f;
			coarseMap[3][0] = 22;	coarseMap[3][1] = 18;	angleMap[3] = 1.571f;
			coarseMap[4][0] = 23;	coarseMap[4][1] = 18;	angleMap[4] = 1.571f;
			coarseMap[5][0] = 24;	coarseMap[5][1] = 18;	angleMap[5] = 1.571f;
			coarseMap[6][0] = 25;	coarseMap[6][1] = 18;	angleMap[6] = 1.571f;
			coarseMap[7][0] = 26;	coarseMap[7][1] = 18;	angleMap[7] = 1.571f;
			coarseMap[8][0] = 27;	coarseMap[8][1] = 18;	angleMap[8] = 1.571f;
			coarseMap[9][0] = 28;	coarseMap[9][1] = 18;	angleMap[9] = 1.571f;
			coarseMap[10][0] = 29;	coarseMap[10][1] = 18;	angleMap[10] = 1.571f;
			coarseMap[11][0] = 30;	coarseMap[11][1] = 18;	angleMap[11] = 1.571f;
			coarseMap[12][0] = 31;	coarseMap[12][1] = 18;	angleMap[12] = 1.571f;
			coarseMap[13][0] = 32;	coarseMap[13][1] = 18;	angleMap[13] = 1.571f;
			coarseMap[14][0] = 33;	coarseMap[14][1] = 18;	angleMap[14] = 1.571f;
			coarseMap[15][0] = 34;	coarseMap[15][1] = 18;	angleMap[15] = 1.571f;
			coarseMap[16][0] = 35;	coarseMap[16][1] = 18;	angleMap[16] = 1.571f;
			coarseMap[17][0] = 36;	coarseMap[17][1] = 18;	angleMap[17] = 1.571f;
			coarseMap[18][0] = 37;	coarseMap[18][1] = 18;	angleMap[18] = 1.571f;
			coarseMap[19][0] = 38;	coarseMap[19][1] = 18;	angleMap[19] = 1.571f;
			coarseMap[20][0] = 39;	coarseMap[20][1] = 18;	angleMap[20] = 1.571f;
			coarseMap[21][0] = 40;	coarseMap[21][1] = 18;	angleMap[21] = 1.571f;
			coarseMap[22][0] = 41;	coarseMap[22][1] = 18;	angleMap[22] = 0.785f;
			coarseMap[23][0] = 19;	coarseMap[23][1] = 19;	angleMap[23] = 3.142f;
			coarseMap[24][0] = 41;	coarseMap[24][1] = 19;	angleMap[24] = 0.000f;
			coarseMap[25][0] = 19;	coarseMap[25][1] = 20;	angleMap[25] = 3.142f;
			coarseMap[26][0] = 41;	coarseMap[26][1] = 20;	angleMap[26] = 0.000f;
			coarseMap[27][0] = 19;	coarseMap[27][1] = 21;	angleMap[27] = 3.142f;
			coarseMap[28][0] = 41;	coarseMap[28][1] = 21;	angleMap[28] = 0.000f;
			coarseMap[29][0] = 19;	coarseMap[29][1] = 22;	angleMap[29] = 3.142f;
			coarseMap[30][0] = 41;	coarseMap[30][1] = 22;	angleMap[30] = 0.000f;
			coarseMap[31][0] = 19;	coarseMap[31][1] = 23;	angleMap[31] = 3.142f;
			coarseMap[32][0] = 41;	coarseMap[32][1] = 23;	angleMap[32] = 0.000f;
			coarseMap[33][0] = 19;	coarseMap[33][1] = 24;	angleMap[33] = 3.142f;
			coarseMap[34][0] = 41;	coarseMap[34][1] = 24;	angleMap[34] = 0.000f;
			coarseMap[35][0] = 19;	coarseMap[35][1] = 25;	angleMap[35] = 3.142f;
			coarseMap[36][0] = 41;	coarseMap[36][1] = 25;	angleMap[36] = 0.000f;
			coarseMap[37][0] = 19;	coarseMap[37][1] = 26;	angleMap[37] = 3.142f;
			coarseMap[38][0] = 41;	coarseMap[38][1] = 26;	angleMap[38] = 0.000f;
			coarseMap[39][0] = 19;	coarseMap[39][1] = 27;	angleMap[39] = 3.142f;
			coarseMap[40][0] = 41;	coarseMap[40][1] = 27;	angleMap[40] = 0.000f;
			coarseMap[41][0] = 19;	coarseMap[41][1] = 28;	angleMap[41] = 3.142f;
			coarseMap[42][0] = 41;	coarseMap[42][1] = 28;	angleMap[42] = 0.000f;
			coarseMap[43][0] = 19;	coarseMap[43][1] = 29;	angleMap[43] = 4.477f;
			coarseMap[44][0] = 20;	coarseMap[44][1] = 29;	angleMap[44] = 4.712f;
			coarseMap[45][0] = 21;	coarseMap[45][1] = 29;	angleMap[45] = 4.712f;
			coarseMap[46][0] = 22;	coarseMap[46][1] = 29;	angleMap[46] = 4.712f;
			coarseMap[47][0] = 23;	coarseMap[47][1] = 29;	angleMap[47] = 4.712f;
			coarseMap[48][0] = 24;	coarseMap[48][1] = 29;	angleMap[48] = 4.712f;
			coarseMap[49][0] = 25;	coarseMap[49][1] = 29;	angleMap[49] = 4.712f;
			coarseMap[50][0] = 26;	coarseMap[50][1] = 29;	angleMap[50] = 4.298f;
			coarseMap[51][0] = 34;	coarseMap[51][1] = 29;	angleMap[51] = 3.984f;
			coarseMap[52][0] = 35;	coarseMap[52][1] = 29;	angleMap[52] = 4.712f;
			coarseMap[53][0] = 36;	coarseMap[53][1] = 29;	angleMap[53] = 4.712f;
			coarseMap[54][0] = 37;	coarseMap[54][1] = 29;	angleMap[54] = 4.712f;
			coarseMap[55][0] = 38;	coarseMap[55][1] = 29;	angleMap[55] = 4.712f;
			coarseMap[56][0] = 39;	coarseMap[56][1] = 29;	angleMap[56] = 4.712f;
			coarseMap[57][0] = 40;	coarseMap[57][1] = 29;	angleMap[57] = 4.712f;
			coarseMap[58][0] = 41;	coarseMap[58][1] = 29;	angleMap[58] = 4.948f;
			coarseMap[59][0] = 26;	coarseMap[59][1] = 30;	angleMap[59] = 3.142f;
			coarseMap[60][0] = 34;	coarseMap[60][1] = 30;	angleMap[60] = 0.000f;
			coarseMap[61][0] = 26;	coarseMap[61][1] = 31;	angleMap[61] = 3.142f;
			coarseMap[62][0] = 34;	coarseMap[62][1] = 31;	angleMap[62] = 0.000f;
			coarseMap[63][0] = 26;	coarseMap[63][1] = 32;	angleMap[63] = 3.142f;
			coarseMap[64][0] = 34;	coarseMap[64][1] = 32;	angleMap[64] = 0.000f;
			coarseMap[65][0] = 26;	coarseMap[65][1] = 33;	angleMap[65] = 3.142f;
			coarseMap[66][0] = 34;	coarseMap[66][1] = 33;	angleMap[66] = 0.000f;
			coarseMap[67][0] = 26;	coarseMap[67][1] = 34;	angleMap[67] = 3.142f;
			coarseMap[68][0] = 34;	coarseMap[68][1] = 34;	angleMap[68] = 0.000f;
			coarseMap[69][0] = 26;	coarseMap[69][1] = 35;	angleMap[69] = 3.142f;
			coarseMap[70][0] = 34;	coarseMap[70][1] = 35;	angleMap[70] = 0.000f;
			coarseMap[71][0] = 26;	coarseMap[71][1] = 36;	angleMap[71] = 3.142f;
			coarseMap[72][0] = 34;	coarseMap[72][1] = 36;	angleMap[72] = 0.000f;
			coarseMap[73][0] = 26;	coarseMap[73][1] = 37;	angleMap[73] = 3.142f;
			coarseMap[74][0] = 34;	coarseMap[74][1] = 37;	angleMap[74] = 0.000f;
			coarseMap[75][0] = 26;	coarseMap[75][1] = 38;	angleMap[75] = 3.142f;
			coarseMap[76][0] = 34;	coarseMap[76][1] = 38;	angleMap[76] = 0.000f;
			coarseMap[77][0] = 26;	coarseMap[77][1] = 39;	angleMap[77] = 3.142f;
			coarseMap[78][0] = 34;	coarseMap[78][1] = 39;	angleMap[78] = 0.000f;
			coarseMap[79][0] = 26;	coarseMap[79][1] = 40;	angleMap[79] = 3.142f;
			coarseMap[80][0] = 34;	coarseMap[80][1] = 40;	angleMap[80] = 0.000f;
			coarseMap[81][0] = 26;	coarseMap[81][1] = 41;	angleMap[81] = 3.142f;
			coarseMap[82][0] = 34;	coarseMap[82][1] = 41;	angleMap[82] = 0.000f;
			coarseMap[83][0] = 26;	coarseMap[83][1] = 42;	angleMap[83] = 3.142f;
			coarseMap[84][0] = 34;	coarseMap[84][1] = 42;	angleMap[84] = 0.000f;
			coarseMap[85][0] = 26;	coarseMap[85][1] = 43;	angleMap[85] = 3.142f;
			coarseMap[86][0] = 34;	coarseMap[86][1] = 43;	angleMap[86] = 0.000f;
			coarseMap[87][0] = 26;	coarseMap[87][1] = 44;	angleMap[87] = 3.142f;
			coarseMap[88][0] = 34;	coarseMap[88][1] = 44;	angleMap[88] = 0.000f;
			coarseMap[89][0] = 26;	coarseMap[89][1] = 45;	angleMap[89] = 3.142f;
			coarseMap[90][0] = 34;	coarseMap[90][1] = 45;	angleMap[90] = 0.000f;
			coarseMap[91][0] = 26;	coarseMap[91][1] = 46;	angleMap[91] = 3.142f;
			coarseMap[92][0] = 34;	coarseMap[92][1] = 46;	angleMap[92] = 0.000f;
			coarseMap[93][0] = 26;	coarseMap[93][1] = 47;	angleMap[93] = 3.142f;
			coarseMap[94][0] = 34;	coarseMap[94][1] = 47;	angleMap[94] = 0.000f;
			coarseMap[95][0] = 26;	coarseMap[95][1] = 48;	angleMap[95] = 3.142f;
			coarseMap[96][0] = 34;	coarseMap[96][1] = 48;	angleMap[96] = 0.000f;
			coarseMap[97][0] = 26;	coarseMap[97][1] = 49;	angleMap[97] = 4.032f;
			coarseMap[98][0] = 27;	coarseMap[98][1] = 49;	angleMap[98] = 4.712f;
			coarseMap[99][0] = 28;	coarseMap[99][1] = 49;	angleMap[99] = 4.712f;
			coarseMap[100][0] = 29;	coarseMap[100][1] = 49;	angleMap[100] = 4.712f;
			coarseMap[101][0] = 30;	coarseMap[101][1] = 49;	angleMap[101] = 4.712f;
			coarseMap[102][0] = 31;	coarseMap[102][1] = 49;	angleMap[102] = 4.712f;
			coarseMap[103][0] = 32;	coarseMap[103][1] = 49;	angleMap[103] = 4.712f;
			coarseMap[104][0] = 33;	coarseMap[104][1] = 49;	angleMap[104] = 4.712f;
			coarseMap[105][0] = 34;	coarseMap[105][1] = 49;	angleMap[105] = 3.844f;
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
		
	}

}
