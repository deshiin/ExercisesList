package list.exercises.exercise23.domain;

import list.exercises.GetValidData;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigDecimal salaryByHour = GetValidData.getBigDecimal(input, "Enter your salary by hour: ");
        int classesMonthly = GetValidData.getInt(input, "Enter how many classes you have in a month: ");

        BigDecimal fgtsDiscount = new BigDecimal("8").divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);
        BigDecimal salaryMonthly = salaryByHour.multiply(new BigDecimal(classesMonthly));
        BigDecimal salaryAfterDiscount = salaryMonthly.subtract(salaryMonthly.multiply(fgtsDiscount));

        System.out.println("\n                Pay Stub");
        System.out.println("----------------------------------------------");
        System.out.printf("Salary by hour: %s\n", salaryByHour);
        System.out.printf("Salary monthly: %s\n", salaryMonthly);
        System.out.println("----------------------------------------------");
        System.out.println("                Discounts\n");
        System.out.println("FGTS: " + fgtsDiscount.multiply(salaryMonthly));
        System.out.println("----------------------------------------------");
        System.out.println("Net salary: " + salaryAfterDiscount);
    }
}
