package com.github.coyclab.manager;

import com.github.coyclab.comparators.OrderCompByPrice;
import com.github.coyclab.models.Order;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderManagerTest {

    @Test
    public void sortingTest() throws Exception {

        List<Order> orders = new ArrayList<>() {

            {
                add(new Order(1, new Date(), new Date(), 100f));
                add(new Order(3, new Date(), new Date(), 120f));
                add(new Order(4, new Date(), new Date(), 60f));
                add(new Order(2, new Date(), new Date(), 80f));
                add(new Order(5, new Date(), new Date(), 57.3f));
            }
        };
        OrderManager manager = new OrderManager();

        for (Order order : orders) {
            manager.add(order);
        }

        manager.sort(new OrderCompByPrice());

        List<Order> repository = manager.getRepository().getRepository();

        for (int i = 0; i < orders.size() - 1; i++) {
            if (repository.get(i).getPrice() > repository.get(i + 1).getPrice()){
                throw new Exception("Wrong sorting");
            }
        }

    }
}