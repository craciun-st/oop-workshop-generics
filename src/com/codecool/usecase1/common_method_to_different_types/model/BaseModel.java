package com.codecool.usecase1.common_method_to_different_types.model;

public abstract class BaseModel {

    private Long id;

    private String name;


    public BaseModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
