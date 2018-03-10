package com.github.coyclab.facade;

import com.github.coyclab.comparators.OrderByPriceComparator;
import com.github.coyclab.managers.OrderManager;
import com.github.coyclab.managers.RepairPlaceManager;
import com.github.coyclab.managers.WorkerManager;
import com.github.coyclab.models.Order;
import com.github.coyclab.models.RepairPlace;
import com.github.coyclab.models.Worker;
import com.github.coyclab.utils.Reporter;

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

    //Worker administration methods
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

    public String addWorker(int id, String name) {
        if (mWorkerManager.add(id, name)) {
            return "РАБОТНИК УСПЕШНО ДОБАВЛЕН";
        }
        return "ЧТО-ТО НЕ ТАК";
    }

    public String removeWorkerById(int id) {
        if (mWorkerManager.remove(id)) {
            return String.format("Работник Id%d успешно удален", id);
        }
        return "НЕТ ТАКОГО РАБОТНИКА";
    }


    //RepairPlace administration methods
    public String addRepairPlace(int id) {
        if (mRepairPlaceManager.add(id)) {
            return "Добавлено ремонтное место № " + id;
        } else {
            return String.format("Ремонтное место с номером \"%d\" уже существует...", id);
        }
    }

    public String removeRepairPlace(int id) {
        if (mRepairPlaceManager.remove(id)) {
            return "Ремонтное место № " + id + " успешно удалено...";
        } else {
            return "Нет ремонтного места с таким номером...";
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

    //Order administration methods
    public String getOrderById(int id) {
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

    public String addOrder(int id, Date startDate, Date finishDate, Float price) {
        if (mOrderManager.add(id, startDate, finishDate, price)) {
            return String.format("Заказ №%d успешно создан...", id);
        } else {
            return "Не удалось создать заказ...";
        }
    }

    public void setOrderStatus(int id, Order.Status status){
        mOrderManager.getById(id).setOrderStatus(status);
    }

}
