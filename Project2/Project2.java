import java.util.Scanner;

public class Project2{
   public static void main(String[] args) {

      // Set up sorted and unsorted word list objects
      UnsortedWordList myUnsortedWordList = new UnsortedWordList();
      SortedWordList mySortedWordList = new SortedWordList();

      // Set up TextFileInput for input
      TextFileInput myFile = new TextFileInput("input.txt");
      String fileNextLine = myFile.readLine();
      // Split line into word array
      String[] wordArray = fileNextLine.split(" ");
      // variable to hold entirety of original file input (left column of WordGUI)
      String originalText = "";

      // read in file input
      while (fileNextLine != null){
         originalText += fileNextLine + "\n";
         wordArray = fileNextLine.split(" ");

         // adds each word to an UnsortedWordList as a WordNode
         for (String s : wordArray){
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