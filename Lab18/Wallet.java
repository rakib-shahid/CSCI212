
public class Wallet {
    private MoneyList walletContents = new MoneyList();
    
    public Wallet(){
        walletContents.append(null);
    }
    public void addToWallet(Money m){
        
    }
    public void print () {
        String finalOut = "";
        MoneyNode tNode = walletContents.first;
        while (tNode.next.data != null){
            if (tNode.data.contains("B")){
                finalOut += "$ "+tNode.data.substring(1)+".00";
            }
            else {
                finalOut += "$ 0."+tNode.data.substring(1);
            }
            tNode = tNode.next;
        }
        System.out.println(finalOut);
    }
    public String getValue() {
        return "";
        
    }
    
  }