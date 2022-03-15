public class Solution {
   public static void main(String[] args) {
      int[] a = { 10, 5, 7, 30 };
      System.out.println("Before Reverse");
      for (int i = 0; i < a.length; i++) {
         System.out.print(a[i] + " ");
      }
      System.out.println();
      reverse(a);
      System.out.println("After Reverse");
      for (int i = 0; i < a.length; i++) {
         System.out.print(a[i] + " ");
      }
   }
   static void reverse(int[] a) {
      int low = 0, high = a.length - 1;
      while (low < high) {
         int temp = a[low];
         a[low] = a[high];
         a[high] = temp;
         low++;
         high--;
      }
   }
}
