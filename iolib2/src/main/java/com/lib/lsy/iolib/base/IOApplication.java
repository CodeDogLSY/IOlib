package com.lib.lsy.iolib.base;

import android.app.Application;

/**
 * Created on 2018/2/1.
 * 功能描述：
 * 版本：
 * 待处理部分：
 *
 * @author lsy
 */

public class IOApplication extends Application {

    private static IOApplication instance;

    //获取单例
    public static IOApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
