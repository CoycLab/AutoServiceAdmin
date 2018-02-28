package com.github.coyclab.api;

import java.util.Collections;
import java.util.Comparator;

public abstract class AManager<R extends ARepository, E extends AEntity> {

    protected R repository;

    public AManager(final R repository) {
        this.repository = repository;
    }

    public void add(final E entity) {
        repository.getRepository().add(entity);
    }

    public void remove(final Integer id) {
        repository.getRepository().remove(id);
    }

    public void sort(Comparator<E> comparator){
        Collections.sort(repository.getRepository(), comparator);
    }

    public R getRepository() {
        return repository;
    }
}
