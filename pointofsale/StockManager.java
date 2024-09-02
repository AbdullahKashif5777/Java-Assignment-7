/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pointofsale;

import java.util.ArrayList;

public class StockManager {

    public static ArrayList<Stock> st;

    static {
        st = new ArrayList<>();
    }

    public static void addstock(Stock s) {
        st.add(s);
    }

    public static ArrayList<Stock> getStock() {
        return st;
    }

    public static void deleteStock(Stock s) {
        for (int i = 0; i < st.size(); i++) {
            if (st.get(i).getName().equalsIgnoreCase(s.getName())) {
                st.remove(i);
            }
        }
    }

    public static ArrayList<Stock> search(String name) {
        ArrayList<Stock> matchingProducts = new ArrayList<>();
        for (Stock product : st) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                matchingProducts.add(product);
            }
        }
        return matchingProducts;
    }

    public static double calculateProfitOrLoss() {
        for (int i = 0; i < st.size(); i++) {
            return (st.get(i).getRetailPrice() - st.get(i).getW_s_price());
        }
        return 0.0;
    }

    public static double calculateTotalProfitOrLoss() {
        double totalProfitOrLoss = 0.0;
        for (Stock stock : st) {
            totalProfitOrLoss += calculateProfitOrLoss();
        }
        return totalProfitOrLoss;
    }

    public static int calculateTotalQuantity() {
        int totalQuantity = 0;
        for (Stock stock : st) {
            totalQuantity += stock.getCusQuantity();
        }
        return totalQuantity;
    }

}
