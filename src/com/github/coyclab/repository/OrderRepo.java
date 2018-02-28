package com.github.coyclab.repository;

import com.github.coyclab.api.ARepository;
import com.github.coyclab.models.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo extends ARepository<Order> {

    private List<Order> orderList;

    public OrderRepo() {
        repository = new ArrayList<>();
    }
}
