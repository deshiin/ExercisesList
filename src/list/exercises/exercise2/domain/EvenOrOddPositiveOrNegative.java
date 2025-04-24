package list.exercises.exercise2.domain;

import list.exercises.GetValidData;

import java.util.Scanner;

public class EvenOrOddPositiveOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = GetValidData.getInt(input, "Enter a number: ");

        if (x % 2 == 0) {
            if (x >= 0) {
                System.out.println("Your number is even and positive.");
            } else {
                System.out.println("Your number is even and negative.");
            }
        } else {
            if (x >= 0) {
                System.out.println("Your number is odd and positive.");
            } else {
                System.out.println("Your number is odd and negative.");
            }
        }
    }
}
