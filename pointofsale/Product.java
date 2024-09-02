package pointofsale;

public class Product {

    private String productID;
    private String name;
    private String category;
    private double w_s_price;
    private double retailPrice;
    private int quantity;

    public Product() {
    }

    public Product(String productID, double retailPrice, int quantity) {
        this.productID = productID;
        this.quantity = quantity;
        this.retailPrice = retailPrice;
    }

    public Product(String productID, String name, String category, double w_s_price, double retailPrice, int quantity) {
        this.productID = productID;
        this.name = name;
        this.category = category;
        this.w_s_price = w_s_price;
        this.retailPrice = retailPrice;
        this.quantity = quantity;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        if (productID == null || productID.trim().isEmpty()) {
            throw new IllegalArgumentException("Product ID cannot be empty");
        }
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getW_s_price() {
        return w_s_price;
    }

    public void setW_s_price(String w_s_price) {
        if (w_s_price == null || w_s_price.trim().isEmpty()) {
            throw new IllegalArgumentException("WholeSale cannot be empty");
        }
        if (Double.parseDouble(w_s_price) <= 0) {
            throw new IllegalArgumentException("Wholesale price must be greater than zero.");
        }
        this.w_s_price = Double.parseDouble(w_s_price);
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(String retailPrice) {
        if (retailPrice == null || retailPrice.trim().isEmpty()) {
            throw new IllegalArgumentException("Retail cannot be empty");
        }
        if (Double.parseDouble(retailPrice) <= 0) {
            throw new IllegalArgumentException("Retail price must be greater than zero.");
        }
        this.retailPrice = Double.parseDouble(retailPrice);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        if (quantity == null || quantity.trim().isEmpty()) {
            throw new IllegalArgumentException("Quantity cannot be empty");
        }
        if (Integer.parseInt(quantity) < 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }
        this.quantity = Integer.parseInt(quantity);
    }

    public boolean isValid() {
        if (productID == null && productID.trim().isEmpty() && name == null && name.trim().isEmpty() && retailPrice <= 0 && quantity <= 0 && w_s_price <= 0) {
            return false;
        }
        return true;
    }
}
