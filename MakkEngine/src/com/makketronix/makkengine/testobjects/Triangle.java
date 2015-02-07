package com.makketronix.makkengine.testobjects;

import com.makketronix.makkengine.makkobjects.ShapeData;

public class Triangle extends ShapeData {
	
	public Triangle(){
		super();
		TAG = "Triangle";
	}

	@Override
	public float[] setVertices(){
		float[] verts = {
			-1.624322f, -1.624322f, 0.205636f, 
			0.000000f, 1.691868f, 0.205636f, 
			0.000000f, 1.691868f, -0.205636f, 
			0.000000f, 1.691868f, 0.205636f, 
			1.624322f, -1.624322f, 0.205636f, 
			1.624322f, -1.624322f, -0.205636f, 
			-1.624322f, -1.624322f, 0.205636f, 
			-1.624322f, -1.624322f, -0.205636f, 
			1.624322f, -1.624322f, 0.205636f, 
			-1.624322f, -1.624322f, -0.205636f, 
			0.000000f, 1.691868f, -0.205636f, 
			1.624322f, -1.624322f, -0.205636f, 
			1.624322f, -1.624322f, 0.205636f, 
			0.000000f, 1.691868f, 0.205636f, 
			-1.624322f, -1.624322f, 0.205636f, 
			-1.624322f, -1.624322f, -0.205636f, 
			0.000000f, 1.691868f, -0.205636f, 
			1.624322f, -1.624322f, -0.205636f
			};

		return verts;
	}


	@Override
	public float[] setNormals(){
		float[] normals = {
			-0.898056f, 0.439882f, 0.000000f, 
			-0.898056f, 0.439882f, 0.000000f, 
			-0.898056f, 0.439882f, 0.000000f, 
			0.898056f, 0.439882f, -0.000000f, 
			0.898056f, 0.439882f, -0.000000f, 
			0.898056f, 0.439882f, -0.000000f, 
			-0.000000f, -1.000000f, 0.000000f, 
			-0.000000f, -1.000000f, 0.000000f, 
			-0.000000f, -1.000000f, 0.000000f, 
			-0.000000f, 0.000000f, -1.000000f, 
			-0.000000f, 0.000000f, -1.000000f, 
			-0.000000f, 0.000000f, -1.000000f, 
			-0.000000f, 0.000000f, 1.000000f, 
			-0.000000f, 0.000000f, 1.000000f, 
			-0.000000f, 0.000000f, 1.000000f, 
			-0.898056f, 0.439882f, 0.000000f, 
			0.898056f, 0.439882f, 0.000000f, 
			0.000000f, -1.000000f, 0.000000f
			};

		return normals;
	}


	@Override
	public float[] setColors(){
		float[] colors = {
			0.329f, 1.000f, 0.314f, 
			0.878f, 0.592f, 0.012f, 
			0.863f, 0.639f, 0.000f, 
			0.898f, 1.000f, 0.004f, 
			0.761f, 0.984f, 1.000f, 
			0.878f, 0.580f, 0.000f, 
			0.200f, 0.204f, 0.024f, 
			0.635f, 0.490f, 0.000f, 
			0.212f, 0.180f, 0.043f, 
			0.906f, 0.467f, 0.000f, 
			0.863f, 0.639f, 0.000f, 
			0.878f, 0.580f, 0.000f, 
			0.212f, 0.180f, 0.043f, 
			0.863f, 0.710f, 0.000f, 
			0.200f, 0.204f, 0.024f, 
			0.906f, 0.467f, 0.000f, 
			0.863f, 0.639f, 0.000f, 
			0.769f, 0.592f, 0.000f
			};

		return colors;
	}


	@Override
	public short[] setDrawOrder(){
		short[] order = {
			3, 4, 5, 
			6, 7, 8, 
			9, 10, 11, 
			12, 13, 14, 
			15, 0, 2, 
			16, 3, 5, 
			8, 7, 17
			};

		return order;
	}

	@Override
	public float[] setTextures() {
		// TODO Auto-generated method stub
		float[] coor = {0f};
		return coor;
	}

