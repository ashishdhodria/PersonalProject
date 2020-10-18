package com.example.farmer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.farmer.RecyclerView.DailyPriceAdapter;
import com.example.farmer.RetrofitFiles.RetrofitClient1;
import com.example.farmer.dailyprice.Mandi;
import com.example.farmer.dailyprice.Record;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MarketPrice extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_price);
        recyclerView = findViewById(R.id.recycler);

        getData();
    }

    private void getData() {
        Call<Mandi> call = RetrofitClient1
                .getInstance()
                .getApi1()
                .getMandi();
        call.enqueue(new Callback<Mandi>() {
            @Override
            public void onResponse(Call<Mandi> call, Response<Mandi> response) {
                Mandi mandi = response.body();
                List<Record> recordList = mandi.getRecords();
                DailyPriceAdapter dailyPriceAdapter = new DailyPriceAdapter(recordList, MarketPrice.this);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(MarketPrice.this));
                recyclerView.setAdapter(dailyPriceAdapter);
                //Toast.makeText(MarketPrice.this, ""+mandi.getRecords().size(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Mandi> call, Throwable t) {

            }
        });
    }
}