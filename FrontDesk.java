public class FrontDesk {
    public void requestValetService(String plateNumber) {
        Valet valet = new Valet(plateNumber);
        valet.hotelServices();
    }

    public void requestHouseKeeping(int roomNumber) {
        HouseKeeping houseKeeping = new HouseKeeping(roomNumber);
        houseKeeping.hotelServices();
    }

    public void requestCartService(int numberOfCarts) {
        Cart cart = new Cart(numberOfCarts);
        cart.hotelServices();
    }
}
