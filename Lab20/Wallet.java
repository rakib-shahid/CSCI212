
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
        double sum = 0.00;
        MoneyNode m = walletContents.first;
        while (m != null) {
            if (m.data instanceof Bill){
                sum += ((Bill)(m.data)).getValue();
            }
            else{
                sum += ((Coin)(m.data)).getValue()/100.0;
            }
            m = m.next;
            
        }
        return Double.toString(sum);

    }
}