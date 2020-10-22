package com.example.farmer.RetrofitFiles;

import com.example.farmer.Weather.Weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api2 {
    @GET("weather?lat=25&lon=75&appid=1e66f9232c913149830f5568849da495")
    Call<Weather> getWeather();
}
