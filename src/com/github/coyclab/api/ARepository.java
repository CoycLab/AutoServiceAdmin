package com.github.coyclab.api;

import java.util.ArrayList;
import java.util.List;

public abstract class ARepository<T extends AEntity> {

    protected List<T> repository;

    public ARepository() {
        repository = new ArrayList<>();
    }

    public List<T> getRepository() {
        return repository;
    }

    public boolean add(T entity) {
        return isFreeId(entity.getId()) && repository.add(entity);
    }

    public boolean remove(T entity) {
        return repository.remove(entity);
    }

    private boolean isFreeId(int id) {

        for (T entity : repository) {
            if (entity.getId().equals(id)){
                return false;
            }
        }
        return true;
    }

}
