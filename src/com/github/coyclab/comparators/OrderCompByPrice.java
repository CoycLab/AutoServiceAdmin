package com.github.coyclab.comparators;

import com.github.coyclab.models.Order;

import java.util.Comparator;

public class OrderCompByPrice implements Comparator<Order> {

    @Override
    public int compare(final Order o1, final Order o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}
