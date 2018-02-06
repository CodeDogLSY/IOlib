package com.lib.lsy.sample.demo;

import com.lib.lsy.sample.demo.entity.Repo;
import com.lib.lsy.sample.demo.entity.SortCityBean;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

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
    Call<List<Repo>> listRepos(@Path("user") String user);

    @GET("users/{user}/repos")
    Observable<List<Repo>> listReposR(@Path("user") String user);

    //注册国家列表
    @GET("/user/country-list")
    Observable<SortCityBean> getUserCountryList(@HeaderMap Map<String, String> headers, @QueryMap Map<String, String> map);
}