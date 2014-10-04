package santa.toys;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraftforge.common.config.Configuration;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by elijahfoster-wysocki on 9/28/14.
 */
public class Config {

    public static boolean enableEnderBlaster;
    public static boolean enableNetherBlaster;
    public static boolean enableMatch;
    public static boolean enableGiveADamn;
    public static boolean enableGlowstone;
    //public static boolean enableMuffler;

    public static void load(FMLPreInitializationEvent event){
        File configurationDir = ReflectionHelper.getPrivateValue(FMLPreInitializationEvent.class, event, 2);
        File oldConfigFile = new File(configurationDir, "santastoys.cfg");
        if (oldConfigFile.exists()){
            try {
                FileUtils.copyFile(new File(configurationDir, "santastoys.cfg"), new File(configurationDir, "SantasToys-try.cfg"));
            } catch (IOException e){
                e.printStackTrace();
            }
            oldConfigFile.delete();
        }

        Configuration config = new Configuration(new File(configurationDir, "SantasToys-new.cfg"));
        config.load();

        //FEATURES

        enableEnderBlaster = config.get("Enable", "Toggle the Ender Blaster. Disabling this will disable the Nether Blaster, unless you make a recipe for it with MineTweaker", true).getBoolean(true);
        enableNetherBlaster = config.get("Enable", "Toggle the Nether Blaster. This is useless if the Ender Blaster is already disabled", true).getBoolean(true);
        enableMatch = config.get("Enable", "Toggle the Match", true).getBoolean(true);
        enableGiveADamn = config.get("Enable", "Toggle the Give a Damn Block", true).getBoolean(true);
        enableGlowstone = config.get("Enable", "Toggle the Heavy Light", true).getBoolean(true);
        //enableMuffler = config.get("Enable", "Toggle the Muffler", true).getBoolean(true);

        config.save();
    }


}
