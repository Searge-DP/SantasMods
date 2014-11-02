package santa.decor.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * @author SatanicSanta
 */
public class ModelPumpkin extends ModelBase{

    ModelRenderer render;

    public ModelPumpkin(){
        render = new ModelRenderer(this, 18, 4);
        render.addBox(-6F, -10F, -7F, 12, 18, 10, 0F);
        render.setRotationPoint(0F, 5F, 2F);
        render.rotateAngleX = -0.4854F;
    }

    @Override
    public void render(Entity entity, float fuck0, float fuck1, float fuck2, float fuck3, float fuck4, float fuck5){
        setRotationAngles(fuck0, fuck1, fuck2, fuck3, fuck4, fuck5, entity);
        render.render(fuck5);
    }

}
