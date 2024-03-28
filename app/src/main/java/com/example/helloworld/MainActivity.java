package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.helloworld.gridview.GridViewActivity;
import com.example.helloworld.listview.ListViewActivity;
import com.example.helloworld.recyclerview.RecyclerViewActivity;
import com.example.helloworld.recyclerview.WebViewActivity;


public class MainActivity extends AppCompatActivity {
    private Button btn ;
    private Button Radio_btn;
    private Button image_btn;
    private Button listview_btn;
    private Button gridview_btn;
    private Button frida_btn;
    private Button mBtnRv;
    private Button WebView_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn_1);
        Radio_btn = findViewById(R.id.radio_btn_1);
        image_btn = findViewById(R.id.btn_imageview);
        listview_btn = findViewById(R.id.btn_listview);
        gridview_btn = findViewById(R.id.btn_gridview);
        frida_btn = findViewById(R.id.btn_fridatest);
        mBtnRv = findViewById(R.id.btn_recyclerview);
        WebView_btn = findViewById(R.id.btn_webview);

        setListeners();
    }

    private  void setListeners(){
        OnClick onClick = new OnClick();
        btn.setOnClickListener(onClick);
        Radio_btn.setOnClickListener(onClick);
        image_btn.setOnClickListener(onClick);
        listview_btn.setOnClickListener(onClick);
        gridview_btn.setOnClickListener(onClick);
        frida_btn.setOnClickListener(onClick);
        mBtnRv.setOnClickListener(onClick);
        WebView_btn.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener{
        Intent intent;
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case  R.id.btn_1:

                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    });
                    break;
                case R.id.radio_btn_1:
                    intent = new Intent(MainActivity.this,RadioActivity.class);
                    break;
                case R.id.btn_imageview:
                    intent = new Intent(MainActivity.this,ImageViewActivity.class);
                    break;
                case R.id.btn_listview:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    intent = new Intent(MainActivity.this, GridViewActivity.class);
                    break;
                case R.id.btn_fridatest:
                    intent = new Intent(MainActivity.this, FridaTest.class);
                    break;
                case R.id.btn_recyclerview:
                    intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                    break;
                case  R.id.btn_webview:
                    intent = new Intent(MainActivity.this, WebViewActivity.class);
            }
            if(intent != null) {
                startActivity(intent);
            }
        }
    }
}