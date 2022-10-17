import java.awt.*;
import javax.swing.*;

public class WordGUI extends JFrame{
   public WordGUI(String originalTextString, UnsortedWordList myUnsortedWordList, SortedWordList mySortedWordList){
      setTitle("Rakib Shahid Project1");
      // Set size and Layout
      setSize(800,400);
      setLayout(new GridLayout(1,3));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container myContentPane = this.getContentPane();
      TextArea originalText = new TextArea(originalTextString);
      TextArea unsortedList = new TextArea();
      TextArea sortedList = new TextArea();
      
      WordNode unsortedNode = myUnsortedWordList.first; 
      while (unsortedNode != null) {
         unsortedList.append(unsortedNode.data+"\n");
         unsortedNode = unsortedNode.next;
      }

      WordNode sortedNode = mySortedWordList.first; 
      while (sortedNode != null) {
         sortedList.append(sortedNode.data+" \t\ttesting sorted\n");
         sortedNode = sortedNode.next;
      }
      

      // Add TextAreas to JFrame and display it
      myContentPane.add(originalText);
      myContentPane.add(unsortedList);
      myContentPane.add(sortedList);
      setVisible(true);
  }
   
}