package com.makketronix.test;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
	
	public static Context xt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }
    
	@Override
	protected void onResume() {
		super.onResume();
		MainApp.setCurrentActivity(this);		// Current Activity is the foreground one
	}   
    
    @Override
	protected void onDestroy() {
    	// Assuming the application can have multiple activities on different threads,
    	// background activity may disappear when in background. Don't set current 
    	// Activity to null when that happens.
    	if (MainApp.getCurrentActivity() == this) {
    		MainApp.setCurrentActivity(null);
    	}
    	super.onDestroy();
	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
    	
    	private mGLSurfaceView mGLView;

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            
    	    RelativeLayout layout = new RelativeLayout(getActivity());
    	    RelativeLayout.LayoutParams adParams = new RelativeLayout.LayoutParams(
    	            RelativeLayout.LayoutParams.MATCH_PARENT,
    	            RelativeLayout.LayoutParams.WRAP_CONTENT);
    	    adParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
    	    adParams.addRule(RelativeLayout.CENTER_HORIZONTAL);

    	    RelativeLayout.LayoutParams glParams = new RelativeLayout.LayoutParams(
    	            RelativeLayout.LayoutParams.WRAP_CONTENT,
    	            RelativeLayout.LayoutParams.WRAP_CONTENT);
    	    glParams.addRule(RelativeLayout.ABOVE, 0x11223);
    	    glParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
    	    mGLView = new mGLSurfaceView(getActivity());
    	    mGLView.setKeepScreenOn(true);
    	    layout.addView(mGLView, glParams);
     //       layout.addView(adView, adParams);

            getActivity().setContentView(layout);
            
            if(savedInstanceState != null){
       //     	GameState.start(savedInstanceState);

            }
            else{
      //      	GameState.start();
            }
            return rootView;
        }
    }
}
