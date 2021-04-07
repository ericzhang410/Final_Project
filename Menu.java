/*
 * 2021-04-06
 * ICS3U7
 * Ms.Strelkovska
 * Eric Zhang and Allan Huang
 * This program creates the menu card for our final project.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Menu extends JPanel implements ActionListener, MouseListener, MouseMotionListener {
   //initialize the variables
    private int mouseX, mouseY;
    private Color buttonColor1, buttonColor2, buttonColor3;
    private ImportImg image = new ImportImg();
    //creates the constructor
    public Menu(){
        super();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        buttonColor1 = buttonColor2 = buttonColor3 = Color.blue;
        mouseX = 0;
        mouseY = 0;
    }
    //paints all the frame
    public void paintComponent(Graphics g){
        g.drawImage(image.getImage(0), 0 , 0, null);
        g.setFont(new Font("SansSerif", Font.BOLD, 40));
        g.setColor(Color.BLUE);
        g.drawString("Final Hour", 250, 100);
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
    public void mouseClicked(MouseEvent e) {}
    //checks for what button the user clicks
    public void mousePressed(MouseEvent e){
        System.out.println("f");
        mouseX = e.getX();
        mouseY = e.getY();

        if(e.getButton() == MouseEvent.BUTTON1 && ((mouseX>150 && mouseX <550) && (mouseY>180 && mouseY <280))){
        	 MyFrame.cardsL.show(MyFrame.c, "Panel");
        }
        if(e.getButton() == MouseEvent.BUTTON1 && ((mouseX>150 && mouseX <550) && (mouseY>480 && mouseY <580))){
            MyFrame.cardsL.show(MyFrame.c, "Rules");
        }
        if(e.getButton() == MouseEvent.BUTTON1 && ((mouseX>150 && mouseX <550) && (mouseY>320 && mouseY <420))){
            MyFrame.cardsL.show(MyFrame.c, "Options");
        }
        repaint();
    }
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void actionPerformed(ActionEvent e) {}
    public void mouseDragged(MouseEvent e) {}
    //creates interactive buttons that change if the mouse is over the button
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