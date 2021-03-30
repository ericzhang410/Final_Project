/*
 * for(int n = 0; n < blocks.size();n++) {
			for(int i = 0; i < bullets.size();i++) {
				if (bullets.get(i).x <=blocks.get(n).X()+50  && bullets.get(i).x >= blocks.get(n).X() && bullets.get(i).y <= blocks.get(n).Y()+50 && bullets.get(i).y >= blocks.get(n).Y()) {
					bullets.remove(i);
				}
			}
			for(int i = 0; i < zombies.size(); i++){
				blocks.get(n).ZColl(zombies.get(i));
			}
			blocks.get(n).PColl(p);
		}
 * 		for(int i=0; i<grenades.size(); i++){
			grenades.get(i).myDraw(g);
		}
 * for(int i = 0 ; i<grenades.size(); i++){
				grenades.get(i).tick();
			}
 * 		for(int n=0; n < zombies.size(); n++) {
			for(int i=0; i < grenades.size(); i++) {
				System.out.println(zombies.get(n).distanceFrom(grenades.get(i).x, grenades.get(i).y));
				if (grenades.get(i).radius > (int)(zombies.get(n).distanceFrom(grenades.get(i).x, grenades.get(i).y))) {
					grenades.remove(i);
					zombies.remove(n);
					}
			}
		}
 */
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements ActionListener, KeyListener, MouseListener, MouseMotionListener {
	//Variables
	int Mx, My,zh, ammo,capacity,kills,stage,Znum,Tnum,Snum,speed,Pgun;
	Long start,end,current,firing,takedmg;
	ImportImg image = new ImportImg();
	Timer timer;
	Player p;
	Gun g;
	Zombie d;
	boolean hit,grenaded,damaged,reloaded,held,lvlup;
	ArrayList<Projectile> bullets;
	ArrayList<Zombie> zombies;
	ArrayList<Projectile> grenades; 
	ArrayList<Block> blocks;
	ArrayList<Gun> guns;
	Font font = new Font("SanSerif", Font.BOLD,24);
	//Constructor
	public Panel() 
	{
		super();
		this.addKeyListener(this);
		addKeyListener(this);
		this.addMouseListener(this);
		addMouseMotionListener(this);
		this.setFocusable(true);
		
		Mx = 0; My = 0; zh = -1; ammo = 10; capacity = ammo; kills = 0; Znum = 0; stage = 1;reloaded = false;held = false;
		
		start = System.currentTimeMillis();
		current = (long) 0;
		takedmg = (long) 0;
		firing = (long) 0;
		Pgun = 0;
		p = new Player();
		blocks = new ArrayList<Block>(Arrays.asList(new Block(100,60,120,300), new Block(100,60,300,300),new Block(100,60,500,300)));
		zombies = new  ArrayList<Zombie>();
		bullets = new  ArrayList<Projectile>();
		grenades = new ArrayList<Projectile>();
		guns = new ArrayList<Gun>(Arrays.asList(new Pistol(), new Sniper(), new Shotgun(), new Rifle(), new Laser()));
		g =  guns.get(Pgun);
		timer = new Timer(10 , this);
		timer.start();
	}
	public void paintComponent(Graphics g) 
	{
		for(int n = 0; n < blocks.size();n++) {
			blocks.get(n).myDraw(g);
		}
		super.paintComponent(g);
		this.setBackground(Color.white);
		g.drawImage(image.getImage(4), 0 , 0, null);
		p.myDraw(g);
		for(int i =0; i < zombies.size(); i++) {
			if(zh == i) {
				zombies.get(i).hit(g);
				zh = -1;
			}
			else {
				zombies.get(i).myDraw(g);
			}
		}
		
		for(int i=0; i<bullets.size(); i++){
			bullets.get(i).myDraw(g);
		}
		if(lvlup == true){
			g.setColor(Color.orange);
			g.fillRoundRect(25, 130, 125, 50, 30, 30);
			g.fillRoundRect(200, 130, 125, 50, 30, 30);
			g.fillRoundRect(375, 130, 125, 50, 30, 30);
			g.fillRoundRect(550, 130, 125, 50, 30, 30);
			g.setColor(Color.black);
			g.drawRoundRect(25, 130, 125, 50, 30, 30);
			g.drawRoundRect(200, 130, 125, 50, 30, 30);
			g.drawRoundRect(375, 130, 125, 50, 30, 30);
			g.drawRoundRect(550, 130, 125, 50, 30, 30);
			g.setFont(new Font("SansSerif", Font.ITALIC, 18));
			g.drawString("SPEED", 25 + (125-g.getFontMetrics().stringWidth("SPEED"))/2, 160);
			g.drawString("AMMO", 200 + (125-g.getFontMetrics().stringWidth("AMMO"))/2, 160);
			g.drawString("HEALTH", 375 + (125-g.getFontMetrics().stringWidth("HEALTH"))/2, 160);
			g.drawString("GUN", 550 + (125-g.getFontMetrics().stringWidth("GUN"))/2, 160);
			g.setColor(Color.red);
			g.setFont(new Font("SansSerif", Font.BOLD, 30));
			g.drawString("BUFF CHOICE", (700-g.getFontMetrics().stringWidth("BUFF CHOICE"))/2, 100);
		}
		if(p.Health() <= 0) {
			Frame.cardsL.show(Frame.c, "Over");
		}
		g.setFont(font);
		g.setColor(Color.BLACK);
		font = new Font("SanSerif", Font.BOLD, 48);
		g.setFont(font);
		g.drawString("Stage " + stage, 250,50);
		font = new Font("SanSerif", Font.BOLD, 24);
		g.setFont(font);
		g.drawString("Ammo: " + capacity, 20,50);
		g.drawString("Kills " + kills, 20,100);
		g.drawString("Time Passed " + (System.currentTimeMillis()-start)/1000, 450,50);
		g.setColor(Color.BLACK);
		g.drawRect(99,599,501,21);
		g.setColor(Color.RED);
		g.fillRect(100,600,500,20);
		g.setColor(Color.GREEN);
		g.fillRect(100,600,5*p.Health(),20);
		requestFocusInWindow();
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==timer) 
		{	
				p.tick();
			while(Znum < (int)stage*1.2) {
				zombies.add(new Zombie());
				Znum ++;
			}
			while (Tnum+1 < Math.round(stage)*0.1) {
				zombies.add(new TankZombie());
				Tnum ++;
			}
			while (Snum+1 < Math.round(stage)*0.05){
				zombies.add(new SpittingZombie());
				Snum ++;
			}
			if(zombies.size() == 0) 
			{
				Znum = 0;
				Tnum = 0;
				Snum = 0;
				stage++;
				if(stage%5 == 0) {
					lvlup = true;
					for(int i = 0; i < zombies.size(); i++) {
						zombies.get(i). IncHealth();
					}
				}
				
			}
			for(int i = 0; i < zombies.size(); i++) {
				zombies.get(i).tick(p.X(),p.Y());
			}
			for(int i = 0 ; i<bullets.size(); i++){
				bullets.get(i).tick();
				if(System.currentTimeMillis()-bullets.get(i).duration() > 10000)
				{
					bullets.remove(i);
				}
			}
			for(int i =0; i < zombies.size(); i++) {
				if(zombies.get(i).health <= 0) {
					zombies.remove(i);
					kills++;
				}
			}
			timing();
			collisions();
			repaint();
		}
		
	}
	public void timing() {
		if(System.currentTimeMillis()-current > 1000 && reloaded) {
			capacity = ammo;
			reloaded = false;
		}
	}
	public void collisions() {		
		for(int n=0; n < zombies.size(); n++) {
			zombies.get(n).PColl(p);
			zombies.get(n).spitColl(p.X()-25,p.Y()-25);
			if(zombies.get(n).PHit() && System.currentTimeMillis()-takedmg > 50) {
				takedmg = System.currentTimeMillis();
				p.SetH(p.Health()-1);
			}
			if(zombies.get(n).SpitHit()) {
				p.SetH(p.Health()-10);
			}

			for(int i= 0; i < bullets.size(); i++){
				if (bullets.get(i).x <= zombies.get(n).x+50  && bullets.get(i).x >= zombies.get(n).x && bullets.get(i).y <= zombies.get(n).y+50 && bullets.get(i).y >= zombies.get(n).y) {
					hit = true;
					bullets.remove(i);
					zh = n;
				}
			}
			for(int i= 0; i < zombies.size(); i++){
				zombies.get(n).ZColl(zombies.get(i));
				zombies.get(i).ZColl(zombies.get(n));
			}
		}
		
	}
	public void keyTyped(KeyEvent e) {}
	public void keyPressed(KeyEvent e) 
	{	
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_D:
			p.SetVx((int)p.Speed());
			break;
		case KeyEvent.VK_A:
			p.SetVx((int)p.Speed()*-1);
			break;
		case KeyEvent.VK_W:
			p.SetVy((int)p.Speed()*-1);
			break;
		case KeyEvent.VK_S:	
			p.SetVy((int)p.Speed());
			break;
		case KeyEvent.VK_R:
			current  = System.currentTimeMillis();
			reloaded = true;
			break;
		case KeyEvent.VK_G:
			grenaded = true;
			break;
		case KeyEvent.VK_SPACE:
			if(speed < 1) {
			p.SetS(p.Speed()*1.5);
			speed++;
			}
			break;
		case KeyEvent.VK_O:
			for(int i =0; i < zombies.size(); i++) {
				zombies.remove(i);
			}
			
		}
	}
	public void keyReleased(KeyEvent e) 
	{	

		switch(e.getKeyCode())
		{
		case KeyEvent.VK_D:
			p.SetVx(0);
			break;
		case KeyEvent.VK_A:
			p.SetVx(0);
			break;
		case KeyEvent.VK_W:
			p.SetVy(0);
			break;
		case KeyEvent.VK_S:	
			p.SetVy(0);
			break;
		case KeyEvent.VK_SPACE:
			p.SetS(p.Speed()/1.5);
			speed--;
			break;
		}
	}
	public void mouseDragged(MouseEvent e) {
		if(g.automatic) {
			if(System.currentTimeMillis()-firing > 1000/g.firerate) {
				firing = System.currentTimeMillis();
				if (capacity > 0) {

						bullets.add(new Bullet(e.getX(), e.getY(),p.X(),p.Y()));
						capacity--;					

				}
				
			}
		}
	}
	public void mouseMoved(MouseEvent e) {
		if (grenaded) {
			grenades.add(new Grenade(e.getX(), e.getY()));
			grenaded = false;
		}
		
	}
	public void mouseClicked(MouseEvent e) 
	{
		if (e.getButton() == MouseEvent.BUTTON1) {
			if(System.currentTimeMillis()-firing >= 1000/g.firerate) {
				firing = System.currentTimeMillis();
				if (capacity > 0) {
					if (capacity > 2 && g.isShotgun()) {
						bullets.add(new Bullet(e.getX(), e.getY(),p.X(),p.Y()));
						bullets.add(new Bullet(e.getX()-40, e.getY(),p.X()+50,p.Y()));
						bullets.add(new Bullet(e.getX()+40, e.getY(),p.X()-50,p.Y()));
						capacity-=3;
					}
					else {
						bullets.add(new Bullet(e.getX(), e.getY(),p.X(),p.Y()));
						capacity--;
					}
				}
			}
		}
	}
	public void mousePressed(MouseEvent e) 
	{
		Mx = e.getX();
		My = e.getY();
		if((Mx > 25 && Mx < 150) && (My >130 && My <180)){
			p.SetS(p.Speed()+2);
			lvlup = false;
		}
		if((Mx > 200 && Mx < 325) && (My >130 && My <180)){
			ammo += 10;
			lvlup = false;
		}
		if((Mx > 375 && Mx < 500) && (My >130 && My <180)){
			p.SetH(100);
			lvlup = false;
		}
		if((Mx > 550 && Mx < 675) && (My >130 && My <180)){
			Pgun ++;
			g =  guns.get(Pgun);
			lvlup = false;
		}

	}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}

	
	
}
