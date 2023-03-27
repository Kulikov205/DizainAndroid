package com.example.hyperpc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;


public class detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        VideoView videoView = findViewById(R.id.detali);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.detali);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

        //com.gamma.scan
        //com.gamma.barcodeapp.ui.BarcodeCaptureActivity
        Button button = findViewById(R.id.poisk);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String packageName = "com.gamma.scan";
                try {
                    Intent launchIntent = getPackageManager().getLaunchIntentForPackage(packageName);
                    if (launchIntent != null) {
                        startActivity(launchIntent);
                    } else {
                        // Если приложение не найдено, открываем страницу в Google Play Store
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + packageName)));
                    }
                } catch (ActivityNotFoundException e) {
                    // Если Google Play Store не установлен, открываем страницу в браузере
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
                }
            }
        });
    }

    public void goBack(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void goColab(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://colab.research.google.com/drive/1VplROXdLB19C3Tw31Ki6wSp8Qd3N1FCy?usp=sharing"));
        startActivity(browserIntent);
    }
}