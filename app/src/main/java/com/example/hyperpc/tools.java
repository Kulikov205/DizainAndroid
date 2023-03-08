package com.example.hyperpc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;



public class tools extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);
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