	@Override
	public short[][] setCoarseAndMap(){
			coarseMap = new short[127][2];
			angleMap = new float[127];
			coarseMap[0][0] = 30;	coarseMap[0][1] = 14;	angleMap[0] = 1.571f;
			coarseMap[1][0] = 29;	coarseMap[1][1] = 15;	angleMap[1] = 2.682f;
			coarseMap[2][0] = 30;	coarseMap[2][1] = 15;	angleMap[2] = 1.571f;
			coarseMap[3][0] = 31;	coarseMap[3][1] = 15;	angleMap[3] = 0.459f;
			coarseMap[4][0] = 29;	coarseMap[4][1] = 16;	angleMap[4] = 2.682f;
			coarseMap[5][0] = 31;	coarseMap[5][1] = 16;	angleMap[5] = 0.459f;
			coarseMap[6][0] = 28;	coarseMap[6][1] = 17;	angleMap[6] = 2.682f;
			coarseMap[7][0] = 29;	coarseMap[7][1] = 17;	angleMap[7] = 2.682f;
			coarseMap[8][0] = 31;	coarseMap[8][1] = 17;	angleMap[8] = 0.459f;
			coarseMap[9][0] = 32;	coarseMap[9][1] = 17;	angleMap[9] = 0.459f;
			coarseMap[10][0] = 28;	coarseMap[10][1] = 18;	angleMap[10] = 2.682f;
			coarseMap[11][0] = 32;	coarseMap[11][1] = 18;	angleMap[11] = 0.459f;
			coarseMap[12][0] = 27;	coarseMap[12][1] = 19;	angleMap[12] = 2.682f;
			coarseMap[13][0] = 28;	coarseMap[13][1] = 19;	angleMap[13] = 2.682f;
			coarseMap[14][0] = 32;	coarseMap[14][1] = 19;	angleMap[14] = 0.459f;
			coarseMap[15][0] = 33;	coarseMap[15][1] = 19;	angleMap[15] = 0.459f;
			coarseMap[16][0] = 27;	coarseMap[16][1] = 20;	angleMap[16] = 2.682f;
			coarseMap[17][0] = 33;	coarseMap[17][1] = 20;	angleMap[17] = 0.459f;
			coarseMap[18][0] = 26;	coarseMap[18][1] = 21;	angleMap[18] = 2.682f;
			coarseMap[19][0] = 27;	coarseMap[19][1] = 21;	angleMap[19] = 2.682f;
			coarseMap[20][0] = 33;	coarseMap[20][1] = 21;	angleMap[20] = 0.459f;
			coarseMap[21][0] = 34;	coarseMap[21][1] = 21;	angleMap[21] = 0.459f;
			coarseMap[22][0] = 26;	coarseMap[22][1] = 22;	angleMap[22] = 2.682f;
			coarseMap[23][0] = 34;	coarseMap[23][1] = 22;	angleMap[23] = 0.459f;
			coarseMap[24][0] = 25;	coarseMap[24][1] = 23;	angleMap[24] = 2.682f;
			coarseMap[25][0] = 26;	coarseMap[25][1] = 23;	angleMap[25] = 2.682f;
			coarseMap[26][0] = 34;	coarseMap[26][1] = 23;	angleMap[26] = 0.459f;
			coarseMap[27][0] = 35;	coarseMap[27][1] = 23;	angleMap[27] = 0.459f;
			coarseMap[28][0] = 25;	coarseMap[28][1] = 24;	angleMap[28] = 2.682f;
			coarseMap[29][0] = 35;	coarseMap[29][1] = 24;	angleMap[29] = 0.459f;
			coarseMap[30][0] = 24;	coarseMap[30][1] = 25;	angleMap[30] = 2.682f;
			coarseMap[31][0] = 25;	coarseMap[31][1] = 25;	angleMap[31] = 2.682f;
			coarseMap[32][0] = 35;	coarseMap[32][1] = 25;	angleMap[32] = 0.459f;
			coarseMap[33][0] = 36;	coarseMap[33][1] = 25;	angleMap[33] = 0.459f;
			coarseMap[34][0] = 24;	coarseMap[34][1] = 26;	angleMap[34] = 2.682f;
			coarseMap[35][0] = 36;	coarseMap[35][1] = 26;	angleMap[35] = 0.459f;
			coarseMap[36][0] = 23;	coarseMap[36][1] = 27;	angleMap[36] = 2.682f;
			coarseMap[37][0] = 24;	coarseMap[37][1] = 27;	angleMap[37] = 2.682f;
			coarseMap[38][0] = 36;	coarseMap[38][1] = 27;	angleMap[38] = 0.459f;
			coarseMap[39][0] = 37;	coarseMap[39][1] = 27;	angleMap[39] = 0.459f;
			coarseMap[40][0] = 23;	coarseMap[40][1] = 28;	angleMap[40] = 2.682f;
			coarseMap[41][0] = 37;	coarseMap[41][1] = 28;	angleMap[41] = 0.459f;
			coarseMap[42][0] = 22;	coarseMap[42][1] = 29;	angleMap[42] = 2.682f;
			coarseMap[43][0] = 23;	coarseMap[43][1] = 29;	angleMap[43] = 2.682f;
			coarseMap[44][0] = 37;	coarseMap[44][1] = 29;	angleMap[44] = 0.459f;
			coarseMap[45][0] = 38;	coarseMap[45][1] = 29;	angleMap[45] = 0.459f;
			coarseMap[46][0] = 22;	coarseMap[46][1] = 30;	angleMap[46] = 2.682f;
			coarseMap[47][0] = 38;	coarseMap[47][1] = 30;	angleMap[47] = 0.459f;
			coarseMap[48][0] = 21;	coarseMap[48][1] = 31;	angleMap[48] = 2.682f;
			coarseMap[49][0] = 22;	coarseMap[49][1] = 31;	angleMap[49] = 2.682f;
			coarseMap[50][0] = 38;	coarseMap[50][1] = 31;	angleMap[50] = 0.459f;
			coarseMap[51][0] = 39;	coarseMap[51][1] = 31;	angleMap[51] = 0.459f;
			coarseMap[52][0] = 21;	coarseMap[52][1] = 32;	angleMap[52] = 2.682f;
			coarseMap[53][0] = 39;	coarseMap[53][1] = 32;	angleMap[53] = 0.459f;
			coarseMap[54][0] = 20;	coarseMap[54][1] = 33;	angleMap[54] = 2.682f;
			coarseMap[55][0] = 21;	coarseMap[55][1] = 33;	angleMap[55] = 2.682f;
			coarseMap[56][0] = 39;	coarseMap[56][1] = 33;	angleMap[56] = 0.459f;
			coarseMap[57][0] = 40;	coarseMap[57][1] = 33;	angleMap[57] = 0.459f;
			coarseMap[58][0] = 20;	coarseMap[58][1] = 34;	angleMap[58] = 2.682f;
			coarseMap[59][0] = 40;	coarseMap[59][1] = 34;	angleMap[59] = 0.459f;
			coarseMap[60][0] = 19;	coarseMap[60][1] = 35;	angleMap[60] = 2.682f;
			coarseMap[61][0] = 20;	coarseMap[61][1] = 35;	angleMap[61] = 2.682f;
			coarseMap[62][0] = 40;	coarseMap[62][1] = 35;	angleMap[62] = 0.459f;
			coarseMap[63][0] = 41;	coarseMap[63][1] = 35;	angleMap[63] = 0.459f;
			coarseMap[64][0] = 19;	coarseMap[64][1] = 36;	angleMap[64] = 2.682f;
			coarseMap[65][0] = 41;	coarseMap[65][1] = 36;	angleMap[65] = 0.459f;
			coarseMap[66][0] = 18;	coarseMap[66][1] = 37;	angleMap[66] = 2.682f;
			coarseMap[67][0] = 19;	coarseMap[67][1] = 37;	angleMap[67] = 2.682f;
			coarseMap[68][0] = 41;	coarseMap[68][1] = 37;	angleMap[68] = 0.459f;
			coarseMap[69][0] = 42;	coarseMap[69][1] = 37;	angleMap[69] = 0.459f;
			coarseMap[70][0] = 18;	coarseMap[70][1] = 38;	angleMap[70] = 2.682f;
			coarseMap[71][0] = 42;	coarseMap[71][1] = 38;	angleMap[71] = 0.459f;
			coarseMap[72][0] = 17;	coarseMap[72][1] = 39;	angleMap[72] = 2.682f;
			coarseMap[73][0] = 18;	coarseMap[73][1] = 39;	angleMap[73] = 2.682f;
			coarseMap[74][0] = 42;	coarseMap[74][1] = 39;	angleMap[74] = 0.459f;
			coarseMap[75][0] = 43;	coarseMap[75][1] = 39;	angleMap[75] = 0.459f;
			coarseMap[76][0] = 17;	coarseMap[76][1] = 40;	angleMap[76] = 2.682f;
			coarseMap[77][0] = 43;	coarseMap[77][1] = 40;	angleMap[77] = 0.459f;
			coarseMap[78][0] = 16;	coarseMap[78][1] = 41;	angleMap[78] = 2.682f;
			coarseMap[79][0] = 17;	coarseMap[79][1] = 41;	angleMap[79] = 2.682f;
			coarseMap[80][0] = 43;	coarseMap[80][1] = 41;	angleMap[80] = 0.459f;
			coarseMap[81][0] = 44;	coarseMap[81][1] = 41;	angleMap[81] = 0.459f;
			coarseMap[82][0] = 16;	coarseMap[82][1] = 42;	angleMap[82] = 2.682f;
			coarseMap[83][0] = 44;	coarseMap[83][1] = 42;	angleMap[83] = 0.459f;
			coarseMap[84][0] = 15;	coarseMap[84][1] = 43;	angleMap[84] = 2.682f;
			coarseMap[85][0] = 16;	coarseMap[85][1] = 43;	angleMap[85] = 2.682f;
			coarseMap[86][0] = 44;	coarseMap[86][1] = 43;	angleMap[86] = 0.459f;
			coarseMap[87][0] = 45;	coarseMap[87][1] = 43;	angleMap[87] = 0.459f;
			coarseMap[88][0] = 15;	coarseMap[88][1] = 44;	angleMap[88] = 2.682f;
			coarseMap[89][0] = 45;	coarseMap[89][1] = 44;	angleMap[89] = 0.459f;
			coarseMap[90][0] = 14;	coarseMap[90][1] = 45;	angleMap[90] = 2.682f;
			coarseMap[91][0] = 15;	coarseMap[91][1] = 45;	angleMap[91] = 2.682f;
			coarseMap[92][0] = 45;	coarseMap[92][1] = 45;	angleMap[92] = 0.459f;
			coarseMap[93][0] = 46;	coarseMap[93][1] = 45;	angleMap[93] = 0.459f;
			coarseMap[94][0] = 14;	coarseMap[94][1] = 46;	angleMap[94] = 3.799f;
			coarseMap[95][0] = 15;	coarseMap[95][1] = 46;	angleMap[95] = 4.712f;
			coarseMap[96][0] = 16;	coarseMap[96][1] = 46;	angleMap[96] = 4.712f;
			coarseMap[97][0] = 17;	coarseMap[97][1] = 46;	angleMap[97] = 4.712f;
			coarseMap[98][0] = 18;	coarseMap[98][1] = 46;	angleMap[98] = 4.712f;
			coarseMap[99][0] = 19;	coarseMap[99][1] = 46;	angleMap[99] = 4.712f;
			coarseMap[100][0] = 20;	coarseMap[100][1] = 46;	angleMap[100] = 4.712f;
			coarseMap[101][0] = 21;	coarseMap[101][1] = 46;	angleMap[101] = 4.712f;
			coarseMap[102][0] = 22;	coarseMap[102][1] = 46;	angleMap[102] = 4.712f;
			coarseMap[103][0] = 23;	coarseMap[103][1] = 46;	angleMap[103] = 4.712f;
			coarseMap[104][0] = 24;	coarseMap[104][1] = 46;	angleMap[104] = 4.712f;
			coarseMap[105][0] = 25;	coarseMap[105][1] = 46;	angleMap[105] = 4.712f;
			coarseMap[106][0] = 26;	coarseMap[106][1] = 46;	angleMap[106] = 4.712f;
			coarseMap[107][0] = 27;	coarseMap[107][1] = 46;	angleMap[107] = 4.712f;
			coarseMap[108][0] = 28;	coarseMap[108][1] = 46;	angleMap[108] = 4.712f;
			coarseMap[109][0] = 29;	coarseMap[109][1] = 46;	angleMap[109] = 4.712f;
			coarseMap[110][0] = 30;	coarseMap[110][1] = 46;	angleMap[110] = 4.712f;
			coarseMap[111][0] = 31;	coarseMap[111][1] = 46;	angleMap[111] = 4.712f;
			coarseMap[112][0] = 32;	coarseMap[112][1] = 46;	angleMap[112] = 4.712f;
			coarseMap[113][0] = 33;	coarseMap[113][1] = 46;	angleMap[113] = 4.712f;
			coarseMap[114][0] = 34;	coarseMap[114][1] = 46;	angleMap[114] = 4.712f;
			coarseMap[115][0] = 35;	coarseMap[115][1] = 46;	angleMap[115] = 4.712f;
			coarseMap[116][0] = 36;	coarseMap[116][1] = 46;	angleMap[116] = 4.712f;
			coarseMap[117][0] = 37;	coarseMap[117][1] = 46;	angleMap[117] = 4.712f;
			coarseMap[118][0] = 38;	coarseMap[118][1] = 46;	angleMap[118] = 4.712f;
			coarseMap[119][0] = 39;	coarseMap[119][1] = 46;	angleMap[119] = 4.712f;
			coarseMap[120][0] = 40;	coarseMap[120][1] = 46;	angleMap[120] = 4.712f;
			coarseMap[121][0] = 41;	coarseMap[121][1] = 46;	angleMap[121] = 4.712f;
			coarseMap[122][0] = 42;	coarseMap[122][1] = 46;	angleMap[122] = 4.712f;
			coarseMap[123][0] = 43;	coarseMap[123][1] = 46;	angleMap[123] = 4.712f;
			coarseMap[124][0] = 44;	coarseMap[124][1] = 46;	angleMap[124] = 4.712f;
			coarseMap[125][0] = 45;	coarseMap[125][1] = 46;	angleMap[125] = 4.712f;
			coarseMap[126][0] = 46;	coarseMap[126][1] = 46;	angleMap[126] = 3.324f;
			return null;
			
		}
	

	@Override
	protected void initObject() {
		// TODO Auto-generated method stub
		
	}
}
