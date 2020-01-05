package com.example.how2recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoTutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_tutorial);
        VideoView videoview = findViewById(R.id.videotutorial);
        String videoPath = "android.reosure://" +getPackageName() +"/" +R.raw.johncena;
        Uri uri = Uri.parse(videoPath);
        videoview.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        videoview.setMediaController(mediaController);
        mediaController.setAnchorView(videoview);
    }
}
