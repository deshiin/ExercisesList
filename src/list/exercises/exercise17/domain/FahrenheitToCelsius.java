package list.exercises.exercise17.domain;

import list.exercises.GetValidData;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fahrenheit = GetValidData.getDouble(input, "Enter your fahrenheit temperature: ");
        double celsius = (5 * (fahrenheit - 32) / 9);

        System.out.printf("Fahrenheit: %.2f ºF\n", fahrenheit);
        System.out.printf("Celsius: %.2f ºC\n", celsius);
    }
}
