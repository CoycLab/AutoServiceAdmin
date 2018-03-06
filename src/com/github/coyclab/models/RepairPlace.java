package com.github.coyclab.models;

import com.github.coyclab.api.AEntity;

public class RepairPlace extends AEntity {

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

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("№ ")
                .append(getId())
                .append("\n");

        return builder.toString();
    }
}
