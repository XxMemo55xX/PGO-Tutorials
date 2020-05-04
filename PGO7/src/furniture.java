public class furniture {
    private String nameFurniture;
    private double price;
    public double vat;

    public furniture(String nameFurniture, double price, double vat) {
        this.nameFurniture = nameFurniture;
        this.price = price;
        this.vat = price + (price * vat);
    }

    public double getVat(){
        double roundOff = Math.round(vat*100.0)/100.0;
        return roundOff;
    }

    public double getPrice() {
        return price;
    }

    public String getNameFurniture() {
        return nameFurniture;
    }
}
