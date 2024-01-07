package com.example.eventelegance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ServiceCostCalculation extends AppCompatActivity {
    Button button;
    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_cost_calculation);

        button = findViewById(R.id.button);

        radioGroup = findViewById(R.id.radioGroup);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);

                if(radioButton.getText().equals("Wedding")){
                    //move to next activity

                    openActualServiceCost();
                }
                else if(radioButton.getText().equals("Birthday Celebration")){
                    //move to next activity
                    openActualServiceCost();
                }
                else if(radioButton.getText().equals("Wedding Anniversary")){
                    //move to next activity
                    openActualServiceCost();
                }
                else if(radioButton.getText().equals("Concert")){
                    //move to next activity
                    openActualServiceCost();
                }


            }
        });
    }

    public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);

        //move to next activity
    }

    public void openActualServiceCost(){
        Intent intent = new Intent(this, ActualServiceCost.class);
        startActivity(intent);
    }
}