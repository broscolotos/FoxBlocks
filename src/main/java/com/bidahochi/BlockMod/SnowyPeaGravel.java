package com.bidahochi.BlockMod;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class SnowyPeaGravel extends BlockFalling {

    protected SnowyPeaGravel(Material p_i45394_1_) {
        super(p_i45394_1_);
        setBlockName("Snowy Pea Gravel");

        setBlockTextureName(FoxBlocks.MODID+":peagravel_snow");

    }
}
