package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FridaTest extends AppCompatActivity {
    private Button mButton;
    private TextView mTextView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frida_test_layout);
        mButton = findViewById(R.id.frida_btn);
        mTextView = findViewById(R.id.frida_text);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText(hook_frida());
            }
        });

    }

    public String hook_frida(){
        String hook_text = "after text!";
        return hook_text;
    }
}
