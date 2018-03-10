package com.github.coyclab;

import com.github.coyclab.facade.Director;
import com.github.coyclab.models.Order;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        director.init();

        System.out.println(director.getOrderById(3));

        director.setOrderStatus(3, Order.Status.CANCELED);
        System.out.println(director.getOrderById(3));

    }
}
