package com.example.pr14_nastygl_22106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity implements View.OnClickListener {
    Button btn, btn2, btn3, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btn = (Button) findViewById(R.id.button14);
        btn.setOnClickListener(this);
        btn4 = (Button) findViewById(R.id.button19);
        btn4.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        if(v.getId()==R.id.button14){
            startActivity(new Intent(this, Uprazhneniya.class));
        }
        if(v.getId()==R.id.button19){
            startActivity(new Intent(this, Statistic.class));
        }
    }

}