import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class FileMenuHandler implements ActionListener {
   public ArrayList<WordLine> fileText = new ArrayList<>();
   JFrame jframe;

   /**
    * Constructor for FileMenuHandler
    * @param jf jframe
    */
   public FileMenuHandler(JFrame jf) {
      jframe = jf;
   }

   public void actionPerformed(ActionEvent event) {
      String menuName = event.getActionCommand();

      
      // check if user is opening a file, if so read it and display it
      if (menuName.equals("Open")) {
         JFileChooser directoryPicker = new JFileChooser();
         directoryPicker.setDialogTitle("Select Input File");
         directoryPicker.showOpenDialog(null);
         File myFile = directoryPicker.getSelectedFile();
         readFile(myFile);
      }
      // check if user clicks quit
      else if (menuName.equals("Quit")) {
         System.exit(0);
      }

   } // actionPerformed


   /**
    * Reads a file and displays it in left TextArea
    * @param inputFile Selected file
    */
   public void readFile(File inputFile) {
      if (inputFile != null) {
         // Get TextAreas to use later
         Container myContentPane = this.jframe.getContentPane();
         TextArea leftTextArea = (TextArea)myContentPane.getComponent(0);
         TextArea rightTextArea = (TextArea)myContentPane.getComponent(1);
         
         // clear columns
         rightTextArea.setText(null);
         leftTextArea.setText(null);
         fileText.clear();

         // Set up TextFileInput
         String filePath = inputFile.toString();
         TextFileInput myInput = new TextFileInput(filePath);
         String currentLine = myInput.readLine();

         // counter for line #
         int i = 1;
         // read input file
         while (currentLine != null) {
            // create new WordLines for each line and add it to ArrayList
            fileText.add(new WordLine(currentLine, i));
            i++;
            currentLine = myInput.readLine();
         }

         // Set left column to input file with lines numbered
         String leftText = "";
         for (WordLine x : fileText) {
            leftText += (x.toString() + "\n");
         }
         leftTextArea.setText(leftText);
      }

   } // readFile()

}