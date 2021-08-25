package com.codecool.usecase1.common_method_to_different_types.model.product;

public class VideoGame extends Product{


    public VideoGame(Long id, String name) {
        super(id, name);
    }



    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
