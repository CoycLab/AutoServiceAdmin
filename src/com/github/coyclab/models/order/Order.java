package com.github.coyclab.models.order;

import java.util.Date;

public class Order {

    private int orderNumber;
    private Date orderEntryDate;
    private Date orderStartDate;
    private Date orderFinishDate;
    private float orderPrice;


    public Order(int orderNumber, Date orderStartDate, Date orderFinishDate, float orderPrice) {
        this.orderNumber = orderNumber;
        this.orderEntryDate = new Date();
        this.orderStartDate = orderStartDate;
        this.orderFinishDate = orderFinishDate;
        this.orderPrice = orderPrice;
    }



    public int getOrderNumber() {
        return orderNumber;
    }

    public Date getOrderEntryDate() {
        return orderEntryDate;
    }

    public Date getOrderStartDate() {
        return orderStartDate;
    }

    public Date getOrderFinishDate() {
        return orderFinishDate;
    }

    public float getOrderPrice() {
        return orderPrice;
    }


}
