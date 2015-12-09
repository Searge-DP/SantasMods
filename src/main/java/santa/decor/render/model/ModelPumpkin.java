package santa.decor.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPumpkin extends ModelBase {
    ModelRenderer render;

    public ModelPumpkin() {
        render = new ModelRenderer(this, 18, 4);
        render.addBox(-6F, -10F, -7F, 12, 18, 10, 0F);
        render.setRotationPoint(0F, 5F, 2F);
        render.rotateAngleX = -0.4854F;
    }

    @Override
    public void render(Entity entity, float par1, float par2, float par3, float par4, float par5, float par6) {
        setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
        render.render(par5);
    }
}
