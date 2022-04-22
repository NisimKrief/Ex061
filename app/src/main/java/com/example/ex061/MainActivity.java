package com.example.ex061;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    Switch sw;
    ImageView iv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (ToggleButton) findViewById(R.id.toggleButton);
        sw = (Switch) findViewById(R.id.switch2);
        btn = (Button) findViewById(R.id.button2);
        iv = (ImageView) findViewById(R.id.imageView6);


    }


    public void Clicked(View view) {
        if (tb.isChecked() && sw.isChecked())
            iv.setImageResource(R.drawable.green);
        else if (tb.isChecked() && sw.isChecked() == false)
            iv.setImageResource(R.drawable.red);
        else if (tb.isChecked() == false && sw.isChecked())
            iv.setImageResource(R.drawable.yellow);
        else{
            iv.setImageResource(R.drawable.brown);
        }

    }
}