package com.github.coyclab.api;

import java.util.List;

public abstract class AManager<R extends ARepository, E extends AEntity> {

    protected R repository;

    public AManager(final R repository) {
        this.repository = repository;
    }

    protected boolean isFreeId(int id) {
        List<E> repository = this.repository.getRepository();

        for (E entity : repository) {
            if (entity.getId().equals(id)) return false;
        }
        return true;
    }


}
