package list.exercises.exercise18.domain;

public class ToBeBigger {
    public static void main(String[] args) {
        /* O enunciado do exercício diz para calcular quanto tempo até Francisco ser maior que sara, porém ele já é
            que Sara, portanto, calculei quanto tempo até que Sara fique maior que Francisco.
         */

        int years = 0;
        double franciscoHeight = 150;
        double saraHeight = 110;
        int heightByYearFran = 2;
        int heightByYearSara = 3;

        while (saraHeight <= franciscoHeight) {
            franciscoHeight += heightByYearFran;
            saraHeight += heightByYearSara;
            years++;
        }

        System.out.println("It will be necessary " + years + " years for Sara to get bigger than Francisco.");
    }
}
