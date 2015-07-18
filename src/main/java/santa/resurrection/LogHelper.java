package santa.resurrection;


import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

/**
 * Created by elijahfoster-wysocki on 10/25/14.
 */
public class LogHelper {

    public static void log(Level level, Object obj){
        FMLLog.log("ftbresurrect", level, String.valueOf(obj));
    }


    public static void info(Object obj){
        log(Level.INFO, obj);
    }
}
