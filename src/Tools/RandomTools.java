package Tools;

import java.util.Random;

/***
 * @author Aaron Chen
 */
public class RandomTools {

    static Random r = new Random();

    /***
     * get random int smaller than max
     * @param max
     * @return
     */
    public static int getRandomInt(int max) {
        int randomInt = r.nextInt(max) + 1;
        return randomInt;
    }

    /***
     * get random int between min and max
     * @param max
     * @param min
     * @return
     */
    public static int getRandomIntbetween(int min, int max) {
        return r.nextInt((max - min) + 1) + min;
    }

    /***
     * get random by percent min is 0 max is 100
     * @param percent
     * @return
     */
    private static boolean getRandomBooleanByPercent(int percent) {
        Random r = new Random();
        return ((r.nextInt(100) + 1) <= percent);
    }
}
