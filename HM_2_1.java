/**
 * Java 1. Home work #2.
 * 
 * @autor Natalya
 * @version 13.2.2022
 */

class HM_2_1 {
    public static void main(String[] args) {
        System.out.println(between10and20(15, 8));
    }

    static boolean between10and20(int summ1, int summ2) {
        return summ1 + summ2 >= 10 & summ1 + summ2 <= 20;
    }
}