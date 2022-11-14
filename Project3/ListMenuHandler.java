import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class ListMenuHandler implements ActionListener {
    JFrame jframe;

    public ListMenuHandler(JFrame jf) {
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
    } // actionPerformed
      // method that updated right column with appropriate words starting with
      // selected vowel

    public void selectVowel(String vowel) {
        ArrayList<WordLine> vowelWords = new ArrayList<>();
        Container myContentPane = this.jframe.getContentPane();
        TextArea leftTextArea = (TextArea) myContentPane.getComponent(0);
        String leftText = leftTextArea.getText();
        try {
            // Create WordLines from each word that starts with given vowel
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

            // Clear right side column
            TextArea rightTextArea = (TextArea) myContentPane.getComponent(1);
            String rightColumnText = "";
            // Sort the WordLines
            vowelWords.sort(null);
            // Turn all WordLines into a string to display in right column
            for (WordLine x : vowelWords) {
                rightColumnText += x.toString() + "\n";
            }
            // Display WordLines of given vowel in right column
            rightTextArea.setText(rightColumnText);
        } catch (StringIndexOutOfBoundsException e) {
            // System.out.println(e);
            // Tell user to open a file first
            JOptionPane.showMessageDialog(null, "Invalid File");
        }
    }

}