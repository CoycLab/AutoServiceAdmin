package com.github.coyclab.manager;

import com.github.coyclab.api.AManager;
import com.github.coyclab.models.Order;
import com.github.coyclab.repository.OrderRepo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderManager extends AManager<OrderRepo, Order> {

    public OrderManager() {
        super(new OrderRepo());
    }

    public List<Order> getOrders() {
        return repository.getRepository();
    }

    public List<Order> getOrders(Comparator<Order> pComparator) {

        List<Order> orders = repository.getRepository();
        Collections.sort(orders, pComparator);

        return orders;
    }
}
