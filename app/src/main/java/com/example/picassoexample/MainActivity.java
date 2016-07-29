package com.example.picassoexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) findViewById(R.id.a_main_img);
    }

    public void doMagic(View view) {
        Picasso.with(this)
                .load("https://pbs.twimg.com/profile_images/705882875896279042/uHCh8ynL.jpg")
                .into(mImageView);
    }
}
