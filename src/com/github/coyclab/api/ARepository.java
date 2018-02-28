package com.github.coyclab.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class ARepository {

    protected List<AEntity> repository;

    public ARepository() {
        this.repository = new ArrayList<>();
    }

    public List<AEntity> getRepository(){
        return repository;
    }


}
