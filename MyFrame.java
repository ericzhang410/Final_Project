import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{
    //creates mp and c variables
    static CardLayout cardsL;
    static Container c;
    boolean start;
    Menu  menuP;
    MyPanel panelP;
    Rules rulesP;
    Options optionsP;
    Over overP;
	//Constructor
    public MyFrame(String title) {
        //super constructor
        super(title);
        //initializes panel with border and layout

        this.setLayout(cardsL);
        c= getContentPane();
        cardsL=new CardLayout();
        c.setLayout(cardsL);

        menuP = new Menu();
        panelP = new MyPanel();
        rulesP = new Rules();
        optionsP = new Options();
        overP = new Over();

        c.add(menuP, "Menu");
        c.add(panelP, "Panel");
        c.add(rulesP, "Rules");
        c.add(optionsP, "Options");
        c.add(overP, "Over");


        //cardsL.show(this, "Menu");
        this.setResizable(false);
        MyFrame.cardsL.show(c, "Menu");


        //c.add(menuP, BorderLayout.CENTER);

        //sets size visibility and size of frame
        this.setVisible(true);
        this.setSize(700,700);
    }


}