// A lot of code in this GUI is reused from Project1
// Added third column and changed constructor to take 3 arguments

import java.awt.*;
import javax.swing.*;

public class WordGUI extends JFrame{
   /**
    * Constructor to construct a 3 column GUI that displays the arguments given
    * 
    * @param originalTextString Entirety of the original text inside the file
    * @param myUnsortedWordList Final UnsortedWordList to be displayed
    * @param mySortedWordList Final SortedWordList to be displayed
    */
   public WordGUI(String originalTextString, UnsortedWordList myUnsortedWordList, SortedWordList mySortedWordList){
      setTitle("Rakib Shahid Project2");
      // Set size and Layout
      setSize(800,400);
      setLayout(new GridLayout(1,3));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container myContentPane = this.getContentPane();

      // create first column with entirety of original file input
      TextArea originalText = new TextArea(originalTextString);

      // create other 2 columns
      TextArea unsortedList = new TextArea();
      TextArea sortedList = new TextArea();
       
      // Iterate through unsorted list and add each wordnode data to 2nd column
      WordNode unsortedNode = myUnsortedWordList.first; 
      while (unsortedNode != null) {
         unsortedList.append(unsortedNode.data+"\n");
         unsortedNode = unsortedNode.next;
      }

      // Iterate through sorted list and add each wordnode data to 2nd column
      WordNode sortedNode = mySortedWordList.first; 
      while (sortedNode != null) {
         sortedList.append(sortedNode.data+"\n");
         sortedNode = sortedNode.next;
      }
      

      // Add TextAreas to JFrame and display it
      myContentPane.add(originalText);
      myContentPane.add(unsortedList);
      myContentPane.add(sortedList);
      setVisible(true);
  }
   
}