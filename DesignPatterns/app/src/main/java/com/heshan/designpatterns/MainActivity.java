package com.heshan.designpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.heshan.designpatterns.creational.abstractFactory.AbstractFactory;
import com.heshan.designpatterns.creational.abstractFactory.Bank;
import com.heshan.designpatterns.creational.abstractFactory.FactoryCreator;
import com.heshan.designpatterns.creational.abstractFactory.Loan;
import com.heshan.designpatterns.creational.builder.Computer;
import com.heshan.designpatterns.creational.factory.Plan;
import com.heshan.designpatterns.creational.factory.PlanFactory;
import com.heshan.designpatterns.creational.objectPool.ObjectPoolDemo;
import com.heshan.designpatterns.creational.prototype.EmployeeRecord;
import com.heshan.designpatterns.creational.singleton.Helper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testBuilder();
        testFactory();
        testAbstractFactory();
        testSingleton();
        testPrototype();
        testObjectPool();
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

    private void testAbstractFactory() {
        String bankName = "HDFC";
        String loanName = "HomeLoan";

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank(bankName);

        double rate = 10.5;
        double loanAmount = 2000000;
        int years = 10;

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l = loanFactory.getLoan(loanName);
        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount,years);
    }

    private void testSingleton() {
        Helper helper = Helper.getHelper();
        helper.doHelper();
    }

    private void testPrototype() {
        EmployeeRecord employeeRecord = new EmployeeRecord();
        EmployeeRecord employeeRecord1 = (EmployeeRecord) employeeRecord.clone();
        EmployeeRecord employeeRecord2 = (EmployeeRecord) employeeRecord.clone();
    }

    private void testObjectPool() {
        ObjectPoolDemo op=new ObjectPoolDemo();
        op.setUp();
        op.tearDown();
        op.testObjectPool();
    }
}
