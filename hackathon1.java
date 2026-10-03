import java.util.*;

public class hackathon1 {

    // 3c) Methods
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3a) Data Types
        int vehicleNumber = 123;
        double wasteCollectedinKg = 20.5;
        int noOfCollectionPoints = 5;
        char vehicleStatus = 'A';

        // Displaying 3a details
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected (kg): " + wasteCollectedinKg);
        System.out.println("Number of Collection Points: " + noOfCollectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
        System.out.println();

        //3b) If-Else Condition
        System.out.print("Enter Waste Collected in KG: ");
        double wasteCollected = sc.nextDouble(); 

        if (wasteCollected >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }
        System.out.println();

        // 3c) Methods
        System.out.print("Enter waste collected at Point 1: ");
        double point1 = sc.nextDouble();

        System.out.print("Enter waste collected at Point 2: ");
        double point2 = sc.nextDouble();

        double totalWaste = calculateTotalWaste(point1, point2);
        System.out.println("Total waste collected: " + totalWaste + " kg");

        sc.close();
    }
}