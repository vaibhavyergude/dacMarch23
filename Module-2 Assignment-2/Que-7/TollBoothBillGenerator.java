import java.util.Scanner;

public class TollBoothBillGenerator {
    private String vehicleType;
    private int numAxles;
    private double distanceTraveled;
    private double tollFee;
    private double totalAmountDue;

    public void calculateTollFee() {
        if (vehicleType.equals("car") || vehicleType.equals("van") || vehicleType.equals("bus")) {
            tollFee = 0.25 * numAxles * distanceTraveled;
        } else if (vehicleType.equals("truck")) {
            tollFee = 0.5 * numAxles * distanceTraveled;
        }
    }

    public void generateBill() {
        totalAmountDue = tollFee + 2.0;
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Number of Axles: " + numAxles);
        System.out.println("Distance Traveled: " + distanceTraveled + " miles");
        System.out.println("Toll Fee: $" + String.format("%.2f", tollFee));
        System.out.println("Total Amount Due: $" + String.format("%.2f", totalAmountDue));
    }

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Select an option:");
            System.out.println("1. Enter vehicle type (car, van, bus, or truck)");
            System.out.println("2. Enter number of axles");
            System.out.println("3. Enter distance traveled");
            System.out.println("4. Calculate toll fee");
            System.out.println("5. Generate bill");
            System.out.println("6. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle type: ");
                    vehicleType = sc.next();
                    break;
                case 2:
                    System.out.print("Enter number of axles: ");
                    numAxles = sc.nextInt();
                    break;
                case 3:
                    System.out.print("Enter distance traveled: ");
                    distanceTraveled = sc.nextDouble();
                    break;
                case 4:
                    calculateTollFee();
                    System.out.println("Toll fee calculated.");
                    break;
                case 5:
                    generateBill();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        TollBoothBillGenerator tollBooth = new TollBoothBillGenerator();
        tollBooth.showMenu();
    }
}