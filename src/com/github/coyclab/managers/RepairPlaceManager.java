package com.github.coyclab.managers;

import com.github.coyclab.api.AManager;
import com.github.coyclab.models.RepairPlace;
import com.github.coyclab.repository.RepairPlaceRepo;

import java.util.ArrayList;
import java.util.List;

public class RepairPlaceManager extends AManager<RepairPlaceRepo, RepairPlace> {

    public RepairPlaceManager() {
        super(new RepairPlaceRepo());
    }

    public List<RepairPlace> getRepairPlaces() {
        return repository.getRepository();
    }

    public List<RepairPlace> getFreeRepairPlaces() {
        List<RepairPlace> temp = new ArrayList<>();

        for (RepairPlace r : repository.getRepository()) {
            if (r.isFree()) {
                temp.add(r);
            }
        }

        return temp;
    }

    public Boolean add(int id) {
        if (isFreeId(id)){
            RepairPlace repairPlace = new RepairPlace(id);
            repository.getRepository().add(repairPlace);
            return true;
        }
        return false;
    }

    public Boolean remove(int id){
        List<RepairPlace> repairPlaceList = repository.getRepository();
        for (int i = 0; i < repairPlaceList.size() ; i++) {
            if (repairPlaceList.get(i).getId().equals(id)){
                repairPlaceList.remove(i);
                return true;
            }
        }
        return false;
    }

}
