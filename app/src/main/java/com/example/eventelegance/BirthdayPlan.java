package com.example.eventelegance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class BirthdayPlan extends AppCompatActivity {
    RadioButton radioButton;
    EditText birthday;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_plan);

        birthday = findViewById(R.id.num_guests);

        Button button = findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(birthday.getText().toString().equals("")){
                    birthday.setError("Please enter number of guests");
                }
                else{
                    int guests = Integer.parseInt(birthday.getText().toString());
                    double cost = 0;
                    if(guests <= 20){
                        cost = guests * 110;
                    }
                    else if(guests <= 50){
                        cost = guests * 100;
                    }
                    else if(guests <= 100){
                        cost = guests * 90;
                    }
                    else if(guests <= 200){
                        cost = guests * 80;
                    }
                    else if(guests <= 300){
                        cost = guests * 70;
                    }
                    else if(guests <= 400){
                        cost = guests * 60;
                    }
                    else if(guests <= 500){
                        cost = guests * 50;
                    }
                    else if(guests <= 600){
                        cost = guests * 40;
                    }
                    else if(guests <= 700){
                        cost = guests * 30;
                    }
                    else if(guests <= 800){
                        cost = guests * 20;
                    }
                    else if(guests <= 900){
                        cost = guests * 10;
                    }
                    else if(guests <= 1000){
                        cost = guests * 5;
                    }
                    else {
                        cost = guests;
                    }
                    birthday.setText("Your Package Costs R" + cost);
                }
            }
        });
        }

}
