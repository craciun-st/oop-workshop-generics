package com.codecool.usecase1.common_method_to_different_types.util;

import com.codecool.usecase1.common_method_to_different_types.model.product.Product;
import com.codecool.usecase1.common_method_to_different_types.model.user.User;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListHandler {

    public static List<Product> filterProductsByString(List<Product> products, String filterString) {
        if (filterString.length() < 3) return Collections.emptyList();
        String lowcaseFilter = filterString.toLowerCase();
        return products.stream()
                .filter( product -> product.getName().toLowerCase().contains(lowcaseFilter) )
                .collect(Collectors.toList());
    }

    public static List<User> filterUsersByString(List<User> users, String filterString) {
        if (filterString.length() < 3) return Collections.emptyList();
        String lowcaseFilter = filterString.toLowerCase();
        return users.stream()
                .filter(user -> user.getName().toLowerCase().contains(lowcaseFilter))
                .collect(Collectors.toList());
    }




    public static <T> List<T> filterListByString(List<T> objects, String filterString) {
        if (filterString.length() < 3) return Collections.emptyList();
        String lowcaseFilter = filterString.toLowerCase();
        return objects.stream()
                .filter(object -> object.toString().toLowerCase().contains(lowcaseFilter))
                .collect(Collectors.toList());
    }

}
