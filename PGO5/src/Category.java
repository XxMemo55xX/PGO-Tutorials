import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    public ArrayList<Product> products;

    public Category() {
        this.products = new ArrayList<>();
    }

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deleteProduct(Product product){
        products.remove(product);
    }

    public void addProduct(Product product){
        products.add(product);
    }

}
