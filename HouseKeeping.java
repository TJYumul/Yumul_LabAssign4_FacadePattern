public class HouseKeeping implements HotelService {
    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("Room " + roomNumber + " is cleaning.");
    }

    @Override
    public void hotelServices() {
        cleanRoom(roomNumber);
    }
}
