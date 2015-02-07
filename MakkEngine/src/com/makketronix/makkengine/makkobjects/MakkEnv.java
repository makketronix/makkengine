package com.makketronix.makkengine.makkobjects;

import java.util.Iterator;
import java.util.List;

// MakkEnvironment
public class MakkEnv {
	protected List<MakkObject> mMakkObjects;
	protected double[] force = {0.0, 0.0, 0.0};
	private MakkObject tempO; // To avoid creating objects.
	
	public MakkEnv(List<MakkObject> objects){
		mMakkObjects = objects;
	}
	
	public void renderAll(float dt){
		for(int i = 0; i < mMakkObjects.size(); i++){
			tempO = mMakkObjects.get(i);
			tempO.mPhysics.setForce(force);
			tempO.stepDt(dt);
		}
	}
	
	public void setForce(double[] f){
		if(f.length != 3){
			return;
		}
		force[0] = f[0];
		force[1] = f[1];
		force[2] = f[2];
	}
	
	//TODO
	// Add method to change the size of environment.

}
