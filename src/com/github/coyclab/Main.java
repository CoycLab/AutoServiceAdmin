package com.github.coyclab;

import com.github.coyclab.comparators.OrderCompByPrice;
import com.github.coyclab.manager.OrderManager;
import com.github.coyclab.models.Order;
import com.github.coyclab.repository.OrderRepo;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Order order1 = new Order(1, new Date(), new Date(), 100f);
        Order order2 = new Order(2, new Date(), new Date(), 80.0f);
        Order order3 = new Order(3, new Date(), new Date(), 120f);
        Order order4 = new Order(4, new Date(), new Date(), 60f);
        Order order5 = new Order(5, new Date(), new Date(), 45f);
        Order order6 = new Order(6, new Date(), new Date(), 57.30f);


        Order test = new Order(7, new Date(), new Date(), 57.30f);
        OrderManager manager = new OrderManager();
        manager.add(test);

        System.out.println(manager.);

//        System.out.println(orderRepo);




    }
}
