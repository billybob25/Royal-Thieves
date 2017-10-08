package com.example.aasish.rt_4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import android.app.ApplicationErrorReport;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.app.AlertDialog;
import android.database.Cursor;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Aasish on 10/3/17.
 */

public class SecondScreen extends AppCompatActivity {

    DatabaseReference myRef;
    DatabaseReference myChildRef;
    EditText Code;
    String EnterMessage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        final String Username;
        Username = MainActivity.editName.getText().toString();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnNavToSecond = (Button) findViewById(R.id.button);
        Code = (EditText)findViewById(R.id.editText);
        myRef = FirebaseDatabase.getInstance().getReference();
        myChildRef = myRef.child("Code");

        btnNavToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EnterMessage = ("You have entered as" + Username);
                Toast.makeText(SecondScreen.this,EnterMessage,Toast.LENGTH_LONG).show();
                myChildRef.child(Code.getText().toString()).child(String.valueOf(Username)).setValue("0");
                Intent intent = new Intent(SecondScreen.this, EnterGame.class);
                startActivity(intent);

            }
        });

    }
}
