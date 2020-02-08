package com.faisal.dc.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="MainActivity";

    // on create
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG,"1> In on Create method");
    }

    // onStart
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"2> In on Start method");
    }

    // onResume
    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"3> In on Resume method");
    }

    // onPause
    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"4> In on Pause method");
    }

    // onStop
    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"5> In on Stop method");
    }

    // onDestroy
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e(TAG,"6> In on Destroy method");
    }
}
