public class Solution {
   public static void main(String[] args) {
      fun(3, 1);
   }

   static void fun(int n, int k) {
      if(n==0)
         return;
      System.out.print(k + " ");
      
      fun(n - 1, k + 1);
   }
}
