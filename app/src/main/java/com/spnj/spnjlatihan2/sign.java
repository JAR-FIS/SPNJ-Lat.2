package com.spnj.spnjlatihan2;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sign extends AppCompatActivity {

    Button signIn,signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        onClick();
    }

    public void onClick(){
        signIn = findViewById(R.id.btn1);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(sign.this, sign_in.class);
                startActivity(i);
            }
        });

        signUp = findViewById(R.id.btn2);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(sign.this, sign_up.class);
                startActivity(v);
            }
        });
    }
}
