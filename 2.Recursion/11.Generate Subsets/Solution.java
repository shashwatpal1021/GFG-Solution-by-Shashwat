public class Solution {
   public static void main(String[] args) {
      String str = "ABC";
      printSub(str, "", 0);
   }

   static void printSub(String str, String res, int index) {
      if (index == str.length()) {
         System.out.print(res + " ");
         return;
      }
      printSub(str, res, index + 1);
      printSub(str, res+str.charAt(index), index+1);
   }
}
