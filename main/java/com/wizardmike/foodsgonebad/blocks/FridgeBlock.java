package com.wizardmike.foodsgonebad.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FridgeBlock extends BlockBase
{

	public FridgeBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(18.0F);
		setHarvestLevel("pickaxe" , 1);
		setLightLevel(0.3F);
		//setLightOpacity(0);
		//setBlockUnbreakable();
	}
	
	

}
