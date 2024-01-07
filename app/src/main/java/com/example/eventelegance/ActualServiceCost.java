package com.example.eventelegance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActualServiceCost extends AppCompatActivity {

    EditText days, deposit, rate;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actual_service_cost);

        days = findViewById(R.id.days);
        deposit = findViewById(R.id.deposit);
        rate = findViewById(R.id.rate);



        //multiply days and rate
        //subtract deposit from the result
        //display the result in DisplayDueAmount:

        sp = getSharedPreferences("my_prefs", MODE_PRIVATE);



        Button button = findViewById(R.id.calculate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(days.getText().toString().equals("")){
                    days.setError("Please enter number of days");
                }
                else if(rate.getText().toString().equals("")){
                    rate.setError("Please enter rate");
                }

                else if(deposit.getText().toString().equals("")){
                    deposit.setError("Please enter deposit");
                }
                else{
                    if(rate.getText().toString().equalsIgnoreCase("w")){

                        int rate_value = 10_000;
                        //multiply days and rate
                        //subtract deposit from the result

                        int amount_due = (days.getText().toString().equals("") ? 0 : Integer.parseInt(days.getText().toString())) * rate_value - (deposit.getText().toString().equals("") ? 0 : Integer.parseInt(deposit.getText().toString()));

                        SharedPreferences.Editor editor = sp.edit();

                        editor.putInt("amount_due", amount_due);
                        editor.apply();


                    }
                    if(rate.getText().toString().equalsIgnoreCase("b")){

                        int rate_value = 5_000;

                        int amount_due = (days.getText().toString().equals("") ? 0 : Integer.parseInt(days.getText().toString())) * rate_value - (deposit.getText().toString().equals("") ? 0 : Integer.parseInt(deposit.getText().toString()));

                        SharedPreferences.Editor editor = sp.edit();

                        editor.putInt("amount_due", amount_due);
                        editor.apply();
                    }
                    if(rate.getText().toString().equalsIgnoreCase("a")){

                        int rate_value = 7_000;

                        int amount_due = (days.getText().toString().equals("") ? 0 : Integer.parseInt(days.getText().toString())) * rate_value - (deposit.getText().toString().equals("") ? 0 : Integer.parseInt(deposit.getText().toString()));

                        SharedPreferences.Editor editor = sp.edit();

                        editor.putInt("amount_due", amount_due);
                        editor.apply();

                    }
                    if(rate.getText().toString().equalsIgnoreCase("c")){

                        int rate_value = 9_000;

                        int amount_due = (days.getText().toString().equals("") ? 0 : Integer.parseInt(days.getText().toString())) * rate_value - (deposit.getText().toString().equals("") ? 0 : Integer.parseInt(deposit.getText().toString()));

                        SharedPreferences.Editor editor = sp.edit();

                        editor.putInt("amount_due", amount_due);
                        editor.apply();
                    }
                }

                //display the result in DisplayDueAmount:
                Intent intent = new Intent(ActualServiceCost.this, DisplayDueAmount.class);
                startActivity(intent);
            }
        });





    }
}