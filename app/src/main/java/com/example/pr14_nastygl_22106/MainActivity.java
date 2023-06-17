package com.example.pr14_nastygl_22106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button4);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}