import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class FileMenuHandler implements ActionListener {
   public ArrayList<WordLine> fileText = new ArrayList<>();
   JFrame jframe;

   public FileMenuHandler(JFrame jf) {
      jframe = jf;
   }

   public void actionPerformed(ActionEvent event) {
      String menuName = event.getActionCommand();

      // Check if user clicked any of the vowels under "List" menu item
      switch (menuName) {
         case "A":
            selectVowel("A");
            break;
         case "E":
            selectVowel("E");
            break;
         case "I":
            selectVowel("I");
            break;
         case "O":
            selectVowel("O");
            break;
         case "U":
            selectVowel("U");
            break;
      }
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

   // method that updated right column with appropriate words starting with
   // selected vowel
   public void selectVowel(String vowel) {
      ArrayList<WordLine> vowelWords = new ArrayList<>();
      Container myContentPane = this.jframe.getContentPane();
      TextArea leftTextArea = (TextArea) myContentPane.getComponent(0);
      String leftText = leftTextArea.getText();
      try {
         String[] lines = leftText.split("\n");
         int i = 1;
         for (String line : lines) {
            String[] words = line.split(" ");
            for (String word : words) {
               if (word.charAt(0) == vowel.toLowerCase().charAt(0) ||
                     word.charAt(0) == vowel.charAt(0)) {
                  vowelWords.add(new WordLine(word, i));
               }
            }
            i++;
         }

         TextArea rightTextArea = (TextArea) myContentPane.getComponent(1);
         String rightColumnText = "";
         vowelWords.sort(null);
         for (WordLine x : vowelWords) {
            rightColumnText += x.toString() + "\n";
         }
         rightTextArea.setText(rightColumnText);
      } catch (Exception e) {
         System.out.println(e);
         JOptionPane.showMessageDialog(null,"Open a file!");
      }
   }

   public void readFile(File inputFile) {
      if (inputFile != null) {
         // Get left column TextArea
         Container myContentPane = this.jframe.getContentPane();
         TextArea leftTextArea = (TextArea) myContentPane.getComponent(0);
         // clear left column
         leftTextArea.setText(null);
         fileText.clear();

         // Set up TextFileInput
         String filePath = inputFile.toString();
         TextFileInput myInput = new TextFileInput(filePath);
         String currentLine = myInput.readLine();

         int i = 1;
         // read input file
         while (currentLine != null) {
            // create new WordLines for each line
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