package com.codecool.usecase1.common_method_to_different_types.model;

import com.codecool.usecase1.common_method_to_different_types.model.product.Product;
import com.codecool.usecase1.common_method_to_different_types.model.user.Customer;

public class TransportOperator implements ProductDelivery {

    private Long id;
    private String name;
    private Double transportCost;

    public TransportOperator(Long id, String name, Double transportCost) {
        this.id = id;
        this.name = name;
        this.transportCost = transportCost;
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

    public Double getTransportCost() {
        return transportCost;
    }

    public void setTransportCost(Double transportCost) {
        this.transportCost = transportCost;
    }

    @Override
    public void deliverProductFromVendor(Product product, Vendor vendor) {
        // get that product from whomever sells it
    }

    @Override
    public void deliverProductToCustomer(Product product, Customer customer) {
        // send that product to the client that buys it
    }
}
