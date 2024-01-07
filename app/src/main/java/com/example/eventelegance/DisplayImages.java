package com.example.eventelegance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayImages extends AppCompatActivity {

    TextView textView;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_images);

        textView = findViewById(R.id.text_image);
        image = findViewById(R.id.grid_image);

        //display grid image and toast message after clicking on image:
        if (getIntent().hasExtra("com.example.eventelegance.child1")) {
            int image = getIntent().getIntExtra("com.example.eventelegance.child1", 1);
            textView.setText("Child's Birthday Celebration");
            this.image.setImageResource(image);
        }
        else if (getIntent().hasExtra("com.example.eventelegance.adult")) {
            int image = getIntent().getIntExtra("com.example.eventelegance.adult", 1);
            textView.setText("Adult's Birthday Celebration");
            this.image.setImageResource(image);
        }
        else if (getIntent().hasExtra("com.example.eventelegance.wed1")) {
            int image = getIntent().getIntExtra("com.example.eventelegance.wed1", 1);
            textView.setText("Wedding");
            this.image.setImageResource(image);
        }
        else if (getIntent().hasExtra("com.example.eventelegance.wed2")) {
            int image = getIntent().getIntExtra("com.example.eventelegance.wed2", 1);
            textView.setText("Wedding");
            this.image.setImageResource(image);
        }
        else if (getIntent().hasExtra("com.example.eventelegance.func")) {
            int image = getIntent().getIntExtra("com.example.eventelegance.func", 1);
            textView.setText("Other Function");
            this.image.setImageResource(image);
        }
        else if (getIntent().hasExtra("com.example.eventelegance.func2")) {
            int image = getIntent().getIntExtra("com.example.eventelegance.func2", 1);
            textView.setText("Other Function");
            this.image.setImageResource(image);
        }
    }
}