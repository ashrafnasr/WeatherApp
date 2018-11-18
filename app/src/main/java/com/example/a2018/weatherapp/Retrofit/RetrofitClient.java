package com.example.a2018.weatherapp.Retrofit;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author 2018
 * @date 2018-11-16
 */
public class RetrofitClient {
    public static Retrofit instance;

    public static Retrofit getInstance() {

//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(SERVICE_ENDPOINT)
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .build();

        if (instance == null) {
            instance = new Retrofit.Builder()
                    .baseUrl("https://api.openweathermap.org/data/2.5/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return instance;
    }
}
