import java.util.Arrays;

public class Reversal {
   public static void main(String[] args) {
      int[] a = { 1, 2, 3, 4, 5 };
      System.out.println("Before-");
      System.out.println(Arrays.toString(a));
      leftRotate(a, 2,a.length);
      System.out.println("After--");
      System.out.println(Arrays.toString(a));
   }

   static void leftRotate(int[] a, int d,int n) {
      reverse(a, 0, d - 1);
      reverse(a, d, n - 1);
      reverse(a, 0, n - 1);
   }

   static void reverse(int[] a, int low, int high) {
      while (low < high) {
         int temp = a[low];
         a[low] = a[high];
         a[high] = temp;
         low++;
         high--;
      }
   }
}
