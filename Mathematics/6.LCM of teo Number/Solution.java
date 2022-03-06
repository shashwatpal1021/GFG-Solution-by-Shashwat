public class Solution {
   public static void main(String[] args) {
      int a = 4, b = 6;
      System.out.println(lcm(a, b));
      System.out.println(gcd(a,b));
   }

   static int gcd(int a, int b) {
      if (b == 0)
         return a;
      return gcd(b, a % b);
   }

   static int lcm(int a, int b) {
      return (a * b) / gcd(a, b);
   }
}
