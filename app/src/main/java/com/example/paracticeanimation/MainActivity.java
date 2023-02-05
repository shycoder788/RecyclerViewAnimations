package com.example.paracticeanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView demoImage = findViewById(R.id.demoImage);

        // Zoom animation
        findViewById(R.id.buttonZoomIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demoImage.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.zoom_in
                ));

            }
        });
        findViewById(R.id.buttonZoomOut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demoImage.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.zoom_out
                ));

            }
        });

        // Fade animation
        findViewById(R.id.buttonFadeIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demoImage.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.fade_in
                ));

            }
        });
        findViewById(R.id.buttonFadeOut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demoImage.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.fade_out
                ));

            }
        });


        // Slide animation
        findViewById(R.id.buttonSlideLeft).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demoImage.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.slide_left
                ));

            }
        });
        findViewById(R.id.buttonSlideRight).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demoImage.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.slide_right
                ));


            }
        });

        findViewById(R.id.buttonSlideUp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demoImage.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.slide_up
                ));

            }
        });
        findViewById(R.id.buttonSlideDown).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demoImage.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.slide_down
                ));


            }
        });
        // Multiple animations

        findViewById(R.id.buttonZoomInFadeIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demoImage.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.zoom_in_fade_in
                ));

            }
        });
        findViewById(R.id.buttonZoomOutFadeOut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demoImage.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.zoom_out_fade_out
                ));


            }
        });
        // rotate animations


        findViewById(R.id.buttonRotate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demoImage.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.rotate
                ));

            }
        });
        // Move animation

        findViewById(R.id.buttonMove).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demoImage.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.move
                ));

            }
        });


    }
}
