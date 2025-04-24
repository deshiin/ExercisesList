package list.exercises.exercise14.domain;

import list.exercises.GetValidData;

import java.util.Scanner;

public class Substitution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = GetValidData.getString(input, "Enter the value of A: ");
        String b = GetValidData.getString(input, "Enter the value of B: ");
        String temp = a;

        System.out.println("\nBefore the substitution: \n");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        a = b;
        b = temp;

        System.out.println("\nAfter the substitution: \n");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}
