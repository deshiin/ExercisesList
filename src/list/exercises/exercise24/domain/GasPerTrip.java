package list.exercises.exercise24.domain;

import list.exercises.GetValidData;

import java.util.Scanner;

public class GasPerTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distance = GetValidData.getDouble(input, "Enter the distance in km of the trip: ");
        double averageSpeed = GetValidData.getDouble(input, "Enter the average speed of the road: ");
        int kmPerLiter = 12;

        double time = distance / averageSpeed;
        double totalLiters = distance / kmPerLiter;

        System.out.printf("The total time of the trip will be of %.2f hours.\n", time);
        System.out.printf("The total of liters spent will be of %.2f liters.", totalLiters);
    }
}
