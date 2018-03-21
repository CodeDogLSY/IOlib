package com.lib.lsy.iolib.img;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;

import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.lib.lsy.iolib.base.IOApplication;
import com.lib.lsy.iolib.img.glide.GlideApp;
import com.lib.lsy.iolib.img.glide.GlideCircleTransform;
import com.lib.lsy.iolib.img.glide.GlideRoundTransform;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

/**
 * Created by liushiyang on 17-12-15.
 * 功能描述：Glide抽取工具类
 * 版本：
 * 待处理部分：
 */

public class ImageX {

    /**
     * 普通加载，不带任何效果
     */
    public static void loadNormal(Context context, String url, ImageView img) {
        GlideApp.with(context)
                .load(url).into(img);
    }

    /**
     * 普通加载，加载失败的显示
     */
    public static void loadNormalNull(Context context, String url, int resource, ImageView img) {
        GlideApp.with(context)
                .load(url)
                .error(resource)
                .into(img);
    }

    /**
     * 普通加载，处理了占位（颜色），加载失败（通用），淡入淡出
     */
    public static void loadNormalShow(Context context, String url, int color, ImageView img) {
        GlideApp.with(context)
                .load(url)
                //加载中占位符，
                .placeholder(new ColorDrawable(ContextCompat.getColor(IOApplication.getInstance(), color)))
                //                加载错误
                //                .error(R.mipmap.ic_launcher)
//                .error(R.color.gray_hard)
                .error(color)
                //交叉淡入变换
                .transition(withCrossFade())
                .into(img);
    }


    /**
     * 加载gif
     * R.mipmap.loading
     */
    public static void loadGif(Context context, String imgurl, int color, ImageView img) {
        //        GlideApp.with(context)
        //                .asGif()
        //                .load(intid)
        //                .into(img);
        GlideApp.with(context)
                .asGif()
                //                .load("http://ww2.sinaimg.cn/large/005ZwB0Dgw1exzaqyqg65g30an04thdz.gif")
                //                .load("http://img.youbiaoqing.com/u/1b20a885f4dfd524efb99ef0c4c1f53f.gif")
                //                .load("http://p3.pstatp.com/large/19f30002ad7da16b3d2a")
                //                .load("http://p9.pstatp.com/large/19ec0002c813434615ae")
                .load(imgurl)
                //                .placeholder(new ColorDrawable(ContextCompat.getColor(IOApplication.getInstance(), R.color.gray_hard)))
                .placeholder(new ColorDrawable(ContextCompat.getColor(IOApplication.getInstance(), color)))
                .transition(withCrossFade())
                //                .transforms(new CenterCrop(), new GlideRoundTransform(context, 50))
                .into(img);

    }

    /**
     * 加载圆角图片
     * app:layout_auto_basewidth="height" 迫使宽高正常，避免变形
     */
    public static void loadRound(Context context, String url, ImageView img, int round) {
        GlideApp.with(context)
                .load(url)
                .transforms(new CenterCrop(), new GlideRoundTransform(context, round))
                .into(img);
    }

    /**
     * 加载圆形图片
     */
    public static void loadCircle(Context context, String url, ImageView img, int re) {
        GlideApp.with(context)
                .load(url)
                .error(re)
                .transform(new GlideCircleTransform(context))
                .into(img);

    }

    /**
     * 加载圆形图片
     */
    public static void loadCircle(Context context, int localurl, ImageView img, int re) {
        GlideApp.with(context)
                .load(localurl)
                .error(re)
                .transform(new GlideCircleTransform(context))
                .into(img);

    }


    /**
     * 加载圆形图片
     */
    public static void loadCircle(Context context, String url, ImageView img) {
        GlideApp.with(context)
                .load(url)
                .transform(new GlideCircleTransform(context))
                .into(img);

    }

    /**
     * 加载圆形图片
     */
    public static void loadCircle(Context context, int localurl, ImageView img) {
        GlideApp.with(context)
                .load(localurl)
                .transform(new GlideCircleTransform(context))
                .into(img);

    }

}
