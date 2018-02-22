package com.lib.lsy.iolib.base;

import android.support.v7.app.AppCompatActivity;

/**
 * Created on 2018/2/8.
 * 功能描述：
 * 版本：
 * 待处理部分：
 *
 * @author lsy
 */

public abstract class IOBaseActivity extends AppCompatActivity {

    /**
     * 展示加载动画|提示框
     */
    public abstract void showLoadingDialog();


    /**
     * 展示加载动画|提示框
     * @param type 用于部分页面需要不同类型加载动画|框
     */
    public abstract void showLoadingDialog(int type);

    /**
     * 关闭加载动画|提示框
     */
    public abstract void dismissLoadingDialog();

    /**
     * 关闭加载动画|提示框
     * @param type 用于部分页面需要不同类型加载动画|框
     */
    public abstract void dismissLoadingDialog(int type);
}
