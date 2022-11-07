
public class MoneyMain {

   static String[] dataSource = { "B5", "Q", "B20", "Q" };
   static Money[] wallet = new Money[dataSource.length];

   public static void main(String[] args) {

      for (int i = 0; i < dataSource.length; i++) {
         char dataItem = dataSource[i].charAt(0);
         if (dataItem == 'B') {
            int billValue = Integer.parseInt(dataSource[i].substring(1, dataSource[i].length()));
            wallet[i] = new Bill(billValue);
         } else if (dataItem == 'Q')
            wallet[i] = new Quarter();
      }
      printWallet();
      sumWallet();
   }

   public static void printWallet() {
      for (int i = 0; i < wallet.length; i++) {
         if (wallet[i] instanceof Bill)
            System.out.println(wallet[i]);
         else
            System.out.println(wallet[i]);

      }
   }

   public static void sumWallet() {
      int cTotal = 0;
      int bTotal = 0;
      for (int i = 0; i < wallet.length; i++) {
         if (wallet[i] instanceof Bill)
            bTotal += (((Bill)wallet[i]).getValue());
         else
            cTotal += ((Coin)wallet[i]).getValue();
      }
      if (cTotal >= 100){
         bTotal += cTotal / 100;
         cTotal %= 100;
      }
      System.out.println("Wallet sum = $ "+bTotal+"."+cTotal);
   }
}