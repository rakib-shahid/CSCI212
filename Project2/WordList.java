public class WordList {
   public WordNode first = new WordNode(null);

	public WordNode last = first;

   protected int length = 0;

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