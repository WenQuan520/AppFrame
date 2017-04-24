package com.example.admin.appframe.utils;

import okhttp3.OkHttpClient;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/**
 * Created by admin on 2017/4/24.
 */

public class ApiManager {
    private RetrofitServer apiserver;
    private static ApiManager apiManager;
    public static ApiManager getInstance(){
        if (apiManager==null){
            synchronized (ApiManager.class){
                apiManager=new ApiManager();
            }
        }
        return apiManager;
    }

    public RetrofitServer getApisetver(){
        RxJavaCallAdapterFactory rxJavaCallAdapterFactory = new RxJavaCallAdapterFactory();
        OkHttpClient client = new OkHttpClient.Builder().build();
        if (apiserver==null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("")
                    .client(client)
                    .addCallAdapterFactory(rxJavaCallAdapterFactory)
                    .build();
             apiserver = retrofit.create(RetrofitServer.class);
        }
        return apiserver;
    }
}
