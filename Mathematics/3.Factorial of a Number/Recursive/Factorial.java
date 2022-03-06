public class Factorial {
   public static void main(String[] args) {
      int num = 5;
      System.out.println(fact(num));
   }

   static int fact(int x) {
      if (x == 0)
         return 1;
      return x * fact(x - 1);
   }
}
