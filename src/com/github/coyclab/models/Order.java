package com.github.coyclab.models;

import com.github.coyclab.api.AEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order extends AEntity {

    private Date entryDate;
    private Date startDate;
    private Date finishDate;
    private Float price;
    private Worker worker;
    private OrderStatus status;

    public Order(Integer id, Date startDate, Date finishDate, float price) {
        super(id);
        this.entryDate = new Date();
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.price = price;
        this.status = OrderStatus.WAITING;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");

        builder.append("Id: ").append(getId()).append("\n")
                .append("Entry date: ").append(dateFormat.format(entryDate)).append("\n")
                .append("Start date: ").append(dateFormat.format(startDate)).append("\n")
                .append("Finish date: ").append(dateFormat.format(finishDate)).append("\n")
                .append("Price: ").append(price).append("\n");
        return builder.toString();
    }

    public enum OrderStatus {
        DONE,
        CANCELED,
        DELETED,
        WAITING
    }
}
