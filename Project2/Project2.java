/***************************************************************
 * 
 * @author Rakib Shahid
 *         A program that takes file input, sorts each word and displays it in 3 columns in a GUI
 *
 */

public class Project2 {
   /**
    * Main method that reads file input and sorts it, then displays in GUI
    * @param args String of args (not used in Project2)
    */
   public static void main(String[] args) {

      // Set up sorted and unsorted word list objects
      UnsortedWordList myUnsortedWordList = new UnsortedWordList();
      SortedWordList mySortedWordList = new SortedWordList();

      // Set up TextFileInput for fileinput
      TextFileInput myFile = new TextFileInput("input.txt");
      // read first line of file
      String fileNextLine = myFile.readLine();

      // variable to hold entirety of original file input (left column of WordGUI)
      String originalText = "";

      // read in file input
      while (fileNextLine != null) {
         // add text to originalText to display in first column
         originalText += fileNextLine + "\n";

         // Split line into array of words
         String[] wordArray = fileNextLine.split(" ");

         // for each word, create a new WordNode and:
         //    -append it to unsorted word list
         //    -add it to sorted word list
         for (String s : wordArray) {
            WordNode temp = new WordNode(s);
            myUnsortedWordList.append(temp);
            mySortedWordList.add(s);
         }
         fileNextLine = myFile.readLine();
      }


      // display GUI
      WordGUI myGUI = new WordGUI(originalText, myUnsortedWordList, mySortedWordList);

   }

}