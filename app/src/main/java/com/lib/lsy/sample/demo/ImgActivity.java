package com.lib.lsy.sample.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lib.lsy.iolib.R;
import com.lib.lsy.iolib.img.ImageX;

/**
 * @author lsy
 */
public class ImgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img);

        ImageX.loadNormalShow(this,
                "http://www.gzhphb.com/gpPic/600/0/mmbiz.qpic.cn/mmbiz/1yLp0DPNIhHx9T9Oq3crGbibZpgBDwBZgjSzWGwYKKvOZusrEOWFyoUuibJdibQibHic2sIFaxBZ6aewzdscuBqfHwQ/0?wx_fmt=jpeg"
                , findViewById(R.id.img_2));
    }
}
