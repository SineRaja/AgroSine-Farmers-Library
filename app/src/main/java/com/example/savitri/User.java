package com.example.savitri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.savitri.Chat.ChatBot;

public class User extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        ImageView image1 = (ImageView)findViewById(R.id.userhome);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent userint = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(userint);
                            }
        });

        ImageView image2 = (ImageView) findViewById(R.id.usercontact);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent userint2 = new Intent(getApplicationContext(), ChatBot.class);
                startActivity(userint2);
            }
        });

        ImageView image3 = (ImageView) findViewById(R.id.signup2);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signu = new Intent(getApplicationContext(),Registration.class);
                startActivity(signu);
            }
        });
    }
}
