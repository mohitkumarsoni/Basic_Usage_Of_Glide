package com.example.glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.iv);
        tv = findViewById(R.id.dummyTv);

        Glide.with(this).load("https://rukminim2.flixcart.com/image/416/416/knyxqq80/dslr-camera/r/y/x/digital-camera-eos-m50-mark-ii-eos-m50-mark-ii-canon-original-imag2gzkexzqhyhu.jpeg?q=70")
                .into(img);

        tv.setText(R.string.canon_eos_m50_mark_ii_mirrorless_camera_ef_m15_45mm_is_stm_lens_black);

    }
}