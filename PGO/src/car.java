public class car {
    String colour;
    String brand;
    double engineCapacity;

    public car(String colour,String brand,double engineCapacity){
        this.colour = colour;
        this.brand = brand;
        this.engineCapacity = engineCapacity;
    }

    public void information(String colour, String brand, double engineCapacity){
        System.out.println("model of car: "+brand);
        System.out.println("colour of car: "+colour);
        System.out.println("engine: "+engineCapacity+"L");
    }
    public String getBrand(){
        return this.brand;
    }
    public String getColour(){
        return this.colour;
    }
    public double getEngineCapacity(){
        return this.engineCapacity;
    }

    public void modification(String massage, double mod){
        System.out.println(massage+" "+mod+"L");
    }
}
