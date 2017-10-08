package com.example.aasish.rt_4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends Activity {

 //   private static final String TAG = "MainActivity";

    DatabaseReference myRef;
    DatabaseReference myChildRef;
    EditText editScore;
    static EditText editName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        Button btnNavToPlayer = (Button) findViewById(R.id.button4);
        Button btnNavToAdmin = (Button) findViewById(R.id.button3);

        myRef = FirebaseDatabase.getInstance().getReference();
        myChildRef = myRef.child("Code");
     //   final EditText user;
       // user = (EditText)findViewById(R.id.editText);
     //   final String username = user.getText().toString();
        //editScore = (EditText)findViewById(R.id.editText3);
        editName = (EditText) findViewById(R.id.editText2);

        btnNavToPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   myRef.child("Code").setValue("574832");
              //  myRef.child("Code").push().child("Joe").setValue("892421");
             //   myChildRef.child("023423").setValue("Jill");
              //  myChildRef.child("023423").child("Bob").setValue(editScore);
             ///   myChildRef.child("023423").child(editName.getText().toString()).setValue("0");
                Intent intent = new Intent(MainActivity.this, SecondScreen.class);
                startActivity(intent);

           }
        });


        btnNavToAdmin.setOnClickListener(new View.OnClickListener(){
         @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdminScreen.class);
                startActivity(intent);
            }


        });



        }

    }

