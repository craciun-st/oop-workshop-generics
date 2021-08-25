package com.codecool.usecase1.common_method_to_different_types.model.product;

import com.codecool.usecase1.common_method_to_different_types.model.Vendor;

public class ClothesIron extends Product {

    private Long id;

    private String color;

    private String model;

    private Vendor vendor;

    public ClothesIron(Long id, String color, String model, Vendor vendor) {
        super(id, "---");
        this.color = color;
        this.model = model;
        this.vendor = vendor;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "ClothesIron{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", vendor=" + ( vendor != null ? vendor.getName() : "N/A" ) +
                '}';
    }
}
