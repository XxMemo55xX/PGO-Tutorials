public class main {
    public static void main(String[] args) {
        double vat = (0.23);

        furniture f1 = new furniture("chair", 100, vat);
        furniture f2 = new furniture("sofa", 100, vat);
        furniture f3 = new furniture("table", 100, vat);
        furniture f4 = new furniture("sink", 100, vat);
        furniture f5 = new furniture("mirror", 100, vat);

/*
        System.out.println("price with vat: "+f1.getVat());
        System.out.println("price: "+f1.getPrice());
*/

        room room1 = new room("livingRoom");
        room room2 = new room("bathroom");

        room1.addFurniture(f1);
        room1.addFurniture(f2);
        room1.addFurniture(f3);

        room2.addFurniture(f4);
        room2.addFurniture(f5);

        House house1 = new House();

        house1.addRoom(room1);
        house1.addRoom(room2);

        System.out.println(room1.getFurnitureList());

        System.out.println("Price for this room with vat: "+ room1.getRoomPrice());

        System.out.println(room2.getFurnitureList());

        System.out.println("Price for this room with vat: "+ room2.getRoomPrice());

        System.out.println("Room list: "+ house1.getRoomList());

        System.out.println("Price for this house with vat is: "+ house1.getHousePrice());
    }
}
