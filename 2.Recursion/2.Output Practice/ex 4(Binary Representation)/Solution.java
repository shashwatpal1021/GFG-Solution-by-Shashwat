public class Solution {
   public static void main(String[] args) {
      fun(11);
   }

   static void fun(int n) {
      if(n==0)
         return;
      fun(n / 2);
      System.out.println(n%2);
   }
}
