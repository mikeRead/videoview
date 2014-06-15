Video View Plugin
=========
opens a videoView in android and plays any android supported video

Install
---
```sh
phonegap create videoview
phonegap plugin add https://github.com/mikeRead/videoview.git
```
Read "Important!" below VVV

IMPORTANT!
----
In most cases,after installing this plugin, you will need to edit line 24 of platforms/android/src/org/ihopkc/videoplayer/play.java
Find import com.phonegap.helloworld.R; (on line 24) and replace with your own main package

for example, if you ran 

```sh 
phonegap create name com.example.project_name "CordovaProjectName"
```
you will need to repace (on line 24)
```sh 
import com.phonegap.helloworld.R;
```
with

```sh 
import com.example.project_name.R;
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
