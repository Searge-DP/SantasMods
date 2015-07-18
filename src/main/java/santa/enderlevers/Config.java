package santa.enderlevers;

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

    public static boolean consoleStuff;
    public static boolean enableEnderLever;
    public static boolean harderRecipe;

    public static void load(FMLPreInitializationEvent event){
        File configDirectory = ReflectionHelper.getPrivateValue(FMLPreInitializationEvent.class, event, 2);
        File oldConfigFile = new File(configDirectory, "enderlevers.cfg");
        if (oldConfigFile.exists()){
            try{
                FileUtils.copyFile(new File(configDirectory, "enderlevers.cfg"), new File(configDirectory, "enderlevers.cfg"));
            } catch (IOException exception){
                exception.printStackTrace();
            }
            oldConfigFile.delete();
        }
        Configuration config = new Configuration(new File(configDirectory, "enderlevers.cfg"));
        config.load();

        config.addCustomCategoryComment("Debug", "These are things that can be used for bug fixing and debugging");
        consoleStuff = config.get("Debug", "Toggle console messages. This should probably be disabled in public modpacks. Defaults to true", true).getBoolean(true);

        config.addCustomCategoryComment("Feature", "Enabling/disabling features within the mod");
        enableEnderLever = config.get("Feature", "Toggle the Ender Lever. Defaults to true", true).getBoolean(true);
        harderRecipe = config.get("Feature", "Enable the pre-made harder recipe. Defaults to false", false).getBoolean(false);
    }
}
