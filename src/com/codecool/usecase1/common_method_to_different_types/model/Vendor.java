package com.codecool.usecase1.common_method_to_different_types.model;

import com.codecool.usecase1.common_method_to_different_types.model.product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Vendor {

    private Long id;

    private String name;

    private String address;

    private List<Product> inventoryToSell;

    public Vendor(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.inventoryToSell = new ArrayList<>();
    }

    public Vendor(Long id, String name, String address, List<Product> inventoryToSell) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.inventoryToSell = inventoryToSell;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getInventoryToSell() {
        return inventoryToSell;
    }

    public void setInventoryToSell(List<Product> inventoryToSell) {
        this.inventoryToSell = inventoryToSell;
    }

    public void addProductInInventoryToSell(Product product) {
        this.inventoryToSell.add(product);
    }

    public void removeProductInInventoryToSell(Product product) {
        this.inventoryToSell.remove(product);
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", inventoryToSell=" + getListOfTypesAndIds(inventoryToSell).toString() +
                '}';
    }

    private List<String> getListOfTypesAndIds(List<Product> inventory) {
        List<String> listOfIds = inventory.stream()
                .map(product -> product.getClass().getSimpleName()+"{id="+product.getId()+"}")
                .collect(Collectors.toList());
        return listOfIds;
    }
}
