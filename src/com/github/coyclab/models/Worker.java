package com.github.coyclab.models;

import com.github.coyclab.api.AEntity;

public class Worker extends AEntity {

    private String workerName;
    private boolean isFree;

    public Worker(int id, String workerName) {
        super(id);
        this.workerName = workerName;
        this.isFree = true;
    }

    public String getName() {
        return workerName;
    }

    public void setName(String workerName) {
        this.workerName = workerName;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    @Override
    public String toString() {
        return "Id: " + getId() + " Name: " + workerName;
    }
}
