package list.exercises.exercise8.domain;

import list.exercises.GetValidData;

import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] valuesArr = new int[3];

        for (int i = 0; i < valuesArr.length; i++) {
            int value = GetValidData.getInt(input, "Enter your " + (i + 1) + "º"  + " number: ");

            valuesArr[i] = value;

            for (int j = 0; j < valuesArr.length; j++) {
                if(i != j && valuesArr[j] == valuesArr[i]) {
                    System.out.println("The values has to be different from each other.");

                    System.exit(1);
                }
           }
        }

        for (int i = 0; i < valuesArr.length; i++) {
            for (int j = i + 1; j < valuesArr.length; j++) {
                if (valuesArr[j] > valuesArr[i]) {
                    int temp = valuesArr[j];
                    valuesArr[j] = valuesArr[i];
                    valuesArr[i] = temp;
                }
            }
        }

        System.out.print("The numbers in descending order: ");
        for (int num : valuesArr) {
            System.out.print(num);
        }
    }
}