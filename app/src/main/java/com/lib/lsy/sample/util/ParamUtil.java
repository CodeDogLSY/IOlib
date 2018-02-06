package com.lib.lsy.sample.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created on 2018/2/6.
 * 功能描述：
 * 版本：
 * 待处理部分：
 *
 * @author lsy
 */

public class ParamUtil {

    private static final String H_key = "#hoolihome#";

    /**
     * 添加通用参数
     *
     * @param param
     * @return
     */
    public static Map<String, String> getEmtryParam(Map<String, String> param) {
        param.put("t", "android");
        param.put("c", "testno");
        param.put("l", "cn");
        //       param.put("v", AppInfoUtil.getVersionName());
        param.put("v", "1.0.0");
        param.put("apiVersion", "v1");
        return param;
    }

    /**
     * 获取加密后的signature
     *
     * @param param
     * @return
     */
    public static Map<String, String> getEncrypHeader(Map<String, String> param) {
        StringBuffer sb = new StringBuffer();
        String key;
        String value;
        Iterator iter = param.entrySet().iterator();
        while (iter.hasNext()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            Map.Entry entry = (Map.Entry) iter.next();
            key = (String) entry.getKey();
            key = key.toLowerCase();
            value = (String) entry.getValue();
            sb.append(key).append("=").append(value).append(H_key);
        }
        String md5before = sb.toString();
        md5before = MD5Util.getMD5Str(md5before);
        md5before =md5before.toUpperCase();
        md5before = MD5Util.getMD5Str(md5before+H_key);
        md5before =md5before.toUpperCase();
        Map<String, String> paramEncryp = new HashMap<>();
        paramEncryp.put("Encryp-Token",md5before);
        return paramEncryp;
    }
}
