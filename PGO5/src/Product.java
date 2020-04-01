public class Product {
    public String name;
    public double price;
    private int productCode;
    private int numOfItems;

    public Product(String name, double price, int productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
    }

    public Product(String name, double price, int productCode, int numOfItems) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numOfItems = numOfItems;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumOfPieces(int numOfPieces) {
        this.numOfItems = numOfPieces;
    }
}
