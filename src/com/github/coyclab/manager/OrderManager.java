package com.github.coyclab.manager;

import com.github.coyclab.api.AEntity;
import com.github.coyclab.models.Order;
import com.github.coyclab.repository.OrderRepo;

public class OrderManager {

    private OrderRepo orderRepo;

    public OrderManager() {
        this.orderRepo = new OrderRepo();
    }

    public void add(Order entity){
        orderRepo.getRepository().add(entity);
    }

    public void remove(Integer id){
        orderRepo.getRepository().remove(id);
    }


}
