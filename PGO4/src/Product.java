public class Product {

    private String productName;
    private double price;
    private int productCode;
    private int numberOfItems;

    public Product(String productName, double price, int productCode, int numberOfItems) {
        this.productName = productName;
        this.price = price;
        this.productCode = productCode;
        this.numberOfItems = numberOfItems;
    }

    public Product(String productName, double price, int productCode) {
        this.productName = productName;
        this.price = price;
        this.productCode = productCode;
        this.numberOfItems = 0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getProductCode() {
        return productCode;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }
}
