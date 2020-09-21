package com.example.designpatternfactory13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            String bankname = BankFatory.createBank(BankType.TPBANK).getBankName();
            Log.d("BBB", bankname);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}