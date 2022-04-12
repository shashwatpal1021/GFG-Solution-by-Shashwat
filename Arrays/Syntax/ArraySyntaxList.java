package Arrays.Syntax;

import java.util.ArrayList;

public class ArraySyntaxList {
   public static void main(String[] args) {
      ArrayList<Integer> al = new ArrayList<>();

      for (int i = 0; i < 100; i++) {
         al.add(i);
      }
      System.out.println(al);
   }
}
