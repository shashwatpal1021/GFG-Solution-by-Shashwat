package Arrays.Syntax;

import java.util.ArrayList;

public class EnsureCap {
   public static void main(String[] args) {
      ArrayList<Integer> al = new ArrayList<>();

      al.ensureCapacity(100);

      for (int i = 1; i <= 100; i++) {
         al.add(i);
      }
      System.out.println(al);
   }
}
