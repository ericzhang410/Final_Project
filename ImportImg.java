/*
 * 2021-04-06
 * ICS3U7
 * Ms.Strelkovska
 * Eric Zhang and Allan Haung
 * This program creates the images for the game
 */
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
public class ImportImg {
	//initialize the variables
    private static BufferedImage imgZomb;
    private static BufferedImage imgBack;
    private static BufferedImage imgSettings;
    private static BufferedImage imgBook;
    private static BufferedImage bgImg;
    private static BufferedImage over;
    private static BufferedImage endO;
    private static BufferedImage endG;
    private static BufferedImage PlayerN;
    private static BufferedImage PlayerNE;
    private static BufferedImage PlayerE;
    private static BufferedImage PlayerSE;
    private static BufferedImage PlayerS;
    private static BufferedImage PlayerSW;
    private static BufferedImage PlayerW;
    private static BufferedImage PlayerNW;
    private static BufferedImage ZombieN;
    private static BufferedImage ZombieNE;
    private static BufferedImage ZombieE;
    private static BufferedImage ZombieSE;
    private static BufferedImage ZombieS;
    private static BufferedImage ZombieSW;
    private static BufferedImage ZombieW;
    private static BufferedImage ZombieNW;
    private static BufferedImage RZombieN;
    private static BufferedImage RZombieNE;
    private static BufferedImage RZombieE;
    private static BufferedImage RZombieSE;
    private static BufferedImage RZombieS;
    private static BufferedImage RZombieSW;
    private static BufferedImage RZombieW;
    private static BufferedImage RZombieNW;
    private static BufferedImage TankN;
    private static BufferedImage TankNE;
    private static BufferedImage TankE;
    private static BufferedImage TankSE;
    private static BufferedImage TankS;
    private static BufferedImage TankSW;
    private static BufferedImage TankW;
    private static BufferedImage TankNW;
    private static BufferedImage SpitN;
    private static BufferedImage SpitNE;
    private static BufferedImage SpitE;
    private static BufferedImage SpitSE;
    private static BufferedImage SpitS;
    private static BufferedImage SpitSW;
    private static BufferedImage SpitW;
    private static BufferedImage SpitNW;
    private static BufferedImage rules;
    private static BufferedImage about;
    private static BufferedImage arrOfImg[];
    //constructor and loading all the images
    public ImportImg() {
        arrOfImg = new BufferedImage[50];
        if (imgZomb == null && imgBack == null && imgSettings ==null && imgBook==null && bgImg == null & over== null && endO == null && endG ==null && PlayerN == null && PlayerNE == null && PlayerE == null && PlayerSE == null && PlayerS == null && PlayerSW == null && PlayerW == null && PlayerW == null && PlayerNW == null
        		&& ZombieN == null &&  ZombieNE == null && ZombieE == null && ZombieSE == null &&  ZombieS == null &&  ZombieSW == null &&  ZombieW == null &&  ZombieW == null &&  ZombieNW == null
        		&& RZombieN == null &&  RZombieNE == null && RZombieE == null && RZombieSE == null &&  RZombieS == null &&  RZombieSW == null &&  RZombieW == null &&  RZombieW == null &&  RZombieNW == null
        		&& TankN == null &&  TankNE == null && TankE == null && TankSE == null &&  TankS == null &&  TankSW == null &&  TankW == null &&  TankW == null &&  TankNW == null
        		&& SpitN == null &&  SpitNE == null && SpitE == null && SpitSE == null &&  SpitS == null &&  SpitSW == null &&  SpitW == null &&  SpitW == null &&  SpitNW == null && rules == null && about == null) {
            try {
                imgZomb = ImageIO.read(new File("zombie.png"));
                imgBack = ImageIO.read(new File("back.png"));
                imgSettings = ImageIO.read(new File("settings.png"));
                imgBook = ImageIO.read(new File("book.png"));
                bgImg = ImageIO.read(new File("bgImg.png"));
                over = ImageIO.read(new File("over.png"));
                endO = ImageIO.read(new File("endO.png"));
                endG = ImageIO.read(new File("endG.png"));
                PlayerN = ImageIO.read(new File("PlayerN.png"));
                PlayerNE = ImageIO.read(new File("PlayerNE.png"));
                PlayerE = ImageIO.read(new File("PlayerE.png"));
                PlayerSE = ImageIO.read(new File("PlayerSE.png"));
                PlayerS = ImageIO.read(new File("PlayerS.png"));
                PlayerSW = ImageIO.read(new File("PlayerSW.png"));
                PlayerW = ImageIO.read(new File("PlayerW.png"));
                PlayerNW = ImageIO.read(new File("PlayerNW.png"));
                ZombieN = ImageIO.read(new File("ZombieN.png"));
                ZombieNE = ImageIO.read(new File("ZombieNE.png"));
                ZombieE = ImageIO.read(new File("ZombieE.png"));
                ZombieSE = ImageIO.read(new File("ZombieSE.png"));
                ZombieS = ImageIO.read(new File("ZombieS.png"));
                ZombieSW = ImageIO.read(new File("ZombieSW.png"));
                ZombieW = ImageIO.read(new File("ZombieW.png"));
                ZombieNW = ImageIO.read(new File("ZombieNW.png"));
                RZombieN = ImageIO.read(new File("RZombieN.png"));
                RZombieNE = ImageIO.read(new File("RZombieNE.png"));
                RZombieE = ImageIO.read(new File("RZombieE.png"));
                RZombieSE = ImageIO.read(new File("RZombieSE.png"));
                RZombieS = ImageIO.read(new File("RZombieS.png"));
                RZombieSW = ImageIO.read(new File("RZombieSW.png"));
                RZombieW = ImageIO.read(new File("RZombieW.png"));
                RZombieNW = ImageIO.read(new File("RZombieNW.png"));
                TankN = ImageIO.read(new File("TankN.png"));
                TankNE = ImageIO.read(new File("TankNE.png"));
                TankE = ImageIO.read(new File("TankE.png"));
                TankSE = ImageIO.read(new File("TankSE.png"));
                TankS = ImageIO.read(new File("TankS.png"));
                TankSW = ImageIO.read(new File("TankSW.png"));
                TankW = ImageIO.read(new File("TankW.png"));
                TankNW = ImageIO.read(new File("TankNW.png"));
                SpitN = ImageIO.read(new File("SpitN.png"));
                SpitNE = ImageIO.read(new File("SpitNE.png"));
                SpitE = ImageIO.read(new File("SpitE.png"));
                SpitSE = ImageIO.read(new File("SpitSE.png"));
                SpitS = ImageIO.read(new File("SpitS.png"));
                SpitSW = ImageIO.read(new File("SpitSW.png"));
                SpitW = ImageIO.read(new File("SpitW.png"));
                SpitNW = ImageIO.read(new File("SpitNW.png"));
                rules = ImageIO.read(new File("rules.png"));
                about = ImageIO.read(new File("about.png"));
            } catch (IOException e) {
                System.out.println("something is wrong with the file reading" + e);
            } catch (Exception ee) {
                System.out.println(ee);
            }
        }
        arrOfImg[0] = imgZomb;
        arrOfImg[1] = imgBack;
        arrOfImg[2] = imgSettings;
        arrOfImg[3] = imgBook;
        arrOfImg[4] = bgImg;
        arrOfImg[5] = over;
        arrOfImg[6] = endO;
        arrOfImg[7] = endG;
        arrOfImg[8] = PlayerN;
        arrOfImg[9] = PlayerNE;
        arrOfImg[10] = PlayerE;
        arrOfImg[11] = PlayerSE;
        arrOfImg[12] = PlayerS;
        arrOfImg[13] = PlayerSW;
        arrOfImg[14] = PlayerW;
        arrOfImg[15] = PlayerNW;
        arrOfImg[16] = ZombieN;
        arrOfImg[17] = ZombieNE;
        arrOfImg[18] = ZombieE;
        arrOfImg[19] = ZombieSE;
        arrOfImg[20] = ZombieS;
        arrOfImg[21] = ZombieSW;
        arrOfImg[22] = ZombieW;
        arrOfImg[23] = ZombieNW;
        arrOfImg[24] = RZombieN;
        arrOfImg[25] = RZombieNE;
        arrOfImg[26] = RZombieE;
        arrOfImg[27] = RZombieSE;
        arrOfImg[28] = RZombieS;
        arrOfImg[29] = RZombieSW;
        arrOfImg[30] = RZombieW;
        arrOfImg[31] = RZombieNW;
        arrOfImg[32] = TankN;
        arrOfImg[33] = TankNE;
        arrOfImg[34] = TankE;
        arrOfImg[35] = TankSE;
        arrOfImg[36] = TankS;
        arrOfImg[37] = TankSW;
        arrOfImg[38] = TankW;
        arrOfImg[39] = TankNW;
        arrOfImg[40] = SpitN;
        arrOfImg[41] = SpitNE;
        arrOfImg[42] = SpitE;
        arrOfImg[43] = SpitSE;
        arrOfImg[44] = SpitS;
        arrOfImg[45] = SpitSW;
        arrOfImg[46] = SpitW;
        arrOfImg[47] = SpitNW;
        arrOfImg[48] = rules;
        arrOfImg[49] = about;
    }
    public static BufferedImage getImage(int imgNum) {return arrOfImg[imgNum];}
}