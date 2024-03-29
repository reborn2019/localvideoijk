package com.fff.data.util;

import android.util.Log;

/**
 * 日志类
 * Created by Devlin_n on 2017/6/5.
 */

public class L {

    private static final String TAG = "IJKPlayer";

    private static boolean isDebug = false;


    public static void d(String msg) {
        if (isDebug) {
            Log.d(TAG, msg);
        }
    }

    public static void e(String msg) {
        if (isDebug) {
            Log.e(TAG, msg);
        }
    }

    public static void i(String msg) {
        if (isDebug) {
            Log.i(TAG, msg);
        }
    }

    public static void setDebug(boolean isDebug) {
        L.isDebug = isDebug;
    }
}
