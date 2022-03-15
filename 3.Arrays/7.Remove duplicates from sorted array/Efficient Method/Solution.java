import java.util.Arrays;


public class Solution {
   public static void main(String[] args) {
      int[] a = { 10, 20, 20, 30, 30, 30 };
      System.out.println("Before");
      System.out.println(Arrays.toString(a));
      remDups(a);
      System.out.println("After");
      System.out.println(Arrays.toString(a));
   }

   static int remDups(int[] a) {
      int res = 1;
      for (int i = 1; i < a.length; i++) {
         if (a[res - 1] != a[i]) {
            a[res] = a[i];
            res++;
         }
      }
      return res;
   }
}
