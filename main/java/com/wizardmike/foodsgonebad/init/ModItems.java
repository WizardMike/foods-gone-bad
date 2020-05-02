package com.wizardmike.foodsgonebad.init;

import java.util.ArrayList;
import java.util.List;

import com.wizardmike.foodsgonebad.items.ItemBase;
import com.wizardmike.foodsgonebad.tools.ToolAxe;
import com.wizardmike.foodsgonebad.tools.ToolHoe;
import com.wizardmike.foodsgonebad.tools.ToolPickaxe;
import com.wizardmike.foodsgonebad.tools.ToolSpade;
import com.wizardmike.foodsgonebad.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_MOLDY_BREAD = EnumHelper.addToolMaterial("material_moldy_bread", 0 , 24 , 2.0F , 0.0F , 15);
	
	//Items
	public static final Item MOLDY_BREAD = new ItemBase("moldy_bread");
	public static final Item ROTTEN_EGG = new ItemBase("rotten_egg");
	
	//Tools
	public static final ItemSword MOLDY_SWORD = new ToolSword("moldy_sword" , MATERIAL_MOLDY_BREAD);
	public static final ItemSpade MOLDY_SHOVEL = new ToolSpade("moldy_shovel", MATERIAL_MOLDY_BREAD);
	public static final ItemPickaxe MOLDY_PICKAXE = new ToolPickaxe("moldy_pickaxe", MATERIAL_MOLDY_BREAD);
	public static final ItemAxe MOLDY_AXE = new ToolAxe("moldy_axe", MATERIAL_MOLDY_BREAD);
	public static final ItemHoe MOLDY_HOE = new ToolHoe("moldy_hoe", MATERIAL_MOLDY_BREAD);

}
