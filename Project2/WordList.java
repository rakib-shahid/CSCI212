// note: I did this project before fully understanding dummy nodes so no dummy nodes are used
// project directions does not include node deletion so everything works as intended in the context of this project
// I will add dummy nodes when necessary in future projects

public class WordList {
   // first node in list
   public WordNode first = new WordNode(null);
   // last node in list
	public WordNode last = first;
   // length of list
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