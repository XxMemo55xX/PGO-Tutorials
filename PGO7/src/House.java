import java.util.ArrayList;
import java.util.List;

public class House {
    List<room> rooms;
    double vat = 0.23;


    public House() {
        rooms = new ArrayList<>();
    }

    public void addRoom(room room){
        rooms.add(room);
    }

    public double getHousePrice(){
        double sum = 0;
        double roundOff;
        for (int i = 0; i < rooms.size(); i++) {
            sum+=rooms.get(i).getRoomPrice();
        }

        return sum;
    }

    public String getRoomList(){
        String roomList = "";
        String roomName = "";
        int roomCounter = 0;
        for (int k=0; k < rooms.size(); k++){
            roomName = rooms.get(k).getRoomName();
            roomList = roomList + roomName + " / ";
            roomCounter ++;
        }
        System.out.println("");
        System.out.println("Number of rooms in this house: " + roomCounter);
        System.out.println("");

        return roomList;
    }



}
