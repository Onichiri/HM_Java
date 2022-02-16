/**
 * Java 1. Home work #3.
 * 
 * @autor Natalya
 * @version 17.2.2022
 */

class HM_3 {
    public static void main(String[] args) {
        invertArray();
        to100();
        less6x2();
        diagonal();
        initValue();
    }

    static void invertArray() {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.print(arr[i] + 1 + " ");
            } else {
                System.out.print(arr[i] - 1 + " ");
            }
        }
        System.out.println();
    }

    static void to100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    static void less6x2() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                System.out.print(arr[i] * 2 + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    static void diagonal() {
        int[][] table = new int[5][5];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i == j | i + j == 4) {
                    table[i][j] = 1;
                    System.out.print(table[i][j] + " ");
                } else {
                    table[i][j] = 0;
                    System.out.print(table[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    static void initValue() {
        int len = 9;
        int initialValue = 9;
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
