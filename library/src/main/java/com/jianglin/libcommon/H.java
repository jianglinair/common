package com.jianglin.libcommon;

import android.os.Handler;
import android.os.Looper;

/**
 * Author: Jianglin
 * Time: 2021/2/2
 * Description: todo
 *
 * @author jiang
 */
public class H {

    /** 使用统一的 handler 有利于排查消息 */
    private final Handler mMainHandler;

    private H() {
        mMainHandler = new Handler(Looper.getMainLooper());
    }

    public static H getInstance() {
        return LazyHolder.INSTANCE;
    }

    public Handler getMainHandler() {
        return mMainHandler;
    }

    private static final class LazyHolder {
        private static final H INSTANCE = new H();
    }
}
