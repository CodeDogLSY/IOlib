package com.lib.lsy.sample.demo;

import android.os.Bundle;
import android.widget.TextView;

import com.lib.lsy.iolib.R;
import com.lib.lsy.iolib.img.ImageX;
import com.lib.lsy.iolib.util.SPUtils;
import com.lib.lsy.sample.basesample.BaseActivity;

/**
 * @author lsy
 */
public class ImgActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img);

        ImageX.loadNormalShow(this,
                "http://www.gzhphb.com/gpPic/600/0/mmbiz.qpic.cn/mmbiz/1yLp0DPNIhHx9T9Oq3crGbibZpgBDwBZgjSzWGwYKKvOZusrEOWFyoUuibJdibQibHic2sIFaxBZ6aewzdscuBqfHwQ/0?wx_fmt=jpeg"
                , R.color.colorAccent, findViewById(R.id.img_2));

        SPUtils.put("a", "a");

        findViewById(R.id.id_tv).postDelayed(new Runnable() {
            @Override
            public void run() {
                ((TextView) findViewById(R.id.id_tv)).setText((String) SPUtils.get("a", "a"));
            }
        }, 200);


    }
}
