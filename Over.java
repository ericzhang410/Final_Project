import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;
public class Over extends JPanel implements ActionListener, MouseListener, MouseMotionListener{
    final int ENDG = 7;
    final int ENDO = 6;
    int mouseX, mouseY;
    int count;
    Long start;
    ImportImg image = new ImportImg();
    Timer timer;
    public Over(){
        super();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        count = 0;
        timer = new Timer(1000, this);
        start = System.currentTimeMillis();

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        timer.start();
        g.drawImage(image.getImage(5), 0, 0, null);


        g.setColor(Color.blue);

        g.setFont(new Font("Arial", Font.BOLD, 40));
        if(count == 1){
            g.drawImage(image.getImage(ENDG), 173, 200, null);
        }
        else if(count > 1){
            g.drawImage(image.getImage(ENDG), 173, 200, null);
            g.drawImage(image.getImage(ENDO), 191, 400, null);
        }
        repaint();

    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == timer){
            count++;
        }


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
