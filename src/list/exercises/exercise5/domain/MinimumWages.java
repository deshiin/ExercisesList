package list.exercises.exercise5.domain;

import java.util.Scanner;

public class MinimumWages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double minimumWage = 1293.20;
        double salary;
        double howManyMinimumWages;

        while (true) {
            System.out.print("Enter your salary: ");

            if (input.hasNextInt() || input.hasNextDouble()){
                salary = input.hasNextInt() ? (double) input.nextInt() : input.nextDouble();

                break;
            } else {
                System.out.println("Please, enter a valid salary.");

                input.next();
            }
        }

        howManyMinimumWages = salary / minimumWage;
        System.out.printf("You have %.2f minimum wages.", howManyMinimumWages);
    }
}
