public class Solution {
   public static void main(String[] args) {
      fun(3);
   }

   static void fun(int n) {
      if(n==0)
         return;

      System.out.print(n + " ");
      fun(n - 1);
   }
}
