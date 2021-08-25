package com.codecool.usecase1.common_method_to_different_types.util;

import com.codecool.usecase1.common_method_to_different_types.model.TransportOperator;
import com.codecool.usecase1.common_method_to_different_types.model.Vendor;
import com.codecool.usecase1.common_method_to_different_types.model.product.*;
import com.codecool.usecase1.common_method_to_different_types.model.user.Customer;
import com.codecool.usecase1.common_method_to_different_types.model.user.User;

import java.util.List;

public class DbInit {

    public static List<Vendor> getAllVendors() {
        Vendor vendor1 = new Vendor(1L,"ACME Corp.", "United States of Unconsciousness, 51485");
        Vendor vendor2 = new Vendor(2L, "Boeurn", "Upper Helschwig-Schorstein, 2357");
        Vendor vendor3 = new Vendor(3L, "Red Sprockets", "Skyway City, 9AF00");
        Vendor vendor4 = new Vendor(4L, "Zerster", "Wiener Str., Frankfurter Reg., UWE86");
        return List.of(vendor1, vendor2, vendor3, vendor4);
    }

    public static List<TransportOperator> getAllTransportOperators() {
        TransportOperator transporter1 = new TransportOperator(1L,"LightningExpress", 9000.00001);
        TransportOperator transporter2 = new TransportOperator(2L, "AdmiralWay", 1234.5);
        TransportOperator transporter3 = new TransportOperator(3L, "HundredMiles", 1420.9);
        TransportOperator transporter4 = new TransportOperator(4L, "SlugSpeed-Matic", 200.1);
        return List.of(transporter1, transporter2, transporter3, transporter4);
    }

    public static List<User> getAllUsers() {
        Customer customer1 = new Customer(
                1L,
                "John Doe",
                "john.doe@test.test",
                "*123",
                List.of("USER"),
                "No Man's Land, 1"
        );
        Customer customer2 = new Customer(
                2L,
                "Jane Doe",
                "jane111@testservices.com",
                "*321",
                List.of("USER"),
                "No Man's Land, 2"
        );
        Customer customer3 = new Customer(
                3L,
                "Axel Foley",
                "",
                "plain_clothes", List.of("USER"), "Beverly Hills, 1F, CA"
        );
        Customer admin = new Customer(
                0L,
                "admin",
                "admin@thisapp.com",
                "S^LgdsAD!=NVfgs3256",
                List.of("ADMIN", "USER"),
                "---"
        );
        Customer customer4 = new Customer(
                4L,
                "Mildred Stone",
                "millie1958@mail.com",
                "rhubarbpie",
                List.of("USER"),
                "Schenacktaddy, 61247, NY"
        );
        return List.of(admin, customer1, customer2, customer3, customer4);

    }

    public static List<Product> getAllCarpets() {
        Carpet carpet1 = new Carpet(1L, "Tumbleweed Brown", "Gala Fitted Carpet");
        Carpet carpet2 = new Carpet(2L, "Alto Grey", "Samba");
        Carpet carpet3 = new Carpet(3L,"Well Read Red", "Melody");
        Carpet carpet4 = new Carpet(4L, "Multicolor", "Children's Farmhouse");
        return List.of(carpet1, carpet2, carpet3, carpet4);
    }

    public static List<Product> getAllClothesIrons() {
        List<Vendor> vendors = getAllVendors();
        ClothesIron clothesIron1 = new ClothesIron(1L, "Deep Sea Green", "1G", vendors.get(1));
        ClothesIron clothesIron2 = new ClothesIron(2L,"Navy Blue","XLG45", vendors.get(2));
        ClothesIron clothesIron3 = new ClothesIron(3L, "Burgundy Red", "V56", vendors.get(2));

        vendors.get(1).addProductInInventoryToSell(clothesIron1);
        vendors.get(2).addProductInInventoryToSell(clothesIron2);
        vendors.get(2).addProductInInventoryToSell(clothesIron3);

        return List.of(clothesIron1, clothesIron2, clothesIron3);
    }

    public static List<Product> getAllGames() {
        VideoGame videoGame1 = new VideoGame(1L, "The Warlocker 3: Domestic Flight");
        VideoGame videoGame2 = new VideoGame(2L, "The First Of You - Beta Edition");
        VideoGame videoGame3 = new VideoGame(3L, "Waterborne - Starter Edition");
        VideoGame videoGame4 = new VideoGame(4L, "God of Peace");
        VideoGame videoGame5 = new VideoGame(5L, "Initial Reality I - Aqua");
        VideoGame videoGame6 = new VideoGame(6L, "Bodies of Ulaan Bataar");
        VideoGame videoGame7 = new VideoGame(7L, "Red Dead Damnation 2");
        return List.of(videoGame1, videoGame2, videoGame3, videoGame4, videoGame5, videoGame6, videoGame7);
    }

    public static List<Product> getAllMovies() {
        Movie movie1 = new Movie(1L, "Citizen Bane");
        Movie movie2 = new Movie(2L,"The Stepmother");
        Movie movie3 = new Movie(3L, "Front Door");
        Movie movie4 = new Movie(4L,"Anfa");
        Movie movie5 = new Movie(5L,"Girlishness");
        Movie movie6 = new Movie(6L, "Three Colors: Red");
        return List.of(movie1, movie2, movie3, movie4, movie5, movie6);
    }

    static {


    }

}
