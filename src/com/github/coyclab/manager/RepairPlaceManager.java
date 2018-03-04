package com.github.coyclab.manager;

import com.github.coyclab.api.AManager;
import com.github.coyclab.models.RepairPlace;
import com.github.coyclab.repository.RepairPlaceRepo;

public class RepairPlaceManager extends AManager<RepairPlaceRepo, RepairPlace> {

    public RepairPlaceManager() {
        super(new RepairPlaceRepo());
    }
}
