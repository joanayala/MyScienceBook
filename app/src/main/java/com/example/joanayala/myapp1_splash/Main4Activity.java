package com.example.joanayala.myapp1_splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    Button Activity6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //### Go to main menu
        Activity6 = (Button)findViewById(R.id.button2);
        Activity6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent Activity3 = new Intent(Main2Activity.this, Main3Activity.class);
                Intent Activity6 = new Intent(Main4Activity.this, Main6Activity.class);
                startActivity(Activity6);
            }
        });
    }

}
