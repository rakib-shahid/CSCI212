
public class Wallet {
    private MoneyList walletContents = new MoneyList();

    public Wallet() {

    }

    public void addToWallet(Money m) {
        walletContents.append(m);
    }

    public void print() {
        MoneyNode m = walletContents.first;
        while (m != null) {
            if (m.data instanceof Bill){
                System.out.println(m.data);
            }
            else{
                System.out.println(m.data);
            }
            m = m.next;
            
        }
    }

    public String getValue() {
        int coinSum = 0;
        int billSum = 0;
        MoneyNode m = walletContents.first;
        while (m != null) {
            if (m.data instanceof Bill){
                billSum += ((Bill)(m.data)).getValue();
            }
            else{
                coinSum += ((Coin)(m.data)).getValue();
            }
            m = m.next;
            
        }
        return billSum+"."+coinSum;

    }
}