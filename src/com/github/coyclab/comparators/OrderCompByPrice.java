package com.github.coyclab.comparators;

import com.github.coyclab.models.Order;

import java.util.Comparator;

public class OrderCompByPrice {
    Comparator<Order> comparator = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            if (o1.getPrice() < o2.getPrice()){
                return -1;
            } else if (o1.getPrice() > o2.getPrice()){
                return 1;
            } else return 0;
        }
    };

    public Comparator<Order> get() {
        return comparator;
    }
}
