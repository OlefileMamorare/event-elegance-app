package com.example.eventelegance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mytextView = findViewById(R.id.textView);

        Button myBTN = findViewById(R.id.button);
        myBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openMainActivity2();
            }
        });
        }
        public void openMainActivity2(){
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }

}