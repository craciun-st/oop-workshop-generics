package com.codecool.usecase1.common_method_to_different_types.model.product;

public class Carpet extends Product {



    private String color;



    public Carpet(Long id, String color, String name) {
        super(id, name);
        this.color = color;

    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    @Override
    public String toString() {
        return "Carpet{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
