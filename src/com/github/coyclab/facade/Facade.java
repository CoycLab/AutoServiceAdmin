package com.github.coyclab.facade;

import com.github.coyclab.comparators.OrderByPriceComparator;
import com.github.coyclab.managers.OrderManager;
import com.github.coyclab.managers.RepairPlaceManager;
import com.github.coyclab.managers.WorkerManager;
import com.github.coyclab.models.Order;
import com.github.coyclab.models.RepairPlace;
import com.github.coyclab.models.Worker;

import java.util.Date;
import java.util.List;

public class Facade {

    private OrderManager mOrderManager;
    private WorkerManager mWorkerManager;
    private RepairPlaceManager mRepairPlaceManager;

    private StringBuilder stringBuilder;

    public Facade() {
        mWorkerManager = new WorkerManager();
        mOrderManager = new OrderManager();
        mRepairPlaceManager = new RepairPlaceManager();
    }

    public void initAutoservice() {
        mRepairPlaceManager.add(new RepairPlace(1));
        mRepairPlaceManager.add(new RepairPlace(2));
        mRepairPlaceManager.add(new RepairPlace(3));
        mRepairPlaceManager.add(new RepairPlace(4));
        mRepairPlaceManager.add(new RepairPlace(5));

        mWorkerManager.add(new Worker(1, "Alex"));
        mWorkerManager.add(new Worker(2, "Fedor"));
        mWorkerManager.add(new Worker(3, "Vovan"));
        mWorkerManager.add(new Worker(4, "Grisha"));
        mWorkerManager.add(new Worker(5, "Bob"));

        mOrderManager.add(new Order(1, new Date(), new Date(), 100f));
        mOrderManager.add(new Order(2, new Date(), new Date(), 80f));
        mOrderManager.add(new Order(3, new Date(), new Date(), 23.30f));
        mOrderManager.add(new Order(4, new Date(), new Date(), 50.40f));
        mOrderManager.add(new Order(5, new Date(), new Date(), 150.10f));
        mOrderManager.add(new Order(6, new Date(), new Date(), 130f));
        mOrderManager.add(new Order(7, new Date(), new Date(), 190f));
        mOrderManager.add(new Order(8, new Date(), new Date(), 148.90f));
        mOrderManager.add(new Order(9, new Date(), new Date(), 101f));
    }

    public String getWorkers() {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Список работников:")
                .append("\n");

        List<Worker> workers = mWorkerManager.getWorkers();

        for (Worker w : workers) {
            stringBuilder.append(w)
                    .append("\n");
        }

        return stringBuilder.toString();
    }

    public String getFreeWorkers() {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Список свободных работников:")
                .append("\n");

        List<Worker> freeWorkers = mWorkerManager.getFreeWorkers();

        for (Worker w : freeWorkers) {
            stringBuilder.append(w)
                    .append("\n");
        }

        return stringBuilder.toString();
    }

    public void addWorker(int id, String name){
        mWorkerManager.addWorker(id, name);
    }

    public String getOrders() {
        stringBuilder = new StringBuilder();

        List<Order> orderList = mOrderManager.getOrders();

        for (Order o : orderList) {
            stringBuilder.append(o).append("\n");
        }

        return stringBuilder.toString();
    }

    public String getOrdersByPrice() {

        stringBuilder = new StringBuilder();

        List<Order> orderList = mOrderManager.getOrders(new OrderByPriceComparator());

        for (Order o : orderList) {
            stringBuilder.append(o).append("\n");
        }

        return stringBuilder.toString();
    }

    public String getFreeRepairPlaces(){
        stringBuilder = new StringBuilder();

        List<RepairPlace> repairPlaceList = mRepairPlaceManager.getFreeRepairPlaces();

        stringBuilder.append("Свободные ремонтные места: ")
                .append("\n");
        for (RepairPlace r: repairPlaceList) {
                stringBuilder.append(r);
        }

        return stringBuilder.toString();
    }

}
