package net.djh.djhmod.item;

import net.djh.djhmod.DJHMod;
import net.djh.djhmod.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup COINAGE = FabricItemGroupBuilder.build(new Identifier(DJHMod.MODID,"coinage"), () -> new ItemStack(ModItems.COPPER_COIN));
    public static final ItemGroup COMPUTING = FabricItemGroupBuilder.build(new Identifier(DJHMod.MODID,"computing"), () -> new ItemStack(ModBlocks.COMPUTER_FORTH));
    public static final ItemGroup EXPLOSIVES = FabricItemGroupBuilder.build(new Identifier(DJHMod.MODID,"explosives"), () -> new ItemStack(ModItems.CELLPHONE));
}
