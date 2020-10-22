package com.example.farmer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.farmer.RetrofitFiles.RetrofitClient2;
import com.example.farmer.Weather.Weather;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.text);
        getWeather();
    }

    private void getWeather() {

        Call<Weather> call = RetrofitClient2
                .getInstance()
                .getApi2()
                .getWeather();

        call.enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                Weather weather = response.body();
                Toast.makeText(MainActivity2.this, ""+weather.getName(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {

            }
        });

    }

    public void signOut(View view) {
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
    }

    public void cropType(View view) {
        Intent intent = new Intent(MainActivity2.this,Crop_Varities.class);
        startActivity(intent);
    }

    public void dailyPrice(View view) {
        Intent intent = new Intent(MainActivity2.this,MarketPrice.class);
        startActivity(intent);
    }

    public void setProfile(View view) {
        Intent intent = new Intent(MainActivity2.this,Profile.class);
        startActivity(intent);
    }

    public void addItem(View view) {
        Intent intent = new Intent(MainActivity2.this,AddItem.class);
        startActivity(intent);
    }

    public void allData(View view) {
        Intent intent = new Intent(MainActivity2.this,Market_Price.class);
        startActivity(intent);
    }

}