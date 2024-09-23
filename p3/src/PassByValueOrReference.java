public class PassByValueOrReference {



    static void changeRoomType(Room room, String roomType) {
        room.roomType = roomType;
    }



    static void changeNumber(int value) {
       value = 20;
    }



    static void changeString(String value) {
        value = "Changed string";
    }



    static void changeInteger(Integer value) {
        value = Integer.valueOf(40);
    }

    public static void main(String[] args) {
        Room room1 = new Room();

        room1.roomType = "Livingroom";
        room1.color = "Red";
        room1.squareMeters = 20;

        System.out.println("Existing room type: " + room1.roomType);

        changeRoomType(room1, "Bedroom");

        System.out.println("Change room type: " + room1.roomType);

        //////////////////

        int x = 10;

        changeNumber(x);

        System.out.println("X= " + x);

        ///////////////////


        String test = "Test";
        changeString(test);
        System.out.println("Test = " + test);


        /////////////////////////////


        Integer integerWrapper = Integer.valueOf(30);

        changeInteger(integerWrapper);

        System.out.println(integerWrapper);
    }
}
