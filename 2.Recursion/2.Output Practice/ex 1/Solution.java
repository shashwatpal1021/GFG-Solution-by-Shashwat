public class Solution {
   public static void main(String[] args) {
      fun(4);
   }

   static void fun(int n) {
      if(n==0)
         return;

      fun(n - 1);
      System.out.println(n);
      fun(n - 1);
   }
}
