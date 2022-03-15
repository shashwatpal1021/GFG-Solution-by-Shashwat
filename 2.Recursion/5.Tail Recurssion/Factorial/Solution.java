public class Solution {
   public static void main(String[] args) {
      System.out.println(fact(3, 1));//using tail recursion
   }

   static int fact(int n, int k) {
      if(n==0 || n==1)
         return k;

      return fact(n - 1, k * n);
   }
}
