package santa.holiday;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author SatanicSanta
 */
public class HolidayCrap {

    static Date date = Calendar.getInstance().getTime();
    static SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");

    public static void doCrap(){
        isChristmas();
    }

    public static boolean isChristmas() {
        try {
            if (date == sdf.parse("12-25")) {
                if (Config.consoleSpam) {
                    System.out.println("It is Christmas.");
                }
                return true;
            } else {
                return false;
            }
        } catch(ParseException ex){
            if (Config.consoleSpam) {
                System.out.println("u dun fukd up");
            }
            ex.printStackTrace();
        }

        return false;
    }
}
