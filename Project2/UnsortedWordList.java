public class UnsortedWordList extends WordList{

   /**
    * Append method that adds a given node to end of an unsorted list
    * @param node given node to be appended
    */

   // append method is only included here because project directions are vague,
   // overridden to include it but no changes made from append method in WordList
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