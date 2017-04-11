package com.pax.weather.util;

/**
 * Created by Administrator on 2017/4/11 17:08
 * 描述:
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
