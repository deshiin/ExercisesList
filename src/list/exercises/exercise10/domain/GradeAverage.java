package list.exercises.exercise10.domain;

import list.exercises.GetValidData;

import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double grade = 0;

        for (int i = 0; i < 3; i++) {
            double x = GetValidData.getDouble(input, "Enter your " + (i + 1) + "º grade: ");
            grade += x;
        }

        grade = grade / 3;
        System.out.println("The average grade is " + String.format("%.2f", grade) + ".");
    }
}
