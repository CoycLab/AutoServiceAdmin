package com.github.coyclab;

import com.github.coyclab.facade.Facade;

public class Main {

    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.initAutoservice();
//        String freeWorkers = facade.getFreeWorkers();
//        System.out.println(freeWorkers);

        System.out.println(facade.getOrders());

        System.out.println(facade.getOrdersByPrice());

    }
}
