import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Options extends JPanel implements ActionListener, MouseListener, MouseMotionListener {
    private JButton returnMenu;
    int mouseX, mouseY;
    ImportImg image = new ImportImg();
    public Options(){
        super();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        /*
        System.out.println("hallo");
        returnMenu = new JButton("return to menu");
        returnMenu.addActionListener(this);
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 500));
        this.add(returnMenu);
         */



    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image.getImage(2), 0, 0, null);
        g.drawImage(image.getImage(1), 20 , 560, null);

        g.setColor(Color.blue);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("SHIEEEESH", 0,100 );
    }
    public void actionPerformed(ActionEvent e) {
        /*
        if(e.getSource() == returnMenu){
            Frame.cardsL.show(Frame.c, "Menu");
        }
         */

    }


    public void mouseClicked(MouseEvent e) {

    }


    public void mousePressed(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        System.out.println(mouseX + " " + mouseY);
        if(e.getButton() == MouseEvent.BUTTON1 && (mouseX>20 && mouseX <95) && (mouseY>560 && mouseY<625)){
            Frame.cardsL.show(Frame.c, "Menu");
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