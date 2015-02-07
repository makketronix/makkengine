precision highp float;        // Set the default precision to medium. We don't need as high of a
                                // precision in the fragment shader.
uniform sampler2D u_Texture;    // The input texture.

varying vec2 v_TexCoordinate;   // Interpolated texture coordinate per fragment.
 
// The entry point for our fragment shader.
void main()
{
	vec4 myTexture;
	myTexture = texture2D(u_Texture, v_TexCoordinate);

	if( myTexture[3] < 0.1){
		discard;
	}
	else{
	//	gl_FragColor = vec4(1.0,1.0,1.0,1.0);
		gl_FragColor = vec4(1.0,1.0,1.0,myTexture[3]);

	// Check setEGLConfigChooser

	}

  }
