import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;
public class Over extends JPanel implements ActionListener, MouseListener, MouseMotionListener{

    int mouseX, mouseY;
    Long start;
    ImportImg image = new ImportImg();
    public Over(){
        super();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        start = System.currentTimeMillis();

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawImage(image.getImage(5), 0, 0, null);
        g.drawImage(image.getImage(1), 20 , 560, null);
        if(System.currentTimeMillis() - start > 1000) {
            g.drawImage(image.getImage(7), 173, 200, null);
        }
        if(System.currentTimeMillis() - start > 2000) {
            g.drawImage(image.getImage(6), 191, 400, null);
        }
        g.setColor(Color.blue);
        repaint();

    }
    public void actionPerformed(ActionEvent e) {


    }


    public void mouseClicked(MouseEvent e) {

    }


    public void mousePressed(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        if(e.getButton() == MouseEvent.BUTTON1 && (mouseX>20 && mouseX <95) && (mouseY>560 && mouseY<625)){
            MyFrame.cardsL.show(MyFrame.c, "Menu");
        }
        repaint();


    }


    public void mouseReleased(MouseEvent e) {

    }


    public void mouseEntered(MouseEvent e) {

    }


    public void mouseExited(MouseEvent e) {

    }


    public void mouseDragged(MouseEvent e) {

    }


    public void mouseMoved(MouseEvent e) {

    }
}