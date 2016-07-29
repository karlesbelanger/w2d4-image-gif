package com.example.picassoexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;
    private ImageView mImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) findViewById(R.id.a_main_img);
        mImageView2 = (ImageView) findViewById(R.id.a_main_img2);
    }

    public void doMagic(View view) {
        GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(mImageView);
        Glide.with(this)
                .load("https://usatsneakhype.files.wordpress.com/2014/04/boob-gifs-vs-butt-gifs-122.gif")//http://likegif.com/wp-content/uploads/2013/03/01/100-funny-girl-gifs-29.gif
                .into(imageViewTarget);
        imageViewTarget = new GlideDrawableImageViewTarget(mImageView2);
        Glide.with(this)
            .load("http://likegif.com/wp-content/uploads/2013/03/01/100-funny-girl-gifs-29.gif")
            .into(imageViewTarget);
    }
}
