package com.github.coyclab;

import com.github.coyclab.models.autosersice.Order;
import com.github.coyclab.models.autosersice.RepairPlace;
import com.github.coyclab.models.builders.AutoServiceBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<RepairPlace> repairPlaceList;
        List<Order> orderList;

        AutoServiceBuilder builder = new AutoServiceBuilder();
        builder.startAutoService();

        repairPlaceList = builder.getRepairPlaceList();
        orderList = builder.getOrderList();

    }
}
