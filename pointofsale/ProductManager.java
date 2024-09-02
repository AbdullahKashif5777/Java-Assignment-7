package pointofsale;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static pointofsale.StockManager.st;

public class ProductManager {

    private static ArrayList<Product> products;

    static {
        products = new ArrayList<>();
    }

//    public ProductManager() {
//        products = new ArrayList<>();
//    }
    public static void addProduct(Product obj) {
        products.add(obj);
    }

    public static ArrayList<Product> getProducts() {
        return products;
    }

    public static ArrayList<Product> search(String name) {
        ArrayList<Product> matchingProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                matchingProducts.add(product);
            }
        }
        return matchingProducts;
    }

    public static void deleteProduct(Product obj) {
        products.remove(obj);
    }

    public static void updateProduct(String name, Product p) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                product.setName(name);
                product.setProductID(p.getProductID());
                product.setCategory(p.getCategory());
                product.setQuantity(p.getQuantity() + "");
                product.setRetailPrice(p.getRetailPrice() + "");
                product.setW_s_price(p.getW_s_price() + "");
            }
        }
    }

    public static String[] products() {
        String[] firstIndexValues = new String[products.size()];
        String[] productNames = new String[products.size()];
        int index = 0;
        for (Product product : products) {
            productNames[index] = product.getName();
            index++;
        }
        return productNames;
    }

    public static Product stock(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return new Product(product.getProductID(), product.getRetailPrice(), product.getQuantity());
            }
        }
        return null;
    }

    public static int calculateTotalStockQuantity() {
        int totalQuantity = 0;
        for (Product p : products) {
            totalQuantity += p.getQuantity();
        }
        return totalQuantity;
    }

    public static void dummyValues() {
        products.add(new Product("12", "lays", "Snacks", 50, 60, 100));
        products.add(new Product("33", "dairy milk", "Sweets", 140, 150, 100));
        products.add(new Product("54", "milk pak", "Dairy Products", 40, 55, 50));
        products.add(new Product("31", "bread", "Bakery Item", 80, 100, 80));
        products.add(new Product("10", "noodles", "Snacks", 50, 60, 100));

    }
}
