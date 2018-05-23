package com.example.joanayala.myapp1_splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main6Activity extends AppCompatActivity {

    //Button Activity6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        //### Welcome window to Main Menu
        //### Login to main menu
        /*Activity6 = (Button) findViewById(R.id.button4);
        Activity6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Activity3 = new Intent(Main6Activity.this, Main3Activity.class);
                startActivity(Activity3);
            }
        });*/

    }

    public void main_menu(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

}
