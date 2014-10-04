package santa.toys.proxies;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.init.Items;
import santa.toys.entity.EntityEnderBlast;
import santa.toys.entity.EntityNetherStarBlast;

/**
 * Created by elijahfoster-wysocki on 7/28/14.
 */
public class Client extends Common{

    public void initSounds(){

    }

    public void initRenderers(){

        RenderingRegistry.registerEntityRenderingHandler(EntityEnderBlast.class, new RenderSnowball(Items.ender_pearl));
        RenderingRegistry.registerEntityRenderingHandler(EntityNetherStarBlast.class, new RenderSnowball(Items.nether_star));
    }

}
