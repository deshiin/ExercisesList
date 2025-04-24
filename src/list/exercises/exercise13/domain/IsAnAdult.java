package list.exercises.exercise13.domain;

import list.exercises.GetValidData;

import java.util.Scanner;

public class IsAnAdult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = GetValidData.getString(input, "Enter your name: ");
        int age = GetValidData.getInt(input, "Enter your age: ");

        System.out.println("Name: " + name);

        if (age >= 18) {
            System.out.println("You are of legal age.");
        } else {
            System.out.println("You are a minor.");
        }
    }
}
