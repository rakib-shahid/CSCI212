public class SortedWordList extends WordList {

   /**
    * add method, inserts WordNode into SortedWordList in correct position
    * @param string The string to be inserted
    */
   public void add(String string) {

      // check if this list is empty, if empty make new node this list's first node
      if (this.first.data == null) {
         this.first = new WordNode(string);
         this.last = this.first;
      } 
      else {
         // create a new node using given string for adding to the sorted list
         WordNode tempNode = new WordNode(string);
         
         // prepend if the new node is less than existing first node
         if (this.first.data.compareToIgnoreCase(string) > 0) {
            tempNode.next = this.first;
            this.first = tempNode;
         } 
         // append if the new node is greater than existing last node
         else if (string.compareToIgnoreCase(this.last.data) > 0) {
            this.append(tempNode);
         } 
         
         // else find the proper position for the new node within the list
         else {
            // create a new node to iterate through the list and find the right spot for the new node
            WordNode tempIterateNode = this.first;

            // boolean to check if the correct spot has been found
            Boolean check = tempIterateNode.data.compareToIgnoreCase(string) <= 0
                  &&
                  tempIterateNode.next.data.compareToIgnoreCase(string) >= 0;

            // until correct spot has been found iterate through the list
            while (!check) {
               tempIterateNode = tempIterateNode.next;
               // update the boolean in each iteration
               check = tempIterateNode.data.compareToIgnoreCase(string) <= 0
                     &&
                     tempIterateNode.next.data.compareToIgnoreCase(string) >= 0;
            }

            // insert the new node into the correct spot
            tempNode.next = tempIterateNode.next;
            tempIterateNode.next = tempNode;
         }
      }
      // update the length of the list
      this.length++;
   }
}