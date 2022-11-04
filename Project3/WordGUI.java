import java.awt.*;
import javax.swing.*;

public class WordGUI extends JFrame{
    public WordGUI(){
        setTitle("Rakib Shahid Project1");
        // Set size and Layout
        setSize(800,400);
        setLayout(new GridLayout(1,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container myContentPane = this.getContentPane();
        TextArea originalText = new TextArea("originalTextString");
        TextArea vowelNumber = new TextArea();



        // Add TextAreas to JFrame and display it
        myContentPane.add(originalText);
        myContentPane.add(vowelNumber);
        setVisible(true);
    }

}