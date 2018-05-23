package com.example.joanayala.myapp1_splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    //Button Activity7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //### Login to main menu
        /*Activity7 = (Button) findViewById(R.id.button49);
        Activity7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent Activity7 = new Intent(Main2Activity.this, Main3Activity.class);
                Intent Activity7 = new Intent(Main3Activity.this, Main7Activity.class);
                startActivity(Activity7);
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.IdIng:
                Intent intent1 = new Intent(this, Main9Activity.class);
                startActivity(intent1);


            case R.id.Aboutof:
                Intent intent2 = new Intent(this, Main11Activity.class);
                startActivity(intent2);

        }
        return super.onOptionsItemSelected(item);
    }





    public void quimica(View view){
        Intent intent = new Intent(this, Main7Activity.class);
        startActivity(intent);
    }

    public void genetica(View view){
        Intent intent = new Intent(this, Main8Activity.class);
        startActivity(intent);
    }

    public void ingenieria(View view){
        Intent intent = new Intent(this, Main9Activity.class);
        startActivity(intent);
    }
}
