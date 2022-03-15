import java.util.Arrays;

public class Solution {
   public static void main(String[] args) {
      int[] a = { 1, 2, 3, 4, 5 };
      System.out.println("Before Rotation");
      System.out.println(Arrays.toString(a));
      lRotateOne(a);
      System.out.println(Arrays.toString(a));
   }

   static void lRotateOne(int[] a) {
      int temp = a[0];
      for (int i = 1; i < a.length; i++) {
         a[i - 1] = a[i];
      }
      a[a.length - 1] = temp;
   }
}
