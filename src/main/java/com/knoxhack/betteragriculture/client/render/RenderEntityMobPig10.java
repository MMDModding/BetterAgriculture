package com.knoxhack.betteragriculture.client.render;

import com.knoxhack.betteragriculture.entities.pig.EntityMobPig10;

import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobPig10 extends RenderLiving<EntityMobPig10>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/pig10.png");

	public RenderEntityMobPig10(RenderManager renderManager)
	{
		super(renderManager, new ModelPig(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobPig10 entity)
	{
		return textures;
	}
}