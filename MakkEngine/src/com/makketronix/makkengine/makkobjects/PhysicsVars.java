package com.makketronix.makkengine.makkobjects;

import android.util.Log;


public class PhysicsVars {
	
	/** Mass */
	public float mass;
	
	/** Forces x, y, z*/
	public float[] accel = {0f, 0f, 0f};
	
	/** Current Speed */
	public float[] speed = {0f, 0f, 0f};
	
	/** Current speedMagnitude */
	public float speedMag = 0;
	
	/** Current Position. This is obtained by localPos + origin.
	 *  If localPos not used, then it is the origin.
	 *  */
	public float[] position = {0f, 0f, 0f};
	
	/** Current Local Position */
	public float[] localPos = {0f, 0f, 0f};
	
	/** Speed Limit */
	public float[] speedLimit = {2.5f, 2.5f, 1.5f};
	
	/** Damping coefficient */
	public float[] drag = {0.995f, 0.995f, 0.990f};
	
	/** Position Limit */
	public float[] posLimit = {EnvironmentGE.envWidth/2*EnvironmentGE.objectWidth/EnvironmentGE.scale3D, 
							   EnvironmentGE.envHeight/2*EnvironmentGE.objectHeight/EnvironmentGE.scale3D, 1f};
	
	/** Origin Offset. If object is not displayed exactly at origin, this is to compensate */
	public float[] originOffset = {0f, 0f, 0f};

	/** Reinitializes the posLimit. The screen may change*/
	public void resetPosLimit(){
		for(int i = 0; i < localPos.length; i++){
			localPos[i] = 0;
			position[i] = 0;
		}

	}
	
	
	
	/** Apply forces with the environment at origin posInit
	 * This will modify localPos and position.
	 * */
	public void apply(float dt, float[] posInit){
		if( posInit.length != 3){
			Log.e("apply", "Origin passed wrong");
			return;
		}
		
		for(int i = 0; i < 3; i++){
	//		speed[i] = sat(mass*(accel[i] + Environment.accel[i])*dt + speed[i], -speedLimit[i], speedLimit[i]) ;
			speed[i] = sat(mass*(accel[i] )*dt + speed[i]*drag[i], -speedLimit[i], speedLimit[i]) ;
			
			localPos[i] = sat(speed[i]*dt + localPos[i], 
					          -Math.abs(posLimit[i] + posInit[i] + originOffset[i]), 
					           Math.abs(posLimit[i] - posInit[i] - originOffset[i]) );
			
	//		position[i] = sat(posInit[i] + localPos[i], 
	//				         -posLimit[i] - originOffset[i], 
	//				          posLimit[i] - originOffset[i]);
			
			position[i] = posInit[i] + localPos[i];
			
			if( position[i] >= posLimit[i] - originOffset[i] || position[i] <= -posLimit[i] - originOffset[i]  )
				speed[i] = -1*speed[i];
		}
		
	}
	
	/** Apply local forces. Environment is ignored at origin posInit */
	public void applyLocally(float dt, float[] posInit){
		if( posInit.length != 3){
			Log.e("applyLocally", "Origin passed wrong");
			return;
		}
		
		for(int i = 1; i < 2; i++){
			speed[i] = sat(mass*(accel[i])*dt + speed[i], -speedLimit[i], speedLimit[i]) ;
			localPos[i] = sat(speed[i]*drag[i]*dt + localPos[i], -Math.abs(posLimit[i] + posInit[i]), Math.abs(posLimit[i] -posInit[i]));
			position[i] = sat(posInit[i] + localPos[i], -posLimit[i], posLimit[i]);
		}
	}
	
	private float sat(float val, float min, float max){
		
		return Math.max(Math.min(val, max), min);
		
	}
	
	/** Sets initial local Position and position */
	public void setPosition(float[] local, float[] pos){
		
		for(int i = 0; i < 3; i ++){
			localPos[i] = local[i];
			position[i] = pos[i];
		}
	}
	
	/** Get x position of local position */
	public float getLocalX(){
		return localPos[0];
	}
	
	/** Get y position of local position */
	public float getLocalY(){
		return localPos[1];
	}
	
	/** Get z position of local position */
	public float getLocalZ(){
		return localPos[2];
	}
	
	/** Get float[3] localPos */
	public float[] getLocalPos(){
		return localPos;
	}
	
	/** Get actual Position  */
	public float[] getActualPosition(){
		return position;
	}


	/** Change the velocity based on the angle of collision */
	public float collide(RenderList tempList) {
		// TODO Auto-generated method stub
		float vAngle;
		float nAngle;
		vAngle = (float) Math.atan2(speed[1],speed[0]);
		if(vAngle < 0 ){
			vAngle = 2*3.1416f + vAngle;
		}
		nAngle = tempList.angleCollision;
		
		if(nAngle == 9999 ){
			tempList.hasCollided = 0;
			return vAngle;
		}
		
		if(vAngle < 0 || vAngle > 6.2832){
			vAngle = 0; 		// reduce quantization errors
		}
		

		if(nAngle < 0 || nAngle > 6.2832){
			nAngle = 0; 		// reduce quantization errors
		}
		

		if( tempList.hasCollided == 0){
			return vAngle;
		}
		
		// If the collision angle makes angle > 90, then we were inside an object. Don't collide.
		if( Math.abs(nAngle - vAngle) < 1.5008 ){
			tempList.hasCollided = 0;
			return vAngle;
		}
		
		// Now both angles are from 0 to 2*pi
		float incident = 2*nAngle - vAngle - 3.1416f; 			// Equivalent to: a1 = angle - vAngle. a2 = angle + a1.
		

		speedMag = (float) Math.sqrt(speed[0]*speed[0] + speed[1]*speed[1]);
		speed[0] = (float) (speedMag * Math.cos(incident));
		speed[1] = (float) (speedMag * Math.sin(incident));
		vAngle = (float) Math.atan2(speed[1],speed[0]); 		// between 0 and 2 pi
		if( vAngle < 0 ){
			vAngle = 3.1416f*2 + vAngle;
		}
		return vAngle;

	}
	
	public float getSpeedMag(){
		speedMag = (float) Math.sqrt(speed[0]*speed[0] + speed[1]*speed[1]);
		return speedMag;
	}
	

}
