import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
public class ImportImg {
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
    private static BufferedImage arrOfImg[];
    public ImportImg() {
        arrOfImg = new BufferedImage[24];
        if (imgZomb == null && imgBack == null && imgSettings ==null && imgBook==null && bgImg == null & over== null && endO == null && endG ==null && PlayerN == null && PlayerNE == null && PlayerE == null && PlayerSE == null && PlayerS == null && PlayerSW == null && PlayerW == null && PlayerW == null && PlayerNW == null
        		&& ZombieN == null &&  ZombieNE == null && ZombieE == null && ZombieSE == null &&  ZombieS == null &&  ZombieSW == null &&  ZombieW == null &&  ZombieW == null &&  ZombieNW == null) {
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
        
        


    }
    public static BufferedImage getImage(int imgNum) {

        return arrOfImg[imgNum];
    }
}