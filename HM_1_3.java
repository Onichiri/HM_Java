class HM_1_3 {
   public static void main(String[] args) {
      checkSumSign();
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
}
