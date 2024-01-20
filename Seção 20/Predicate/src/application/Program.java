package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // double min = 100.0; // 3

        // Predicate<Product> pred = p -> p.getPrice() >= min; // 3

        // list.removeIf(new ProductPredicate()); // 1

        // list.removeIf(Product::nonStaticProductPredicate); // 2

        //list.removeIf(pred); // 3

        list.removeIf(p -> p.getPrice() >= 100); // 4

        for (Product p : list) {
            System.out.println(p);
        }
    }
}