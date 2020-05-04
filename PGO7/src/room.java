import java.util.ArrayList;
import java.util.List;
public class room{

    private String roomName;
    double vat = 0.23;
    List<furniture> furnitures;

    public room(String roomName) {
        this.roomName = roomName;
        furnitures= new ArrayList<>();
    }


    public void addFurniture(furniture furniture){
        furnitures.add(furniture);
    }


    public double getRoomPrice(){
        double sum = 0;
        double roundOff;
        for (int i = 0; i < furnitures.size(); i++) {
            sum+=furnitures.get(i).getPrice();
        }
        sum += (sum * vat);
        roundOff = Math.round(sum*100.0)/100.0;
        return roundOff;
    }


    public String getFurnitureList(){
        String name = "";
        String list = "";
        for (int j=0; j<furnitures.size();j++) {
            name = furnitures.get(j).getNameFurniture();
            list = list + name + " ";
        }
        return list;
    }

    public String getRoomName(){
        return roomName;
    }

}