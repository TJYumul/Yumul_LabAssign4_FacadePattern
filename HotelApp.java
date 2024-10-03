import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FrontDesk frontDesk = new FrontDesk();

        while (true) {
            System.out.println("Hotel Services Menu:");
            System.out.println("1. Request Valet Service");
            System.out.println("2. Request Housekeeping Service");
            System.out.println("3. Request Cart Service");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the plate number: ");
                    String plateNumber = sc.nextLine();
                    frontDesk.requestValetService(plateNumber);
                    break;
                case 2:
                    System.out.print("Enter the room number: ");
                    int roomNumber = sc.nextInt();
                    frontDesk.requestHouseKeeping(roomNumber);
                    break;
                case 3:
                    System.out.print("Enter the number of carts: ");
                    int numberOfCarts = sc.nextInt();
                    frontDesk.requestCartService(numberOfCarts);
                    break;
                case 4:
                    System.out.println("Exit.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        }
    }
}
