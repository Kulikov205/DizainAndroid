package com.example.hyperpc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;


public class tools extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);

        VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.screwdriver);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
    public void goBack(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openFlow(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kulikov205.github.io/screwdriver/"));
        startActivity(browserIntent);
    }

}