package list.exercises.exercise6.domain;

import list.exercises.GetValidData;

import java.util.Scanner;

public class ValueAdjustment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int value = GetValidData.getInt(input, "Enter a random integer: ");
        double readjustedValue = value * 1.05;

        System.out.println(value + " + 5% = " + readjustedValue);
    }
}
