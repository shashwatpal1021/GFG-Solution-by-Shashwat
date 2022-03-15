class LeaderEfficient {
   public static void main(String[] args) {
      int[] a = { 7, 10, 4, 10, 6, 5, 2 };
      leaders(a);
   }

   static void leaders(int[] a) {
      int curr_ldr = a[a.length - 1];
      System.out.print(curr_ldr + " ");
      for (int i = a.length-2; i >= 0; i--) {
         curr_ldr = a[i];
         System.out.print(curr_ldr+" ");
      }
   }
}