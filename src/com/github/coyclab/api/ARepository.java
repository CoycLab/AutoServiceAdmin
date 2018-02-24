package com.github.coyclab.api;

import java.util.List;

public abstract class ARepository {

    protected List<AEntity> repository;

    public void addEntity(AEntity entity){
        repository.add(entity);
    }


}
