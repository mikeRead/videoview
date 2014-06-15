package org.ihopkc.videoplayer;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import android.content.Context;
import android.content.Intent;

/**
 * This class echoes a string called from JavaScript.
 */
public class videoplugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("play")) {
        	final String url= args.getString(0);   
        	cordova.getActivity().runOnUiThread(new Runnable() {
        	        @Override
        	        public void run() {
        	            Context context = cordova.getActivity().getApplicationContext();
        	            Intent intent = new Intent(context,play.class);
        	            intent.putExtra("url", url);
        	            
        	            cordova.getActivity().startActivity(intent);
        	        }
        	    });
        		
        	    return true;
        }
        return false;
    }

   
    
    
}