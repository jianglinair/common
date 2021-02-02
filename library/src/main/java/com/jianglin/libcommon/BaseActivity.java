package com.jianglin.libcommon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;

public abstract class BaseActivity extends AppCompatActivity {

    private static final String TAG = "BaseActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "[NAIPIQ]onCreate: " + printTag());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "[NAIPIQ]onStart: " + printTag());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "[NAIPIQ]onResume: "  + printTag());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "[NAIPIQ]onPause: " + printTag());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "[NAIPIQ]onStop: " + printTag());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "[NAIPIQ]onDestroy: " + printTag());
    }

    /**
     * 此 handler 将在主线程中处理消息
     */
    public Handler getHandler() {
        return H.getInstance().getMainHandler();
    }

    private String printTag() {
        return TextUtils.isEmpty(tag()) ? TAG : tag();
    }

    protected abstract String tag();
}