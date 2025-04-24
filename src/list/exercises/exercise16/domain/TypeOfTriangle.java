package list.exercises.exercise16.domain;

import list.exercises.GetValidData;

import java.util.Scanner;

public class TypeOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sideA = GetValidData.getInt(input, "Enter your first triangle side: ");
        int sideB = GetValidData.getInt(input, "Enter your second triangle side: ");
        int sideC = GetValidData.getInt(input, "Enter your third triangle side: ");

        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            if (sideA == sideB && sideA == sideC) {
                System.out.println("The triangle is equilateral.");
            } else if (sideA != sideB && sideA != sideC && sideB != sideC) {
                System.out.println("The triangle is a scalene.");
            } else {
                System.out.println("The triangle is a isosceles.");
            }
        } else {
            System.out.println("The triangle is invalid.");
        }
    }
}
