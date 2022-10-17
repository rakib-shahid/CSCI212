public class WordNode
{
   public String data;
   public WordNode next;

   // default constructor
   public WordNode(){
      data = null;
      next = null;
   }

   /**
    * Constructor to create a WordNode given a string
    * @param d String, becomes data value of the WordNode
    */
   public WordNode(String d)
   {
      data = d;
      next = null;
   }  // constructor
}  // class ShortNode
