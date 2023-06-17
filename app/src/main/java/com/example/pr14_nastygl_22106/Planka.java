package com.example.pr14_nastygl_22106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Planka extends AppCompatActivity implements View.OnClickListener{

    Button btn, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planka);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.button7);
        btn2.setOnClickListener(this);



    }

    @Override
    public void onClick(View v){
        if(v.getId()==R.id.button){
            startActivity(new Intent(this, Menu.class));
        }
        if(v.getId()==R.id.button7){
            startActivity(new Intent(this, Uprazhneniya.class));
        }
    }


}