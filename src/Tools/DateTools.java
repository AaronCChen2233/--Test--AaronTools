package Tools;

import java.util.Calendar;
import java.util.Date;

/***
 * @author Aaron Chen
 */
public class DateTools {
    /***
     * date add seconds
     * @param date
     * @param seconds
     * @return
     */
    public static Date addSeconds(Date date, Integer seconds) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.SECOND, seconds);
        return cal.getTime();
    }
}
