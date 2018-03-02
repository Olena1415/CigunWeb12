package lv.cigunweb.java2.database;

import lv.cigunweb.java2.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductInMemoryDatabase implements ProductDatabase {

    private List<Product> products = new ArrayList<>();

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public Optional<Product> findByTitle(String title) {
        return products.stream()
                .filter(p -> p.getTitle().equals(title))
                .findFirst();
    }

    @Override
    public void remove(Product product) {
        products.remove(product);
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> allProducts = new ArrayList<>();
        allProducts.addAll(products);
        return allProducts;
    }

}
