package com.github.coyclab.api;

import java.util.ArrayList;
import java.util.List;

public abstract class ARepository<T extends AEntity> {

    //  todo use ARRAYS!!!!!!!

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

    public boolean remove(int id) {

        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getId().equals(id)) {
                repository.remove(i);
                return true;
            }
        }

        return false;
    }

    private boolean isFreeId(int id) {

        for (T entity : repository) {
            if (entity.getId().equals(id)) return false;
        }

        return true;
    }

}
