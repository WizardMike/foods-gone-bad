package com.wizardmike.foodsgonebad.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

//Smelting Recipes
public class ModRecipes 
{
	
	public static void init() 
	{
		
		GameRegistry.addSmelting(ModItems.MOLDY_BREAD, new ItemStack(Items.BREAD, 1), 0.35F);
		
	}

}
