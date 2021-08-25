package com.codecool.usecase1.common_method_to_different_types.model;

import com.codecool.usecase1.common_method_to_different_types.model.product.Product;
import com.codecool.usecase1.common_method_to_different_types.model.user.Customer;

public interface ProductDelivery {

    void deliverProductFromVendor(Product product, Vendor vendor);

    void deliverProductToCustomer(Product product, Customer customer);
}
