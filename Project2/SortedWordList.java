import javax.swing.SpinnerDateModel;

public class SortedWordList extends WordList {

   public void add(String string) {
      if (this.first.data == null) {
         System.out.println("First was null, now set to " + string);
         this.first = new WordNode(string);
         this.last = this.first;
      } else {
         WordNode tempNode = new WordNode(string);
         WordNode comparisonNode = this.first;
         if (){
            
         }
         while (string.compareToIgnoreCase(comparisonNode.data) > 0) {
            comparisonNode = comparisonNode.next;
         }
      }
      this.length++;
   }
}