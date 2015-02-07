package com.makketronix.makkengine.makkobjects;

import java.util.ArrayList;


public class EnvironmentGE {
	
	
	/** This must match the enums. Hard coded for now
	public static final int TRIANGLE = 1;
	public static final int RECTANGLE = 2;
	public static final int SQUARE = 3;
	public static final int STAR = 4;
	public static final int TURTLE = 5;
	public static final int LEFTSIDE = 6;
	public static final int RIGHTSIDE = 7;
	public static final int TOP = 8;
	public static final int BUTTOM  = 9;
	public static final int CANNON = 10
	public static final int TEE = 12;
	*/
	
	public static int[][] world;
	public static float[][] angleWorld;
	public static int[] levelSelect;
	public static int level;
	
	public static int[] level1 = {
			0, 0, 8, 0, 0,
			2, 0, 0, 0, 0,
			0, 0, 0, 0, 0,
			6, 0, 0, 0, 7,
			0, 2, 0, 0, 0,
			0, 0, 5, 0, 2,
			0, 0, 9, 0, 0,
//			0, 0, 1, 0, 0,
//			0, 0, 9, 0, 0
	};
	
	public static int[] level2 = {
		0, 0, 8, 0, 0,
		0, 2, 0, 1, 0,
		0, 1, 0, 0, 0,
		6, 0, 0, 1, 7,
		0, 0, 0, 0, 0,
		0, 5, 0, 0, 2,
		0, 0, 9, 0, 0,
//		0, 0, 1, 0, 0,
//		0, 0, 9, 0, 0
	};
	
	public static int[] level3 = {
		0, 0, 8, 0, 0,
		0, 0, 0, 0, 0,
		0, 0, 1, 1, 0,
		6, 0, 0, 0, 7,
		0, 0, 2, 0, 0,
		0, 5, 0, 0, 2,
		0, 0, 9, 0, 0,	
	};
	
	public static int[] level4 = {
		0, 0, 8, 0, 0,
		2, 0, 1, 0, 2,
		0, 0, 0, 0, 0,
		6, 0, 0, 0, 7,
		0, 0, 2, 0, 0,
		0, 5, 0, 0, 2,
		0, 0, 9, 0, 0,	
	};
	
	public static int[] level5 = {
		0, 0, 8, 0, 0,
		2, 0, 0, 0, 2,
		0, 0, 0, 0, 0,
		6, 1, 0, 1, 7,
		0, 0, 2, 0, 0,
		0, 0, 0, 5, 2,
		0, 0, 9, 0, 0,	
	};
	
	public static int[] level6 = {
		0, 0, 8, 0, 0,
		0, 2, 0, 2, 0,
		0, 2, 0, 2, 0,
		6, 2, 0, 2, 7,
		0, 0, 0, 0, 0,
		0, 0, 0, 5, 0,
		0, 0, 9, 0, 0,	
	};
	
	
	public static int[] level7= {
		0, 0, 8, 0, 0,
		0, 1, 2, 1, 0,
		0, 1, 0, 1, 0,
		6, 1, 0, 1, 7,
		0, 0, 0, 0, 0,
		5, 0, 2, 2, 0,
		0, 0, 9, 0, 0,	
	};
	
	public static int[] level8= {
		0, 0, 8, 0, 0,
		0, 0, 2, 1, 0,
		0, 12, 0, 12, 0,
		6, 2, 0, 0, 7,
		0, 0, 0, 0, 0,
		5, 0, 1, 2, 0,
		0, 0, 9, 0, 0,	
	};
	
	public static int[] level9= {
		0, 12, 8, 0, 0,
		0, 0, 0, 0, 1,
		0, 12, 2, 0, 0,
		6, 0, 0, 0, 7,
		0, 0, 0, 0, 0,
		5, 0, 0, 0, 0,
		0, 0, 9, 0, 0,	
	};
	
	public static int[] level10= {
		0, 0, 8, 0, 0,
		0, 1, 12, 0, 0,
		0, 0, 0, 0, 0,
		6, 2, 0, 1, 7,
		0, 0, 0, 0, 0,
		5, 0, 2, 0, 0,
		0, 0, 9, 0, 0,	
	};
	
