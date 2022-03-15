public class Frequencies {
   public static void main(String[] args) {
      int[] a = { 10, 10, 20, 30, 30, 30 };
      printFreq(a);
   }

   static void printFreq(int[] a) {
      int freq = 1;
      int i = 1;
      while (i < a.length) {
         while (i < a.length && a[i] == a[i - 1]) {
            freq++;
            i++;
         }
         System.out.println(a[i - 1] + " " + freq);
         i++;
         freq = 1;
      }
   }
}
