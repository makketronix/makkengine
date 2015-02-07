package com.makketronix.makkengine.testobjects;

import com.makketronix.makkengine.abstractobjects.ObjectsEnum;
import com.makketronix.makkengine.makkobjects.ShapeData;

public class Cannon extends ShapeData {

	@Override
	public float[] setVertices(){
		float[] verts = {
			-0.007351f, -1.226964f, 0.422180f, 
			-0.007351f, 0.300674f, 0.375266f, 
			-0.260275f, -1.228731f, 0.340013f, 
			-0.260275f, 0.299236f, 0.293099f, 
			-0.416590f, -1.233357f, 0.124896f, 
			-0.416590f, 0.295471f, 0.077983f, 
			-0.416590f, -1.239075f, -0.141002f, 
			-0.416590f, -1.239075f, -0.141002f, 
			-0.416590f, 0.290818f, -0.187916f, 
			-0.260274f, -1.243702f, -0.356119f, 
			-0.260274f, -1.243702f, -0.356119f, 
			-0.260274f, 0.287053f, -0.403033f, 
			-0.007351f, -1.245469f, -0.438286f, 
			-0.007351f, -1.245469f, -0.438286f, 
			-0.007351f, 0.285615f, -0.485200f, 
			0.245573f, 0.287053f, -0.403033f, 
			0.245573f, -1.243702f, -0.356119f, 
			0.401888f, 0.290818f, -0.187916f, 
			0.401888f, -1.239075f, -0.141002f, 
			0.401888f, 0.295471f, 0.077983f, 
			0.245572f, -1.228731f, 0.340013f, 
			0.245572f, 0.299236f, 0.293099f, 
			0.401888f, -1.233357f, 0.124897f, 
			0.245573f, -1.243702f, -0.356119f, 
			-0.260274f, -1.243702f, -0.356119f, 
			-0.007351f, -1.245469f, -0.438286f, 
			-0.221566f, -1.017852f, 0.283722f, 
			-0.209692f, 0.298018f, 0.223486f, 
			-0.007351f, 0.299168f, 0.289220f, 
			-0.353955f, -1.021771f, 0.101530f, 
			-0.334743f, 0.295006f, 0.051394f, 
			-0.209692f, 0.298018f, 0.223486f, 
			-0.353955f, -1.026614f, -0.123676f, 
			-0.334743f, 0.291283f, -0.161328f, 
			-0.334743f, 0.295006f, 0.051394f, 
			-0.221566f, -1.030532f, -0.305868f, 
			-0.209692f, 0.288271f, -0.333420f, 
			-0.007351f, -1.032029f, -0.375459f, 
			-0.007351f, 0.287121f, -0.399153f, 
			-0.209692f, 0.288271f, -0.333420f, 
			0.206865f, -1.030532f, -0.305867f, 
			0.194990f, 0.288271f, -0.333420f, 
			-0.007351f, -1.032029f, -0.375459f, 
			0.339253f, -1.026614f, -0.123676f, 
			0.320041f, 0.291283f, -0.161328f, 
			0.339253f, -1.021771f, 0.101530f, 
			0.320041f, 0.295006f, 0.051394f, 
			-0.007351f, -1.016356f, 0.353313f, 
			0.206864f, -1.017852f, 0.283722f, 
			0.194990f, 0.298018f, 0.223486f, 
			0.339253f, -1.021771f, 0.101530f, 
			0.206865f, -1.030532f, -0.305867f, 
			-0.007351f, 0.299168f, 0.289220f, 
			-0.209692f, 0.298018f, 0.223486f, 
			-0.334743f, 0.295006f, 0.051394f, 
			-0.260274f, 0.287053f, -0.403033f, 
			-0.209692f, 0.288271f, -0.333420f, 
			-0.007351f, 0.285615f, -0.485200f, 
			-0.007351f, 0.287121f, -0.399153f, 
			0.194990f, 0.288271f, -0.333420f, 
			0.401888f, 0.295471f, 0.077983f, 
			0.320041f, 0.291283f, -0.161328f, 
			0.194990f, 0.298018f, 0.223486f, 
			0.967417f, -1.235650f, 0.478049f, 
			0.967417f, -1.965945f, 0.478049f, 
			1.110991f, -1.746856f, 0.173479f, 
			0.010144f, -1.235650f, 0.478049f, 
			-0.947129f, -1.235650f, -0.392153f, 
			-0.947130f, -1.235650f, 0.478049f, 
			-0.947130f, -1.965945f, 0.478049f, 
			-1.126257f, -1.746856f, 0.173479f, 
			0.967417f, -2.696240f, -0.392152f, 
			0.967417f, -2.696240f, 0.478049f, 
			0.010144f, -2.696240f, 0.478049f, 
			0.010144f, -1.965945f, 0.478049f, 
			-0.947129f, -2.696240f, -0.392153f, 
			-0.468493f, -2.331092f, -0.647646f, 
			-1.126257f, -1.746856f, -0.087582f, 
			-1.126257f, -2.185033f, -0.087582f, 
			-1.126257f, -2.185033f, 0.173479f, 
			-0.947130f, -2.696240f, 0.478049f, 
			-0.947129f, -1.235650f, -0.392153f, 
			1.110991f, -2.185033f, -0.087582f, 
			1.110991f, -1.746856f, -0.087582f, 
			0.967417f, -1.235650f, -0.392152f, 
			0.967417f, -2.696240f, -0.392152f, 
			-0.324902f, -2.221548f, 0.752107f, 
			0.345189f, -2.440637f, 0.794269f, 
			-0.324902f, -2.440637f, 0.752107f, 
			-0.612084f, -2.221548f, 0.752107f, 
			-0.612084f, -2.440637f, 0.752107f, 
			0.632371f, -2.440637f, 0.794269f, 
			0.632371f, -2.221548f, 0.794269f, 
			0.345189f, -2.221548f, 0.794269f, 
			-0.468493f, -1.600798f, -0.647646f, 
			0.488781f, -2.331092f, -0.647646f, 
			0.091254f, -1.397001f, -0.604090f, 
			0.728099f, -1.418224f, -0.519899f, 
			0.488781f, -1.600798f, -0.647646f, 
			-0.707811f, -1.418224f, -0.519899f, 
			0.091254f, -1.397001f, -0.604090f, 
			0.091254f, -1.225998f, -0.476344f, 
			0.091254f, -1.225998f, -0.476344f, 
			-0.416590f, 0.295471f, 0.077983f, 
			-0.416590f, -1.233357f, 0.124896f, 
			-0.260274f, 0.287053f, -0.403033f, 
			-0.260274f, 0.287053f, -0.403033f, 
			-0.007351f, 0.285615f, -0.485200f, 
			0.245573f, -1.243702f, -0.356119f, 
			-0.007351f, -1.245469f, -0.438286f, 
			0.245572f, -1.228731f, 0.340013f, 
			-0.416590f, -1.239075f, -0.141002f, 
			0.401888f, -1.239075f, -0.141002f, 
			0.401888f, -1.233357f, 0.124897f, 
			-0.416590f, -1.233357f, 0.124896f, 
			-0.260275f, -1.228731f, 0.340013f, 
			-0.007351f, -1.226964f, 0.422180f, 
			0.245572f, -1.228731f, 0.340013f, 
			-0.221566f, -1.017852f, 0.283722f, 
			-0.007351f, 0.287121f, -0.399153f, 
			0.194990f, 0.288271f, -0.333420f, 
			0.320041f, 0.295006f, 0.051394f, 
			0.206865f, -1.030532f, -0.305867f, 
			0.339253f, -1.026614f, -0.123676f, 
			0.206865f, -1.030532f, -0.305867f, 
			-0.221566f, -1.017852f, 0.283722f, 
			-0.221566f, -1.017852f, 0.283722f, 
			-0.334743f, 0.291283f, -0.161328f, 
			0.320041f, 0.295006f, 0.051394f, 
			1.110991f, -2.185033f, 0.173479f, 
			-0.947130f, -2.696240f, 0.478049f, 
			0.010144f, -1.600798f, -0.647646f
			};

		return verts;
	}


