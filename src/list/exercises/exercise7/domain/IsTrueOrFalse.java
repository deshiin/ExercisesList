package list.exercises.exercise7.domain;

import list.exercises.GetValidData;

import java.util.Scanner;

public class IsTrueOrFalse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean value1 = GetValidData.getBoolean(input, "First value: ");
        boolean value2 = GetValidData.getBoolean(input, "Second value: ");

        if (value1 && value2) {
            System.out.println("Both values are true.");
        } else if (!value1 && !value2) {
            System.out.println("Both values are false.");
        } else {
            System.out.println("One value is different from the other.");
        }
    }
}
