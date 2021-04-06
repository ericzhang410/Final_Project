/*
 * 2021-04-06
 * ICS3U7
 * Ms.Strelkovska
 * Eric Zhang and Allan Haung
 * This program creates the over screen/class
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;
public class Over extends JPanel implements ActionListener, MouseListener, MouseMotionListener{
	//initializes the variables
    int mouseX, mouseY;
    int count;
    Long start;
    ImportImg image = new ImportImg();
    Timer timer;
    //creates the constructor.
    public Over(){
        super();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        count = 0;
        timer = new Timer(1000, this);
        start = System.currentTimeMillis();
    }
    //draws the frame
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        timer.start();
        g.drawImage(image.getImage(5), 0, 0, null);
        g.setColor(Color.blue);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        if(count == 1){
            g.drawImage(image.getImage(7), 173, 200, null);
        }
        else if(count > 1){
            g.drawImage(image.getImage(7), 173, 200, null);
            g.drawImage(image.getImage(6), 191, 400, null);
            g.drawImage(image.getImage(1), 20 , 560, null);
        }
        repaint();
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == timer){
            count++;
        }
    }
    //checks if the player goes back to menu
    public void mouseClicked(MouseEvent e) {
    	if(e.getButton() == MouseEvent.BUTTON1 && (e.getX()>20 && e.getX()<95) && (e.getY()>560 && e.getY()<625)){
            MyFrame.cardsL.show(MyFrame.c, "Menu");
        }
        repaint();
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseDragged(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}
}