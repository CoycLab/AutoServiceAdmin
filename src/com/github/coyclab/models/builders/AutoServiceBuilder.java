package com.github.coyclab.models.builders;

import com.github.coyclab.models.autosersice.Order;
import com.github.coyclab.models.autosersice.RepairPlace;

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
        for (int i = 1; i <= count ; i++) {
            orderList.add(new Order(count, new Date(), new Date(), 100.00f));
        }

        return orderList;
    }

    public List<RepairPlace> getRepairPlaceList() {
        return repairPlaceList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }
}
