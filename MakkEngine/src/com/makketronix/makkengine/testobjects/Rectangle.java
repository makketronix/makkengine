package com.makketronix.makkengine.testobjects;

import com.makketronix.makkengine.makkobjects.ShapeData;

public class Rectangle extends ShapeData {

	@Override
	public float[] setVertices(){
		float[] verts = {
			-2.588084f, -0.480299f, 0.130150f, 
			-2.588084f, 0.480299f, 0.130150f, 
			-2.588084f, 0.480299f, -0.130150f, 
			-2.588084f, 0.480299f, 0.130150f, 
			2.588084f, 0.480299f, 0.130150f, 
			2.588084f, 0.480299f, -0.130150f, 
			2.588084f, 0.480299f, 0.130150f, 
			2.588084f, -0.480299f, 0.130150f, 
			2.588084f, -0.480299f, -0.130150f, 
			-2.588084f, -0.480299f, 0.130150f, 
			-2.588084f, -0.480299f, -0.130150f, 
			2.588084f, -0.480299f, 0.130150f, 
			-2.588084f, -0.480299f, -0.130150f, 
			-2.588084f, 0.480299f, -0.130150f, 
			2.588084f, 0.480299f, -0.130150f, 
			2.588084f, -0.480299f, 0.130150f, 
			2.588084f, 0.480299f, 0.130150f, 
			-2.588084f, 0.480299f, 0.130150f, 
			-2.588084f, -0.480299f, -0.130150f, 
			-2.588084f, 0.480299f, -0.130150f, 
			2.588084f, 0.480299f, -0.130150f, 
			2.588084f, -0.480299f, -0.130150f, 
			2.588084f, -0.480299f, -0.130150f, 
			-2.588084f, -0.480299f, 0.130150f
			};

		return verts;
	}


	@Override
	public float[] setNormals(){
		float[] normals = {
			-1.000000f, 0.000000f, 0.000000f, 
			-1.000000f, 0.000000f, 0.000000f, 
			-1.000000f, 0.000000f, 0.000000f, 
			0.000000f, 1.000000f, -0.000000f, 
			0.000000f, 1.000000f, -0.000000f, 
			0.000000f, 1.000000f, -0.000000f, 
			1.000000f, 0.000000f, 0.000000f, 
			1.000000f, 0.000000f, 0.000000f, 
			1.000000f, 0.000000f, 0.000000f, 
			-0.000000f, -1.000000f, 0.000000f, 
			-0.000000f, -1.000000f, 0.000000f, 
			-0.000000f, -1.000000f, 0.000000f, 
			-0.000000f, -0.000000f, -1.000000f, 
			-0.000000f, -0.000000f, -1.000000f, 
			-0.000000f, -0.000000f, -1.000000f, 
			-0.000000f, 0.000000f, 1.000000f, 
			-0.000000f, 0.000000f, 1.000000f, 
			-0.000000f, 0.000000f, 1.000000f, 
			-1.000000f, -0.000000f, -0.000000f, 
			0.000000f, 1.000000f, 0.000000f, 
			1.000000f, -0.000000f, 0.000000f, 
			0.000000f, -1.000000f, 0.000000f, 
			0.000000f, -0.000000f, -1.000000f, 
			0.000000f, 0.000000f, 1.000000f
			};

		return normals;
	}