	@Override
	public float[] setNormals(){
		float[] normals = {
			0.000000f, -0.623585f, 0.781732f, 
			0.000000f, 0.661855f, 0.749596f, 
			-0.450514f, -0.627400f, 0.635090f, 
			-0.448775f, 0.658345f, 0.604266f, 
			-0.728233f, -0.637379f, 0.251747f, 
			-0.727165f, 0.649220f, 0.222938f, 
			-0.727348f, -0.649648f, -0.221015f, 
			-0.727348f, -0.649648f, -0.221015f, 
			-0.728446f, 0.637898f, -0.249855f, 
			-0.449110f, -0.659566f, -0.602680f, 
			-0.449110f, -0.659566f, -0.602680f, 
			-0.450819f, 0.628712f, -0.633564f, 
			0.000000f, -0.663350f, -0.748283f, 
			0.000000f, -0.663350f, -0.748283f, 
			0.000000f, 0.625233f, -0.780419f, 
			0.450819f, 0.628712f, -0.633564f, 
			0.449110f, -0.659566f, -0.602680f, 
			0.728446f, 0.637898f, -0.249855f, 
			0.727348f, -0.649648f, -0.221015f, 
			0.727165f, 0.649220f, 0.222938f, 
			0.450514f, -0.627400f, 0.635090f, 
			0.448775f, 0.658345f, 0.604266f, 
			0.728233f, -0.637379f, 0.251747f, 
			0.449110f, -0.659566f, -0.602680f, 
			-0.449110f, -0.659566f, -0.602680f, 
			0.000000f, -0.663350f, -0.748283f, 
			0.453536f, 0.620746f, -0.639485f, 
			0.372234f, 0.766137f, -0.523850f, 
			0.000000f, 0.763054f, -0.646290f, 
			0.732933f, 0.631275f, -0.253517f, 
			0.598529f, 0.774132f, -0.206061f, 
			0.372234f, 0.766137f, -0.523850f, 
			0.731803f, 0.644246f, 0.222175f, 
			0.593860f, 0.783868f, 0.181219f, 
			0.598529f, 0.774132f, -0.206061f, 
			0.451735f, 0.654714f, 0.606006f, 
			0.364727f, 0.791650f, 0.490158f, 
			0.000000f, 0.658711f, 0.752373f, 
			0.000000f, 0.794580f, 0.607135f, 
			0.364727f, 0.791650f, 0.490158f, 
			-0.451735f, 0.654714f, 0.606006f, 
			-0.364727f, 0.791650f, 0.490158f, 
			0.000000f, 0.658711f, 0.752373f, 
			-0.731803f, 0.644246f, 0.222175f, 
			-0.593860f, 0.783868f, 0.181219f, 
			-0.732933f, 0.631275f, -0.253517f, 
			-0.598529f, 0.774132f, -0.206061f, 
			0.000000f, 0.616718f, -0.787164f, 
			-0.453536f, 0.620746f, -0.639485f, 
			-0.372234f, 0.766137f, -0.523850f, 
			-0.732933f, 0.631275f, -0.253517f, 
			-0.451735f, 0.654714f, 0.606006f, 
			0.000000f, 0.763054f, -0.646290f, 
			0.372234f, 0.766137f, -0.523850f, 
			0.598529f, 0.774132f, -0.206061f, 
			-0.450819f, 0.628712f, -0.633564f, 
			0.364727f, 0.791650f, 0.490158f, 
			0.000000f, 0.625233f, -0.780419f, 
			0.000000f, 0.794580f, 0.607135f, 
			-0.364727f, 0.791650f, 0.490158f, 
			0.727165f, 0.649220f, 0.222938f, 
			-0.593860f, 0.783868f, 0.181219f, 
			-0.372234f, 0.766137f, -0.523850f, 
			0.509354f, 0.614338f, 0.602557f, 
			0.639546f, 0.122745f, 0.758843f, 
			0.978973f, 0.093844f, 0.181066f, 
			-0.000061f, 0.705191f, 0.708975f, 
			-0.568316f, 0.657582f, -0.494522f, 
			-0.492569f, 0.622364f, 0.608264f, 
			-0.591906f, 0.108219f, 0.798669f, 
			-0.968993f, 0.116611f, 0.217719f, 
			0.572344f, -0.654286f, -0.494247f, 
			0.604389f, -0.676901f, 0.420087f, 
			-0.014161f, -0.854030f, 0.520005f, 
			-0.012299f, 0.217170f, 0.976043f, 
			-0.557360f, -0.661336f, -0.501907f, 
			-0.178655f, -0.240516f, -0.954039f, 
			-0.968993f, 0.116611f, -0.217719f, 
			-0.968993f, -0.116611f, -0.217719f, 
			-0.968993f, -0.116611f, 0.217719f, 
			-0.581744f, -0.677664f, 0.449812f, 
			-0.568316f, 0.657582f, -0.494522f, 
			0.978973f, -0.093844f, -0.181066f, 
			0.978973f, 0.093844f, -0.181066f, 
			0.585192f, 0.649648f, -0.485244f, 
			0.572344f, -0.654286f, -0.494247f, 
			0.254769f, 0.321696f, 0.911893f, 
			-0.282937f, -0.348796f, 0.893460f, 
			0.254769f, -0.321696f, 0.911893f, 
			-0.254769f, 0.321696f, 0.911893f, 
			-0.254769f, -0.321696f, 0.911893f, 
			0.282937f, -0.348796f, 0.893460f, 
			0.282937f, 0.348796f, 0.893460f, 
			-0.282937f, 0.348796f, 0.893460f, 
			-0.210761f, 0.179357f, -0.960906f, 
			0.178655f, -0.240516f, -0.954039f, 
			0.010498f, 0.443281f, -0.896298f, 
			0.301187f, 0.258339f, -0.917875f, 
			0.216437f, 0.163945f, -0.962401f, 
			-0.292459f, 0.266610f, -0.918332f, 
			0.010498f, 0.443281f, -0.896298f, 
			0.007294f, 0.881649f, -0.471786f, 
			0.007294f, 0.881649f, -0.471786f, 
			-0.727165f, 0.649220f, 0.222938f, 
			-0.728233f, -0.637379f, 0.251747f, 
			-0.450819f, 0.628712f, -0.633564f, 
			-0.450819f, 0.628712f, -0.633564f, 
			0.000000f, 0.625233f, -0.780419f, 
			0.449110f, -0.659566f, -0.602680f, 
			0.000000f, -0.663350f, -0.748283f, 
			0.450514f, -0.627400f, 0.635090f, 
			-0.727348f, -0.649648f, -0.221015f, 
			0.727348f, -0.649648f, -0.221015f, 
			0.728233f, -0.637379f, 0.251747f, 
			-0.728233f, -0.637379f, 0.251747f, 
			-0.450514f, -0.627400f, 0.635090f, 
			0.000000f, -0.623585f, 0.781732f, 
			0.450514f, -0.627400f, 0.635090f, 
			0.453536f, 0.620746f, -0.639485f, 
			0.000000f, 0.794580f, 0.607135f, 
			-0.364727f, 0.791650f, 0.490158f, 
			-0.598529f, 0.774132f, -0.206061f, 
			-0.451735f, 0.654714f, 0.606006f, 
			-0.731803f, 0.644246f, 0.222175f, 
			-0.451735f, 0.654714f, 0.606006f, 
			0.453536f, 0.620746f, -0.639485f, 
			0.453536f, 0.620746f, -0.639485f, 
			0.593860f, 0.783868f, 0.181219f, 
			-0.598529f, 0.774132f, -0.206061f, 
			0.978973f, -0.093844f, 0.181066f, 
			-0.581744f, -0.677664f, 0.449812f, 
			0.000000f, 0.105075f, -0.994446f
			};

		return normals;
	}


