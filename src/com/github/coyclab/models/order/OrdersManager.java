package com.github.coyclab.models.order;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdersManager {

    public static void sortByPrice(List<Order> orderList) {
        Collections.sort(orderList, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getOrderPrice() > o2.getOrderPrice()) {
                    return 1;
                } else if (o1.getOrderPrice() < o2.getOrderPrice()) {
                    return -1;
                } else return 0;
            }
        });
    }

    public static void sortByEntryDate(List<Order> orderList) {
        Collections.sort(orderList, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.getOrderEntryDate().compareTo(o2.getOrderEntryDate());
            }
        });
    }

    public static void sortByStartDate(List<Order> orderList) {
        Collections.sort(orderList, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.getOrderStartDate().compareTo(o2.getOrderStartDate());
            }
        });
    }

    public static void sortByFinishDate(List<Order> orderList) {
        Collections.sort(orderList, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.getOrderFinishDate().compareTo(o2.getOrderFinishDate());
            }
        });
    }
}
