public class Solution {
   public static void main(String[] args) {
      int n = 4;
      printToN(n);
   }

   static void printToN(int n) {
      if(n==0)
         return;
      System.out.println(n + " ");
      printToN(n-1);
   }
}
