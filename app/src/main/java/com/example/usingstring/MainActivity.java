package com.example.usingstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvMessage2 = findViewById(R.id.tvMsg2);
        tvMessage2.setText(R.string.Msg2);

        Log.i("Lifecycle","Invoked-OnCreate Method...");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Lifecycle","Invoked-OnStart Method...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle","Invoked-onResume Method...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle","Invoked-onPause Method...");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Lifecycle","Invoked-onStop Method...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("Lifecycle","Invoked-onDestroy Method...");
    }
}