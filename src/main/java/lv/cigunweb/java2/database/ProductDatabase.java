package lv.cigunweb.java2.database;

import lv.cigunweb.java2.Product;

import java.util.List;
import java.util.Optional;

public interface ProductDatabase {

    void add(Product product);

    Optional<Product> findByTitle(String title);

    void remove(Product product);

    List<Product> getAllProducts();

}
