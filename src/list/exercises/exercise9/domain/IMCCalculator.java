package list.exercises.exercise9.domain;

import list.exercises.GetValidData;

import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight = GetValidData.getDouble(input, "Enter your weight (kg): ");
        double height = (double) GetValidData.getInt(input, "Enter your height (cm): ") / 100;

        double imc = weight / (height * height);


        System.out.printf("Your BMI is " + String.format("%.2f", imc) + " and is classified as ");
        if (imc < 18.5) {
            System.out.print("underweight.");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.print("ideal weight.");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.print("slightly overweight.");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.print("class 1 obesity.");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.print("class 2 obesity.");
        } else {
            System.out.print("class 3 obesity.");
        }
    }
}
