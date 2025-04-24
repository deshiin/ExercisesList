package list.exercises.exercise22.domain;

import list.exercises.GetValidData;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dividend = GetValidData.getInt(input, "Enter your dividend: ");
        int divisor = GetValidData.getInt(input, "Enter your divisor: ");

        System.out.println("----------------------------------------");

        System.out.println("Quotient = " + (dividend / divisor));
        System.out.println("Modulus = " + (dividend % divisor));
    }
}
