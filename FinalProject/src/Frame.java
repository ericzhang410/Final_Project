import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {
	//Variables
	  Panel mp;	
	  Container c;
	//Constructor
	  public Frame(String title) {
		  super(title);
		  mp= new Panel();
		  c= this.getContentPane();
		  c.setLayout(new BorderLayout());
		  c.add(mp, BorderLayout.CENTER);
	      this.setVisible(true);
	      this.setFocusable(true);
	      this.setSize(800,800);
	  }
	  
	  
}
