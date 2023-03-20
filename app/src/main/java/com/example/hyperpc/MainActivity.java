package com.example.hyperpc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Запуск APK
        Button button = findViewById(R.id.button19);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_LAUNCHER);
                intent.setComponent(new ComponentName("com.example.kontur", "com.example.kontur.MainActivity"));
                startActivity(intent);
            }
        });

    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, info.class);
        startActivity(intent);
    }

    public void openSiz(View v) {
        Intent intent = new Intent(this, siz.class);
        startActivity(intent);
    }

    public void openTools(View v) {
        Intent intent = new Intent(this, tools.class);
        startActivity(intent);
    }

    public void openDangerzone(View v) {
        Intent intent = new Intent(this, dangerzone.class);
        startActivity(intent);
    }

    public void openDetail(View v) {
        Intent intent = new Intent(this, detail.class);
        startActivity(intent);
    }

    public void openSortirovka(View v) {
        Intent intent = new Intent(this, sortirovka.class);
        startActivity(intent);
    }

    public void openFiltr(View v) {
        Intent intent = new Intent(this, filtr.class);
        startActivity(intent);
    }

    public void openKontrol(View v) {
        Intent intent = new Intent(this, kontrol.class);
        startActivity(intent);
    }

    public void openSborka(View v) {
        Intent intent = new Intent(this, sborka.class);
        startActivity(intent);
    }

    public void goFlow(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Kulikov205/Glas"));
        startActivity(browserIntent);
    }
}