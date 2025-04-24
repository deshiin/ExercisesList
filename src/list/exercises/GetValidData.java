package list.exercises;

import java.math.BigDecimal;
import java.util.Scanner;

public class GetValidData {
    public static int getInt(Scanner input, String message) {
        while (true) {
            System.out.print(message);
            if (input.hasNextInt()) {
                return input.nextInt();
            } else {
                System.out.println("Only integers are acceptable. Please, try again.");

                input.next();
            }
        }
    }

    public static double getDouble(Scanner input, String message) {
        while (true) {
            System.out.print(message);
            if (input.hasNextDouble()) {
                return input.nextDouble();
            } else {
                System.out.println("Only a valid double value is accepted. Please, try again.");

                input.next();
            }
       }
    }

    public static boolean getBoolean(Scanner input, String message) {
        while (true) {
            System.out.print(message);
            if (input.hasNextBoolean()) {
                return input.nextBoolean();
            } else {
                System.out.println("Only boolean values(true and false) are acceptable. Please, try again.");

                input.next();
            }
        }
    }

    public static String getString(Scanner input, String message) {
        System.out.print(message);
        return input.nextLine();
    }

    public static BigDecimal getBigDecimal(Scanner input, String message) {
        while (true) {
            System.out.print(message);
            if (input.hasNextBigDecimal()) {
                return input.nextBigDecimal();
            } else {
                System.out.println("Only valid monetary values are accepted. Please try again.");

                input.next();
            }
        }
    }
}
