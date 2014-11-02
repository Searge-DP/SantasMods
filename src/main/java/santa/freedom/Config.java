package santa.freedom;

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
    public static boolean enableBread;
    public static boolean enablePie;
    public static boolean enableFriedChicken;
    public static boolean enableDew;

    public static void load(FMLPreInitializationEvent event){
        File configDir = ReflectionHelper.getPrivateValue(FMLPreInitializationEvent.class, event, 2);
        File oldFile = new File(configDir, "Freedom.cfg");

        if (oldFile.exists()){
            try{
                FileUtils.copyFile(new File(configDir, "Freedom.cfg"), new File(configDir, "Freedom.cfg"));
            } catch (IOException e){
                e.printStackTrace();
            }
            oldFile.delete();
        }
        Configuration config = new Configuration(new File(configDir, "Freedom.cfg"));
        config.load();

        config.addCustomCategoryComment("Feature", "Enabling/disabling features within the mod");
        enableBread = config.get("Feature", "Toggle Freedom Bread", true).getBoolean(true);
        enablePie = config.get("Feature", "Toggle Freedom Pie", true).getBoolean(true);
        enableFriedChicken = config.get("Feature", "Toggle Fried Chicken Bucket", true).getBoolean(true);
        enableDew = config.get("Feature", "Dew the Dew or Dew not Dew the Dew", true).getBoolean(true);

        config.addCustomCategoryComment("Debug", "These are things that can be used for bug fixing and debugging");
        consoleSpam = config.get("Debug", "Toggle the various console messages that this mod creates", true).getBoolean(true);
    }
}
