import java.awt.*;
import javax.swing.*;

public class WordGUI extends JFrame{
    // Constructor for GUI
    public WordGUI(){
        setTitle("Rakib Shahid Project3");
        // Set size and Layout
        setSize(800,400);
        setLayout(new GridLayout(1,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container myContentPane = this.getContentPane();
        
        // Left column
        TextArea originalText = new TextArea();
        // Right column
        TextArea vowelNumber = new TextArea();

        createFileMenu();

        // Add TextAreas to JFrame and display it
        myContentPane.add(originalText);
        myContentPane.add(vowelNumber);
        setVisible(true);
    }

    // Add File Menu bar
    private void createFileMenu( ) {
        JMenuItem   item;
        JMenuBar    menuBar  = new JMenuBar();
        JMenu       fileMenu = new JMenu("File");
        FileMenuHandler fmh  = new FileMenuHandler(this);
  
        item = new JMenuItem("Open");    //Open...
        item.addActionListener( fmh );
        fileMenu.add( item );
  
        fileMenu.addSeparator();           //add a horizontal separator line
      
        item = new JMenuItem("Quit");       //Quit
        item.addActionListener( fmh );
        fileMenu.add( item );
  
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        
        // Add List menu to same menu bar
        createListMenu(item, menuBar);
      
     } //createFileMenu
  

     /**
      * Method that adds List menu to menu bar
      * @param item Item from createFileMenu()
      * @param menuBar Menu bar from createFileMenu()
      */
     private void createListMenu(JMenuItem item, JMenuBar menuBar) {
        JMenu       fileMenu = new JMenu("List");
        ListMenuHandler lmh  = new ListMenuHandler(this);
  
        item = new JMenuItem("A");    
        item.addActionListener( lmh );
        fileMenu.add( item );
  
        fileMenu.addSeparator();           //add a horizontal separator line
      
        item = new JMenuItem("E");    
        item.addActionListener( lmh );
        fileMenu.add( item );
  
        fileMenu.addSeparator();

        item = new JMenuItem("I");    
        item.addActionListener( lmh );
        fileMenu.add( item );
  
        fileMenu.addSeparator();

        item = new JMenuItem("O");    
        item.addActionListener( lmh );
        fileMenu.add( item );
  
        fileMenu.addSeparator();

        item = new JMenuItem("U");    
        item.addActionListener( lmh );
        fileMenu.add( item );
  
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
      
     } //createEditMenu

}