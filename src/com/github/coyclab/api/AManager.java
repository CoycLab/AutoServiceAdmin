package com.github.coyclab.api;

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

}