	/** pixel width of rendered objects. It can be more than actual width. The object lies in a virtual cube.
	 *  Although autogen generates object in 30x30 grid (objectWidth = 60), this allows for overlap between objects.
	 *  */
	public static int objectWidth = 40;
	
	/** pixel height of rendered objects. It can be more than actual width. The object lies in a virtual cube.
	 * Although autogen generates object in 30x30 grid (objectWidth = 60), this allows for overlap between objects.
	 *  */
	public static int objectHeight = 40;
	
	/** Environment width, number of possible objects */
	public static int envWidth = 5;
	
	/** Environment height, number of possible objects */
	public static int envHeight = 7;
	
	/** Environment width in terms of grid square element */
	public static int envGSEWidth = objectWidth * envWidth;
	
	/** Environment height in terms of objects */
	public static int envGSEHeight = objectHeight * envHeight;
	
	/** Width of the objects generated in the php script */
	private static int localWidth = 30;
	
	/** Height of the objects genreated in the php script */
	private static int localHeight = 30;
	
	/** This is the scale from blender we are using. For example, a point at (1,1) in blender is 0.1, 0.1 here.
	 * 
	 */
	public static final int scale3D = 10;
	
	/** Input speed X */
	public static float speedX;
	
	/** Input speed Y */
	public static float speedY;
	
	/** Input total speed */
	public static float speedMag;
	
	/** input angle */
	public static float A;
	
	/** Turtle X position. */
	public static float xTurtle;
	
	/** Turtle Y position */
	public static float yTurtle;
	
	
	// Some junk variables to reduce garbage collector work.
	static short[][] tempMap;
	static float[] tempAngleMap;
	static float[] tempOrigin;

	static RenderList tempList;
	

	public static void init() {
		// TODO Auto-generated method stub
		world = new int[objectHeight*(envHeight+4)][objectWidth*(envWidth+4)];	// add 4 so that it is safe to overlay object at the 
																				// boundaries without out of bound indexing. 2 for 
																				// each side.
		angleWorld = new float[objectHeight*(envHeight+4)][objectWidth*(envWidth+4)]; 
		levelSelect = level1;
		level = 1;
	}
	
