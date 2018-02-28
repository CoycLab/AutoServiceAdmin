package com.github.coyclab.manager;

import com.github.coyclab.api.AManager;
import com.github.coyclab.models.Order;
import com.github.coyclab.repository.OrderRepo;

public class OrderManager extends AManager <OrderRepo, Order>{

    public OrderManager() {
        super(new OrderRepo());
    }

    public void add(final Order entity){
        repository.getRepository().add(entity);
    }

    public void remove(final Integer id){
        repository.getRepository().remove(id);
    }

}