	@Override
	public float[] setColors(){
		float[] colors = {
			0.008f, 0.000f, 0.475f, 
			0.231f, 0.129f, 0.000f, 
			0.000f, 0.000f, 0.106f, 
			0.369f, 0.208f, 0.000f, 
			0.004f, 0.004f, 0.141f, 
			0.243f, 0.141f, 0.000f, 
			0.000f, 0.000f, 0.114f, 
			0.004f, 0.004f, 0.114f, 
			0.357f, 0.212f, 0.024f, 
			0.000f, 0.000f, 0.106f, 
			0.004f, 0.004f, 0.110f, 
			0.149f, 0.106f, 0.031f, 
			0.000f, 0.000f, 0.102f, 
			0.012f, 0.008f, 0.243f, 
			0.122f, 0.082f, 0.008f, 
			0.106f, 0.067f, 0.000f, 
			0.075f, 0.075f, 0.208f, 
			0.118f, 0.075f, 0.004f, 
			0.000f, 0.000f, 0.102f, 
			0.133f, 0.086f, 0.016f, 
			0.004f, 0.000f, 0.114f, 
			0.369f, 0.208f, 0.000f, 
			0.000f, 0.000f, 0.102f, 
			1.000f, 1.000f, 1.000f, 
			1.000f, 1.000f, 1.000f, 
			1.000f, 1.000f, 1.000f, 
			0.024f, 0.016f, 0.024f, 
			0.125f, 0.078f, 0.000f, 
			0.039f, 0.027f, 0.047f, 
			0.000f, 0.000f, 0.020f, 
			0.122f, 0.075f, 0.000f, 
			0.059f, 0.035f, 0.012f, 
			0.000f, 0.000f, 0.020f, 
			0.122f, 0.075f, 0.000f, 
			0.125f, 0.075f, 0.000f, 
			0.000f, 0.000f, 0.020f, 
			0.251f, 0.157f, 0.000f, 
			0.000f, 0.000f, 0.020f, 
			0.055f, 0.035f, 0.012f, 
			0.286f, 0.173f, 0.000f, 
			0.090f, 0.075f, 0.075f, 
			0.259f, 0.169f, 0.012f, 
			0.247f, 0.153f, 0.000f, 
			0.012f, 0.004f, 0.020f, 
			0.251f, 0.157f, 0.000f, 
			0.051f, 0.027f, 0.016f, 
			0.251f, 0.157f, 0.000f, 
			0.000f, 0.000f, 0.020f, 
			0.000f, 0.000f, 0.020f, 
			0.071f, 0.043f, 0.090f, 
			0.000f, 0.000f, 0.020f, 
			0.043f, 0.043f, 0.063f, 
			0.243f, 0.137f, 0.000f, 
			0.369f, 0.208f, 0.000f, 
			0.365f, 0.204f, 0.000f, 
			0.133f, 0.086f, 0.004f, 
			0.235f, 0.137f, 0.000f, 
			0.114f, 0.075f, 0.000f, 
			0.000f, 0.000f, 0.020f, 
			0.000f, 0.000f, 0.020f, 
			0.129f, 0.082f, 0.008f, 
			0.000f, 0.000f, 0.020f, 
			0.369f, 0.208f, 0.000f, 
			0.004f, 0.000f, 0.282f, 
			0.012f, 0.000f, 0.859f, 
			0.863f, 0.435f, 0.024f, 
			0.008f, 0.000f, 0.541f, 
			0.102f, 0.043f, 0.569f, 
			0.008f, 0.000f, 0.541f, 
			0.012f, 0.000f, 0.859f, 
			0.859f, 0.420f, 0.000f, 
			0.247f, 0.373f, 0.859f, 
			0.012f, 0.000f, 0.859f, 
			0.247f, 0.373f, 0.859f, 
			0.569f, 0.608f, 0.820f, 
			0.247f, 0.373f, 0.859f, 
			0.310f, 0.157f, 0.000f, 
			0.859f, 0.420f, 0.000f, 
			0.859f, 0.420f, 0.000f, 
			0.859f, 0.424f, 0.008f, 
			0.000f, 0.255f, 0.859f, 
			0.204f, 0.090f, 0.871f, 
			0.859f, 0.420f, 0.000f, 
			0.859f, 0.420f, 0.000f, 
			0.137f, 0.012f, 0.859f, 
			0.251f, 0.376f, 0.859f, 
			0.859f, 0.420f, 0.000f, 
			0.859f, 0.420f, 0.000f, 
			0.859f, 0.420f, 0.000f, 
			0.859f, 0.420f, 0.000f, 
			0.859f, 0.420f, 0.000f, 
			0.859f, 0.420f, 0.000f, 
			0.859f, 0.420f, 0.000f, 
			0.859f, 0.424f, 0.000f, 
			0.310f, 0.157f, 0.000f, 
			0.310f, 0.157f, 0.000f, 
			0.302f, 0.157f, 0.000f, 
			0.318f, 0.169f, 0.016f, 
			0.310f, 0.157f, 0.000f, 
			0.310f, 0.157f, 0.000f, 
			0.310f, 0.157f, 0.000f, 
			0.000f, 0.000f, 0.110f, 
			0.008f, 0.000f, 0.212f, 
			0.251f, 0.149f, 0.008f, 
			0.004f, 0.004f, 0.118f, 
			0.161f, 0.110f, 0.039f, 
			0.129f, 0.082f, 0.004f, 
			0.118f, 0.075f, 0.000f, 
			0.110f, 0.110f, 0.247f, 
			0.008f, 0.004f, 0.239f, 
			0.004f, 0.004f, 0.114f, 
			1.000f, 1.000f, 1.000f, 
			1.000f, 1.000f, 1.000f, 
			1.000f, 1.000f, 1.000f, 
			1.000f, 1.000f, 1.000f, 
			1.000f, 1.000f, 1.000f, 
			1.000f, 1.000f, 1.000f, 
			1.000f, 1.000f, 1.000f, 
			0.008f, 0.004f, 0.020f, 
			0.251f, 0.157f, 0.000f, 
			0.251f, 0.157f, 0.000f, 
			0.012f, 0.004f, 0.020f, 
			0.016f, 0.016f, 0.035f, 
			0.000f, 0.000f, 0.020f, 
			0.016f, 0.016f, 0.031f, 
			0.020f, 0.020f, 0.039f, 
			0.086f, 0.086f, 0.102f, 
			0.369f, 0.208f, 0.000f, 
			0.012f, 0.008f, 0.020f, 
			0.859f, 0.420f, 0.000f, 
			0.004f, 0.259f, 0.859f, 
			0.310f, 0.157f, 0.000f
			};

		return colors;
	}


	@Override
	public short[] setDrawOrder(){
		short[] order = {
			2, 3, 4, 
			4, 5, 6, 
			7, 8, 9, 
			10, 11, 12, 
			13, 14, 15, 
			16, 15, 17, 
			18, 17, 19, 
			20, 21, 1, 
			22, 19, 21, 
			23, 24, 25, 
			26, 27, 28, 
			29, 30, 31, 
			32, 33, 34, 
			35, 36, 33, 
			37, 38, 39, 
			40, 41, 42, 
			43, 44, 40, 
			45, 46, 43, 
			47, 28, 48, 
			48, 49, 50, 
			35, 51, 37, 
			3, 1, 52, 
			5, 3, 53, 
			8, 5, 54, 
			55, 8, 56, 
			57, 55, 58, 
			15, 57, 58, 
			17, 15, 59, 
			60, 17, 61, 
			21, 60, 62, 
			1, 21, 52, 
			63, 64, 65, 
			66, 67, 68, 
			69, 68, 70, 
			71, 72, 73, 
			74, 66, 68, 
			71, 75, 76, 
			77, 78, 79, 
			75, 80, 79, 
			81, 75, 78, 
			68, 81, 77, 
			82, 83, 65, 
			84, 63, 65, 
			85, 84, 83, 
			72, 85, 82, 
			73, 74, 86, 
			74, 73, 87, 
			64, 63, 66, 
			88, 86, 89, 
			74, 69, 89, 
			69, 80, 90, 
			80, 73, 88, 
			91, 92, 93, 
			64, 74, 93, 
			73, 72, 91, 
			72, 64, 92, 
			76, 94, 95, 
			75, 81, 76, 
			96, 97, 98, 
			84, 71, 95, 
			99, 100, 94, 
			67, 101, 99, 
			102, 84, 97, 
			1, 3, 2, 
			3, 103, 104, 
			5, 8, 6, 
			8, 105, 9, 
			106, 107, 12, 
			108, 109, 15, 
			18, 16, 17, 
			22, 18, 19, 
			0, 20, 1, 
			110, 22, 21, 
			23, 111, 24, 
			112, 111, 23, 
			113, 111, 112, 
			113, 114, 111, 
			115, 114, 113, 
			116, 115, 117, 
			115, 113, 117, 
			47, 26, 28, 
			118, 29, 31, 
			29, 32, 34, 
			32, 35, 33, 
			35, 37, 36, 
			41, 119, 42, 
			44, 120, 40, 
			46, 44, 43, 
			28, 49, 48, 
			49, 121, 45, 
			32, 122, 35, 
			32, 123, 124, 
			50, 123, 32, 
			50, 32, 29, 
			50, 29, 125, 
			48, 50, 125, 
			47, 48, 126, 
			53, 3, 52, 
			54, 5, 53, 
			127, 8, 54, 
			8, 127, 56, 
			55, 56, 58, 
			59, 15, 58, 
			61, 17, 59, 
			128, 60, 61, 
			60, 128, 62, 
			21, 62, 52, 
			64, 72, 129, 
			65, 64, 129, 
			101, 67, 66, 
			84, 101, 66, 
			63, 84, 66, 
			80, 69, 79, 
			69, 70, 79, 
			75, 71, 73, 
			130, 75, 73, 
			69, 74, 68, 
			95, 71, 76, 
			70, 77, 79, 
			78, 75, 79, 
			77, 81, 78, 
			70, 68, 77, 
			129, 82, 65, 
			83, 84, 65, 
			82, 85, 83, 
			129, 72, 82, 
			88, 73, 86, 
			93, 74, 87, 
			74, 64, 66, 
			90, 88, 89, 
			86, 74, 89, 
			89, 69, 90, 
			90, 80, 88, 
			87, 91, 93, 
			92, 64, 93, 
			87, 73, 91, 
			91, 72, 92, 
			94, 131, 95, 
			131, 98, 95, 
			81, 99, 76, 
			99, 94, 76, 
			131, 100, 98, 
			97, 84, 95, 
			98, 97, 95, 
			100, 131, 94, 
			101, 100, 99, 
			96, 102, 97
			};

		return order;
	}

