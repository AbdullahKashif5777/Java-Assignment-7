package pointofsale;

import java.util.ArrayList;

public class Stock extends Product {

    private int cusQuantity;
    private boolean status;

    public Stock() {

    }

    public Stock(String name, String id, String retailPrice, int cusQuantity, String quantity, boolean status) {
        this.setName(name);
        this.setProductID(id);
        this.setQuantity(quantity);
        this.setRetailPrice(retailPrice);
        this.status = status;
        this.cusQuantity = cusQuantity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCusQuantity() {
        return cusQuantity;
    }

    public void setCusQuantity(int cusQuantity) {
        if (cusQuantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }
        this.cusQuantity = cusQuantity;
    }

}
