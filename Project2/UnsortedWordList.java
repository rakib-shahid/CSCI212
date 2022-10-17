public class UnsortedWordList extends WordList{

   @Override
   public void append(WordNode node){
      if (this.first.data == null){
         this.first = node;
         this.last = this.first;
      }
      else {
         this.last.next = node;
         this.last = node;
      }
      this.length++;
   }
}