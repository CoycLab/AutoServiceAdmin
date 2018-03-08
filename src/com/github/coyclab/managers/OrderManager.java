package com.github.coyclab.managers;

import com.github.coyclab.api.AManager;
import com.github.coyclab.models.Order;
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

    public Boolean add(Integer id, Date startDate, Date finishDate, Float price) {
        if (isFreeId(id)) {
            Order order = new Order(id, startDate, finishDate, price);
            repository.getRepository().add(order);
            return true;
        }
        return false;
    }

    public Boolean remove(Integer id) {
        List<Order> repository = this.repository.getRepository();
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getId().equals(id)) {
                repository.remove(i);
                return true;
            }
        }
        return false;
    }

    public Boolean close(Integer id) {
        List<Order> repository = this.repository.getRepository();
        for (int i = 0; i < repository.size(); i++) {
            Order order = repository.get(i);
            if (order.getId().equals(id)) {
                order.setOrderStatus(Order.OrderStatus.DONE);
                return true;
            }
        }
        return false;
    }

    public Boolean cancel(Integer id) {
        List<Order> repository = this.repository.getRepository();
        for (int i = 0; i < repository.size(); i++) {
            Order order = repository.get(i);
            if (order.getId().equals(id)) {
                order.setOrderStatus(Order.OrderStatus.CANCELED);
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
