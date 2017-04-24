package com.example.admin.appframe.base;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by admin on 2017/4/24.
 */

public abstract class BaseActivity<P extends BasePresenter, V extends BaseView> extends Activity {
    public P mPersenter;
    private V mView;
    String TAG="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        getTag();
        initPersenter();
        initView();
        initListener();
        getData();
    }

    private void getTag() {
        TAG=this.getLocalClassName();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPersenter.attach((V)this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPersenter.deetach();
    }


    public abstract int getLayoutId();

    public abstract P initPersenter();

    public abstract void initView();

    public abstract void initListener();

    public abstract void getData();

}
