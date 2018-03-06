package com.github.coyclab;

import com.github.coyclab.facade.Facade;

public class Main {

    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.initAutoservice();



        System.out.println(facade.getWorkers());

        facade.addWorker(8, "TestWorker");

        System.out.println(facade.getWorkers());

        System.out.println(facade.getFreeWorkers());

//        System.out.println(facade.getOrders());
//
//        System.out.println(facade.getOrdersByPrice());
//
//        System.out.println(facade.getFreeRepairPlaces());

    }
}
