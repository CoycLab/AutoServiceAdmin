package com.github.coyclab.api;

import java.util.ArrayList;
import java.util.List;

public abstract class ARepository <T extends AEntity>{

    //  todo use ARRAYS!!!!!!!

    protected List<T> repository;

    public ARepository() {
        repository = new ArrayList<>();
    }

    public List<T> getRepository(){
        return repository;
    }

}
