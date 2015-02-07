package com.makketronix.makkengine.makkobjects;


import android.os.Bundle;

public class GameState {
	
	/** Main game state */
	public static int stGame;
	
	/** Current level */
	public static int stLevel;
	
	/** Number of lives remaining */
	public static int lives = 3;
	
	/* Number of trials per live remaining */
	public static int trials = 2;
	
	/** Input is being updated */
//	public static short uInput;
	
	/** Angle */
	public static float A;

	/** When 1, user can control turtle. When 0, user can't control turtle */
//	public static int allowInput = 1;
	
	/** Game State */
	public static final short LOADING = 0;
	public static final short IDLE = 1;
	public static final short BOUNCING = 2;
	public static final short AIMING = 3;
	public static final short FIRING = 4;
	public static final short GAMEOVER = 5;

	
	public static void restart(int level){
		
	}
	
	public static void start(){
		EnvironmentGE.init();
	}
	
	public static void start(Bundle bundle){
		EnvironmentGE.init();
		
	}
	
	public static void store(Bundle bundle){
		
	}
	

}
