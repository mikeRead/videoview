/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package org.ihopkc.videoplayer;

//change this (com.phonegap.helloworld) to your package name, keep the .R
//example: your.package.name.R;
import com.phonegap.helloworld.R;


import android.os.Bundle;
import android.app.Activity;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;
import android.widget.Toast;



/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class play extends Activity {
	  VideoView videoView;

	    private void makePlayer(String URL){
	    	Toast.makeText(getApplicationContext(), "Loading Video", Toast.LENGTH_LONG).show();
	    	videoView = (VideoView) findViewById(R.id.videoView);
	        videoView.setVideoURI(Uri.parse(URL));
	        MediaController mediaController = new MediaController(this);
	      	videoView.setMediaController(mediaController);
	        videoView.requestFocus();
	        videoView.start();
	    }


	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        
	        setContentView(R.layout.activity_player);
	        Bundle bundle = getIntent().getExtras();
	        String url = bundle.getString("url");
	        makePlayer(url);             
	    }     
}
