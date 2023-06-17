package com.example.pr14_nastygl_22106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Statistic extends AppCompatActivity implements View.OnClickListener{

    Button btn, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic);
        btn = (Button) findViewById(R.id.button9);
        btn.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.button6);
        btn2.setOnClickListener(this);



    }

    @Override
    public void onClick(View v){
        if(v.getId()==R.id.button6){
            startActivity(new Intent(this, Menu.class));
        }
        if(v.getId()==R.id.button9){
            startActivity(new Intent(this, Menu.class));
        }
    }


}