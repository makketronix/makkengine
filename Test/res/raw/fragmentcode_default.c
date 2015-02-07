	precision mediump float;

	uniform mat4 u_VPMatrix;			// This shouldn't change often unless camera or viewport change
	uniform mat4 u_MMatrix;				// This will change often. Operations done to object will be applied here.
	uniform vec4 u_Color;
	uniform vec3 u_LightPos;

	varying vec3 v_Position;
	varying vec4 v_Light;

	varying vec4 v_Color;

	//varying vec3 v_Position;
	void main() {


		float distance = length(vec3(v_Light) - v_Position);
  //       distance = length(u_LightPos - v_Position);


	    // Add attenuation.
	    float diffuse = 0.8+(1.0 / (1.0 + (0.3*distance*distance)));

	    // Add ambient lighting
	 //   diffuse = diffuse + 3.5;
	//	float diffuse = 0.2;

	//	gl_FragColor = u_Color;
	    vec4 test = v_Color;
	    test *= diffuse;




//    test *=1.5;
		gl_FragColor = test;
	//	gl_FragColor.rgb *= diffuse;
	//	gl_FragColor.rgb = gl_FragColor.rgb*diffuse;

    }
