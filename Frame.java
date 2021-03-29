import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame{
    //creates mp and c variables
    static CardLayout cardsL;
    static Container c;
    boolean start;
    Menu  menuP;
    Panel panelP;
    Rules rulesP;
    Options optionsP;
    Over overP;
    public Frame(String title) {
        //super constructor
        super(title);
        //initializes panel with border and layout

        this.setLayout(cardsL);
        c= getContentPane();
        cardsL=new CardLayout();
        c.setLayout(cardsL);

        menuP = new Menu();
        panelP = new Panel();
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
        Frame.cardsL.show(c, "Menu");


        //c.add(menuP, BorderLayout.CENTER);

        //sets size visibility and size of frame
        this.setVisible(true);
        this.setSize(700,700);
    }


}
