package com.wizardmike.foodsgonebad.tools;

import com.wizardmike.foodsgonebad.Main;
import com.wizardmike.foodsgonebad.init.ModItems;
import com.wizardmike.foodsgonebad.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel
{
	
	public ToolAxe(String name, ToolMaterial material) 
	{
		super(material, 6.0F, -3.3F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this , 0 , "inventory");
	}

}
