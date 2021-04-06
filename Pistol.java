/*
 * 2021-04-06
 * ICS3U7
 * Ms.Strelkovska
 * Eric Zhang and Allan Haung
 * This program creates the pistol class
 */

public class Pistol extends Gun {
	//initialize the variable
	private double firerate;
	//create the constructor
	public Pistol(){firerate = 1;}
	//getters
	public double firerate(){return firerate;}
	public void tick(){}
	public boolean isShotgun(){return false;}
	public boolean isAuto(){return false;}
}
