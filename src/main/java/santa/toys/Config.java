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
    //public static boolean enableSaplingBlaster;
    public static boolean enableMatch;
    public static boolean enableGiveADamn;
    public static boolean enableGlowstone;
    public static boolean enableBigPouch;
    public static boolean enableLilPouch;
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

        enableEnderBlaster = config.get("Feature", "Toggle the Ender Blaster. Disabling this will disable the Nether Blaster", true).getBoolean(true);
        enableNetherBlaster = config.get("Feature", "Toggle the Nether Blaster. This is useless if the Ender Blaster is already disabled", true).getBoolean(true);
        //enableSaplingBlaster = config.get("Feature", "Toggle the Sapling Blaster", true).getBoolean(true);
        enableMatch = config.get("Feature", "Toggle the Match", true).getBoolean(true);
        enableGiveADamn = config.get("Feature", "Toggle the Give a Damn Block", true).getBoolean(true);
        enableGlowstone = config.get("Feature", "Toggle the Heavy Light", true).getBoolean(true);
        enableBigPouch = config.get("Feature", "Toggle the Big ol' Pouch", true).getBoolean(true);
        enableLilPouch = config.get("Feature", "Toggle the Lil Pouch", true).getBoolean(true);
        //enableMuffler = config.get("Feature", "Toggle the Muffler", true).getBoolean(true);

        config.save();
    }


}
