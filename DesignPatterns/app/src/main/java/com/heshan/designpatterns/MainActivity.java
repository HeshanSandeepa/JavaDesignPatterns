package com.heshan.designpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.heshan.designpatterns.behavioral.chainOfResponsibiity.Sender;
import com.heshan.designpatterns.behavioral.command.Light;
import com.heshan.designpatterns.behavioral.command.LightOffCommand;
import com.heshan.designpatterns.behavioral.command.SimpleRemoteControl;
import com.heshan.designpatterns.behavioral.interpreter.AndExpression;
import com.heshan.designpatterns.behavioral.interpreter.Expression;
import com.heshan.designpatterns.behavioral.interpreter.OrExpression;
import com.heshan.designpatterns.behavioral.interpreter.TerminalExpression;
import com.heshan.designpatterns.behavioral.iterator.CollectionOfNames;
import com.heshan.designpatterns.behavioral.iterator.Iterator;
import com.heshan.designpatterns.behavioral.mediator.ATCMediator;
import com.heshan.designpatterns.behavioral.mediator.Flight;
import com.heshan.designpatterns.behavioral.mediator.IATCMediator;
import com.heshan.designpatterns.behavioral.mediator.Runway;
import com.heshan.designpatterns.behavioral.momento.Caretaker;
import com.heshan.designpatterns.behavioral.momento.Originator;
import com.heshan.designpatterns.behavioral.observer.AverageScoreDisplay;
import com.heshan.designpatterns.behavioral.observer.CricketData;
import com.heshan.designpatterns.behavioral.observer.CurrentScoreDisplay;
import com.heshan.designpatterns.behavioral.state.AlertStateContext;
import com.heshan.designpatterns.behavioral.state.Silent;
import com.heshan.designpatterns.behavioral.strategy.Fighter;
import com.heshan.designpatterns.behavioral.strategy.JumpBehavior;
import com.heshan.designpatterns.behavioral.strategy.KickBehavior;
import com.heshan.designpatterns.behavioral.strategy.LongJump;
import com.heshan.designpatterns.behavioral.strategy.RussianFighter;
import com.heshan.designpatterns.behavioral.strategy.ShortJump;
import com.heshan.designpatterns.behavioral.strategy.TornadoKick;
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
import com.heshan.designpatterns.structural.proxy.Proxy;
import com.heshan.designpatterns.structural.proxy.RealSubject;

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
        testProxy();

        testChainOfResponsibility();
        testCommand();
        testInterpreter();
        testIterator();
        testMediator();
        testMomento();
        testObserver();
        testState();
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

    private void testProxy() {
        Proxy proxy = new Proxy(new RealSubject());
        System.out.println(proxy.operation());
    }

    private void testChainOfResponsibility() {
        Sender sender = new Sender();
        sender.test();
    }

    private void testCommand() {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        simpleRemoteControl.setCommand(new LightOffCommand(light));
        simpleRemoteControl.buttonWasPressed();
    }

    private void testInterpreter() {
        Expression person1 = new TerminalExpression("Kushagra");
        Expression person2 = new TerminalExpression("Lokesh");
        Expression isSingle = new OrExpression(person1, person2);

        Expression vikram = new TerminalExpression("Vikram");
        Expression committed = new TerminalExpression("Committed");
        Expression isCommitted = new AndExpression(vikram, committed);

        System.out.println(isSingle.interpreter("Kushagra"));
        System.out.println(isSingle.interpreter("Lokesh"));
        System.out.println(isSingle.interpreter("Achint"));

        System.out.println(isCommitted.interpreter("Committed, Vikram"));
        System.out.println(isCommitted.interpreter("Single, Vikram"));
    }

    private void testIterator() {
        CollectionOfNames collectionOfNames = new CollectionOfNames();

        for(Iterator iter = collectionOfNames.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }

    private void testMediator() {
        IATCMediator atcMediator = new ATCMediator();
        Flight sparrow101 = new Flight(atcMediator);
        Runway mainRunway = new Runway(atcMediator);
        atcMediator.registerFlight(sparrow101);
        atcMediator.registerRunway(mainRunway);
        sparrow101.getReady();
        mainRunway.land();
        sparrow101.land();
    }

    private void testMomento() {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.setState("State1");
        originator.setState("State2");
        caretaker.addMemento( originator.save() );
        originator.setState("State3");
        caretaker.addMemento( originator.save() );
        originator.setState("State4");
        originator.restore( caretaker.getMemento() );
    }

    private void testObserver() {
        // create objects for testing
        AverageScoreDisplay averageScoreDisplay =
                new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay =
                new CurrentScoreDisplay();

        // pass the displays to Cricket data
        CricketData cricketData = new CricketData();

        // register display elements
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreDisplay);

        // in real app you would have some logic to
        // call this function when data changes
        cricketData.dataChanged();

        //remove an observer
        cricketData.unregisterObserver(averageScoreDisplay);

        // now only currentScoreDisplay gets the
        // notification
        cricketData.dataChanged();
    }

    private void testState() {
        AlertStateContext stateContext = new AlertStateContext();
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();
    }

    private void testStrategy() {
        // let us make some behaviors first
        JumpBehavior shortJump = new ShortJump();
        JumpBehavior LongJump = new LongJump();
        KickBehavior tornadoKick = new TornadoKick();

        // Make a fighter with desired behaviors
        Fighter russian = new RussianFighter(tornadoKick,shortJump);
        russian.display();

        // Test behaviors
        russian.punch();
        russian.kick();
        russian.jump();

        // Change behavior dynamically (algorithms are
        // interchangeable)
        russian.setJumpBehavior(LongJump);
        russian.jump();
    }
}
