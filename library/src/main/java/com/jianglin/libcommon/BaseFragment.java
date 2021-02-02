package com.jianglin.libcommon;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.fragment.app.Fragment;

public abstract class BaseFragment extends Fragment {

    private static final String TAG = "BaseFragment";

    public BaseFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "[NAIPIQ]onCreate: " + printTag());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "[NAIPIQ]onCreateView: " + printTag());
        return inflater.inflate(getLayout(), container, false);
    }

    @LayoutRes
    protected abstract int getLayout();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "[NAIPIQ]onDestroyView: " + printTag());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "[NAIPIQ]onDestroy: " + printTag());
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