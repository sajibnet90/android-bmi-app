package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateBMI(View view) {
        //read weight from input weight
        EditText inputWeight = findViewById(R.id.inputWeight);
        EditText inputHeight = findViewById(R.id.inputHeight);
        //convert numbers to float
        double weight = Double.parseDouble(inputWeight.getText().toString());
        double height = Double.parseDouble(inputHeight.getText().toString());
        double inMeter= height/100;
        double bmi = weight/(inMeter*inMeter);

        TextView textViewBmi = findViewById(R.id.textViewBmi);
        textViewBmi.setText("Your BMI:"+ String.format("%.2f",bmi));

    }
}