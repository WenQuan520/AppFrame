package com.example.admin.appframe;

import com.bumptech.glide.load.engine.prefill.PreFillType;
import com.example.admin.appframe.base.BaseActivity;
import com.example.admin.appframe.model.UserModel;
import com.example.admin.appframe.presenter.MainActivityPersenter;
import com.example.admin.appframe.view.MainActivityView;

public class MainActivity extends BaseActivity<MainActivityPersenter,MainActivityView> {

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public MainActivityPersenter initPersenter() {
        return mPersenter;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void getData() {
//        mPersenter.getData();
    }
}
