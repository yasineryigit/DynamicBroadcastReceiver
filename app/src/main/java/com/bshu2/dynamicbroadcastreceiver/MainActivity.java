package com.bshu2.dynamicbroadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    BroadcastingClass broadcastingClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        broadcastingClass = new BroadcastingClass();
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Intent.ACTION_BATTERY_LOW);
        //registerReceiver ile br yi kayıt ediyoruz
        //parametre olarak hangi broadcast objesi, hangi intent filter'ı gireceğimizi veriyoruz
        registerReceiver(broadcastingClass,intentFilter);

    }

    @Override
    protected void onPause() {
        super.onPause();
        //pause altında br yi unregister yapıyoruz
        unregisterReceiver(broadcastingClass);
    }
}