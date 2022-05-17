package com.example.a001firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayout);
        TextView myText = (TextView) findViewById(R.id.textView1);
        myText.setText("New text");
        CheckBox ch = (CheckBox) findViewById(R.id.ch1);
        ch.setText("ABC");
        ch.setChecked(true);
    }
}