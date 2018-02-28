package com.github.coyclab.api;

import java.util.Collection;
import java.util.Comparator;

public abstract class AManager {

    ARepository repository;

    public void add(AEntity entity){
        repository.getRepository().add(entity);
    }

    public void remove(Integer id){
        repository.getRepository().remove(id);
    }
}
