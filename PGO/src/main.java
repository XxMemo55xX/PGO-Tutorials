import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        telephone mobile = new telephone("Huawei", 5.5,
                224700000);


        int number = mobile.getNumber();
        System.out.println("contact number is: " + number);

        mobile.massage("siema", number);

        System.out.println();
        System.out.println();

        car vehicle = new car("blue","Mustang", 1.6);
        String brand = vehicle.getBrand();
        String colour = vehicle.getColour();

        double engineCapacity = vehicle.getEngineCapacity();

        vehicle.information(colour,brand,engineCapacity);

        System.out.println();
        System.out.println();

        car modification = new car(colour,brand,engineCapacity);

        String massage = "Possible modification: ";
        double mod = 5.0;

        vehicle.modification(massage,mod);

        System.out.println();
        System.out.println();


        System.out.println("Chose an option:");
        System.out.println("1 - option without an modification");
        System.out.println("2 - option with an moditication");

        int chose = in.nextInt();

        if (chose==1){
            if (engineCapacity<=2){
                System.out.println("your car: "+ brand + " with "+engineCapacity+" is low speed");
            }else{
                System.out.println("your car: "+ brand + " with "+engineCapacity+" is high speed");
            }
        }else{
            if (mod<=2){
                System.out.println("your car: "+ brand + " with "+mod+" is low speed");
            }else{
                System.out.println("your car: "+ brand + " with "+mod+" is high speed");
            }
        }
    }
}
