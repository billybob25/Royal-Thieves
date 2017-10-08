//package com.example.aasish.rt_4;
//
//
//
//        import android.app.Activity;
//        import android.support.v7.app.AppCompatActivity;
//        import android.os.Bundle;
//        import android.view.View;
//        import android.widget.Button;
//        import android.widget.TextView;
//        import android.widget.Toast;
//        import java.util.Random;
//
//public class CreateGameId extends Activity {
//    String TextID;
//    private static final String CHAR_LIST =
//            "abcdefghjkmnpqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ23456789";
//    private static final int RANDOM_STRING_LENGTH = 8;
//
//    /**
//     * This method generates random string
//     * @return
//     */
//    public String generateRandomString(){
//
//        StringBuffer randStr = new StringBuffer();
//        for(int i=0; i<RANDOM_STRING_LENGTH; i++){
//            int number = getRandomNumber();
//            char ch = CHAR_LIST.charAt(number);
//            randStr.append(ch);
//        }
//        return randStr.toString();
//    }
//
//    /**
//     * This method generates random numbers
//     * @return int
//     */
//    private int getRandomNumber() {
//        int randomInt = 0;
//        Random randomGenerator = new Random();
//        randomInt = randomGenerator.nextInt(CHAR_LIST.length());
//        if (randomInt - 1 == -1) {
//            return randomInt;
//        } else {
//            return randomInt - 1;
//        }
//    }
//
//
//
//
//
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Button btnNavtoCode = (Button) findViewById(R.id.button2);
//        final TextView GetCode;
//        GetCode = (TextView) findViewById(R.id.textView2);
//
//       btnNavtoCode.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CreateGameId msr = new CreateGameId();
//                TextID = msr.generateRandomString().toString();
//                TextID = TextID+getRandomNumber();
//                GetCode.setText(TextID.toUpperCase());
//                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG).show();
//
//            }
//
//        });
//    }
//
//
//}
//
//
//
//
//
//
//
//
