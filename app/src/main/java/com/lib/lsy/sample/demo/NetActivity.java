package com.lib.lsy.sample.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.lib.lsy.iolib.R;
import com.lib.lsy.iolib.net.GitHubService;
import com.lib.lsy.iolib.net.NetUtil;

import java.util.List;

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
        Call<List<String>> repos = service.listRepos("octocat");
        repos.enqueue(new Callback<List<String>>() {
            @Override
            public void onResponse(Call<List<String>> call, Response<List<String>> response) {
                tvshow.setText(response.toString());
            }

            @Override
            public void onFailure(Call<List<String>> call, Throwable t) {

            }
        });
    }
}
