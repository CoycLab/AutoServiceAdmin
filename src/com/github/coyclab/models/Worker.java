package com.github.coyclab.models;

import com.github.coyclab.api.AEntity;

public class Worker extends AEntity {

    private String workerName;
    private Status workerStatus;

    public Worker(int id, String workerName) {
        super(id);
        this.workerName = workerName;
        this.workerStatus = Status.FREE;
    }

    public String getName() {
        return workerName;
    }

    public void setName(String workerName) {
        this.workerName = workerName;
    }


    @Override
    public String toString() {

        return "Id: " + getId() + " Name: " + workerName + " --> " + workerStatus ;
    }

    public Status getWorkerStatus() {
        return workerStatus;
    }

    public void setWorkerStatus(Status workerStatus) {
        this.workerStatus = workerStatus;
    }

    public enum Status {
        BUSY("ЗАНЯТ"),
        FREE("СВОБОДЕН");

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
