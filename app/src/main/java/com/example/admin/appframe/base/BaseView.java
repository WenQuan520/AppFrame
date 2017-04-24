package com.example.admin.appframe.base;

/**
 * Created by admin on 2017/4/24.
 */

public interface BaseView {
    void onLoaded();
    void onLoading();
    void onLoadFailed(String error);
}
