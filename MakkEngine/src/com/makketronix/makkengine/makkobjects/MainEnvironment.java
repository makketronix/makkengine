package com.makketronix.makkengine.makkobjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import android.opengl.GLES20;

import com.makketronix.makkengine.utils.objUtility;

public class MainEnvironment {
	private static final String TAG = "MainEnvironment";
	public static List<MakkEnv> envList;
	protected static ArrayList<Integer> GLprograms;
	
	
	static{
		envList = new ArrayList<MakkEnv>();
		GLprograms =  new ArrayList<Integer>();
	}
	
	public static MakkEnv addEnvironment(List<MakkObject> objects){
		MakkEnv env = new MakkEnv(objects);
		envList.add(env);
		return env;
	}

	public static void stepAll(float dt){
		for(int i = 0; i < envList.size(); i++){
			envList.get(i).renderAll(dt);
		}
	}
	
	public static void clearEnviornments(){
		envList.clear();
	}
	
	/** 
	 * Creates GL program with vertex shader code and fragment shader code.
	 * It is assumed that the shader code has:
	 *    "a_Position", "a_Color", "a_Textures", "a_Normals".
	 * @param vertexShaderCode
	 * @param fragmentShaderCode
	 * @return
	 */
	public static int addShaders(String vertexShaderCode, String fragmentShaderCode){	
		
		// NOTE: ONLY FOR DEFAULT SHADER> CUSTOM IS ALWAYS COMPILED
        int compiledVShader = objUtility.compileShader(GLES20.GL_VERTEX_SHADER, vertexShaderCode);
        int compiledFShader = objUtility.compileShader(GLES20.GL_FRAGMENT_SHADER, fragmentShaderCode);
        
        String[] params = {"a_Position", "a_Color","a_Textures", "a_Normals"};
        int	program = objUtility.createAndLinkProgram(compiledVShader, compiledFShader, params);
        GLprograms.add(program);
        return program;
	}

	
}
