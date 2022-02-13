class HM_2_1 {
    public static void main(String[] args) {
        System.out.println(between10and20(15, 8));
    }

    static boolean between10and20(int a, int b) {
        return a + b >= 10 & a + b <= 20;
    }
}