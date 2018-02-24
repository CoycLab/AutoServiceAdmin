package com.github.coyclab.models;

public class Worker {

    private String workerName;
    private boolean isFree;

    public Worker(String workerName) {
        this.workerName = workerName;
        this.isFree = true;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
