package com.lib.lsy.sample.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.lib.lsy.iolib.R;
import com.lib.lsy.iolib.net.NetUtil;
import com.lib.lsy.sample.demo.entity.Repo;
import com.lib.lsy.sample.demo.entity.SortCityBean;
import com.lib.lsy.sample.util.ParamUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NetActivity extends AppCompatActivity {
    private TextView tvshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net);
        tvshow = findViewById(R.id.tv_show);
    }

    public void textNet(View view) {
        GitHubService service = NetUtil.getRetrofit().create(GitHubService.class);
        Call<List<Repo>> repos = service.listRepos("octocat");
        repos.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                tvshow.setText(response.body().size() + "");
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {

            }
        });
    }

    public void netRx(View view) {
        GitHubService service = NetUtil.getRetrofit().create(GitHubService.class);
//        Observable<List<Repo>> repos = service.listReposR("octocat");
        service.listReposR("octocat").subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(
                new Observer<List<Repo>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List<Repo> repos) {
                        tvshow.setText(repos.size() + "");
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {
                        tvshow.append("------完成");
                    }
                }

        );
    }

    public void netRxSign(View view) {
        GitHubService service = NetUtil.getRetrofit("http://testapi.hoolihome.com:97").create(GitHubService.class);
//        Observable<List<Repo>> repos = service.listReposR("octocat");

        Map<String, String> param = new TreeMap<>();
        param = ParamUtil.getEmtryParam(param);
        service.getUserCountryList(ParamUtil.getEncrypHeader(param), param).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(
                new Observer<SortCityBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(SortCityBean repos) {
                        tvshow.setText(repos.getMsg() + "");
                    }

                    @Override
                    public void onError(Throwable e) {
                        tvshow.setText(e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        tvshow.append("------完成");
                    }
                }

        );
    }
}
