package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobNpcFemale1;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobNpcMale extends RenderLiving<EntityMobNpcFemale1>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/npcfemale1.png");

	public RenderEntityMobNpcMale(RenderManager renderManager)
	{
		super(renderManager, new ModelBiped(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobNpcFemale1 entity)
	{
		return textures;
	}
}