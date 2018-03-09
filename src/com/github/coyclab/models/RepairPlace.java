package com.github.coyclab.models;

import com.github.coyclab.api.AEntity;

public class RepairPlace extends AEntity {

    private Status status;

    public RepairPlace(int id) {
        super(id);
        this.status = Status.FREE;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("№ ")
                .append(getId())
                .append("\n");

        return builder.toString();
    }

    public enum Status{
        FREE("СВОБОДНО"),
        BUSY("ЗАНЯТО");

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
