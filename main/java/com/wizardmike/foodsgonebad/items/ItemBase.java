package com.wizardmike.foodsgonebad.items;

import com.wizardmike.foodsgonebad.Main;
import com.wizardmike.foodsgonebad.init.ModItems;
import com.wizardmike.foodsgonebad.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this , 0 , "inventory");
	}
	
	

}
