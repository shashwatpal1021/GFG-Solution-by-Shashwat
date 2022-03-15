// TC:O(2^n)
// SC:O(1)

// Author: Shashwat Pal

public class Recursive {
   public static void main(String[] args) {
      int num = 30;
      System.out.println(fact(num));
   }

   static int fact(int x) {
      if (x == 0)
         return 1;
      return x * fact(x - 1);
   }
}
