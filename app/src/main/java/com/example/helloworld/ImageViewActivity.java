package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {
    private ImageView Iv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        Iv1 = findViewById(R.id.iv_1);
        Glide.with(this).load("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fp2.ssl.qhimgs1.com%2Fbdr%2F460__%2Ft01c4d9fa5f497b5abc.jpg&refer=http%3A%2F%2Fp2.ssl.qhimgs1.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1651209500&t=7cd0444fa7dadcb8f4477424d9469abc").into(Iv1);

    }
}