package com.example.eventelegance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class NewImageView extends AppCompatActivity {

    ImageView child, adult, wedding, anniversary, board, concert;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_image_view);

        child = findViewById(R.id.child);
        adult = findViewById(R.id.adult);
        wedding = findViewById(R.id.wedding);
        anniversary = findViewById(R.id.anniversary);
        board = findViewById(R.id.board);
        concert = findViewById(R.id.concert);
        btn = findViewById(R.id.start);

        //Toast message after clicking each image:
        child.setOnClickListener(v -> {
            Toast.makeText(this, "Child's Birthday Celebration" + " Cost: R15000", Toast.LENGTH_LONG).show();
        });
        adult.setOnClickListener(v -> {
            Toast.makeText(this, "Adult's Birthday Celebration" + " Cost: R20000", Toast.LENGTH_LONG).show();
        });
        wedding.setOnClickListener(v -> {
            Toast.makeText(this, "Wedding" + " Cost: R30000", Toast.LENGTH_LONG).show();
        });
        anniversary.setOnClickListener(v -> {
            Toast.makeText(this, "Anniversary" + " Cost: R25000", Toast.LENGTH_LONG).show();
        });
        board.setOnClickListener(v -> {
            Toast.makeText(this, "Board Meeting" + " Cost: R10000", Toast.LENGTH_LONG).show();
        });
        concert.setOnClickListener(v -> {
            Toast.makeText(this, "Concert" + " Cost: R30000", Toast.LENGTH_LONG).show();
        });

        //Open ImageAnimation activity after clicking the start button:
        btn.setOnClickListener(v -> {
            openImageAnimation();
        });


    }

    public void openImageAnimation(){
        Intent intent = new Intent(this, ImageAnimation.class);
        startActivity(intent);
    }
}