package ch.fhnw.acrm.product;

import java.util.ArrayList;

public class ProductController {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        Product p1 = new Product(1001L, "Product 1", 50.95, 0.5);
        Product p2 = new Product(1002L, "Product 2", 35.90, 0.75);

        products.add(p1);
        products.add(p2);

        System.out.println(products);


    }


}
