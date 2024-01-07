package com.example.eventelegance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayDueAmount extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_due_amount);

        textView = findViewById(R.id.amount_due);

        SharedPreferences sp = getApplicationContext().getSharedPreferences("my_prefs", MODE_PRIVATE);
        int amount_due = sp.getInt("amount_due", 0);

        textView.setText("R" + amount_due);


    }
}