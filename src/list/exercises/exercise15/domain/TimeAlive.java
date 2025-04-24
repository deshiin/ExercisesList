package list.exercises.exercise15.domain;

import list.exercises.GetValidData;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class TimeAlive {
    public static void main(String[] args) {
        /*
            O enunciado pede para retornar os anos, meses e dias de vida da pessoa, porém se for pedido apenas o ano
            se torna um cálculo impossível. Resolvi pedir todas as informações para chegar a resposta desejada.
         */

        Scanner input = new Scanner(System.in);

        int yearOfBirth = GetValidData.getInt(input, "Enter your year of birth: ");
        int monthOfBirth = GetValidData.getInt(input, "Enter your month of birth: ");
        int dayOfBirth = GetValidData.getInt(input, "Enter your day of birth: ");

        LocalDate currentDate = LocalDate.now();
        LocalDate userAge = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);

        Period difference = Period.between(userAge, currentDate);

        System.out.println(difference.getYears() + " years, " + difference.getMonths() + " months, " +
            difference.getDays() + " days of life."
        );

    }
}
