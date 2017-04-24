package com.example.admin.appframe.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by admin on 2017/4/24.
 */

public abstract class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView();
        initView();
        initListener();
        getData();
    }

    public abstract void setContentView();
    public abstract void initView();
    public abstract void initListener();
    public abstract void getData();

}
