package list.exercises.exercise1.domain;

import list.exercises.GetValidData;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = GetValidData.getInt(input, "Enter the value of A: ");
        int b = GetValidData.getInt(input, "Enter the value of B: ");
        int c = GetValidData.getInt(input, "Enter the value of C: ");

        System.out.println("-------------------------------");

        System.out.println("A + B = " + (a + b));

        if (a + b > c) {
            System.out.println("C is less than A + B.");
        } else if (a + b == c) {
            System.out.println("C is equal to A + B.");
        } else {
            System.out.println("C is greater than A + B.");
        }
    }
}