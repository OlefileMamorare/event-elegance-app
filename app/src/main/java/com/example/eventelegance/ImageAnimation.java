package com.example.eventelegance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class ImageAnimation extends AppCompatActivity {

    ViewFlipper viewFlipper;
    Button stop_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_animation);

        int[] images = {R.drawable.child1, R.drawable.adult, R.drawable.wed1, R.drawable.anni, R.drawable.board2, R.drawable.func2};

        viewFlipper = findViewById(R.id.viewFlipper);
        stop_btn = findViewById(R.id.stop);

        for(int image: images){
            flipperImages(image);
        }

        //stop button
        stop_btn.setOnClickListener(v -> {
            viewFlipper.stopFlipping();

            viewFlipper.setVisibility(View.INVISIBLE);

        });

    }

    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(1000); //1 seconds
        viewFlipper.setAutoStart(true);

        //animation
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}