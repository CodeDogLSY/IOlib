package com.lib.lsy.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lib.lsy.iolib.R;
import com.lib.lsy.sample.demo.NetActivity;
import com.lib.lsy.sample.demo.RxActivity;


/**
 * @author lsy
 *         主页入口
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toRx(View view) {
        Intent intent = new Intent(MainActivity.this, RxActivity.class);
        startActivity(intent);
    }

    public void toNet(View view) {
        Intent intent = new Intent(MainActivity.this, NetActivity.class);
        startActivity(intent);
    }

    public void toImg(View view) {
    }

    public void toDatabase(View view) {
    }
}
