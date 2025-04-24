package list.exercises.exercise4.domain;

import list.exercises.GetValidData;

import java.util.Scanner;

public class PredecessorAndSuccessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = GetValidData.getInt(input, "Enter an integer: ");

        System.out.println("Predecessor: " + (x - 1));
        System.out.println("Successor: " + (x + 1));
    }
}
