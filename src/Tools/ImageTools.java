package Tools;

import java.awt.*;
import java.awt.image.BufferedImage;

/***
 * @author Aaron Chen
 */
public class ImageTools {
    /***
     * resize image
     * @param img
     * @param newW
     * @param newH
     * @return
     */
    public static BufferedImage resize(BufferedImage img, int newW, int newH) {
        Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
        BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = dimg.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();

        return dimg;
    }
}
