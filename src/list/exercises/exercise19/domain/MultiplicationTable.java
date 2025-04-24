package list.exercises.exercise19.domain;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------");
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                int result = j * i;
                System.out.println(j + " x " + i + " = " + result);
            }
            System.out.println("------------------------------------------------------");
        }
    }
}
