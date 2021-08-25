package com.codecool.usecase1.common_method_to_different_types;

import com.codecool.usecase1.common_method_to_different_types.model.Vendor;
import com.codecool.usecase1.common_method_to_different_types.model.product.Product;
import com.codecool.usecase1.common_method_to_different_types.model.user.User;
import com.codecool.usecase1.common_method_to_different_types.util.DbInit;
import com.codecool.usecase1.common_method_to_different_types.view.TerminalOutput;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        TerminalOutput view = new TerminalOutput();
        List<User> users = DbInit.getAllUsers();
        List<Product> games = DbInit.getAllGames();
        List<Vendor> vendors = DbInit.getAllVendors();


//        view.renderList(users);
        String filterWord = "red";
        view.renderListHighLightingWord(vendors, filterWord);
    }
}
