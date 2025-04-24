package list.exercises.exercise20.domain;

import list.exercises.GetValidData;

import java.util.Scanner;

public class ChooseYourMultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int targetValue = GetValidData.getInt(input, "Enter your number: ");

        System.out.println("The multiplication table for your number is: ");

        for (int i = 1; i < 11; i++) {
            int result = targetValue * i;
            System.out.println(targetValue + " x " + i + " = " + result);
        }
    }
}
