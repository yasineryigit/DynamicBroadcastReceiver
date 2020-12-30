package com.bshu2.dynamicbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastingClass extends BroadcastReceiver {
    //Yayın receive edilince ne yapılacağını bu metoda yazıyoruz
    //İstenilen yayın yapıldığında bu metod çalışır
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Battery Low :(", Toast.LENGTH_LONG).show();
    }
}
