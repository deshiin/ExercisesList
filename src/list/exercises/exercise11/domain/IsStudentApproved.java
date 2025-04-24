package list.exercises.exercise11.domain;

import list.exercises.GetValidData;

import java.util.Scanner;

public class IsStudentApproved {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = GetValidData.getString(input, "Enter your name: ");
        double grade = 0;
        int i = 0;

        while (i < 4) {
            double x = GetValidData.getDouble(input, "Enter your " + (i + 1) + "º grade: ");
            if (x > 10 || x < 0) {
                System.out.println("Invalid grade value. Keep it between 0 and 10. Please, try again.");
            } else {
                grade += x;
                i++;
            }
        }

        grade /= 4;

        System.out.printf("Your average is %.2f.\n", grade);
        if (grade >= 7) {
            System.out.printf("Congratulations, %s!. You're approved.", name);
        } else {
            System.out.printf("Sorry, %s. You're reproved.", name);
        }
    }
}
