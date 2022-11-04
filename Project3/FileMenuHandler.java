import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

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
      
   }

}