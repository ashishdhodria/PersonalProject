package com.example.farmer;

import com.example.farmer.example.Crop;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Api {

    //Api call for addstudent.php
    @GET("search?token=N3F4ZmY3RVR0UXFBQmdaZEdxWGViUT09&q=coconut")
    Call<Crop> getCrops();
}
