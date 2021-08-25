package com.codecool.usecase1.common_method_to_different_types.model.user;

import java.util.List;

public class Customer extends User {

    private String address;

    public Customer(Long id, String name, String email, String password, List<String> roles, String address) {
        super(id, name, email, password, roles);
        this.address = address;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", roles=" + roles +
                '}';
    }
}
