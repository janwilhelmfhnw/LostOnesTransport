package ch.fhnw.acrm.product;

import java.util.ArrayList;

public class ProductController {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        Product p1 = new Product(1001L, "Mexican Blue Palm", 199.95, 0.7);
        Product p2 = new Product(1002L, "Cordyline Red Star", 49.95, 0.4);
        Product p3 = new Product(1001L, "Butterfly Palm", 89.95, 0.4);
        Product p4 = new Product(1002L, "Soil 20L", 10, 0.2);

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);

        System.out.println(products);


    }


}
