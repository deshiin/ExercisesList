package list.exercises.exercise3.domain;

import list.exercises.GetValidData;

import java.util.Scanner;

public class IfIsEqual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = GetValidData.getInt(input, "Enter the value of A: ");
        int b = GetValidData.getInt(input, "Enter the value of B: ");
        int c;

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }

        System.out.println(c);
    }
}
