package com.makketronix.makkengine.makkobjects;

interface IGLData {
	
	/** Do something like float[] data = {x, y, z, x1, y1, z1 . . }*/
	public abstract float[] setNormals();
	
	/** Do something like float[] data = {x, y, z, x1, y1, z1 . . }*/
	public abstract float[]  setVertices();
	
	/** Do something like float[] data = {x, y, z, x1, y1, z1 . . }*/
	public abstract short[]  setDrawOrder();
	
	/** Do something like float[] data = {x, y, z, x1, y1, z1 . . }*/
	public abstract float[] setColors();
	
	/** Fill coarse map. For sprite objects, by default RenderList will get map from object at index 0.
	 *  This can be changed by changing the mapIndex variable in renderlist to other than 0.
	 *  
	 *  Must set coarseMap and normalMap
	 */
	public abstract short[][] setCoarseAndMap();
	
	/** Do something like float[] data = {x, y, z, x1, y1, z1 . . }*/
	public abstract float[] setTextures();

}
