package com.example.joanayala.myapp1_splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button Activity3;
    Button Activity4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //### Login to main menu
        Activity3 = (Button) findViewById(R.id.button);
        Activity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent Activity3 = new Intent(Main2Activity.this, Main3Activity.class);
                Intent Activity3 = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(Activity3);
            }
        });

        //### Login to register
        Activity4 = (Button) findViewById(R.id.button3);
        Activity4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent Activity3 = new Intent(Main2Activity.this, Main3Activity.class);
                Intent Activity4 = new Intent(Main2Activity.this, Main4Activity.class);
                startActivity(Activity4);
            }
        });
    }
}
