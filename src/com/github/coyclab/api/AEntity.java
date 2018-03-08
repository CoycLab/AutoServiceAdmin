package com.github.coyclab.api;

public abstract class AEntity {

    private Integer id;

    public AEntity(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

}
