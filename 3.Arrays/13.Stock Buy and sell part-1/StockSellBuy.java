public class StockSellBuy {
   public static void main(String[] args) {
      int[] a = { 1, 5, 3, 8, 12 };
      System.out.println(maxProfit(a, 0, a.length));

   }

   static int maxProfit(int[] price, int start, int end) {
      if(end <= start)
         return 0;
      
      int profit = 0;

      for (int i = start; i < end; i++) {
         for (int j = i + 1; j < end; j++) {
            if (price[j] > price[i]) {
               int curr_profit = price[j] - price[i] + maxProfit(price, start, i - 1) + maxProfit(price, j + 1, end);

               profit = Math.max(profit, curr_profit);
            }
         }
      }
      return profit;
   }
}
