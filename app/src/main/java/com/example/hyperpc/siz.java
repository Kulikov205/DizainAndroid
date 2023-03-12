package com.example.hyperpc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class siz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siz);

        VideoView videoView = findViewById(R.id.videoView3);
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
    public void goColab(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://colab.research.google.com/drive/1mXxcTfAqS5fptgcl1uBEdVdke_zGVur0"));
        startActivity(browserIntent);
    }
}