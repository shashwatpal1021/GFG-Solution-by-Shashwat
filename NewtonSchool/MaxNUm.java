package NewtonSchool;

import java.io.InputStream;
import java.io.*;
import java.util.*;

public class MaxNUm {
   public static void main(String[] args) {
      // System.in and System.out are input and output streams, respectively.
      InputStream inputStream = System.in;

      InputReader s = new InputReader(inputStream);

      // Read the number of test casese.
      int T = s.nextInt();
      while (T-- > 0) {
         
         
      }
   }

   static class InputReader {
      public BufferedReader reader;
      public StringTokenizer tokenizer;

      public InputReader(InputStream stream) {
         reader = new BufferedReader(new InputStreamReader(stream), 32768);
         tokenizer = null;
      }

      public String next() {
         while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
               tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
               throw new RuntimeException(e);
            }
         }
         return tokenizer.nextToken();
      }

      public int nextInt() {
         return Integer.parseInt(next());
      }
   }

}