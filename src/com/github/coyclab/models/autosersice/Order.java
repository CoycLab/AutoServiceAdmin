package com.github.coyclab.models.autosersice;

import java.util.Date;

public class Order {

    private int number;
    private Date entryDate;
    private Date startDate;
    private Date finishDate;
    private float price;

    public Order(int number, Date startDate, Date finishDate, float price) {
        this.number = number;
        this.entryDate = new Date();
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.price = price;
    }
}
