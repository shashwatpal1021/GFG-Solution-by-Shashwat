public class Solution {
   public static void main(String[] args) {
      fun1(2);
   }

   static void fun1(int n) {
      if(n==0)
         return;
      System.out.println("Hi Shashwat");
      fun1(n-1);
   }
}
