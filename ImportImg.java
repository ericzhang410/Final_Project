import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.Buffer;
import java.util.*;
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
    private static BufferedImage arrOfImg[];
    public ImportImg() {
        arrOfImg = new BufferedImage[8];
        if (imgZomb == null && imgBack == null && imgSettings ==null && imgBook==null && bgImg == null & over== null && endO == null && endG ==null) {
            try {

                imgZomb = ImageIO.read(new File("zombie.png"));
                imgBack = ImageIO.read(new File("back.png"));
                imgSettings = ImageIO.read(new File("settings.png"));
                imgBook = ImageIO.read(new File("book.png"));
                bgImg = ImageIO.read(new File("bgImg.png"));
                over = ImageIO.read(new File("over.png"));
                endO = ImageIO.read(new File("endO.png"));
                endG = ImageIO.read(new File("endG.png"));
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


    }
    public static BufferedImage getImage(int imgNum) {

        return arrOfImg[imgNum];
    }
}
