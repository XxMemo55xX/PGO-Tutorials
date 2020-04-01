import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Category category1 = new Category();
        Category category2 = new Category("chemicals");
        Category category3 = new Category("drinks", new ArrayList<>());

        category1.addProduct(new Product("kajzerka",0.25, 110));
        category2.addProduct(new Product("domestos",5, 2137));
        category3.addProduct(new Product("Harnas",2.50, 420));


        Busket busket1 = new Busket();
        Busket busket2 = new Busket(new User("s20431@pjwstk.edu.pl"));
        Busket busket3 = new Busket(new User("s20431@pjwstk.edu.pl"),new Product[5]);

        Product produkt1 = new Product("Harnas",2.50, 420);
        Product produkt2 = new Product("domestos",5, 2137);
        Product produkt3 = new Product("kajzerka",0.25, 110);

        busket2.addProduct(produkt1);
        busket3.addProduct(produkt1);
        busket3.addProduct(produkt2);
        busket3.addProduct(produkt3);

        busket3.deleteProduct(produkt2);

        busket3.buy();



    }

}
