Video View Plugin
=========
opens a videoView in android and plays any android supported video

Install
---
```sh
phonegap create videoview
cd videoview
phonegap plugin add https://github.com/mikeRead/videoview.git
```
Read "Important!" below VVV

IMPORTANT!
----
In most cases,after installing this plugin, you will need to edit line 24 of platforms/android/src/org/ihopkc/videoplayer/play.java ( https://github.com/mikeRead/videoview/blob/master/src/android/play.java )

Find (on line 24) 

> import com.phonegap.helloworld.R;

and replace with your own project name space

for example, if you ran 

```sh 
phonegap create name com.example.project_name_space "CordovaProjectName"
```
you will need to replace (on line 24)
```sh 
import com.phonegap.helloworld.R;
```
with

```sh 
import com.example.project_names_space.R;
```
then you can run 
```sh 
phonegap build android
```
successfully


Usage
---
To open the video in android's video view run this javascript function
```sh 
 window.play('http://link/to/android/supported/video.mp4');
```
