package com.github.coyclab.api;

import java.util.List;

public abstract class ARepository <T extends AEntity>{

    //  todo use ARRAYS!!!!!!!

    protected List<T> repository;

    public List<T> getRepository(){
        return repository;
    }

    public void remove(int id){
        T entity = repository.get(id);

        if (entity != null){
            repository.remove(entity);
        }
    }
}
