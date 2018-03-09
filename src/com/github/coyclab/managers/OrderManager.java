package com.github.coyclab.managers;

import com.github.coyclab.api.AManager;
import com.github.coyclab.models.Order;
import com.github.coyclab.models.RepairPlace;
import com.github.coyclab.repository.OrderRepo;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
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

    public boolean add(Integer id, Date startDate, Date finishDate, Float price) {
        if (isFreeId(id)) {
            Order order = new Order(id, startDate, finishDate, price);
            repository.getRepository().add(order);
            return true;
        }
        return false;
    }

    public boolean remove(Integer id) {
        List<Order> repository = this.repository.getRepository();
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getId().equals(id)) {
                repository.remove(i);
                return true;
            }
        }
        return false;
    }


    //todo not works yet
    public boolean setStatus(int id, Order.Status status) {
        List<Order> repository = this.repository.getRepository();
        for (int i = 0; i < repository.size(); i++) {
            Order order = repository.get(i);
            if (order.getId().equals(id)) {
                order.setOrderStatus(Order.Status.DONE);
                return true;
            }
        }
        return false;
    }

    public Order getById(Integer id) {
        Order order = null;
        List<Order> repository = this.repository.getRepository();
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getId().equals(id)){
                order = repository.get(i);
            }
        }
        return order;
    }
}
