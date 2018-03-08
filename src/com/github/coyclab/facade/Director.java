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

public class Director {

    private OrderManager mOrderManager;
    private WorkerManager mWorkerManager;
    private RepairPlaceManager mRepairPlaceManager;

    private StringBuilder stringBuilder;

    public Director() {
        mWorkerManager = new WorkerManager();
        mOrderManager = new OrderManager();
        mRepairPlaceManager = new RepairPlaceManager();
    }

    public void init() {
        mRepairPlaceManager.add(1);
        mRepairPlaceManager.add(2);
        mRepairPlaceManager.add(3);
        mRepairPlaceManager.add(4);
        mRepairPlaceManager.add(5);

        mWorkerManager.add(1, "Alex");
        mWorkerManager.add(2, "Fedor");
        mWorkerManager.add(3, "Vovan");
        mWorkerManager.add(4, "Grisha");
        mWorkerManager.add(5, "Bob");

        mOrderManager.add(1, new Date(), new Date(), 100f);
        mOrderManager.add(2, new Date(), new Date(), 80f);
        mOrderManager.add(3, new Date(), new Date(), 23.30f);
        mOrderManager.add(4, new Date(), new Date(), 50.40f);
        mOrderManager.add(5, new Date(), new Date(), 150.10f);
        mOrderManager.add(6, new Date(), new Date(), 130f);
        mOrderManager.add(7, new Date(), new Date(), 190f);
        mOrderManager.add(8, new Date(), new Date(), 148.90f);
        mOrderManager.add(9, new Date(), new Date(), 101f);
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

    public void addWorker(int id, String name) {
        mWorkerManager.add(id, name);
    }

    public void removeWorkerById(int id) {
        mWorkerManager.remove(id);
    }

    public void removeWorkerByName(String name) {
        mWorkerManager.remove(name);
    }

    public void addRepairPlace(int id) {
        if (mRepairPlaceManager.add(id)) {
            System.out.println("Добавлено ремонтное место № " + id);
        } else {
            System.out.println("Ремонтное место с таким номером уже существует...");
        }
    }

    public void removeRepairPlace(int id) {
        if (mRepairPlaceManager.remove(id)) {
            System.out.println("Ремонтное место № " + id + " успешно удалено...");
        } else {
            System.out.println("Нет ремонтного места с таким номером...");
        }
    }

    public String getFreeRepairPlaces() {
        stringBuilder = new StringBuilder();

        List<RepairPlace> repairPlaceList = mRepairPlaceManager.getFreeRepairPlaces();

        stringBuilder.append("Свободные ремонтные места: ")
                .append("\n");
        for (RepairPlace r : repairPlaceList) {
            stringBuilder.append(r);
        }

        return stringBuilder.toString();
    }

    public String getOrderById( int id){
        return mOrderManager.getById(id).toString();
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

    public void addOrder(int id, Date startDate, Date finishDate, Float price) {
        if (!mOrderManager.add(id, startDate, finishDate, price)) {
            System.out.println("Не удалось создать заказ...");
        }
    }

    public void closeOrder(int id){
        mOrderManager.close(id);
    }

    public void cancelOrder(int id){
        mOrderManager.cancel(id);
    }



}
