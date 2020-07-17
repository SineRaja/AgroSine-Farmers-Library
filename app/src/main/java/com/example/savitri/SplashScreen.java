package com.example.savitri;


import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EasySplashScreen config = new EasySplashScreen(SplashScreen.this)
                .withFullScreen()
                .withTargetActivity(Login.class)
                .withSplashTimeOut(5000)
                .withBackgroundResource(R.drawable.pinkkk)
                .withLogo(R.drawable.agrotop);
        View easySplashScreen = config.create();
        setContentView(easySplashScreen);
    }
}
