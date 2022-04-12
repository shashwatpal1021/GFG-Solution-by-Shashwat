package Arrays;
import java.util.Arrays;


public class Reverse {
   public static void main(String[] args) {

      int[] arr = { 10, 5, 7, 30 };
      System.out.println("Before Reverse");

      System.out.println(Arrays.toString(arr));
      System.out.println();
      reverse(arr);
      System.out.println("After reverse");
      System.out.println(Arrays.toString(arr));
   }

   static void reverse(int[] arr) {
      int l = 0, h = arr.length - 1;

      while (l < h) {
         int temp = arr[l];
         arr[l] = arr[h];
         arr[h] = temp;
         l++;
         h--;
      }
   }
}
