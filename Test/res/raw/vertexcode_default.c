// This matrix member variable provides a hook to manipulate
// the coordinates of the objects that use this vertex shader
	precision mediump float;
	uniform mat4 u_VPMatrix;			// This shouldn't change often unless camera or viewport change
	uniform mat4 u_MMatrix;				// This will change often. Operations done to object will be applied here.
	uniform vec3 u_LightPos;				// Light Position

	attribute vec4 a_Color;
	attribute vec4 a_Position;			// Vertex Position
	attribute vec2 a_Texture;
	attribute vec3 a_Normal;


	varying vec3 v_Position;        	// This will be passed into the fragment shader.
	varying vec4 v_Light;
	varying vec4 v_Color;

	void main() {


		v_Position 	= vec3(u_VPMatrix * u_MMatrix * a_Position);
		gl_Position = (u_VPMatrix * u_MMatrix ) * a_Position;
		v_Light = u_VPMatrix*(u_MMatrix * vec4(u_LightPos, 1.0));
		v_Color = a_Color;
	//	v_Light = vec4(u_LightPos, 1.0);
	//	gl_Position = u_VPMatrix * a_Position;

	}
