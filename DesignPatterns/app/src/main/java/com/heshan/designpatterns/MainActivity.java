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
import com.heshan.designpatterns.structural.adapter.BirdAdapter;
import com.heshan.designpatterns.structural.adapter.PlasticToyDuck;
import com.heshan.designpatterns.structural.adapter.Sparrow;
import com.heshan.designpatterns.structural.adapter.ToyDuck;
import com.heshan.designpatterns.structural.bridge.BridgePattern;
import com.heshan.designpatterns.structural.composite.CompanyDirectory;
import com.heshan.designpatterns.structural.composite.Developer;
import com.heshan.designpatterns.structural.composite.Manager;
import com.heshan.designpatterns.structural.decorator.PizzaStore;
import com.heshan.designpatterns.structural.facade.HotelKeeper;
import com.heshan.designpatterns.structural.flyWeight.Player;
import com.heshan.designpatterns.structural.flyWeight.PlayerFactory;

import static com.heshan.designpatterns.structural.flyWeight.CounterStrike.getRandPlayerType;
import static com.heshan.designpatterns.structural.flyWeight.CounterStrike.getRandWeapon;

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

        testAdapter();
        testBridge();
        testComposite();
        testDecorator();
        testFacade();
        testFlyWeight();

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

    private void testAdapter() {
        Sparrow sparrow = new Sparrow();
        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();


        ToyDuck toyDuck = new PlasticToyDuck();
        System.out.println("ToyDuck...");
        toyDuck.squeak();


        // Wrap a bird in a birdAdapter so that it
        // behaves like toy duck
        ToyDuck birdAdapter = new BirdAdapter(sparrow);
        // toy duck behaving like a bird
        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
    }

    private void testBridge() {
        BridgePattern bridgePattern = new BridgePattern();
        bridgePattern.test();
    }

    //client
    private void testComposite() {
        Developer dev1 = new Developer(100, "L", "Pro Developer");
        Developer dev2 = new Developer(101, "V", "Developer");
        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Manager man1 = new Manager(200, "K", "SEO Manager");
        Manager man2 = new Manager(201, "V", "K's Manager");

        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();
    }

    private void testDecorator() {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.test();
    }

    private void testFacade() {
        HotelKeeper keeper = new HotelKeeper();

        String v = keeper.getVeganMenu();
        String nv = keeper.getNonVeganMenu();
    }

    private void testFlyWeight() {
         /* Assume that we have a total of 10 players
           in the game. */
        for (int i = 0; i < 10; i++)
        {
            /* getPlayer() is called simply using the class
               name since the method is a static one */
            Player p = PlayerFactory.getPlayer(getRandPlayerType());

            /* Assign a weapon chosen randomly uniformly
               from the weapon array  */
            p.assignWeapon(getRandWeapon());

            // Send this player on a mission
            p.mission();
        }
    }
}
