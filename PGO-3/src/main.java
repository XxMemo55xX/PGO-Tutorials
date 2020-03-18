import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("how many seats?");
        int seats = in.nextInt();

        airplane plane = new airplane("Boeing", seats);


        String brand = plane.getBrand();
        System.out.println("airplane brand is: "+ brand);

        System.out.println("number of seats: "+plane.getNumberOfSeats(seats));

        boolean ecological;

        engine information = new engine(20001,2020);

        double power = information.getPower();
        System.out.println("power of engine: "+ power);

        int yearOfProduction = information.yearOfProduction;
        System.out.println("year of production: "+ yearOfProduction);

        ecological = information.isEcological();

        if(ecological){
            System.out.println("Your engine is ecological");
        }else{
            System.out.println("Your engine is not ecological");
        }


    }
}
