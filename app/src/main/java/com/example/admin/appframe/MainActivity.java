package com.example.admin.appframe;

import android.databinding.DataBindingUtil;

import com.example.admin.appframe.base.BaseActivity;
import com.example.admin.appframe.databinding.ActivityMainBinding;
import com.example.admin.appframe.model.User;
import com.example.admin.appframe.presenter.MainActivityPersenter;
import com.example.admin.appframe.view.MainActivityView;

public class MainActivity extends BaseActivity<MainActivityPersenter,MainActivityView> {


    @Override
    public void setContentView() {
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setUser(new User("我依然爱你"));
    }


    @Override
    public MainActivityPersenter initPersenter() {
        return null;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void getData() {

    }
}
