package com.github.coyclab.builders;

import com.github.coyclab.models.order.Order;
import com.github.coyclab.models.repairPlace.RepairPlace;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AutoServiceBuilder {

    private List<RepairPlace> repairPlaceList;
    private List<Order> orderList;

    public void startAutoService(){
        makeRepairPlaces(10);
        makeOrderList(20);
    }

    private List<RepairPlace> makeRepairPlaces(int count) {
        repairPlaceList = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            repairPlaceList.add(new RepairPlace(i));
        }

        return repairPlaceList;
    }

    private List<Order> makeOrderList(int count) {
        orderList = new ArrayList<>();
        orderList.add(new Order(1, new Date(), new Date(), 100.00f));
        orderList.add(new Order(2, new Date(), new Date(), 120.00f));
        orderList.add(new Order(3, new Date(), new Date(), 50.00f));
        orderList.add(new Order(4, new Date(), new Date(), 80.00f));
        orderList.add(new Order(5, new Date(), new Date(), 90.00f));
        orderList.add(new Order(6, new Date(), new Date(), 150.00f));
        orderList.add(new Order(7, new Date(), new Date(), 130.00f));
        orderList.add(new Order(8, new Date(), new Date(), 130.50f));
        orderList.add(new Order(9, new Date(), new Date(), 118.30f));
        orderList.add(new Order(10, new Date(), new Date(), 118.30f));

        return orderList;
    }

    public List<RepairPlace> getRepairPlaceList() {
        return repairPlaceList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }
}
