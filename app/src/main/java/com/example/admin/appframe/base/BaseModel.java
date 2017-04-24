package com.example.admin.appframe.base;

/**
 * Created by admin on 2017/4/24.
 */

public interface BaseModel {
    void onFailed(String error);
    void onSucceed(String result);
}
