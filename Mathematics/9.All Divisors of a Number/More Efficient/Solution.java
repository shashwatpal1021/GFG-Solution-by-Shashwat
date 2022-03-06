public class Solution {
   public static void main(String[] args) {
      int n = 25;
      printDivisor(n);
   }

   static void printDivisor(int n) {
      for (int i = 1; i * i <= n; i++) {
         if (n % i == 0) {
            System.out.print(i + " ");
            if (i != n / i) {
               System.out.print((n/i)+" ");
            }
         }
      }
   }  
}
