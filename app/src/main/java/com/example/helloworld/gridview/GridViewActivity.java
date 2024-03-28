package com.example.helloworld.gridview;

import android.os.Bundle;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.R;

public class GridViewActivity extends AppCompatActivity {
    private GridView mGrd;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        mGrd = findViewById(R.id.gr_v);
        mGrd.setAdapter(new MyGridViewAdapter(GridViewActivity.this));
    }
}