	@Override
	public short[][] setCoarseAndMap(){
			coarseMap = new short[411][2];
			angleMap = new float[411];
			coarseMap[0][0] = 24;	coarseMap[0][1] = 25;	angleMap[0] = 1.670f;
			coarseMap[1][0] = 25;	coarseMap[1][1] = 25;	angleMap[1] = 1.551f;
			coarseMap[2][0] = 26;	coarseMap[2][1] = 25;	angleMap[2] = 1.546f;
			coarseMap[3][0] = 27;	coarseMap[3][1] = 25;	angleMap[3] = 1.565f;
			coarseMap[4][0] = 28;	coarseMap[4][1] = 25;	angleMap[4] = 1.568f;
			coarseMap[5][0] = 29;	coarseMap[5][1] = 25;	angleMap[5] = 1.576f;
			coarseMap[6][0] = 30;	coarseMap[6][1] = 25;	angleMap[6] = 1.593f;
			coarseMap[7][0] = 31;	coarseMap[7][1] = 25;	angleMap[7] = 1.609f;
			coarseMap[8][0] = 32;	coarseMap[8][1] = 25;	angleMap[8] = 1.508f;
			coarseMap[9][0] = 24;	coarseMap[9][1] = 26;	angleMap[9] = 3.142f;
			coarseMap[10][0] = 25;	coarseMap[10][1] = 26;	angleMap[10] = 4.138f;
			coarseMap[11][0] = 26;	coarseMap[11][1] = 26;	angleMap[11] = 3.126f;
			coarseMap[12][0] = 27;	coarseMap[12][1] = 26;	angleMap[12] = 3.113f;
			coarseMap[13][0] = 28;	coarseMap[13][1] = 26;	angleMap[13] = 3.132f;
			coarseMap[14][0] = 29;	coarseMap[14][1] = 26;	angleMap[14] = 3.170f;
			coarseMap[15][0] = 30;	coarseMap[15][1] = 26;	angleMap[15] = 3.164f;
			coarseMap[16][0] = 31;	coarseMap[16][1] = 26;	angleMap[16] = 3.153f;
			coarseMap[17][0] = 32;	coarseMap[17][1] = 26;	angleMap[17] = 1.621f;
			coarseMap[18][0] = 24;	coarseMap[18][1] = 27;	angleMap[18] = 3.142f;
			coarseMap[19][0] = 25;	coarseMap[19][1] = 27;	angleMap[19] = 4.138f;
			coarseMap[20][0] = 26;	coarseMap[20][1] = 27;	angleMap[20] = 3.124f;
			coarseMap[21][0] = 27;	coarseMap[21][1] = 27;	angleMap[21] = 3.115f;
			coarseMap[22][0] = 28;	coarseMap[22][1] = 27;	angleMap[22] = 3.132f;
			coarseMap[23][0] = 29;	coarseMap[23][1] = 27;	angleMap[23] = 3.170f;
			coarseMap[24][0] = 30;	coarseMap[24][1] = 27;	angleMap[24] = 3.164f;
			coarseMap[25][0] = 31;	coarseMap[25][1] = 27;	angleMap[25] = 3.154f;
			coarseMap[26][0] = 32;	coarseMap[26][1] = 27;	angleMap[26] = 1.621f;
			coarseMap[27][0] = 24;	coarseMap[27][1] = 28;	angleMap[27] = 3.142f;
			coarseMap[28][0] = 25;	coarseMap[28][1] = 28;	angleMap[28] = 4.370f;
			coarseMap[29][0] = 26;	coarseMap[29][1] = 28;	angleMap[29] = 3.120f;
			coarseMap[30][0] = 27;	coarseMap[30][1] = 28;	angleMap[30] = 3.107f;
			coarseMap[31][0] = 28;	coarseMap[31][1] = 28;	angleMap[31] = 3.129f;
			coarseMap[32][0] = 29;	coarseMap[32][1] = 28;	angleMap[32] = 3.178f;
			coarseMap[33][0] = 30;	coarseMap[33][1] = 28;	angleMap[33] = 3.169f;
			coarseMap[34][0] = 31;	coarseMap[34][1] = 28;	angleMap[34] = 3.156f;
			coarseMap[35][0] = 32;	coarseMap[35][1] = 28;	angleMap[35] = 1.621f;
			coarseMap[36][0] = 24;	coarseMap[36][1] = 29;	angleMap[36] = 3.142f;
			coarseMap[37][0] = 25;	coarseMap[37][1] = 29;	angleMap[37] = 4.138f;
			coarseMap[38][0] = 26;	coarseMap[38][1] = 29;	angleMap[38] = 3.124f;
			coarseMap[39][0] = 27;	coarseMap[39][1] = 29;	angleMap[39] = 3.115f;
			coarseMap[40][0] = 28;	coarseMap[40][1] = 29;	angleMap[40] = 3.132f;
			coarseMap[41][0] = 29;	coarseMap[41][1] = 29;	angleMap[41] = 3.170f;
			coarseMap[42][0] = 30;	coarseMap[42][1] = 29;	angleMap[42] = 3.164f;
			coarseMap[43][0] = 31;	coarseMap[43][1] = 29;	angleMap[43] = 3.154f;
			coarseMap[44][0] = 32;	coarseMap[44][1] = 29;	angleMap[44] = 1.621f;
			coarseMap[45][0] = 24;	coarseMap[45][1] = 30;	angleMap[45] = 3.142f;
			coarseMap[46][0] = 25;	coarseMap[46][1] = 30;	angleMap[46] = 4.138f;
			coarseMap[47][0] = 26;	coarseMap[47][1] = 30;	angleMap[47] = 3.124f;
			coarseMap[48][0] = 27;	coarseMap[48][1] = 30;	angleMap[48] = 3.115f;
			coarseMap[49][0] = 28;	coarseMap[49][1] = 30;	angleMap[49] = 3.132f;
			coarseMap[50][0] = 29;	coarseMap[50][1] = 30;	angleMap[50] = 3.170f;
			coarseMap[51][0] = 30;	coarseMap[51][1] = 30;	angleMap[51] = 3.164f;
			coarseMap[52][0] = 31;	coarseMap[52][1] = 30;	angleMap[52] = 3.154f;
			coarseMap[53][0] = 32;	coarseMap[53][1] = 30;	angleMap[53] = 1.621f;
			coarseMap[54][0] = 24;	coarseMap[54][1] = 31;	angleMap[54] = 3.142f;
			coarseMap[55][0] = 25;	coarseMap[55][1] = 31;	angleMap[55] = 4.580f;
			coarseMap[56][0] = 26;	coarseMap[56][1] = 31;	angleMap[56] = 3.845f;
			coarseMap[57][0] = 27;	coarseMap[57][1] = 31;	angleMap[57] = 3.753f;
			coarseMap[58][0] = 28;	coarseMap[58][1] = 31;	angleMap[58] = 3.576f;
			coarseMap[59][0] = 29;	coarseMap[59][1] = 31;	angleMap[59] = 3.199f;
			coarseMap[60][0] = 30;	coarseMap[60][1] = 31;	angleMap[60] = 3.184f;
			coarseMap[61][0] = 31;	coarseMap[61][1] = 31;	angleMap[61] = 3.159f;
			coarseMap[62][0] = 32;	coarseMap[62][1] = 31;	angleMap[62] = 2.276f;
			coarseMap[63][0] = 24;	coarseMap[63][1] = 32;	angleMap[63] = 3.142f;
			coarseMap[64][0] = 25;	coarseMap[64][1] = 32;	angleMap[64] = 3.981f;
			coarseMap[65][0] = 26;	coarseMap[65][1] = 32;	angleMap[65] = 2.447f;
			coarseMap[66][0] = 27;	coarseMap[66][1] = 32;	angleMap[66] = 2.581f;
			coarseMap[67][0] = 28;	coarseMap[67][1] = 32;	angleMap[67] = 2.552f;
			coarseMap[68][0] = 29;	coarseMap[68][1] = 32;	angleMap[68] = 2.715f;
			coarseMap[69][0] = 30;	coarseMap[69][1] = 32;	angleMap[69] = 2.743f;
			coarseMap[70][0] = 31;	coarseMap[70][1] = 32;	angleMap[70] = 3.042f;
			coarseMap[71][0] = 32;	coarseMap[71][1] = 32;	angleMap[71] = 2.350f;
			coarseMap[72][0] = 24;	coarseMap[72][1] = 33;	angleMap[72] = 3.139f;
			coarseMap[73][0] = 25;	coarseMap[73][1] = 33;	angleMap[73] = 3.950f;
			coarseMap[74][0] = 26;	coarseMap[74][1] = 33;	angleMap[74] = 3.124f;
			coarseMap[75][0] = 27;	coarseMap[75][1] = 33;	angleMap[75] = 3.113f;
			coarseMap[76][0] = 28;	coarseMap[76][1] = 33;	angleMap[76] = 3.134f;
			coarseMap[77][0] = 29;	coarseMap[77][1] = 33;	angleMap[77] = 3.170f;
			coarseMap[78][0] = 30;	coarseMap[78][1] = 33;	angleMap[78] = 3.164f;
			coarseMap[79][0] = 31;	coarseMap[79][1] = 33;	angleMap[79] = 2.671f;
			coarseMap[80][0] = 32;	coarseMap[80][1] = 33;	angleMap[80] = 1.466f;
			coarseMap[81][0] = 24;	coarseMap[81][1] = 34;	angleMap[81] = 3.145f;
			coarseMap[82][0] = 25;	coarseMap[82][1] = 34;	angleMap[82] = 3.957f;
			coarseMap[83][0] = 26;	coarseMap[83][1] = 34;	angleMap[83] = 3.141f;
			coarseMap[84][0] = 27;	coarseMap[84][1] = 34;	angleMap[84] = 3.136f;
			coarseMap[85][0] = 28;	coarseMap[85][1] = 34;	angleMap[85] = 3.366f;
			coarseMap[86][0] = 29;	coarseMap[86][1] = 34;	angleMap[86] = 3.702f;
			coarseMap[87][0] = 30;	coarseMap[87][1] = 34;	angleMap[87] = 3.697f;
			coarseMap[88][0] = 31;	coarseMap[88][1] = 34;	angleMap[88] = 3.706f;
			coarseMap[89][0] = 32;	coarseMap[89][1] = 34;	angleMap[89] = 2.751f;
			coarseMap[90][0] = 24;	coarseMap[90][1] = 35;	angleMap[90] = 3.142f;
			coarseMap[91][0] = 25;	coarseMap[91][1] = 35;	angleMap[91] = 4.315f;
			coarseMap[92][0] = 26;	coarseMap[92][1] = 35;	angleMap[92] = 3.120f;
			coarseMap[93][0] = 27;	coarseMap[93][1] = 35;	angleMap[93] = 3.105f;
			coarseMap[94][0] = 28;	coarseMap[94][1] = 35;	angleMap[94] = 3.132f;
			coarseMap[95][0] = 29;	coarseMap[95][1] = 35;	angleMap[95] = 3.178f;
			coarseMap[96][0] = 30;	coarseMap[96][1] = 35;	angleMap[96] = 3.170f;
			coarseMap[97][0] = 31;	coarseMap[97][1] = 35;	angleMap[97] = 3.155f;
			coarseMap[98][0] = 32;	coarseMap[98][1] = 35;	angleMap[98] = 2.425f;
			coarseMap[99][0] = 24;	coarseMap[99][1] = 36;	angleMap[99] = 3.142f;
			coarseMap[100][0] = 25;	coarseMap[100][1] = 36;	angleMap[100] = 4.102f;
			coarseMap[101][0] = 26;	coarseMap[101][1] = 36;	angleMap[101] = 3.124f;
			coarseMap[102][0] = 27;	coarseMap[102][1] = 36;	angleMap[102] = 3.113f;
			coarseMap[103][0] = 28;	coarseMap[103][1] = 36;	angleMap[103] = 3.134f;
			coarseMap[104][0] = 29;	coarseMap[104][1] = 36;	angleMap[104] = 3.170f;
			coarseMap[105][0] = 30;	coarseMap[105][1] = 36;	angleMap[105] = 3.164f;
			coarseMap[106][0] = 31;	coarseMap[106][1] = 36;	angleMap[106] = 3.152f;
			coarseMap[107][0] = 32;	coarseMap[107][1] = 36;	angleMap[107] = 2.205f;
			coarseMap[108][0] = 24;	coarseMap[108][1] = 37;	angleMap[108] = 3.142f;
			coarseMap[109][0] = 25;	coarseMap[109][1] = 37;	angleMap[109] = 4.102f;
			coarseMap[110][0] = 26;	coarseMap[110][1] = 37;	angleMap[110] = 3.124f;
			coarseMap[111][0] = 27;	coarseMap[111][1] = 37;	angleMap[111] = 3.113f;
			coarseMap[112][0] = 28;	coarseMap[112][1] = 37;	angleMap[112] = 3.134f;
			coarseMap[113][0] = 29;	coarseMap[113][1] = 37;	angleMap[113] = 3.170f;
			coarseMap[114][0] = 30;	coarseMap[114][1] = 37;	angleMap[114] = 3.164f;
			coarseMap[115][0] = 31;	coarseMap[115][1] = 37;	angleMap[115] = 3.152f;
			coarseMap[116][0] = 32;	coarseMap[116][1] = 37;	angleMap[116] = 2.205f;
			coarseMap[117][0] = 24;	coarseMap[117][1] = 38;	angleMap[117] = 3.142f;
			coarseMap[118][0] = 25;	coarseMap[118][1] = 38;	angleMap[118] = 1.669f;
			coarseMap[119][0] = 26;	coarseMap[119][1] = 38;	angleMap[119] = 1.885f;
			coarseMap[120][0] = 27;	coarseMap[120][1] = 38;	angleMap[120] = 2.070f;
			coarseMap[121][0] = 28;	coarseMap[121][1] = 38;	angleMap[121] = 2.313f;
			coarseMap[122][0] = 29;	coarseMap[122][1] = 38;	angleMap[122] = 2.418f;
			coarseMap[123][0] = 30;	coarseMap[123][1] = 38;	angleMap[123] = 2.495f;
			coarseMap[124][0] = 31;	coarseMap[124][1] = 38;	angleMap[124] = 2.660f;
			coarseMap[125][0] = 32;	coarseMap[125][1] = 38;	angleMap[125] = 1.902f;
			coarseMap[126][0] = 24;	coarseMap[126][1] = 39;	angleMap[126] = 3.142f;
			coarseMap[127][0] = 25;	coarseMap[127][1] = 39;	angleMap[127] = 3.142f;
			coarseMap[128][0] = 26;	coarseMap[128][1] = 39;	angleMap[128] = 3.142f;
			coarseMap[129][0] = 27;	coarseMap[129][1] = 39;	angleMap[129] = 3.142f;
			coarseMap[130][0] = 28;	coarseMap[130][1] = 39;	angleMap[130] = 3.142f;
			coarseMap[131][0] = 29;	coarseMap[131][1] = 39;	angleMap[131] = 3.142f;
			coarseMap[132][0] = 30;	coarseMap[132][1] = 39;	angleMap[132] = 3.142f;
			coarseMap[133][0] = 31;	coarseMap[133][1] = 39;	angleMap[133] = 2.858f;
			coarseMap[134][0] = 32;	coarseMap[134][1] = 39;	angleMap[134] = 1.031f;
			coarseMap[135][0] = 19;	coarseMap[135][1] = 40;	angleMap[135] = 2.368f;
			coarseMap[136][0] = 20;	coarseMap[136][1] = 40;	angleMap[136] = 1.708f;
			coarseMap[137][0] = 21;	coarseMap[137][1] = 40;	angleMap[137] = 1.611f;
			coarseMap[138][0] = 22;	coarseMap[138][1] = 40;	angleMap[138] = 1.617f;
			coarseMap[139][0] = 23;	coarseMap[139][1] = 40;	angleMap[139] = 1.622f;
			coarseMap[140][0] = 24;	coarseMap[140][1] = 40;	angleMap[140] = 2.487f;
			coarseMap[141][0] = 25;	coarseMap[141][1] = 40;	angleMap[141] = 2.463f;
			coarseMap[142][0] = 26;	coarseMap[142][1] = 40;	angleMap[142] = 2.340f;
			coarseMap[143][0] = 27;	coarseMap[143][1] = 40;	angleMap[143] = 2.220f;
			coarseMap[144][0] = 28;	coarseMap[144][1] = 40;	angleMap[144] = 2.619f;
			coarseMap[145][0] = 29;	coarseMap[145][1] = 40;	angleMap[145] = 2.618f;
			coarseMap[146][0] = 30;	coarseMap[146][1] = 40;	angleMap[146] = 2.457f;
			coarseMap[147][0] = 31;	coarseMap[147][1] = 40;	angleMap[147] = 2.958f;
			coarseMap[148][0] = 32;	coarseMap[148][1] = 40;	angleMap[148] = 3.141f;
			coarseMap[149][0] = 33;	coarseMap[149][1] = 40;	angleMap[149] = 1.518f;
			coarseMap[150][0] = 34;	coarseMap[150][1] = 40;	angleMap[150] = 1.515f;
			coarseMap[151][0] = 35;	coarseMap[151][1] = 40;	angleMap[151] = 1.499f;
			coarseMap[152][0] = 36;	coarseMap[152][1] = 40;	angleMap[152] = 1.517f;
			coarseMap[153][0] = 37;	coarseMap[153][1] = 40;	angleMap[153] = 1.448f;
			coarseMap[154][0] = 38;	coarseMap[154][1] = 40;	angleMap[154] = 0.499f;
			coarseMap[155][0] = 18;	coarseMap[155][1] = 41;	angleMap[155] = 2.829f;
			coarseMap[156][0] = 19;	coarseMap[156][1] = 41;	angleMap[156] = 3.142f;
			coarseMap[157][0] = 20;	coarseMap[157][1] = 41;	angleMap[157] = 2.422f;
			coarseMap[158][0] = 21;	coarseMap[158][1] = 41;	angleMap[158] = 1.937f;
			coarseMap[159][0] = 22;	coarseMap[159][1] = 41;	angleMap[159] = 1.759f;
			coarseMap[160][0] = 23;	coarseMap[160][1] = 41;	angleMap[160] = 1.755f;
			coarseMap[161][0] = 24;	coarseMap[161][1] = 41;	angleMap[161] = 1.752f;
			coarseMap[162][0] = 25;	coarseMap[162][1] = 41;	angleMap[162] = 1.745f;
			coarseMap[163][0] = 26;	coarseMap[163][1] = 41;	angleMap[163] = 1.743f;
			coarseMap[164][0] = 27;	coarseMap[164][1] = 41;	angleMap[164] = 1.759f;
			coarseMap[165][0] = 28;	coarseMap[165][1] = 41;	angleMap[165] = 1.765f;
			coarseMap[166][0] = 29;	coarseMap[166][1] = 41;	angleMap[166] = 1.614f;
			coarseMap[167][0] = 30;	coarseMap[167][1] = 41;	angleMap[167] = 1.333f;
			coarseMap[168][0] = 31;	coarseMap[168][1] = 41;	angleMap[168] = 1.329f;
			coarseMap[169][0] = 32;	coarseMap[169][1] = 41;	angleMap[169] = 1.348f;
			coarseMap[170][0] = 33;	coarseMap[170][1] = 41;	angleMap[170] = 1.346f;
			coarseMap[171][0] = 34;	coarseMap[171][1] = 41;	angleMap[171] = 1.335f;
			coarseMap[172][0] = 35;	coarseMap[172][1] = 41;	angleMap[172] = 1.330f;
			coarseMap[173][0] = 36;	coarseMap[173][1] = 41;	angleMap[173] = 1.050f;
			coarseMap[174][0] = 37;	coarseMap[174][1] = 41;	angleMap[174] = 0.687f;
			coarseMap[175][0] = 38;	coarseMap[175][1] = 41;	angleMap[175] = 0.231f;
			coarseMap[176][0] = 18;	coarseMap[176][1] = 42;	angleMap[176] = 2.851f;
			coarseMap[177][0] = 19;	coarseMap[177][1] = 42;	angleMap[177] = 3.142f;
			coarseMap[178][0] = 21;	coarseMap[178][1] = 42;	angleMap[178] = 2.448f;
			coarseMap[179][0] = 22;	coarseMap[179][1] = 42;	angleMap[179] = 2.042f;
			coarseMap[180][0] = 23;	coarseMap[180][1] = 42;	angleMap[180] = 1.754f;
			coarseMap[181][0] = 24;	coarseMap[181][1] = 42;	angleMap[181] = 1.768f;
			coarseMap[182][0] = 25;	coarseMap[182][1] = 42;	angleMap[182] = 1.783f;
			coarseMap[183][0] = 26;	coarseMap[183][1] = 42;	angleMap[183] = 1.798f;
			coarseMap[184][0] = 27;	coarseMap[184][1] = 42;	angleMap[184] = 1.818f;
			coarseMap[185][0] = 28;	coarseMap[185][1] = 42;	angleMap[185] = 1.853f;
			coarseMap[186][0] = 29;	coarseMap[186][1] = 42;	angleMap[186] = 1.372f;
			coarseMap[187][0] = 30;	coarseMap[187][1] = 42;	angleMap[187] = 1.188f;
			coarseMap[188][0] = 31;	coarseMap[188][1] = 42;	angleMap[188] = 1.241f;
			coarseMap[189][0] = 32;	coarseMap[189][1] = 42;	angleMap[189] = 1.281f;
			coarseMap[190][0] = 33;	coarseMap[190][1] = 42;	angleMap[190] = 1.308f;
			coarseMap[191][0] = 34;	coarseMap[191][1] = 42;	angleMap[191] = 1.281f;
			coarseMap[192][0] = 35;	coarseMap[192][1] = 42;	angleMap[192] = 0.983f;
			coarseMap[193][0] = 36;	coarseMap[193][1] = 42;	angleMap[193] = 1.156f;
			coarseMap[194][0] = 38;	coarseMap[194][1] = 42;	angleMap[194] = 0.152f;
			coarseMap[195][0] = 39;	coarseMap[195][1] = 42;	angleMap[195] = 0.258f;
			coarseMap[196][0] = 18;	coarseMap[196][1] = 43;	angleMap[196] = 2.879f;
			coarseMap[197][0] = 19;	coarseMap[197][1] = 43;	angleMap[197] = 3.142f;
			coarseMap[198][0] = 22;	coarseMap[198][1] = 43;	angleMap[198] = 2.375f;
			coarseMap[199][0] = 23;	coarseMap[199][1] = 43;	angleMap[199] = 1.971f;
			coarseMap[200][0] = 24;	coarseMap[200][1] = 43;	angleMap[200] = 1.661f;
			coarseMap[201][0] = 25;	coarseMap[201][1] = 43;	angleMap[201] = 1.641f;
			coarseMap[202][0] = 26;	coarseMap[202][1] = 43;	angleMap[202] = 1.648f;
			coarseMap[203][0] = 27;	coarseMap[203][1] = 43;	angleMap[203] = 1.651f;
			coarseMap[204][0] = 28;	coarseMap[204][1] = 43;	angleMap[204] = 1.669f;
			coarseMap[205][0] = 29;	coarseMap[205][1] = 43;	angleMap[205] = 1.467f;
			coarseMap[206][0] = 30;	coarseMap[206][1] = 43;	angleMap[206] = 1.465f;
			coarseMap[207][0] = 31;	coarseMap[207][1] = 43;	angleMap[207] = 1.487f;
			coarseMap[208][0] = 32;	coarseMap[208][1] = 43;	angleMap[208] = 1.491f;
			coarseMap[209][0] = 33;	coarseMap[209][1] = 43;	angleMap[209] = 1.412f;
			coarseMap[210][0] = 34;	coarseMap[210][1] = 43;	angleMap[210] = 1.034f;
			coarseMap[211][0] = 38;	coarseMap[211][1] = 43;	angleMap[211] = 0.000f;
			coarseMap[212][0] = 39;	coarseMap[212][1] = 43;	angleMap[212] = 0.231f;
			coarseMap[213][0] = 17;	coarseMap[213][1] = 44;	angleMap[213] = 2.836f;
			coarseMap[214][0] = 18;	coarseMap[214][1] = 44;	angleMap[214] = 3.142f;
			coarseMap[215][0] = 19;	coarseMap[215][1] = 44;	angleMap[215] = 3.142f;
			coarseMap[216][0] = 24;	coarseMap[216][1] = 44;	angleMap[216] = 3.142f;
			coarseMap[217][0] = 33;	coarseMap[217][1] = 44;	angleMap[217] = 0.000f;
			coarseMap[218][0] = 38;	coarseMap[218][1] = 44;	angleMap[218] = 0.000f;
			coarseMap[219][0] = 39;	coarseMap[219][1] = 44;	angleMap[219] = 0.220f;
			coarseMap[220][0] = 17;	coarseMap[220][1] = 45;	angleMap[220] = 3.097f;
			coarseMap[221][0] = 18;	coarseMap[221][1] = 45;	angleMap[221] = 3.142f;
			coarseMap[222][0] = 19;	coarseMap[222][1] = 45;	angleMap[222] = 3.142f;
			coarseMap[223][0] = 24;	coarseMap[223][1] = 45;	angleMap[223] = 3.142f;
			coarseMap[224][0] = 33;	coarseMap[224][1] = 45;	angleMap[224] = 0.000f;
			coarseMap[225][0] = 38;	coarseMap[225][1] = 45;	angleMap[225] = 0.000f;
			coarseMap[226][0] = 39;	coarseMap[226][1] = 45;	angleMap[226] = 0.032f;
			coarseMap[227][0] = 17;	coarseMap[227][1] = 46;	angleMap[227] = 3.142f;
			coarseMap[228][0] = 18;	coarseMap[228][1] = 46;	angleMap[228] = 3.142f;
			coarseMap[229][0] = 19;	coarseMap[229][1] = 46;	angleMap[229] = 3.142f;
			coarseMap[230][0] = 24;	coarseMap[230][1] = 46;	angleMap[230] = 3.142f;
			coarseMap[231][0] = 33;	coarseMap[231][1] = 46;	angleMap[231] = 0.000f;
			coarseMap[232][0] = 38;	coarseMap[232][1] = 46;	angleMap[232] = 0.000f;
			coarseMap[233][0] = 39;	coarseMap[233][1] = 46;	angleMap[233] = 0.000f;
			coarseMap[234][0] = 17;	coarseMap[234][1] = 47;	angleMap[234] = 3.142f;
			coarseMap[235][0] = 18;	coarseMap[235][1] = 47;	angleMap[235] = 3.142f;
			coarseMap[236][0] = 19;	coarseMap[236][1] = 47;	angleMap[236] = 2.709f;
			coarseMap[237][0] = 20;	coarseMap[237][1] = 47;	angleMap[237] = 1.571f;
			coarseMap[238][0] = 21;	coarseMap[238][1] = 47;	angleMap[238] = 1.571f;
			coarseMap[239][0] = 22;	coarseMap[239][1] = 47;	angleMap[239] = 1.571f;
			coarseMap[240][0] = 23;	coarseMap[240][1] = 47;	angleMap[240] = 1.571f;
			coarseMap[241][0] = 24;	coarseMap[241][1] = 47;	angleMap[241] = 1.999f;
			coarseMap[242][0] = 25;	coarseMap[242][1] = 47;	angleMap[242] = 1.571f;
			coarseMap[243][0] = 26;	coarseMap[243][1] = 47;	angleMap[243] = 1.571f;
			coarseMap[244][0] = 27;	coarseMap[244][1] = 47;	angleMap[244] = 1.571f;
			coarseMap[245][0] = 28;	coarseMap[245][1] = 47;	angleMap[245] = 1.497f;
			coarseMap[246][0] = 29;	coarseMap[246][1] = 47;	angleMap[246] = 1.881f;
			coarseMap[247][0] = 30;	coarseMap[247][1] = 47;	angleMap[247] = 1.571f;
			coarseMap[248][0] = 31;	coarseMap[248][1] = 47;	angleMap[248] = 1.571f;
			coarseMap[249][0] = 32;	coarseMap[249][1] = 47;	angleMap[249] = 1.571f;
			coarseMap[250][0] = 33;	coarseMap[250][1] = 47;	angleMap[250] = 1.142f;
			coarseMap[251][0] = 34;	coarseMap[251][1] = 47;	angleMap[251] = 1.571f;
			coarseMap[252][0] = 35;	coarseMap[252][1] = 47;	angleMap[252] = 1.571f;
			coarseMap[253][0] = 36;	coarseMap[253][1] = 47;	angleMap[253] = 1.571f;
			coarseMap[254][0] = 37;	coarseMap[254][1] = 47;	angleMap[254] = 1.390f;
			coarseMap[255][0] = 38;	coarseMap[255][1] = 47;	angleMap[255] = 0.094f;
			coarseMap[256][0] = 39;	coarseMap[256][1] = 47;	angleMap[256] = 0.000f;
			coarseMap[257][0] = 17;	coarseMap[257][1] = 48;	angleMap[257] = 3.142f;
			coarseMap[258][0] = 18;	coarseMap[258][1] = 48;	angleMap[258] = 3.142f;
			coarseMap[259][0] = 19;	coarseMap[259][1] = 48;	angleMap[259] = 3.142f;
			coarseMap[260][0] = 20;	coarseMap[260][1] = 48;	angleMap[260] = 2.499f;
			coarseMap[261][0] = 21;	coarseMap[261][1] = 48;	angleMap[261] = 1.622f;
			coarseMap[262][0] = 22;	coarseMap[262][1] = 48;	angleMap[262] = 1.571f;
			coarseMap[263][0] = 23;	coarseMap[263][1] = 48;	angleMap[263] = 1.571f;
			coarseMap[264][0] = 24;	coarseMap[264][1] = 48;	angleMap[264] = 1.736f;
			coarseMap[265][0] = 25;	coarseMap[265][1] = 48;	angleMap[265] = 1.571f;
			coarseMap[266][0] = 26;	coarseMap[266][1] = 48;	angleMap[266] = 1.520f;
			coarseMap[267][0] = 27;	coarseMap[267][1] = 48;	angleMap[267] = 0.705f;
			coarseMap[268][0] = 28;	coarseMap[268][1] = 48;	angleMap[268] = 0.698f;
			coarseMap[269][0] = 29;	coarseMap[269][1] = 48;	angleMap[269] = 3.011f;
			coarseMap[270][0] = 30;	coarseMap[270][1] = 48;	angleMap[270] = 2.002f;
			coarseMap[271][0] = 31;	coarseMap[271][1] = 48;	angleMap[271] = 1.571f;
			coarseMap[272][0] = 32;	coarseMap[272][1] = 48;	angleMap[272] = 1.571f;
			coarseMap[273][0] = 33;	coarseMap[273][1] = 48;	angleMap[273] = 1.361f;
			coarseMap[274][0] = 34;	coarseMap[274][1] = 48;	angleMap[274] = 1.571f;
			coarseMap[275][0] = 35;	coarseMap[275][1] = 48;	angleMap[275] = 1.571f;
			coarseMap[276][0] = 36;	coarseMap[276][1] = 48;	angleMap[276] = 1.304f;
			coarseMap[277][0] = 37;	coarseMap[277][1] = 48;	angleMap[277] = 0.316f;
			coarseMap[278][0] = 38;	coarseMap[278][1] = 48;	angleMap[278] = 0.000f;
			coarseMap[279][0] = 39;	coarseMap[279][1] = 48;	angleMap[279] = 0.000f;
			coarseMap[280][0] = 17;	coarseMap[280][1] = 49;	angleMap[280] = 3.245f;
			coarseMap[281][0] = 18;	coarseMap[281][1] = 49;	angleMap[281] = 3.142f;
			coarseMap[282][0] = 19;	coarseMap[282][1] = 49;	angleMap[282] = 3.142f;
			coarseMap[283][0] = 20;	coarseMap[283][1] = 49;	angleMap[283] = 3.142f;
			coarseMap[284][0] = 21;	coarseMap[284][1] = 49;	angleMap[284] = 2.796f;
			coarseMap[285][0] = 22;	coarseMap[285][1] = 49;	angleMap[285] = 1.714f;
			coarseMap[286][0] = 23;	coarseMap[286][1] = 49;	angleMap[286] = 1.571f;
			coarseMap[287][0] = 24;	coarseMap[287][1] = 49;	angleMap[287] = 1.687f;
			coarseMap[288][0] = 25;	coarseMap[288][1] = 49;	angleMap[288] = 1.435f;
			coarseMap[289][0] = 26;	coarseMap[289][1] = 49;	angleMap[289] = 0.462f;
			coarseMap[290][0] = 27;	coarseMap[290][1] = 49;	angleMap[290] = 0.000f;
			coarseMap[291][0] = 28;	coarseMap[291][1] = 49;	angleMap[291] = 0.628f;
			coarseMap[292][0] = 29;	coarseMap[292][1] = 49;	angleMap[292] = 3.142f;
			coarseMap[293][0] = 30;	coarseMap[293][1] = 49;	angleMap[293] = 3.092f;
			coarseMap[294][0] = 31;	coarseMap[294][1] = 49;	angleMap[294] = 2.306f;
			coarseMap[295][0] = 32;	coarseMap[295][1] = 49;	angleMap[295] = 1.571f;
			coarseMap[296][0] = 33;	coarseMap[296][1] = 49;	angleMap[296] = 1.440f;
			coarseMap[297][0] = 34;	coarseMap[297][1] = 49;	angleMap[297] = 1.571f;
			coarseMap[298][0] = 35;	coarseMap[298][1] = 49;	angleMap[298] = 1.104f;
			coarseMap[299][0] = 36;	coarseMap[299][1] = 49;	angleMap[299] = 0.094f;
			coarseMap[300][0] = 37;	coarseMap[300][1] = 49;	angleMap[300] = 0.000f;
			coarseMap[301][0] = 38;	coarseMap[301][1] = 49;	angleMap[301] = 0.000f;
			coarseMap[302][0] = 39;	coarseMap[302][1] = 49;	angleMap[302] = 2.352f;
			coarseMap[303][0] = 17;	coarseMap[303][1] = 50;	angleMap[303] = 3.443f;
			coarseMap[304][0] = 18;	coarseMap[304][1] = 50;	angleMap[304] = 3.142f;
			coarseMap[305][0] = 19;	coarseMap[305][1] = 50;	angleMap[305] = 3.142f;
			coarseMap[306][0] = 20;	coarseMap[306][1] = 50;	angleMap[306] = 3.142f;
			coarseMap[307][0] = 21;	coarseMap[307][1] = 50;	angleMap[307] = 3.142f;
			coarseMap[308][0] = 22;	coarseMap[308][1] = 50;	angleMap[308] = 2.958f;
			coarseMap[309][0] = 23;	coarseMap[309][1] = 50;	angleMap[309] = 1.571f;
			coarseMap[310][0] = 24;	coarseMap[310][1] = 50;	angleMap[310] = 1.963f;
			coarseMap[311][0] = 25;	coarseMap[311][1] = 50;	angleMap[311] = 0.184f;
			coarseMap[312][0] = 26;	coarseMap[312][1] = 50;	angleMap[312] = 0.000f;
			coarseMap[313][0] = 27;	coarseMap[313][1] = 50;	angleMap[313] = 0.000f;
			coarseMap[314][0] = 28;	coarseMap[314][1] = 50;	angleMap[314] = 0.785f;
			coarseMap[315][0] = 29;	coarseMap[315][1] = 50;	angleMap[315] = 3.142f;
			coarseMap[316][0] = 30;	coarseMap[316][1] = 50;	angleMap[316] = 3.142f;
			coarseMap[317][0] = 31;	coarseMap[317][1] = 50;	angleMap[317] = 3.142f;
			coarseMap[318][0] = 32;	coarseMap[318][1] = 50;	angleMap[318] = 2.490f;
			coarseMap[319][0] = 33;	coarseMap[319][1] = 50;	angleMap[319] = 1.178f;
			coarseMap[320][0] = 34;	coarseMap[320][1] = 50;	angleMap[320] = 1.571f;
			coarseMap[321][0] = 35;	coarseMap[321][1] = 50;	angleMap[321] = 0.030f;
			coarseMap[322][0] = 36;	coarseMap[322][1] = 50;	angleMap[322] = 0.000f;
			coarseMap[323][0] = 37;	coarseMap[323][1] = 50;	angleMap[323] = 0.000f;
			coarseMap[324][0] = 38;	coarseMap[324][1] = 50;	angleMap[324] = 0.000f;
			coarseMap[325][0] = 39;	coarseMap[325][1] = 50;	angleMap[325] = 4.877f;
			coarseMap[326][0] = 18;	coarseMap[326][1] = 51;	angleMap[326] = 3.404f;
			coarseMap[327][0] = 19;	coarseMap[327][1] = 51;	angleMap[327] = 3.142f;
			coarseMap[328][0] = 20;	coarseMap[328][1] = 51;	angleMap[328] = 3.142f;
			coarseMap[329][0] = 21;	coarseMap[329][1] = 51;	angleMap[329] = 3.142f;
			coarseMap[330][0] = 22;	coarseMap[330][1] = 51;	angleMap[330] = 3.142f;
			coarseMap[331][0] = 23;	coarseMap[331][1] = 51;	angleMap[331] = 4.197f;
			coarseMap[332][0] = 24;	coarseMap[332][1] = 51;	angleMap[332] = 4.606f;
			coarseMap[333][0] = 25;	coarseMap[333][1] = 51;	angleMap[333] = 1.269f;
			coarseMap[334][0] = 26;	coarseMap[334][1] = 51;	angleMap[334] = 1.047f;
			coarseMap[335][0] = 27;	coarseMap[335][1] = 51;	angleMap[335] = 1.178f;
			coarseMap[336][0] = 28;	coarseMap[336][1] = 51;	angleMap[336] = 2.443f;
			coarseMap[337][0] = 29;	coarseMap[337][1] = 51;	angleMap[337] = 3.491f;
			coarseMap[338][0] = 30;	coarseMap[338][1] = 51;	angleMap[338] = 3.644f;
			coarseMap[339][0] = 31;	coarseMap[339][1] = 51;	angleMap[339] = 3.412f;
			coarseMap[340][0] = 32;	coarseMap[340][1] = 51;	angleMap[340] = 3.815f;
			coarseMap[341][0] = 33;	coarseMap[341][1] = 51;	angleMap[341] = 4.902f;
			coarseMap[342][0] = 34;	coarseMap[342][1] = 51;	angleMap[342] = 5.400f;
			coarseMap[343][0] = 35;	coarseMap[343][1] = 51;	angleMap[343] = 0.000f;
			coarseMap[344][0] = 36;	coarseMap[344][1] = 51;	angleMap[344] = 0.000f;
			coarseMap[345][0] = 37;	coarseMap[345][1] = 51;	angleMap[345] = 0.000f;
			coarseMap[346][0] = 38;	coarseMap[346][1] = 51;	angleMap[346] = 0.000f;
			coarseMap[347][0] = 39;	coarseMap[347][1] = 51;	angleMap[347] = 5.391f;
			coarseMap[348][0] = 18;	coarseMap[348][1] = 52;	angleMap[348] = 3.432f;
			coarseMap[349][0] = 19;	coarseMap[349][1] = 52;	angleMap[349] = 3.142f;
			coarseMap[350][0] = 20;	coarseMap[350][1] = 52;	angleMap[350] = 3.142f;
			coarseMap[351][0] = 21;	coarseMap[351][1] = 52;	angleMap[351] = 3.300f;
			coarseMap[352][0] = 22;	coarseMap[352][1] = 52;	angleMap[352] = 4.227f;
			coarseMap[353][0] = 23;	coarseMap[353][1] = 52;	angleMap[353] = 4.712f;
			coarseMap[354][0] = 24;	coarseMap[354][1] = 52;	angleMap[354] = 4.712f;
			coarseMap[355][0] = 25;	coarseMap[355][1] = 52;	angleMap[355] = 3.840f;
			coarseMap[356][0] = 26;	coarseMap[356][1] = 52;	angleMap[356] = 1.505f;
			coarseMap[357][0] = 27;	coarseMap[357][1] = 52;	angleMap[357] = 1.499f;
			coarseMap[358][0] = 28;	coarseMap[358][1] = 52;	angleMap[358] = 2.618f;
			coarseMap[359][0] = 29;	coarseMap[359][1] = 52;	angleMap[359] = 3.604f;
			coarseMap[360][0] = 30;	coarseMap[360][1] = 52;	angleMap[360] = 3.499f;
			coarseMap[361][0] = 31;	coarseMap[361][1] = 52;	angleMap[361] = 3.808f;
			coarseMap[362][0] = 32;	coarseMap[362][1] = 52;	angleMap[362] = 4.632f;
			coarseMap[363][0] = 33;	coarseMap[363][1] = 52;	angleMap[363] = 4.712f;
			coarseMap[364][0] = 34;	coarseMap[364][1] = 52;	angleMap[364] = 4.738f;
			coarseMap[365][0] = 35;	coarseMap[365][1] = 52;	angleMap[365] = 2.858f;
			coarseMap[366][0] = 36;	coarseMap[366][1] = 52;	angleMap[366] = 0.284f;
			coarseMap[367][0] = 37;	coarseMap[367][1] = 52;	angleMap[367] = 0.000f;
			coarseMap[368][0] = 38;	coarseMap[368][1] = 52;	angleMap[368] = 3.201f;
			coarseMap[369][0] = 39;	coarseMap[369][1] = 52;	angleMap[369] = 6.025f;
			coarseMap[370][0] = 18;	coarseMap[370][1] = 53;	angleMap[370] = 3.454f;
			coarseMap[371][0] = 19;	coarseMap[371][1] = 53;	angleMap[371] = 3.142f;
			coarseMap[372][0] = 20;	coarseMap[372][1] = 53;	angleMap[372] = 3.605f;
			coarseMap[373][0] = 21;	coarseMap[373][1] = 53;	angleMap[373] = 4.470f;
			coarseMap[374][0] = 22;	coarseMap[374][1] = 53;	angleMap[374] = 4.712f;
			coarseMap[375][0] = 23;	coarseMap[375][1] = 53;	angleMap[375] = 4.712f;
			coarseMap[376][0] = 24;	coarseMap[376][1] = 53;	angleMap[376] = 4.712f;
			coarseMap[377][0] = 25;	coarseMap[377][1] = 53;	angleMap[377] = 4.712f;
			coarseMap[378][0] = 26;	coarseMap[378][1] = 53;	angleMap[378] = 4.601f;
			coarseMap[379][0] = 27;	coarseMap[379][1] = 53;	angleMap[379] = 2.499f;
			coarseMap[380][0] = 28;	coarseMap[380][1] = 53;	angleMap[380] = 1.933f;
			coarseMap[381][0] = 29;	coarseMap[381][1] = 53;	angleMap[381] = 3.561f;
			coarseMap[382][0] = 30;	coarseMap[382][1] = 53;	angleMap[382] = 4.091f;
			coarseMap[383][0] = 31;	coarseMap[383][1] = 53;	angleMap[383] = 4.680f;
			coarseMap[384][0] = 32;	coarseMap[384][1] = 53;	angleMap[384] = 4.712f;
			coarseMap[385][0] = 33;	coarseMap[385][1] = 53;	angleMap[385] = 4.712f;
			coarseMap[386][0] = 34;	coarseMap[386][1] = 53;	angleMap[386] = 4.712f;
			coarseMap[387][0] = 35;	coarseMap[387][1] = 53;	angleMap[387] = 4.712f;
			coarseMap[388][0] = 36;	coarseMap[388][1] = 53;	angleMap[388] = 4.085f;
			coarseMap[389][0] = 37;	coarseMap[389][1] = 53;	angleMap[389] = 1.085f;
			coarseMap[390][0] = 38;	coarseMap[390][1] = 53;	angleMap[390] = 5.208f;
			coarseMap[391][0] = 19;	coarseMap[391][1] = 54;	angleMap[391] = 3.688f;
			coarseMap[392][0] = 20;	coarseMap[392][1] = 54;	angleMap[392] = 4.605f;
			coarseMap[393][0] = 21;	coarseMap[393][1] = 54;	angleMap[393] = 4.712f;
			coarseMap[394][0] = 22;	coarseMap[394][1] = 54;	angleMap[394] = 4.712f;
			coarseMap[395][0] = 23;	coarseMap[395][1] = 54;	angleMap[395] = 4.712f;
			coarseMap[396][0] = 24;	coarseMap[396][1] = 54;	angleMap[396] = 4.712f;
			coarseMap[397][0] = 25;	coarseMap[397][1] = 54;	angleMap[397] = 4.712f;
			coarseMap[398][0] = 26;	coarseMap[398][1] = 54;	angleMap[398] = 4.712f;
			coarseMap[399][0] = 27;	coarseMap[399][1] = 54;	angleMap[399] = 4.763f;
			coarseMap[400][0] = 28;	coarseMap[400][1] = 54;	angleMap[400] = 4.030f;
			coarseMap[401][0] = 29;	coarseMap[401][1] = 54;	angleMap[401] = 4.248f;
			coarseMap[402][0] = 30;	coarseMap[402][1] = 54;	angleMap[402] = 4.712f;
			coarseMap[403][0] = 31;	coarseMap[403][1] = 54;	angleMap[403] = 4.712f;
			coarseMap[404][0] = 32;	coarseMap[404][1] = 54;	angleMap[404] = 4.712f;
			coarseMap[405][0] = 33;	coarseMap[405][1] = 54;	angleMap[405] = 4.712f;
			coarseMap[406][0] = 34;	coarseMap[406][1] = 54;	angleMap[406] = 4.712f;
			coarseMap[407][0] = 35;	coarseMap[407][1] = 54;	angleMap[407] = 4.712f;
			coarseMap[408][0] = 36;	coarseMap[408][1] = 54;	angleMap[408] = 4.712f;
			coarseMap[409][0] = 37;	coarseMap[409][1] = 54;	angleMap[409] = 4.629f;
			coarseMap[410][0] = 38;	coarseMap[410][1] = 54;	angleMap[410] = 5.581f;
			return null;
			
		}

	@Override
	public float[] setTextures() {
		// TODO Auto-generated method stub
		float[] coor = {0f};
		return coor;
	}

	@Override
	protected void initObject() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		TAG = "Turtle";
		iTag = ObjectsEnum.TURTLE;
		
	}

}
