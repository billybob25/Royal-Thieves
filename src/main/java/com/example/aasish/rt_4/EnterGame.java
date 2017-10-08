package com.example.aasish.rt_4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by Aasish on 10/3/17.
 */

public class EnterGame extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_game);
        Button btnNavToSecond = (Button) findViewById(R.id.button2);

        btnNavToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(EnterGame.this, FirstRound.class);
                startActivity(intent);

            }
        });

    }
}
