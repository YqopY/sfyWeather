package com.sfy.sunshineweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by YqopY on 2016/12/7.
 *
 * @描述 ${TODO}
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
