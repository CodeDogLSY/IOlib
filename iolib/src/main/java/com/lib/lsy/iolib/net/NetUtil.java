package com.lib.lsy.iolib.net;

import com.lib.lsy.iolib.net.retrofitconverter.FastJsonConverterFactory;

import retrofit2.Retrofit;

/**
 * Created on 2018/2/5.
 * 功能描述：
 * 版本：
 * 待处理部分：
 *
 * @author lsy
 */

public class NetUtil {
    public static Retrofit getRetrofit() {
        String baseUrl = "https://api.github.com/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(FastJsonConverterFactory.create())
//                .client(client)
                .build();
        return retrofit;
    }
}
