package com.example.sample53;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessage = findViewById(R.id.myTv);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("message", "onStart() has excecuted...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("message", "onResume() has excecuted...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("message", "onPause() has excecuted...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("message", "onStop() has excecuted...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("message", "onDestroy() has excecuted...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("message", "onRestart() has excecuted...");
    }

    public void showMessage(View v) {
        tvMessage.setText("Proceed clicked");

      //  Toast toast = Toast.makeText(this, "Button was clicked...", Toast.LENGTH_LONG);
      //  toast.show();
    }



}
