package com.example.aasish.rt_4;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.os.Bundle;
        import android.text.Editable;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;
        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;

public class MainScreenActivity extends AppCompatActivity {
    DatabaseReference myRef;
    DatabaseReference myChildRef;
    EditText editScore, editName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       myRef = FirebaseDatabase.getInstance().getReference();
      myChildRef = myRef.child("Code");
    final EditText user;
    user = (EditText)findViewById(R.id.editText);
    final String username = user.getText().toString();
       //editScore = (EditText)findViewById(R.id.editText3);
       editName = (EditText) findViewById(R.id.editText2);
    Button btnNavToPlayer = (Button) findViewById(R.id.button2);

    btnNavToPlayer.setOnClickListener(new View.OnClickListener() {
    @Override
      public void onClick(View v) {
     Toast.makeText(MainScreenActivity.this,"Data Inserted",Toast.LENGTH_LONG).show();
    myRef.child("Code").setValue("574832");
    myRef.child("Code").push().child("Joe").setValue("892421");
    myChildRef.child("023423").setValue("Jill");
    myChildRef.child("023423").child("Bob").setValue(editScore);
            myChildRef.child("023423").child(editName.getText().toString()).setValue(editScore.getText().toString());

     }
     });

      }
}

//