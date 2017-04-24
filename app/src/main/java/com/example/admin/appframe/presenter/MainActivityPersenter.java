package com.example.admin.appframe.presenter;

import android.net.Network;

import com.example.admin.appframe.base.BaseModel;
import com.example.admin.appframe.base.BasePresenter;
import com.example.admin.appframe.model.UserModel;
import com.example.admin.appframe.utils.ApiManager;
import com.example.admin.appframe.utils.NetWorkUtils;
import com.example.admin.appframe.view.MainActivityView;

/**
 * Created by admin on 2017/4/24.
 */

public class MainActivityPersenter extends BasePresenter<MainActivityView, UserModel> {

    public void getData() {
        new NetWorkUtils() {
            @Override
            public String success(String result) {
                return null;
            }

            @Override
            public String error(Throwable e) {
                return null;
            }
        }.sendRequest(ApiManager.getInstance().getApisetver().get());
    }
}
