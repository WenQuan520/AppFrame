package com.example.admin.appframe.utils;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by admin on 2017/4/24.
 */

public abstract class NetWorkUtils {
    public  void sendRequest(Observable observable) {
        ApiManager.getInstance().getApisetver().get();
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<String>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(String s) {
                        success(s);
                    }


                    @Override
                    public void onError(Throwable e) {
                        error(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public  abstract String success(String result);
    public  abstract String error(Throwable e);
}
