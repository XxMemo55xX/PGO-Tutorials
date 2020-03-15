public class telephone {
    String brand;
    double resolution;
    int number;


    public telephone(String brand, double resolution, int number) {
        this.brand = brand;
        this.resolution = resolution;
        this.number = number;

    }

    public void massage(String X, int Y) {
        System.out.println("Send "+X+" to "+Y);
    }
    public int getNumber(){
        return this.number;
    }


}
