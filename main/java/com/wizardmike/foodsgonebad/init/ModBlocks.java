package com.wizardmike.foodsgonebad.init;

import java.util.ArrayList;
import java.util.List;

import com.wizardmike.foodsgonebad.blocks.BlockBase;
import com.wizardmike.foodsgonebad.blocks.FridgeBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block FRIDGE_BLOCK = new FridgeBlock("fridge_block" , Material.IRON);

}
