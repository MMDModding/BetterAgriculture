package com.knoxhack.betteragriculture.client.render;

import com.knoxhack.betteragriculture.entities.cow.EntityMobCow5;

import net.minecraft.client.model.ModelCow;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobCow5 extends RenderLiving<EntityMobCow5>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/cow5.png");

	public RenderEntityMobCow5(RenderManager renderManager)
	{
		super(renderManager, new ModelCow(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobCow5 entity)
	{
		return textures;
	}
}