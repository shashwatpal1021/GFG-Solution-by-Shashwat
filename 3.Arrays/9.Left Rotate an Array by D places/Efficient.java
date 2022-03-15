import java.util.Arrays;

public class Efficient {
   public static void main(String[] args) {
      int[] a = { 1, 2, 3, 4, 5 };
      System.out.println("Before-");
      System.out.println(Arrays.toString(a));
      leftRotate(a, 2);
      System.out.println("after-");
      System.out.println(Arrays.toString(a));
   }

   static void leftRotate(int[] a, int d) {
      int[] temp = new int[d];
      for (int i = 0; i < d; i++) {
         temp[i] = a[i];
      }
      for (int i = d; i < a.length; i++) {
         a[i - d] = a[i];
      }
      for (int i = 0; i < d; i++) {
         a[a.length - d + i] = temp[i];
      }
   }
}
