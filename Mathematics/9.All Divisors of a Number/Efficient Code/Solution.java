public class Solution {
   public static void main(String[] args) {
      int n = 15;
      printDivisor(n);
   }

   static void printDivisor(int n) {
      int i = 1;
      for (i = 1; i * i < n; i++) {
         if (n % i == 0) {
            System.out.print(i + " ");
         }
      }
      for (; i >= 1; i--) {
         if (n % i == 0) {
            System.out.print((n/i)+" ");
         }
      }
   }
}
