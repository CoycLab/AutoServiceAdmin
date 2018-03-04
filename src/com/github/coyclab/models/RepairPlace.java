package com.github.coyclab.models;

import com.github.coyclab.api.AEntity;

public class RepairPlace extends AEntity{

    private boolean isFree;

    public RepairPlace(int id) {
        super(id);
        this.isFree = true;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean freeRepairPlace) {
        isFree = freeRepairPlace;
    }
}
