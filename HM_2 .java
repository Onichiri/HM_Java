/**
 * Java 1. Home work #2.
 * 
 * @autor Natalya
 * @version 13.2.2022
 */

class HM_2 {
    public static void main(String[] args) {
        System.out.println(between10and20(15, 8));
        isPositiveOrNegative();
        System.out.println(Negative(-2));
        MeowP();
    }

    static boolean between10and20(int summ1, int summ2) {
        return summ1 + summ2 >= 10 & summ1 + summ2 <= 20;
    }

    static void isPositiveOrNegative() {
        int number = 0;
        String isPositiveOrNegative = (number >= 0) ? "Число положительное" : "Число отрицательное";
        System.out.println(isPositiveOrNegative);
    }

    static boolean Negative(int number) {
        return number < 0;
    }

    static void MeowP() {
        String text = "Meow";
        for (int i = 7; i > 0; i--) {
            System.out.println(text);
        }
    }
}