
public class Bill extends Money{
    private int dollars;
    
    public Bill (int d) {
      int[] validValues = {1,5,10,20,50,10};
      boolean isValid = false;
      for (int x : validValues){
         if (x == d){
            isValid = true;
         }
      }
      if (isValid) {
         dollars = d;
      } else {
         throw new IllegalBillException("Bill value of "+d+" invalid!");
      }
    }
    public int getValue () {
       return dollars;
    }
    public String toString(){
      return "$ "+dollars+".00";
    }
 }