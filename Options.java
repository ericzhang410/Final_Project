/*
 * 2021-04-06
 * ICS3U7
 * Ms.Strelkovska
 * Eric Zhang and Allan Haung
 * This program creates the options class
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Options extends JPanel implements ActionListener, MouseListener, MouseMotionListener {
	//initialize the variables
    private JButton returnMenu;
    private int mouseX, mouseY;
    ImportImg image = new ImportImg();
    //constructor
    public Options(){
        super();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }
    //draws the frame
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image.getImage(2), 0, 0, null);
        g.drawImage(image.getImage(1), 20 , 560, null);
        g.drawImage(image.getImage(49), 50, 150, null);
        g.setColor(Color.blue);
        g.setFont(new Font("Arial", Font.BOLD, 40));
    }
    public void actionPerformed(ActionEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    //checks if the player clicks the return to menu button
    public void mousePressed(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        System.out.println(mouseX + " " + mouseY);
        if(e.getButton() == MouseEvent.BUTTON1 && (mouseX>20 && mouseX <95) && (mouseY>560 && mouseY<625)){
            MyFrame.cardsL.show(MyFrame.c, "Menu");
        }
        repaint();
    }
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseDragged(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}
}