	@Override
	public float[] setColors(){
		float[] colors = {
			0.141f, 0.184f, 0.800f, 
			0.153f, 0.243f, 0.741f, 
			0.004f, 0.000f, 0.890f, 
			0.153f, 0.243f, 0.741f, 
			0.722f, 0.831f, 0.898f, 
			0.706f, 0.820f, 0.894f, 
			0.698f, 0.816f, 0.890f, 
			0.698f, 0.816f, 0.890f, 
			0.698f, 0.816f, 0.890f, 
			0.000f, 0.153f, 0.549f, 
			0.004f, 0.157f, 0.549f, 
			0.698f, 0.816f, 0.890f, 
			0.008f, 0.004f, 0.890f, 
			0.004f, 0.000f, 0.890f, 
			0.698f, 0.816f, 0.890f, 
			0.698f, 0.816f, 0.890f, 
			0.698f, 0.816f, 0.890f, 
			0.000f, 0.153f, 0.549f, 
			0.004f, 0.000f, 0.890f, 
			0.004f, 0.000f, 0.890f, 
			0.698f, 0.816f, 0.890f, 
			0.694f, 0.812f, 0.890f, 
			0.698f, 0.816f, 0.890f, 
			0.000f, 0.153f, 0.549f
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
			15, 16, 17, 
			18, 0, 2, 
			19, 3, 5, 
			20, 6, 8, 
			11, 10, 21, 
			22, 12, 14, 
			23, 15, 17
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
			coarseMap = new short[124][2];
			angleMap = new float[124];
			coarseMap[0][0] = 4;	coarseMap[0][1] = 25;	angleMap[0] = 2.708f;
			coarseMap[1][0] = 5;	coarseMap[1][1] = 25;	angleMap[1] = 1.571f;
			coarseMap[2][0] = 6;	coarseMap[2][1] = 25;	angleMap[2] = 1.571f;
			coarseMap[3][0] = 7;	coarseMap[3][1] = 25;	angleMap[3] = 1.571f;
			coarseMap[4][0] = 8;	coarseMap[4][1] = 25;	angleMap[4] = 1.571f;
			coarseMap[5][0] = 9;	coarseMap[5][1] = 25;	angleMap[5] = 1.571f;
			coarseMap[6][0] = 10;	coarseMap[6][1] = 25;	angleMap[6] = 1.571f;
			coarseMap[7][0] = 11;	coarseMap[7][1] = 25;	angleMap[7] = 1.571f;
			coarseMap[8][0] = 12;	coarseMap[8][1] = 25;	angleMap[8] = 1.571f;
			coarseMap[9][0] = 13;	coarseMap[9][1] = 25;	angleMap[9] = 1.571f;
			coarseMap[10][0] = 14;	coarseMap[10][1] = 25;	angleMap[10] = 1.571f;
			coarseMap[11][0] = 15;	coarseMap[11][1] = 25;	angleMap[11] = 1.571f;
			coarseMap[12][0] = 16;	coarseMap[12][1] = 25;	angleMap[12] = 1.571f;
			coarseMap[13][0] = 17;	coarseMap[13][1] = 25;	angleMap[13] = 1.571f;
			coarseMap[14][0] = 18;	coarseMap[14][1] = 25;	angleMap[14] = 1.571f;
			coarseMap[15][0] = 19;	coarseMap[15][1] = 25;	angleMap[15] = 1.571f;
			coarseMap[16][0] = 20;	coarseMap[16][1] = 25;	angleMap[16] = 1.571f;
			coarseMap[17][0] = 21;	coarseMap[17][1] = 25;	angleMap[17] = 1.571f;
			coarseMap[18][0] = 22;	coarseMap[18][1] = 25;	angleMap[18] = 1.571f;
			coarseMap[19][0] = 23;	coarseMap[19][1] = 25;	angleMap[19] = 1.571f;
			coarseMap[20][0] = 24;	coarseMap[20][1] = 25;	angleMap[20] = 1.571f;
			coarseMap[21][0] = 25;	coarseMap[21][1] = 25;	angleMap[21] = 1.571f;
			coarseMap[22][0] = 26;	coarseMap[22][1] = 25;	angleMap[22] = 1.571f;
			coarseMap[23][0] = 27;	coarseMap[23][1] = 25;	angleMap[23] = 1.571f;
			coarseMap[24][0] = 28;	coarseMap[24][1] = 25;	angleMap[24] = 1.571f;
			coarseMap[25][0] = 29;	coarseMap[25][1] = 25;	angleMap[25] = 1.571f;
			coarseMap[26][0] = 30;	coarseMap[26][1] = 25;	angleMap[26] = 1.571f;
			coarseMap[27][0] = 31;	coarseMap[27][1] = 25;	angleMap[27] = 1.571f;
			coarseMap[28][0] = 32;	coarseMap[28][1] = 25;	angleMap[28] = 1.571f;
			coarseMap[29][0] = 33;	coarseMap[29][1] = 25;	angleMap[29] = 1.571f;
			coarseMap[30][0] = 34;	coarseMap[30][1] = 25;	angleMap[30] = 1.571f;
			coarseMap[31][0] = 35;	coarseMap[31][1] = 25;	angleMap[31] = 1.571f;
			coarseMap[32][0] = 36;	coarseMap[32][1] = 25;	angleMap[32] = 1.571f;
			coarseMap[33][0] = 37;	coarseMap[33][1] = 25;	angleMap[33] = 1.571f;
			coarseMap[34][0] = 38;	coarseMap[34][1] = 25;	angleMap[34] = 1.571f;
			coarseMap[35][0] = 39;	coarseMap[35][1] = 25;	angleMap[35] = 1.571f;
			coarseMap[36][0] = 40;	coarseMap[36][1] = 25;	angleMap[36] = 1.571f;
			coarseMap[37][0] = 41;	coarseMap[37][1] = 25;	angleMap[37] = 1.571f;
			coarseMap[38][0] = 42;	coarseMap[38][1] = 25;	angleMap[38] = 1.571f;
			coarseMap[39][0] = 43;	coarseMap[39][1] = 25;	angleMap[39] = 1.571f;
			coarseMap[40][0] = 44;	coarseMap[40][1] = 25;	angleMap[40] = 1.571f;
			coarseMap[41][0] = 45;	coarseMap[41][1] = 25;	angleMap[41] = 1.571f;
			coarseMap[42][0] = 46;	coarseMap[42][1] = 25;	angleMap[42] = 1.571f;
			coarseMap[43][0] = 47;	coarseMap[43][1] = 25;	angleMap[43] = 1.571f;
			coarseMap[44][0] = 48;	coarseMap[44][1] = 25;	angleMap[44] = 1.571f;
			coarseMap[45][0] = 49;	coarseMap[45][1] = 25;	angleMap[45] = 1.571f;
			coarseMap[46][0] = 50;	coarseMap[46][1] = 25;	angleMap[46] = 1.571f;
			coarseMap[47][0] = 51;	coarseMap[47][1] = 25;	angleMap[47] = 1.571f;
			coarseMap[48][0] = 52;	coarseMap[48][1] = 25;	angleMap[48] = 1.571f;
			coarseMap[49][0] = 53;	coarseMap[49][1] = 25;	angleMap[49] = 1.571f;
			coarseMap[50][0] = 54;	coarseMap[50][1] = 25;	angleMap[50] = 1.571f;
			coarseMap[51][0] = 55;	coarseMap[51][1] = 25;	angleMap[51] = 1.571f;
			coarseMap[52][0] = 56;	coarseMap[52][1] = 25;	angleMap[52] = 0.434f;
			coarseMap[53][0] = 4;	coarseMap[53][1] = 26;	angleMap[53] = 3.142f;
			coarseMap[54][0] = 56;	coarseMap[54][1] = 26;	angleMap[54] = 0.000f;
			coarseMap[55][0] = 4;	coarseMap[55][1] = 27;	angleMap[55] = 3.142f;
			coarseMap[56][0] = 56;	coarseMap[56][1] = 27;	angleMap[56] = 0.000f;
			coarseMap[57][0] = 4;	coarseMap[57][1] = 28;	angleMap[57] = 3.142f;
			coarseMap[58][0] = 56;	coarseMap[58][1] = 28;	angleMap[58] = 0.000f;
			coarseMap[59][0] = 4;	coarseMap[59][1] = 29;	angleMap[59] = 3.142f;
			coarseMap[60][0] = 56;	coarseMap[60][1] = 29;	angleMap[60] = 0.000f;
			coarseMap[61][0] = 4;	coarseMap[61][1] = 30;	angleMap[61] = 3.142f;
			coarseMap[62][0] = 56;	coarseMap[62][1] = 30;	angleMap[62] = 0.000f;
			coarseMap[63][0] = 4;	coarseMap[63][1] = 31;	angleMap[63] = 3.142f;
			coarseMap[64][0] = 56;	coarseMap[64][1] = 31;	angleMap[64] = 0.000f;
			coarseMap[65][0] = 4;	coarseMap[65][1] = 32;	angleMap[65] = 3.142f;
			coarseMap[66][0] = 56;	coarseMap[66][1] = 32;	angleMap[66] = 0.000f;
			coarseMap[67][0] = 4;	coarseMap[67][1] = 33;	angleMap[67] = 3.142f;
			coarseMap[68][0] = 56;	coarseMap[68][1] = 33;	angleMap[68] = 0.000f;
			coarseMap[69][0] = 4;	coarseMap[69][1] = 34;	angleMap[69] = 3.142f;
			coarseMap[70][0] = 56;	coarseMap[70][1] = 34;	angleMap[70] = 0.000f;
			coarseMap[71][0] = 4;	coarseMap[71][1] = 35;	angleMap[71] = 3.576f;
			coarseMap[72][0] = 5;	coarseMap[72][1] = 35;	angleMap[72] = 4.712f;
			coarseMap[73][0] = 6;	coarseMap[73][1] = 35;	angleMap[73] = 4.712f;
			coarseMap[74][0] = 7;	coarseMap[74][1] = 35;	angleMap[74] = 4.712f;
			coarseMap[75][0] = 8;	coarseMap[75][1] = 35;	angleMap[75] = 4.712f;
			coarseMap[76][0] = 9;	coarseMap[76][1] = 35;	angleMap[76] = 4.712f;
			coarseMap[77][0] = 10;	coarseMap[77][1] = 35;	angleMap[77] = 4.712f;
			coarseMap[78][0] = 11;	coarseMap[78][1] = 35;	angleMap[78] = 4.712f;
			coarseMap[79][0] = 12;	coarseMap[79][1] = 35;	angleMap[79] = 4.712f;
			coarseMap[80][0] = 13;	coarseMap[80][1] = 35;	angleMap[80] = 4.712f;
			coarseMap[81][0] = 14;	coarseMap[81][1] = 35;	angleMap[81] = 4.712f;
			coarseMap[82][0] = 15;	coarseMap[82][1] = 35;	angleMap[82] = 4.712f;
			coarseMap[83][0] = 16;	coarseMap[83][1] = 35;	angleMap[83] = 4.712f;
			coarseMap[84][0] = 17;	coarseMap[84][1] = 35;	angleMap[84] = 4.712f;
			coarseMap[85][0] = 18;	coarseMap[85][1] = 35;	angleMap[85] = 4.712f;
			coarseMap[86][0] = 19;	coarseMap[86][1] = 35;	angleMap[86] = 4.712f;
			coarseMap[87][0] = 20;	coarseMap[87][1] = 35;	angleMap[87] = 4.712f;
			coarseMap[88][0] = 21;	coarseMap[88][1] = 35;	angleMap[88] = 4.712f;
			coarseMap[89][0] = 22;	coarseMap[89][1] = 35;	angleMap[89] = 4.712f;
			coarseMap[90][0] = 23;	coarseMap[90][1] = 35;	angleMap[90] = 4.712f;
			coarseMap[91][0] = 24;	coarseMap[91][1] = 35;	angleMap[91] = 4.712f;
			coarseMap[92][0] = 25;	coarseMap[92][1] = 35;	angleMap[92] = 4.712f;
			coarseMap[93][0] = 26;	coarseMap[93][1] = 35;	angleMap[93] = 4.712f;
			coarseMap[94][0] = 27;	coarseMap[94][1] = 35;	angleMap[94] = 4.712f;
			coarseMap[95][0] = 28;	coarseMap[95][1] = 35;	angleMap[95] = 4.712f;
			coarseMap[96][0] = 29;	coarseMap[96][1] = 35;	angleMap[96] = 4.712f;
			coarseMap[97][0] = 30;	coarseMap[97][1] = 35;	angleMap[97] = 4.712f;
			coarseMap[98][0] = 31;	coarseMap[98][1] = 35;	angleMap[98] = 4.712f;
			coarseMap[99][0] = 32;	coarseMap[99][1] = 35;	angleMap[99] = 4.712f;
			coarseMap[100][0] = 33;	coarseMap[100][1] = 35;	angleMap[100] = 4.712f;
			coarseMap[101][0] = 34;	coarseMap[101][1] = 35;	angleMap[101] = 4.712f;
			coarseMap[102][0] = 35;	coarseMap[102][1] = 35;	angleMap[102] = 4.712f;
			coarseMap[103][0] = 36;	coarseMap[103][1] = 35;	angleMap[103] = 4.712f;
			coarseMap[104][0] = 37;	coarseMap[104][1] = 35;	angleMap[104] = 4.712f;
			coarseMap[105][0] = 38;	coarseMap[105][1] = 35;	angleMap[105] = 4.712f;
			coarseMap[106][0] = 39;	coarseMap[106][1] = 35;	angleMap[106] = 4.712f;
			coarseMap[107][0] = 40;	coarseMap[107][1] = 35;	angleMap[107] = 4.712f;
			coarseMap[108][0] = 41;	coarseMap[108][1] = 35;	angleMap[108] = 4.712f;
			coarseMap[109][0] = 42;	coarseMap[109][1] = 35;	angleMap[109] = 4.712f;
			coarseMap[110][0] = 43;	coarseMap[110][1] = 35;	angleMap[110] = 4.712f;
			coarseMap[111][0] = 44;	coarseMap[111][1] = 35;	angleMap[111] = 4.712f;
			coarseMap[112][0] = 45;	coarseMap[112][1] = 35;	angleMap[112] = 4.712f;
			coarseMap[113][0] = 46;	coarseMap[113][1] = 35;	angleMap[113] = 4.712f;
			coarseMap[114][0] = 47;	coarseMap[114][1] = 35;	angleMap[114] = 4.712f;
			coarseMap[115][0] = 48;	coarseMap[115][1] = 35;	angleMap[115] = 4.712f;
			coarseMap[116][0] = 49;	coarseMap[116][1] = 35;	angleMap[116] = 4.712f;
			coarseMap[117][0] = 50;	coarseMap[117][1] = 35;	angleMap[117] = 4.712f;
			coarseMap[118][0] = 51;	coarseMap[118][1] = 35;	angleMap[118] = 4.712f;
			coarseMap[119][0] = 52;	coarseMap[119][1] = 35;	angleMap[119] = 4.712f;
			coarseMap[120][0] = 53;	coarseMap[120][1] = 35;	angleMap[120] = 4.712f;
			coarseMap[121][0] = 54;	coarseMap[121][1] = 35;	angleMap[121] = 4.712f;
			coarseMap[122][0] = 55;	coarseMap[122][1] = 35;	angleMap[122] = 4.712f;
			coarseMap[123][0] = 56;	coarseMap[123][1] = 35;	angleMap[123] = 3.038f;
			return null;
			
		}

	@Override
	protected void initObject() {
		// TODO Auto-generated method stub
		
	}

}
