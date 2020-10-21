package com.example.farmer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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
    }
}