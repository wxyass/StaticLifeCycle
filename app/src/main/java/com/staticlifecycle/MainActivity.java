package com.staticlifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    // 静态fragment onCreateView在Activity的onCreate之前
    //03-10 21:07:24.687 1514-1514/com.staticlifecycle I/MainActivity: onAttach..............fragment
    //03-10 21:07:24.687 1514-1514/com.staticlifecycle I/MainActivity: onCreate..............fragment
    //03-10 21:07:24.687 1514-1514/com.staticlifecycle I/MainActivity: onCreateView..............fragment
    //03-10 21:07:24.687 1514-1514/com.staticlifecycle I/MainActivity: onCreate....
    //03-10 21:07:24.687 1514-1514/com.staticlifecycle I/MainActivity: onActivityCreated..............fragment
    //03-10 21:07:24.687 1514-1514/com.staticlifecycle I/MainActivity: onStart..............fragment
    //03-10 21:07:24.687 1514-1514/com.staticlifecycle I/MainActivity: onStart....
    //03-10 21:07:24.687 1514-1514/com.staticlifecycle I/MainActivity: onResume....
    //03-10 21:07:24.687 1514-1514/com.staticlifecycle I/MainActivity: onResume..............fragment
    //03-10 21:07:56.635 1514-1514/com.staticlifecycle I/MainActivity: onPause..............fragment
    //03-10 21:07:56.635 1514-1514/com.staticlifecycle I/MainActivity: onPause....
    //03-10 21:07:59.835 1514-1514/com.staticlifecycle I/MainActivity: onStop..............fragment
    //03-10 21:07:59.835 1514-1514/com.staticlifecycle I/MainActivity: onStop....
    //03-10 21:07:59.835 1514-1514/com.staticlifecycle I/MainActivity: onDestroyView..............fragment
    //03-10 21:07:59.835 1514-1514/com.staticlifecycle I/MainActivity: onDestroy..............fragment
    //03-10 21:07:59.835 1514-1514/com.staticlifecycle I/MainActivity: onDetach..............fragment
    //03-10 21:07:59.835 1514-1514/com.staticlifecycle I/MainActivity: onDestroy....

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate....");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart....");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume....");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart....");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause....");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop....");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy....");
    }
}
