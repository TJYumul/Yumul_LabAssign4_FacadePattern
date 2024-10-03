public class Cart implements HotelService{
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("Requesting " + numberOfCarts + " luggage cart");
    }

    @Override
    public void hotelServices() {
        requestCart(numberOfCarts);
    }
}
