package Tools;

import java.util.Random;

/***
 * @author Aaron Chen
 */
public class RandomTools {

    static Random r = new Random();
    public static int getRandomInt(int max){
        int randomInt = r.nextInt(max) + 1;
        return randomInt;
    }

    public static int getRandomIntbetween (int max,int min){
       return r.nextInt((max - min) + 1) + min;
    }

    private static boolean getRandomBooleanByPercent(int percent) {
        Random r = new Random();
        return ((r.nextInt(100) + 1) <= percent);
    }
}
