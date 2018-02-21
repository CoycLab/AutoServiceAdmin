package com.github.coyclab.models.autosersice;

public class RepairPlace {

    private int repairPlaceNumber;
    private boolean isFreeRepairPlace;

    public RepairPlace(int repairPlaceNumber) {
        this.repairPlaceNumber = repairPlaceNumber;
        this.isFreeRepairPlace = true;
    }

    public int getRepairPlaceNumber() {
        return repairPlaceNumber;
    }

    public boolean isFreeRepairPlace() {
        return isFreeRepairPlace;
    }

    public void setFreeRepairPlace(boolean freeRepairPlace) {
        isFreeRepairPlace = freeRepairPlace;
    }
}
