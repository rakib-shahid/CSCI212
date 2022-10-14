/***************************************************************
 * 
 * @author Rakib Shahid
 *         A GUI made for Project1, displays the input text and the number of vowels in that text
 *
 */

import java.awt.*;
import javax.swing.*;

public class VowelGUI extends JFrame {
    /**
     * Constructs a GUI to display input file text and the number of vowels in it
     * 
     * @param originalTextString Entirety of original text from input.txt
     * @param vowelCounters Array containing counters for numbers of each vowel present
     */
    public VowelGUI(String originalTextString, int[] vowelCounters){
        setTitle("Rakib Shahid Project1");
        // Set size and Layout
        setSize(800,400);
        setLayout(new GridLayout(1,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container myContentPane = this.getContentPane();
        TextArea originalText = new TextArea(originalTextString);
        TextArea vowelNumber = new TextArea();

        // Add text to 2nd column telling user how many of each variable there are
        Character[] vowelArr = {'a','e','i','o','u'};
        for (int i = 0; i < vowelCounters.length; i++){
            vowelNumber.append("Number of \'"+vowelArr[i]+"\'s:\t" + vowelCounters[i]+"\n\n");
        }

        // Add TextAreas to JFrame and display it
        myContentPane.add(originalText);
        myContentPane.add(vowelNumber);
        setVisible(true);
    }
}