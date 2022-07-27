package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {

        // Singleton: Teste para verificar se é sempre a mesma instância que retorna para cada singleton
        System.out.println("------------------Singleton------------------");
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        // Strategy
        System.out.println("\n-------------------Strategy-------------------");
        Behavior defensive = new DefensiveBehavior();
        Behavior normal = new NormalBehavior();
        Behavior aggressive = new AggressiveBehavior();

        Robot robot = new Robot();
        robot.setBehavior(defensive);
        robot.move();
        robot.move();

        robot.setBehavior(normal);
        robot.move();

        robot.setBehavior(aggressive);
        robot.move();
        robot.move();
        robot.move();

        // Facade
        System.out.println("\n-------------------Facade-------------------");
        Facade facade = new Facade();
        facade.moveClient("Roni", "11010-020");
    }
}
