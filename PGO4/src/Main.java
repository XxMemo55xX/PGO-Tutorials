import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name, lastName, email, password;
        String emailGuest;

        System.out.println("Do you want to create an account?");
        System.out.println("Yes - [0]");
        System.out.println("No, continue as a Guest - [1]");

        int check = in.nextInt();

        if(check==0){

            System.out.println("Your Name:");
            name = in.nextLine();
            System.out.println("Your Last name:");
            lastName = in.nextLine();
            System.out.println("Your email:");
            email = in.nextLine();
            System.out.println("Your password:");
            password = in.nextLine();
            User u1 = new User(name,lastName,email,password);
            System.out.println("you become a User!");
        }else{

            System.out.println("Your email:");
            emailGuest = in.nextLine();

            System.out.println("You become as a Guest! ");
            System.out.println("Are you sure to not become a User?");
            System.out.println("Yes, contiue as a Guest - [0]");
            System.out.println("No, lets create a User account - [1]");

            int check2 = in.nextInt();

            if (check2==1){

                System.out.println("Your Name:");
                name = in.nextLine();
                System.out.println("Your Last name:");
                lastName = in.nextLine();
                System.out.println("Your password:");
                password = in.nextLine();
                User u2 = new User(name,lastName,emailGuest,password);
                System.out.println("you become a User!");
            }else{
                User u2 = new User(emailGuest);
            }

            //additional static guest account
            User u3 = new User("s20431@pjwstk.edu.pl");
        }


        Product p1 = new Product("Pear", 2.5,321, 500);
        Product p2 = new Product("Apple", 3.5,123);

        System.out.println("Change the price for: " + p1.getProductName());
        double price = in.nextDouble();


        System.out.println("Change the price for: " + p2.getProductName());
        double price2 = in.nextDouble();

        p1.setPrice(price);
        p2.setPrice(price2);

        System.out.println("Do you want to see all possible products?");
        System.out.println("Yes - [0]");
        System.out.println("No - [1]");

        int check3 = in.nextInt();

        if(check3==0) {

            System.out.println("product 1: " + p1.getProductName());
            System.out.println("price: " + p1.getPrice());
            System.out.println("product code: " + p1.getProductCode());
            System.out.println("number of intems: " + p1.getNumberOfItems());

            System.out.println();

            System.out.println("product 1: " + p2.getProductName());
            System.out.println("price: " + p2.getPrice());
            System.out.println("product code: " + p2.getProductCode());
            System.out.println("number of intems: " + p2.getNumberOfItems());

        }


    }
}
