package com.makketronix.makkengine.makkobjects;

import java.util.ArrayList;
import java.util.Collection;

import com.makketronix.makkengine.makkobjects.MakkObject;
import com.makketronix.makkengine.makkobjects.PhysicsVars;

/** This class overrides ArrayList
 * 
 * @author Makke
 * The idea is this list hold ShapeData
 * Then an arraylist will hold these lists. The calls will be something like:
 * Loop through main list
 * 			List.get(i).get()
 * If there is sprite, the index will move forward or backwards depending on sprite setting.
 * 
 */

public class RenderList extends ArrayList<IGLRender20> {
	/**
	 * No clue what this is. 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/** Time dt to calculate time for sprite */
	private float dt = 0;
	
	/** Time since dt was accumulating */
	private long timeStart = 0;

	/** 
	 * Set this flag if object will move. If so, its map will not be constant in enviornmentGE and will have
	 * to be redrawn on every render.
	 */
	public int isDynamic;

	/** spriteMode = 1 is for wrap. spriteMode = -1 is for reverse, 0 is no sprite */
	private int spriteMode;
	
	/** Auto or manual sprite. Both modes will use spriteMode to graph next animation.
	 * 0 = Manual
	 * 1 = Auto
	 */
	private int spriteControl;
	
	/** Wrapped index. It increments whenever item is seleted. */
	private int wrapIndex;
	
	/** Reversed Index */
	private int reverseIndex;
	
	/** Local index if others are not used. Selection must be overridden */
	private int localIndex;
	
	/** Time Tracker used for animation */
	float time;
	
	/** Common origin of the objects */
	private float[] origin = new float[3];
	
	/** The animation will be updated after this time only. Only works when spriteControl = 1 (Auto)
	 * Default is 0.2 seconds.
	 *  */
	private float animFilterTime = 0.2f;
	
	/** This flag will indicate that the origin cannot be set upon initialization due to its fixed location.
	 *  If is true, the origin must be set at "OnSurfaceChanged" instead of "OnSurfaceCreated"
	 */
	public int lateOrigin;
	
	/** This is the index of the object to get the map from, used for collision detection. This expects that GLObject
	 * 	does have the map defined.
	 */
	public int mapIndex = 0;
	
	/** If this flag is 1, then object shall not affect collision detection */
	public short isGhost;
	
	/** When collision happens, the angle of the normal is set in this variable */
	public float angleCollision;
	
	/** When collision happens, this flag is set to indicate collision */
	public short hasCollided;
	
	/** Some physics states */
	public PhysicsVars states = new PhysicsVars();
	
	public RenderList(){
		super();
		localConstruct();
	}

	public RenderList(Collection<MakkObject> arg0){
		super();
		localConstruct();
		
	}

	/** Initializes private variables */
	public void localConstruct(){
		spriteMode 		= 0;
		spriteControl 	= 0;
		wrapIndex 		= 0;
		localIndex 		= 0;
		reverseIndex 	= 0;
	}
	

	/** Allows the list to be called as list.get()
	 *  In manual mode (spriteControl = 0), this will return same object.
	 *  
	 *  */
	public IGLRender20 get() {
		// TODO Auto-generated method stub
		
		if( spriteControl != 1){
			return super.get(localIndex);
		}
		
		if( dt < animFilterTime){
			accumulateDt();
			return (IGLRender20) super.get(localIndex);
		}

		dt = 0;
		
		int maxItems = super.size();
		
		if(++wrapIndex >= maxItems ) wrapIndex = 0;
		
		if(--reverseIndex < 0 ) reverseIndex = maxItems -1;
			
		localIndex = (spriteMode == 0 )?localIndex : ( (spriteMode == 1 )?wrapIndex:reverseIndex);
		
		return (IGLRender20) super.get(localIndex);
	}

	/** Readjusts internal indices when an item is removed */
	@Override
	public boolean remove(Object object) {
		// TODO Auto-generated method stub
		
		boolean rtn = super.remove(object);
		int maxItems = super.size();
		
		if(wrapIndex >= maxItems ) wrapIndex = 0;
		
		if( reverseIndex >= maxItems ) reverseIndex = maxItems -1;
		
		return rtn;
	}
	
	/** Sets the sprite. 1 is Wrap, -1 is reverse. Anything else is no sprite.
	 * 
	 * @param mode: Sprite mode: 1, -1, or anything else = 0
	 */
	public void setSpriteMode(int mode){
		
		if( mode == 1) spriteMode = 1;
		else if( mode == -1) spriteMode = -1;
		else spriteMode = 0;
	}
	
	/**
	 * Sets manual (0) or auto (1) mode. 
	 * @param mode: 0 or 1. Anything else is treated as 0.
	 */
	public void setSpriteControl(int mode){
		spriteControl = (mode == 1)?1:0;
		
	}
	
	/**
	 * Manual control for animation.
	 * This will will modify the index based on spriteMode (Normal, Reverse, or nothing).
	 * get() still has to be called afer this to return the indexed object
	 */
	public void switchSprite(){
		if( this.size() == 0) return;
		
		int maxItems = super.size();
		
		if(++wrapIndex >= maxItems ) wrapIndex = 0;
		
		if(--reverseIndex < 0 ) reverseIndex = maxItems -1;
		
		localIndex = (spriteMode == 0 )?localIndex : ( (spriteMode == 1 )?wrapIndex:reverseIndex);
		
//		if( GameState.collided == 1 && GameState.isInterrupted != 1) localIndex = 0;
	//	else localIndex = 1;
		
		
		// This is dirty. There should be an overriden list per type of objects if necessary. But for now, this will do.
		
		// We need to start from the same position
	//	super.get(index2).states.localPos = super.get(index1).states.localPos;
		
		
	}
	
	/** This will set the sprite to index 0, sets to manual control  */
	public void resetSprite(){
		spriteControl 	= 0;
		wrapIndex 		= 0;
		localIndex 		= 0;
		reverseIndex 	= 0;
		dt 				= 0;

	}
	
	
	public void resetAll(){

			
	}
	
	
	/** Returns the common origin of the objects in the list
	 * 
	 * @return: float[3]
	 */
	public float[] getOrigin() {
		return origin;
	}

	/** 
	 * Sets the common origin for the objects in the set
	 * @param origin: Float[3] origin
	 */
	public void setOrigin(float[] origin) {
		for(int i = 0; i < origin.length; i++){
			this.origin[i] = origin[i];
		}
	}

	/**
	 * Sets the minimum time that has to pass in seconds before sprite changes
	 * @param animFilterTime: seconds before sprite changes.
	 */
	public void setAnimFilterTime(float animFilterTime) {
		this.animFilterTime = animFilterTime;
	}
	
	/** Gets collision map from index 0 object */
	public short[][] getMap(){
		// TODO: Fix this.
		if( this.size() > 0){
	//		return get(0).coarseMap;
			return null;
		}
		else{
			return null;
		}
		
	}
	
	/** Gets angle of collision map from index 0 object */
	public float[] getAngle(){
		// TODO: fix this.
		if( this.size() > 0){
	//		return get(0).angleMap;
			return null;
		}
		else{
			return null;
		}
	}
	
	/** Accumulates time dt */
	public void accumulateDt(){
		if( timeStart == 0){
			timeStart = System.currentTimeMillis();
		}
		else{
			dt = dt + (System.currentTimeMillis()- timeStart)/1000f;
			timeStart = System.currentTimeMillis();
	

		}
		
		
	}

	
	

}
