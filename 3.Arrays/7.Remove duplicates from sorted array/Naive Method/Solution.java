import java.util.Arrays;

public class Solution {
   public static void main(String[] args) {
      int[] a = { 10, 20, 20, 30, 30, 30 };
      System.out.println("Before Removal");
      System.out.println(Arrays.toString(a));
      remDups(a);
      System.out.println("After Removal duplicates");
      System.out.println(Arrays.toString(a));
   }

   static int remDups(int[] a) {
      int[] temp = new int[a.length];
      temp[0] = a[0];
      int res = 1;
      for (int i = 1; i < a.length; i++) {
         if (temp[res - 1] != a[i]) {
            temp[res] = a[i];
            res++;
         }
      }
      for (int i = 0; i < temp.length; i++) {
         a[i] = temp[i];
      }
      return res;
   }
}
