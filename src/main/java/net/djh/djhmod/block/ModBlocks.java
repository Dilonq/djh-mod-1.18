package net.djh.djhmod.block;

import net.djh.djhmod.DJHMod;
import net.djh.djhmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;

public class ModBlocks {

    public static final Block COMPUTER_FORTH = registerBlock("computer_forth", new Block(FabricBlockSettings.of(Material.METAL)), ModItemGroup.FORTH_TAB);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(DJHMod.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(DJHMod.MODID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        DJHMod.LOGGER.info("registering ModBlocks for "+DJHMod.MODID);
    }
}
