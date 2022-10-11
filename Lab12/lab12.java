import javax.swing.*;
import java.awt.*;

public class lab12 {

   static TextFileInput inFile;
   static String inFileName = "lab12.txt";
   static JFrame myFrame;
   static Container cPane;
   static TextArea even, odd;

   public static void main(String[] args) {
      initialize();
      readNumbersFromFile(inFileName);
   }

   public static void initialize() {
      inFile = new TextFileInput(inFileName);
      even = new TextArea();
      odd = new TextArea();
      myFrame = new JFrame();
      myFrame.setSize(400, 400);
      myFrame.setLocation(200, 200);
      myFrame.setTitle("Lab 12");
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }

   public static void readNumbersFromFile(String fileName) {
      /*
       * Add code to this method so...
       * - the two text areas are added to the content pane of the JFrame
       * (see the code in the PowerPoint on GUIs)
       * - numbers are read from the file, and even numbers are put in
       * the TextArea "even", odd numbers in "odd".
       * - At end of file, the JFrame is made visible.
       */

      String line;
      String tempEvens = "";
      String tempOdds = "";
      line = inFile.readLine();
      while (line != null) {

         if (Integer.parseInt(line) % 2 == 0) {
            tempEvens += line + "\n";
         } else {
            tempOdds += line + "\n";
         }
         line = inFile.readLine();
      } // while

      // lines added for gui
      even.setText(tempEvens);
      odd.setText(tempOdds);
      myFrame.setLayout(new GridLayout());
      myFrame.setVisible(true);
      myFrame.add(even);
      myFrame.add(odd);
   } // readSSNsFromFile

} // SSN
