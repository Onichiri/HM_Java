class HM_1_4 {
    public static void main(String[] args) {
        printColor();
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
}
