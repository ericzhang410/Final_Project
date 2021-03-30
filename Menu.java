import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Menu extends JPanel implements ActionListener, MouseListener, MouseMotionListener {
    //private JButton goGame;
    int mouseX, mouseY;
    static boolean  gstart;
    Color buttonColor1, buttonColor2, buttonColor3;
    ImportImg image = new ImportImg();
    public Menu(){
        super();
        gstart = false;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        /*
        goGame=new JButton("   Go to game panel   ");
        goGame.addActionListener(this);
        this.setLayout(new FlowLayout());
        this.add(goGame);     // add the button
        this.setBackground(Color.GREEN);

         */
        buttonColor1 = buttonColor2 = buttonColor3 = Color.blue;
        mouseX = 0;
        mouseY = 0;





    }

    public void paintComponent(Graphics g){
        g.drawImage(image.getImage(0), 0 , 0, null);
        g.setFont(new Font("SansSerif", Font.BOLD, 40));
        int titleWidth = g.getFontMetrics().stringWidth("ZOMBIE SHOOTER");


        g.setColor(Color.green);
        g.drawString("ZOMBIE SHOOTER", (700-titleWidth)/2, 100);
        g.setColor(buttonColor1);
        g.fillRoundRect(150, 180, 400, 100,30, 30);
        g.setColor(buttonColor2);
        g.fillRoundRect(150, 320, 400, 100, 30, 30);
        g.setColor(buttonColor3);
        g.fillRoundRect(150, 480, 400, 100, 30, 30);
        g.setColor(Color.black);

        g.setFont(new Font("SansSerif", Font.BOLD, 30));
        int playWidth = g.getFontMetrics().stringWidth("PLAY");
        int opWidth = g.getFontMetrics().stringWidth("ABOUT");
        int rulesWidth = g.getFontMetrics().stringWidth("RULES");
        g.drawString("PLAY", (700-playWidth)/2, 240);
        g.drawString("ABOUT", (700-opWidth)/2, 380);
        g.drawString("RULES", (700-rulesWidth)/2, 540);



    }

    public void mouseClicked(MouseEvent e) {


    }

    public void mousePressed(MouseEvent e){
        System.out.println("f");
        mouseX = e.getX();
        mouseY = e.getY();

        if(e.getButton() == MouseEvent.BUTTON1 && ((mouseX>150 && mouseX <550) && (mouseY>180 && mouseY <280))){
            myFrame.cardsL.show(myFrame.c, "Panel");

        }
        if(e.getButton() == MouseEvent.BUTTON1 && ((mouseX>150 && mouseX <550) && (mouseY>480 && mouseY <580))){
            myFrame.cardsL.show(myFrame.c, "Rules");
        }
        if(e.getButton() == MouseEvent.BUTTON1 && ((mouseX>150 && mouseX <550) && (mouseY>320 && mouseY <420))){
            myFrame.cardsL.show(myFrame.c, "Options");
        }
        repaint();

    }


    public void mouseReleased(MouseEvent e) {


    }



    public void mouseEntered(MouseEvent e) {


    }


    public void mouseExited(MouseEvent e) {

    }


    public void actionPerformed(ActionEvent e) {

    }


    public void mouseDragged(MouseEvent e) {


    }


    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        if((mouseX>150 && mouseX <550) && (mouseY>180 && mouseY <280)){
            buttonColor1 = Color.cyan;
        }
        else{
            buttonColor1 = Color.blue;
        }
        if((mouseX>150 && mouseX <550) && (mouseY>320 && mouseY <420)){
            buttonColor2 = Color.cyan;
        }
        else{
            buttonColor2 = Color.blue;
        }
        if((mouseX>150 && mouseX <550) && (mouseY>480 && mouseY <580)){
            buttonColor3 = Color.cyan;
        }
        else{
            buttonColor3 = Color.blue;
        }
        repaint();
    }
}
