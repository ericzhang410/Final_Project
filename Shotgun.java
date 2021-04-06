/*
 * 2021-04-06
 * ICS3U7
 * Ms.Strelkovska
 * Eric Zhang and Allan Haung
 * This program creates the sniper class
 */

public class Shotgun extends Gun {
	//initialize the variable
	private double firerate;
	//create the constructor
	public Shotgun(){firerate = 4;}
	//getters
	public double firerate() {return firerate;}
	public void tick(){}
	public boolean isShotgun(){return true;}
	public boolean isAuto(){return false;}
}
