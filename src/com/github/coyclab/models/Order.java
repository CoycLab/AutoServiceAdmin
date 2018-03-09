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
    private Status orderStatus;


    public Order(Integer id, Date startDate, Date finishDate, float price) {
        super(id);
        this.entryDate = new Date();
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.price = price;
        this.orderStatus = Status.NEW;
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

    public Date getEntryDate() {
        return entryDate;
    }

    public Status getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Status orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");

        builder.append("Id: ").append(getId()).append("\n")
                .append("Entry date: ").append(dateFormat.format(entryDate)).append("\n")
                .append("Start date: ").append(dateFormat.format(startDate)).append("\n")
                .append("Finish date: ").append(dateFormat.format(finishDate)).append("\n")
                .append("Price: ").append(price).append("\n")
                .append("Status: ").append(orderStatus).append("\n");
        return builder.toString();
    }

    public enum Status {
        NEW("НОВЫЙ"),
        DONE("ВЫПОЛНЕН"),
        CANCELED("ОТМЕНЕН");

        private String status;

        Status(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return status;
        }
    }
}
