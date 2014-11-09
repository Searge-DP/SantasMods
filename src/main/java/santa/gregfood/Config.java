package santa.gregfood;

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

    public static void load(FMLPreInitializationEvent event) {
        File configurationDir = ReflectionHelper.getPrivateValue(FMLPreInitializationEvent.class, event, 2);
        File oldConfigFile = new File(configurationDir, "GregFood.cfg");
        if (oldConfigFile.exists()) {
            try {
                FileUtils.copyFile(new File(configurationDir, "GregFood.cfg"), new File(configurationDir, "GregFood.cfg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            oldConfigFile.delete();
        }
        Configuration config = new Configuration(new File(configurationDir, "GregFood.cfg"));
        config.load();
    }
}
