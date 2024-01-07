package com.example.eventelegance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity3 extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        radioGroup = findViewById(R.id.radioGroup);

        Button button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);

                if(radioButton.getText().equals("Wedding")){
                    //move to next activity

                    openWedding();
                }
                else if(radioButton.getText().equals("Birthday Celebration")){
                    //move to next activity
                    openBirthday();
                }
                else if(radioButton.getText().equals("Service Images")){
                    //move to next activity
                    openNewImageView();
                }
                else if(radioButton.getText().equals("Service Cost Calculation")){
                    //move to next activity
                    openServiceCostCalculation();
                }


            }
        });
    }
    public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);

        //move to next activity
    }
    public void openWedding(){

        Intent intent = new Intent(this, Wedding.class);
        startActivity(intent);
    }
    public void openBirthday(){

        Intent intent = new Intent(this, Birthday.class);
        startActivity(intent);
    }
    public void openNewImageView(){

        Intent intent = new Intent(this, NewImageView.class);
        startActivity(intent);
    }
    public void openServiceCostCalculation(){

        Intent intent = new Intent(this, ServiceCostCalculation.class);
        startActivity(intent);
    }
}