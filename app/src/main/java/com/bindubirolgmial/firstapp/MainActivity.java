package com.bindubirolgmial.firstapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button btn;
    private static final String TAG= "BMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG,"onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        btn= (Button) btn.findViewById(R.id.mybutton1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Ahhhh...!!", Toast.LENGTH_LONG);
            }
        });
        */
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "OnStart");
    }
}
