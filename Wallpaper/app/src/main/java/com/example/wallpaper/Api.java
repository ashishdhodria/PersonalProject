package com.example.wallpaper;
import com.example.wallpaper.pojo.com.example.Example;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("api/?key=17422110-69d2fba5e758126d04252703f&q=yellow+flowers&image_type=photo")
    Call<Example> getWallpaper();
}
