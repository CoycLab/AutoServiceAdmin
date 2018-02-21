package com.github.coyclab.models.builders;

import com.github.coyclab.models.autosersice.RepairPlace;

import java.util.ArrayList;
import java.util.List;

public class AutoServiceBuilder {

    private List<RepairPlace> repairPlaceList;

    public List<RepairPlace> makeRepairPlaces(int count) {
        repairPlaceList = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            repairPlaceList.add(new RepairPlace(i));

        }
        return repairPlaceList;
    }

}
