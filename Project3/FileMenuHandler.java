import javax.lang.model.util.SimpleTypeVisitor14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class FileMenuHandler implements ActionListener {
   JFrame jframe;

   public FileMenuHandler(JFrame jf) {
      jframe = jf;
   }

   public void actionPerformed(ActionEvent event) {
      String menuName = event.getActionCommand();
      if (menuName.equals("Open")) {
         // JOptionPane.showMessageDialog(null,"You clicked Open");
         JFileChooser directoryPicker = new JFileChooser();
         // directoryPicker.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
         directoryPicker.setDialogTitle("Select Input File");
         directoryPicker.showOpenDialog(null);
         File myFile = directoryPicker.getSelectedFile();
         // this.jframe.setTitle(filePath);
         readFile(myFile);
      }

      else if (menuName.equals("Quit")) {
         // JOptionPane.showMessageDialog(null,"You clicked on Quit");
         System.exit(0);
      }

   } // actionPerformed

   public void readFile(File inputFile){
      String filePath = inputFile.toString();
      Container myContentPane = this.jframe.getContentPane();
      TextArea leftTextArea = (TextArea)myContentPane.getComponent(0);
      TextFileInput myInput = new TextFileInput(filePath);
      String currentLine = myInput.readLine();
      ArrayList<WordLine> fileText = new ArrayList<>();
      int i = 1;
      while (currentLine != null){
         fileText.add(new WordLine(currentLine, i));
         i++;
         currentLine = myInput.readLine();
      }
      leftTextArea.setText("");
      for (WordLine x : fileText){
         leftTextArea.append(x.toString()+"\n");
      }
      
   }

}