package com.example.yamuna.androidstatesandlog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "StateChange";
    @Override
    protected void onCreate(Bundle savedInstanceState) {   //where to save the state when another application interrupts....
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //R is a class where all resources are kept required for the application
        Log.v(TAG, "OnCreate()"); //used for debugging...identify the order in which it is printed
    }
    //Ctrl+O

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "onStart()"); //verbose,debug,error,information(network connection issues)
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "onDestroy()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) { //Bundle is one of the methods to save states , then we retrieve it....we cannot use it for large data
        super.onSaveInstanceState(outState);
        Log.v(TAG,"onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) { //onCreate and OnRestore is the same...onCreate works the same way...onCreate will be null in the beginning
        super.onRestoreInstanceState(savedInstanceState);
        Log.v(TAG,"onRestoreInstanceState");
    }


















}
