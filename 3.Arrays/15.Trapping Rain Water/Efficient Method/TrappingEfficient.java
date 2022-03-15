public class TrappingEfficient {
   public static void main(String[] args) {
      int[] a = { 5, 0, 6, 2, 3 };
      System.out.println(getWater(a));
   }

   static int getWater(int[] a) {
      int res = 0;
      int[] lMax = new int[a.length];
      int[] rMax = new int[a.length];

      lMax[0] = a[0];
      for (int i = 1; i < a.length; i++) {
         lMax[i] = Math.max(a[i], lMax[i - 1]);
      }
      rMax[a.length - 1] = a[a.length - 1];
      for (int i = a.length - 2; i >= 0; i--) {
         rMax[i] = Math.max(a[i], rMax[i + 1]);
      }
      for (int i = 1; i < a.length - 1; i++) {
         res = res + (Math.min(lMax[i], rMax[i]) - a[i]);
      }
      return res;
   }
}
