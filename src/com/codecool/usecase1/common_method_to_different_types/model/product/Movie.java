package com.codecool.usecase1.common_method_to_different_types.model.product;

public class Movie extends Product {



    public Movie(Long id, String name) {
        super(id, name);
    }



    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
