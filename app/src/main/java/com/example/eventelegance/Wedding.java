package com.example.eventelegance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Wedding extends AppCompatActivity {
    EditText input_guests;
    EditText input_partial_full;
    TextView input_package;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wedding);

        input_guests = findViewById(R.id.num_guests);
        input_partial_full = findViewById(R.id.partial_full);
        input_package = findViewById(R.id.wedding_cost);

        Button button = findViewById(R.id.apply);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_guests.getText().toString().equals("")){
                    input_guests.setError("Please enter number of guests");
                }
                else if(input_partial_full.getText().toString().equals("")){
                    input_partial_full.setError("Please enter Partial or Full");
                }
                else{
                    int guests = Integer.parseInt(input_guests.getText().toString());
                    String partial_full = input_partial_full.getText().toString();
                    double cost = 0;
                    if(partial_full.equalsIgnoreCase("Partial")){
                        cost = guests * 110;
                    }
                    else if(partial_full.equalsIgnoreCase("full")){
                        cost = guests * 180;
                    }
                    else if(!partial_full.equalsIgnoreCase("partial")
                            && !partial_full.equalsIgnoreCase("full")){

                        input_partial_full.setError("Please enter Partial or Full");

                    }
                    input_package.setText("Your Package Costs R" + cost);
                }
            }
        });
    }
}