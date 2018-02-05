package com.lib.lsy.iolib.net;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created on 2018/2/5.
 * 功能描述：
 * 版本：
 * 待处理部分：
 *
 * @author lsy
 */

public interface GitHubService {

    @GET("users/{user}/repos")
    Call<List<String>> listRepos(@Path("user") String user);
}