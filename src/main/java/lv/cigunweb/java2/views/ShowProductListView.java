package lv.cigunweb.java2.views;

import lv.cigunweb.java2.Product;
import lv.cigunweb.java2.database.ProductDatabase;

public class ShowProductListView implements View {

    private ProductDatabase database;

    public ShowProductListView(ProductDatabase database) {
        this.database = database;
    }

    @Override
    public void execute() {
        System.out.println();
        System.out.println("Print shopping list to console execution start!");
        for (Product product : database.getAllProducts()) {
            System.out.println(product.getTitle() + "[" + product.getDescription() + "]");
        }
        System.out.println("Print shopping list to console execution end!");
        System.out.println();
    }

}
