package com.bidahochi.BlockMod.blocks.constructionmaterials;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemBlocklabwallDark extends ItemBlockWithMetadata {

    public ItemBlocklabwallDark(Block block) {
        super(block, block);
    }

    public String getUnlocalizedName( ItemStack item){
        return this.getUnlocalizedName() + "_" + item.getItemDamage();
    }
}
