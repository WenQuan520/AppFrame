package com.example.admin.appframe.utils;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by admin on 2017/4/24.
 */

public interface RetrofitServer {
    @GET("sdsds")
    Observable get();
}
