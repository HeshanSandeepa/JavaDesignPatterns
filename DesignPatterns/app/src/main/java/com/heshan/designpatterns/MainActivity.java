package com.heshan.designpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.heshan.designpatterns.creational.builder.Computer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testBuilder();
    }

    private void testBuilder() {
        Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setBluetoothEnabled(true)
                .build();
        Log.d("Builder", computer.getHDD());
    }
}
