import java.util.Scanner;

public class airplane {
    String brand;
    int numberOfSeats;

    public airplane(String brand, int numberOfSeats){
        this.brand = brand;
        this.numberOfSeats = numberOfSeats;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getNumberOfSeats(int seats){

        this.numberOfSeats = seats;
        return this.numberOfSeats;
    }

}
