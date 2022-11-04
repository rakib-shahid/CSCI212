import javax.swing.*;
import java.awt.*;
public class SampleGUI extends JFrame {
      
   public SampleGUI(String title, int height, int width) {
	    setTitle(title);
	    setSize(height,width);
       setLocation  (400,200);
	    createFileMenu();
       
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);
   } //SSNGUI

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
      createEditMenu(item, menuBar);
    
   } //createMenu

   private void createEditMenu(JMenuItem item, JMenuBar menuBar) {
      JMenu       fileMenu = new JMenu("Edit");
      EditMenuHandler emh  = new EditMenuHandler(this);

      item = new JMenuItem("Find");    //Open...
      item.addActionListener( emh );
      fileMenu.add( item );

      fileMenu.addSeparator();           //add a horizontal separator line
    
      item = new JMenuItem("Replace");       //Quit
      item.addActionListener( emh );
      fileMenu.add( item );

      setJMenuBar(menuBar);
      menuBar.add(fileMenu);
    
   } //createMenu

} //SSNGUI