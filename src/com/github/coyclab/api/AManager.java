package com.github.coyclab.api;

import java.util.List;

public abstract class AManager<R extends ARepository, E extends AEntity> {

    protected R repository;
    private List<E> itemList;

    public AManager(final R repository) {
        this.repository = repository;
    }

    protected boolean isFreeId(int id) {
        itemList = this.repository.getRepository();

        for (E entity : itemList) {
            if (entity.getId().equals(id)) {
                return false;
            }
        }
        return true;
    }

    protected E getItemById(int id) {
        itemList = repository.getRepository();
        for (E item : itemList) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }


}
