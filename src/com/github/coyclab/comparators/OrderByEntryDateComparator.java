package com.github.coyclab.comparators;

import com.github.coyclab.models.Order;

import java.util.Comparator;

public class OrderByEntryDateComparator {
    Comparator<Order> comparator = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            return o1.getEntryDate().compareTo(o2.getEntryDate());
        }
    };
}
