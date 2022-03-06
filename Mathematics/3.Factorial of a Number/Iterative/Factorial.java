public class Factorial {
   public static void main(String[] args) {
      int num = 4;
      System.out.println(fact(num));
   }

   static int fact(int x) {
      int res = 1;
      for (int i = 2; i <= x; i++) {
         res *= i;
      }
      return res;
   }
}
