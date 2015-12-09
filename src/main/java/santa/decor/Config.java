package santa.decor;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraftforge.common.config.Configuration;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Config {
    public static boolean enablePumpkin;

    public static boolean enableBlaze;
    public static boolean enableBone;
    public static boolean enableBurnt;
    public static boolean enableEnder;
    public static boolean enableFlesh;
    public static boolean enableIce;
    public static boolean enableLeather;
    public static boolean enableSlime;
    public static boolean enableSnow;
    public static boolean enableCrying;
    public static boolean enablePorked;

    public static boolean enderBalance;
    public static boolean cryingBalance;

    /**
     * Creates, customizes, and saves the configuration file.
     * @param event The FMLPreInitializationEvent that this is called during.
     */
    public static void load(FMLPreInitializationEvent event){
        File configDir = ReflectionHelper.getPrivateValue(FMLPreInitializationEvent.class, event, 2);
        File oldFile = new File(configDir, "SantasDecor.cfg");

        if (oldFile.exists()){
            try{
                FileUtils.copyFile(new File(configDir, "SantasDecor.cfg"), new File(configDir, "SantasDecor-new.cfg"));
            } catch (IOException e){
                e.printStackTrace();
            }
            oldFile.delete();
        }
        Configuration config = new Configuration(new File(configDir, "SantasDecor-new.cfg"));
        config.load();

        //Block Family
        config.addCustomCategoryComment("Block Family", "Disabling these disables everything in that family. For further tweaking, use MineTweaker.");
        enableBlaze = config.get("Block Family", "Toggle the Blaze family", true).getBoolean(true);
        enableBone = config.get("Block Family", "Toggle the Bone family", true).getBoolean(true);
        enableBurnt = config.get("Block Family", "Toggle the Burnt family", true).getBoolean(true);
        enableEnder = config.get("Block Family", "Toggle the Ender family", true).getBoolean(true);
        enableFlesh = config.get("Block Family", "Toggle the Flesh family", true).getBoolean(true);
        enableIce = config.get("Block Family", "Toggle the Ice family", true).getBoolean(true);
        enableLeather = config.get("Block Family", "Toggle the Leather family", true).getBoolean(true);
        enableSlime = config.get("Block Family", "Toggle the Slime family", true).getBoolean(true);
        enableSnow = config.get("Block Family", "Toggle the Snow family", true).getBoolean(true);
        enableCrying = config.get("Block Family", "Toggle the Crying family", true).getBoolean(true);
        enablePorked = config.get("Block Family", "Toggle the Porked family", true).getBoolean(true);

        //Other
        config.addCustomCategoryComment("Other blocks", "Toggling blocks that are not considered to be in any block family.");
        enablePumpkin = config.get("Other blocks", "Toggle the prettier jack o lantern block [NYI]", false).getBoolean(false);

        //Tweaking
        config.addCustomCategoryComment("Tweaking", "Things that can be used to tweak stuff, without enabling/disabling them.");
        enderBalance = config.get("Tweaking", "Ender blocks output 8 like everything else. This should be used in packs where ender pearls are abundant, or farmable.", false).getBoolean(false);
        cryingBalance = config.get("Tweaking", "Crying blocks output 8 like everything else. This should be used in packs where ghast tears are abundant, or farmable.", false).getBoolean(false);

        config.save();
    }
}
