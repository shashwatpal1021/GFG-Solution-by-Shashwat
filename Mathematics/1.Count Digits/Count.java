public class Count {
   public static void main(String[] args) {
      int num = 789;
      System.out.println(numOfDigits(num));
   }
   static int numOfDigits(int x) {
      int res = 0;
      while (x > 0) {
         x = x / 10;
         res++;
      }
      return res;
    }
}
