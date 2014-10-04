package santa.pants.proxies;

import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * Created by elijahfoster-wysocki on 7/20/14.
 */
public class ClientProxy extends CommonProxy{

    @Override
    public void initRenderers(){

    }

    public int addArmor(String armor){
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }

}
