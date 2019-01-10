package com.heshan.designpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.heshan.designpatterns.creational.builder.Computer;
import com.heshan.designpatterns.creational.factory.Plan;
import com.heshan.designpatterns.creational.factory.PlanFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testBuilder();
        testFactory();
    }

    private void testBuilder() {
        Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setBluetoothEnabled(true)
                .build();
        Log.d("testBuilder", computer.getHDD());
    }

    private void testFactory() {
        PlanFactory planFactory = new PlanFactory();
        Plan plan = planFactory.getPlan("DOMESTICPLAN");

        plan.getRate();
        plan.calculateBill(10);
    }
}
