package betteragriculture.items;

import javax.annotation.Nullable;

import betteragriculture.Main;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;

public class ItemMilk extends ItemBucketMilk {

	public ItemMilk(String string,String name) {
	    this.setUnlocalizedName(name);
	    this.setCreativeTab(Main.tab);
	    this.setRegistryName(name);
	}

   

}