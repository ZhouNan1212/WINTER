package com.zhounan.winter.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 创建时间：2017/12/9 17:34.
 * 作者：周楠
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
