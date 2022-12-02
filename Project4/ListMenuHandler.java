import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ListMenuHandler implements ActionListener {
    JFrame jframe;

    // Create an ArrayList to store WordLines of words that start with the selected vowels
    ArrayList<WordLine> vowelWords = new ArrayList<>();

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

    /**
     * Method that updates right-side column with vowels that start with selected
     * vowel
     * 
     * @param vowel User selected vowel
     */
    public void selectVowel(String vowel) {
        // Clear the ArrayList each time a new vowel is selected
        vowelWords.clear();

        // Get TextAreas from GUI
        Container myContentPane = this.jframe.getContentPane();
        TextArea leftTextArea = (TextArea) myContentPane.getComponent(0);
        TextArea rightTextArea = (TextArea) myContentPane.getComponent(1);
        String rightColumnText = "";

        // Get file input from left column
        String leftText = leftTextArea.getText();

        // Split Original text into Lines
        String[] lines = leftText.split("\n");
        int i = 1;
        for (String line : lines) {
            // Split lines into words
            String[] words = line.split(" ");
            for (String word : words) {
                // Check if word is valid
                if (word.length() >= 1) {
                    // Check if word starts with selected vowel
                    if (word.toUpperCase().charAt(0) == vowel.charAt(0)) {

                        // checks if the WordLine ArrayList isn't null
                        if (vowelWords.size() > 0) {
                            boolean contains = false;
                            // loop through the WordLine ArrayList to see 
                            // if a WordLine containing the current word exists
                            for (WordLine x : vowelWords) {
                                // if such a WordLine exists, 
                                // add the current line number to its own line numbers ArrayList
                                if (x.getWord().equals(word)) {
                                    x.addLine(i);
                                    contains = true;
                                }
                            }
                            // if such a WordLine doesn't exist, create a new one and add it
                            if (!contains) {
                                vowelWords.add(new WordLine(word, i));
                            }
                        } 
                        // Add a first word to the WordLine ArrayList
                        else {
                            vowelWords.add(new WordLine(word, i));
                        }
                    }
                }
            }
            i++;
        }

        // sort WordLine ArrayList
        vowelWords.sort(null);

        // Turn all WordLines in the ArrayList into a string to display in right column
        for (WordLine x : vowelWords) {
            rightColumnText += x.getWord() + ": " + x.getLine() + "\n";
        }
        
        // Display WordLines of given vowel in right column
        rightTextArea.setText(rightColumnText);
    }

}