package santa.holiday;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraftforge.common.config.Configuration;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author SatanicSanta
 */
public class Config {

    public static boolean consoleSpam;
    public static boolean enableChristmasCookies;

    public static void load(FMLPreInitializationEvent event){
        File configDirectory = ReflectionHelper.getPrivateValue(FMLPreInitializationEvent.class, event, 2);
        File oldConfigFile = new File(configDirectory, "santa/santasholidays.cfg");
        if (oldConfigFile.exists()){
            try{
                FileUtils.copyFile(new File(configDirectory, "santa/santasholidays.cfg"), new File(configDirectory, "santa/santasholidays.cfg"));
            } catch (IOException exception){
                exception.printStackTrace();
            }
            oldConfigFile.delete();
        }
        Configuration config = new Configuration(new File(configDirectory, "santa/enderlevers.cfg"));
        config.load();

        config.addCustomCategoryComment("Debug", "These things are for use with debugging stuff");
        consoleSpam = config.get("Debug", "Enable console logging", true).getBoolean(true);

        config.addCustomCategoryComment("Feature", "Enabling/disabling features within the mod");
        enableChristmasCookies = config.get("Feature", "Enable Christmas Cookies", true).getBoolean(true);
    }
}
