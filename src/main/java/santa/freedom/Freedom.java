package santa.freedom;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import santa.freedom.items.ItemHandler;

@Mod(modid="santafreedom", name="Freedom", version="1779")
public class Freedom {
    public static CreativeTabs tabFreedom = new FreedomTab("Freedom");

    @Mod.EventHandler
    void preInit(FMLPreInitializationEvent event) {
        Config.load(event);

        if (Config.consoleSpam) {
            System.out.println("wooooooooo freedom! guns and shit!");
        }
    }
    @Mod.EventHandler
    void init(FMLInitializationEvent event) {
        if (Config.consoleSpam) {
            System.out.println("freedom has been obtained! prepare to inject mountain dew and fried butter into your face!");
            if (Config.enableDew) {
                System.out.println("I am proud of you.");
            } else {
                System.out.println("Are you kidding me? No Dew? Shame on you!");
            }
        }

        ItemHandler.initializeItems();
        ItemHandler.registerItems();
        ItemHandler.addRecipes();
    }
}
