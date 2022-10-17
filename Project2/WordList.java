public class WordList {
   public WordNode first = new WordNode(null);

	public WordNode last = first;

   protected int length = 0;

   /**
    * append method that adds the new node to the end of the list
    * @param node new node to be appended
    */
   public void append(WordNode node){
      if (this.first.data == null){
         this.first = node;
         this.last = this.first;
      }
      else {
         this.last.next = node;
         this.last = node;
      }
      length++;
   }

   /**
    * method that returns the length of the list
    * @return length of the list
    */
   public int getLength() {
		return length;
	}

   public String toString() {
		WordNode p = first;
		String returnString = "";
		while (p != null) {
			returnString += p.data + " ";
			p = p.next;
		}
		return returnString;
	}
}