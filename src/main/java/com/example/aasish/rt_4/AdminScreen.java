package com.example.aasish.rt_4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Random;
import android.widget.Toast;


/**
 * Created by Aasish on 10/3/17.
 */

public class AdminScreen extends AppCompatActivity {
    TextView RandomCode;
    Random r = new Random();
    String NumberCode;
    Integer NumberCode2;
    String TextID;
    private static final String CHAR_LIST =
            "abcdefghjkmnpqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ23456789";
    private static final int RANDOM_STRING_LENGTH = 8;

    /**
     * This method generates random string
     * @return
     */
    public String generateRandomString(){

        StringBuffer randStr = new StringBuffer();
        for(int i=0; i<RANDOM_STRING_LENGTH; i++){
            int number = getRandomNumber();
            char ch = CHAR_LIST.charAt(number);
            randStr.append(ch);
        }
        return randStr.toString();
    }

    /**
     * This method generates random numbers
     * @return int
     */
    private int getRandomNumber() {
        int randomInt = 0;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(CHAR_LIST.length());
        if (randomInt - 1 == -1) {
            return randomInt;
        } else {
            return randomInt - 1;
        }
    }



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.admin_code);
        super.onCreate(savedInstanceState);
        final TextView GetCode;
        GetCode = (TextView) findViewById(R.id.textView12);
        AdminScreen msr = new AdminScreen();
        TextID = msr.generateRandomString().toString();
        //TextID = TextID+getRandomNumber();
        GetCode.setText(TextID.toUpperCase());


    }
}