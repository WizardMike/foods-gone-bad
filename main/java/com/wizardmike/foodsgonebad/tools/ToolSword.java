package com.wizardmike.foodsgonebad.tools;

import com.wizardmike.foodsgonebad.Main;
import com.wizardmike.foodsgonebad.init.ModItems;
import com.wizardmike.foodsgonebad.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel
{
	
	public ToolSword (String name , ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this , 0 , "inventory");
	}

}
