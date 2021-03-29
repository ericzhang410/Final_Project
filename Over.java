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
        if(System.currentTimeMillis() - start > 1000) {
            g.drawImage(image.getImage(7), 173, 200, null);
        }
        if(System.currentTimeMillis() - start > 2000) {
            g.drawImage(image.getImage(6), 191, 400, null);
        }
        System.out.println("zzzz");
        g.setColor(Color.blue);

        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("Yooooo", 0,100 );
        repaint();

    }
    public void actionPerformed(ActionEvent e) {


    }


    public void mouseClicked(MouseEvent e) {

    }


    public void mousePressed(MouseEvent e) {

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
