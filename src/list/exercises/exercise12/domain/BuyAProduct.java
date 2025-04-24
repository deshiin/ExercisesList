package list.exercises.exercise12.domain;

import list.exercises.GetValidData;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BuyAProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigDecimal valueToBePaid = GetValidData.getBigDecimal(input, "Enter the product value: ");

        System.out.println("------------------------------");
        System.out.println("1 - Payment in cash or Pix, receive a 15% discount.");
        System.out.println("2 - Payment in cash by credit card, receive a 10% discount.");
        System.out.println("3 - Paid in two interest-free installments at the regular price.");
        System.out.println("4 - Paid in three or more installments, regular product price plus 10% interest");
        System.out.println("------------------------------");

        System.out.println();

        int formOfPayment;
        while (true) {
            formOfPayment = GetValidData.getInt(input, "Enter the form of payment(1 - 4): ");
            if (formOfPayment >= 1 && formOfPayment <= 4) {
                break;
            } else {
                System.out.println("Invalid option. Please, try again.");
            }
        }

        System.out.println();

        switch (formOfPayment) {
            case 1:
                valueToBePaid = valueToBePaid.multiply(new BigDecimal("0.85"));

                System.out.println("Form of payment: In cash or Pix.");
                System.out.println("Total value: R$" + valueToBePaid);

                break;
            case 2:
                valueToBePaid = valueToBePaid.multiply(new BigDecimal("0.90"));

                System.out.println("Form of payment: In cash by credit card.");
                System.out.println("Total value: R$" + valueToBePaid);

                break;
            case 3:
                BigDecimal portionValue = valueToBePaid.divide(new BigDecimal("2"), 2, RoundingMode.HALF_UP);

                System.out.println("Form of payment: In two interest-free installments.");
                System.out.print("Total value: R$" + valueToBePaid);
                System.out.print(" in two installments of R$" + portionValue);

                break;
            case 4:
                BigDecimal interest = valueToBePaid.multiply(new BigDecimal("0.90"));
                BigDecimal difference = valueToBePaid.subtract(interest);

                System.out.println("Form of payment: In three or more installments, regular price plus 10% interest.");
                System.out.println("Regular price: R$" + valueToBePaid);
                System.out.println("10% interest: R$" + difference);

                valueToBePaid = valueToBePaid.add(difference);

                System.out.println("Total value: R$" + valueToBePaid);

                break;
        }
    }
}
