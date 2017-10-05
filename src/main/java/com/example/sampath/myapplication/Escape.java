package com.example.sampath.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.app.ApplicationErrorReport;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.sampath.myapplication.R;



public class Escape extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.escape);
        Button btnNavToSecond = (Button) findViewById(R.id.button3);

        btnNavToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Escape.this, Caught.class);
                startActivity(intent);
            }
        });
    }
}