public class HM_1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 0;
        int b = 0;
        if (a + b > 0) {
            System.out.println("Сумма положительная");
        }
        if (a + b < 0) {
            System.out.println("Сумма отрицательная");
        }
        if (a + b == 0) {
            System.out.println("Сумма равна 0");
        }
    }

    public static void printColor() {
        int value = 0;

        if (value > 100) {
            System.out.println("Зеленый");
        } else if (value > 0) {
            System.out.println("Желтый");
        } else {
            System.out.println("Красный");
        }
    }

    public static void compareNumbers() {
        int a = 0;
        int b = 0;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