	public static void populateWorld(ArrayList <RenderList> objList){
		
		if(objList.size() < 1){
			return;
		}
		
		// Clear prevoius level.
		for(int i = 0; i < world.length; i++){
			for(int j = 0; j < world[0].length; j++){
				world[i][j] = 0;
				angleWorld[i][j] = 0;
			}
		}
		
		// For each object, insert its map in the world.
		for(int i = 0; i < objList.size(); i++){
			if(objList.get(i).isGhost == 1 || objList.get(i).isDynamic == 1){
				continue;
			}
			tempList = objList.get(i);
			tempMap = tempList.getMap();							// the map is nx2 by design. [n][0] is col, [n][1] is row
			tempAngleMap = tempList.getAngle();					// angle has same length "n" as map.
			
			// Remember: Origin is (x,y,z) = [col, row] not [row, col]
			tempOrigin = tempList.getOrigin();
			
			
			int[] worldOrigin = {objectHeight*(envHeight+2)/2, objectWidth*(envWidth+2)/2};

			int[] objectOrigin = {(int) (worldOrigin[0] + tempOrigin[1]*scale3D), 
					              (int) (worldOrigin[1] + tempOrigin[0]*scale3D)};			// some trancation will occur.
			
			for(int j = 0; j < tempMap.length; j++){
				// The y generated is 0 at the top, 60 at the buttom. Hence as we increase, we get lower.
				// The x generated is 0 at the left, 60 at right. Hence, as we increase, we get higher. Thus the sign difference
				world[objectOrigin[0] + localHeight - tempMap[j][1]]
					 [objectOrigin[1] - localWidth + tempMap[j][0]] = 1;
				
				angleWorld[objectOrigin[0] + localHeight - tempMap[j][1]]
						  [objectOrigin[1] - localWidth + tempMap[j][0]] = tempAngleMap[j];
					
			}
		}
		

	}
	
	
	/** This function will move the map of the objects based on the location of the origin
	 * 	It also detects collision. If no collision, hasCollided is set to 0 in objList.
	 *  Otherwise, hasCollided = 1 and normal angle is stored in angleCollided.
	 * @param objList
	 * Object to be moved on the grid.
	 */
	public static void moveObjects(ArrayList <RenderList> objList){
		
		if(objList.size() < 1){
			return;
		}
		
		// For each object, insert its map in the world.
		for(int i = 0; i < objList.size(); i++){
			
			if(objList.get(i).isGhost == 1 || objList.get(i).isDynamic != 1){
				continue;
			}
			tempList 		= objList.get(i);
			tempMap 		= tempList.getMap();					// the map is nx2 by design. [n][0] is col, [n][1] is row
			tempAngleMap 	= tempList.getAngle();					// angle has same length "n" as map.
			tempOrigin 		= tempList.states.getActualPosition();
				
			int[] worldOrigin = {objectHeight*(envHeight+2)/2, objectWidth*(envWidth+2)/2};

			int[] objectOrigin = {(int) (worldOrigin[0] + tempOrigin[1]*scale3D), 
		              			  (int) (worldOrigin[1] + tempOrigin[0]*scale3D)};			// some trancation will occur.
			
			short pastCollided = tempList.hasCollided;
//			float counter = 1;
//			float avgAngles = 0;
			tempList.hasCollided = 0;			// reset
			tempList.angleCollision = 9999;		// error value
			
		
			
			for(int j = 0; j < tempMap.length; j++){
				// The y generated is 0 at the top, 60 at the buttom. Hence as we increase, we get lower.
				// The x generated is 0 at the left, 60 at right. Hence, as we increase, we get higher. Thus the sign difference
				int locVal = world[objectOrigin[0] + localHeight - tempMap[j][1]]
						          [objectOrigin[1] - localWidth + tempMap[j][0]];
				
				
				if( locVal == 0){
		//			world [objectOrigin[0] + localHeight - tempMap[j][1]]
		//			      [objectOrigin[1] - localWidth + tempMap[j][0]] = 1;
				}
				else{
					if( pastCollided != 2){
//						tempList.angleCollision += angleWorld[objectOrigin[0] + localHeight - tempMap[j][1]]
//							  						    [objectOrigin[1] - localWidth + tempMap[j][0]];
						tempList.angleCollision = angleWorld[objectOrigin[0] + localHeight - tempMap[j][1]]
							  						    [objectOrigin[1] - localWidth + tempMap[j][0]];
//						counter++;
					}
					tempList.hasCollided = 1;
					return;
				}		
					
			}
	//		tempList.angleCollision *= 1/counter;
		}
		
		
	}
	
	/** This function will update the speed of an object */
	public static void setSpeed(RenderList object){
		
	//	if(GameState.uInput == 1){				// If the user is changing the speed
			object.states.speed[0] = speedX;
			object.states.speed[1] = speedY;
	//	}
		
		
	}
	
	public static void updateLevel(){
		if(level == 1){
			levelSelect = level2;
			level++;
		}
		
		else if(level == 2){
			levelSelect = level3;
			level++;
		}
		
		else if(level == 3){
			levelSelect = level4;
			level++;
		}
		
		else if(level == 4){
			levelSelect = level5;
			level++;
		}
		
		else if(level == 5){
			levelSelect = level6;
			level++;
		}
		
		else if(level == 6){
			levelSelect = level7;
			level++;
		}
		
		else if(level == 7){
			levelSelect = level8;
			level++;
		}
		
		else if(level == 8){
			levelSelect = level9;
			level++;
		}
		
		else if(level == 9){
			levelSelect = level10;
			level++;
		}
		
		else if(level == 10){
			levelSelect = level1;
			level = 1;
		}


	}
	
}
	
	


