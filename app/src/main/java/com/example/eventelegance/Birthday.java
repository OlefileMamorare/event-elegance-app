package com.example.eventelegance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class Birthday extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);

        radioGroup = findViewById(R.id.radioGroup2);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);

                if(radioButton.getText().equals("Children's Birthday Party")){
                    //move to next activity

                    openBirthdayPlan();
                }
                else if(radioButton.getText().equals("Teenager's Birthday Party")){
                    //move to next activity
                    openBirthdayPlan();
                }
                else if(radioButton.getText().equals("Adult's Birthday Party")){
                    //move to next activity
                    openBirthdayPlan();
                }

            }
        });

    }
    public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);

        //move to next activity
    }
    public void openBirthdayPlan(){

        Intent intent = new Intent(this, BirthdayPlan.class);
        startActivity(intent);
    }
}