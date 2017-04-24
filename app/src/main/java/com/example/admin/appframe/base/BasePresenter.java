package com.example.admin.appframe.base;

import org.reactivestreams.Subscription;

/**
 * Created by admin on 2017/4/24.
 */

public abstract class BasePresenter<V extends BaseView,M extends BaseModel>  {

    public V mView;
    private M mModel;

    public void attach(V mView){
        this.mView=mView;
    }
    public void deetach(){
        mView=null;
    }
}
