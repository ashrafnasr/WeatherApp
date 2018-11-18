package com.example.a2018.weatherapp.Retrofit;

import com.example.a2018.weatherapp.Model.WeatherForecastResult;
import com.example.a2018.weatherapp.Model.WeatherResult;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author 2018
 * @date 2018-11-16
 */
public interface IOpenWeatherMap {

    //lat refers to Latitude
    //lon refers to Longitude
    //appid refers to the api key for weather
    @GET("weather")
    Observable<WeatherResult> getWeatherByLatLng(@Query("lat") String lat,
                                                 @Query("lon") String lng,
                                                 @Query("appid") String app,
                                                 @Query("units") String unit);

    @GET("weather")
    Observable<WeatherResult> getWeatherByCityName(@Query("q") String cityName,
                                                   @Query("appid") String app,
                                                   @Query("units") String unit);

    @GET("forecast")
    Observable<WeatherForecastResult> getForecastWeatherByLatLng(@Query("lat") String lat,
                                                                 @Query("lon") String lng,
                                                                 @Query("appid") String app,
                                                                 @Query("units") String unit);
}
