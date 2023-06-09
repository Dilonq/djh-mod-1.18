package net.djh.djhmod.item;

import net.djh.djhmod.DJHMod;
import net.djh.djhmod.item.custom.CellphoneItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item COPPER_COIN = registerItem("copper_coin",new Item(new FabricItemSettings().group(ModItemGroup.COINAGE)));
    public static final Item SILVER_COIN = registerItem("silver_coin",new Item(new FabricItemSettings().group(ModItemGroup.COINAGE)));
    public static final Item GOLD_COIN = registerItem("gold_coin",new Item(new FabricItemSettings().group(ModItemGroup.COINAGE)));
    public static final Item PLATINUM_COIN = registerItem("platinum_coin",new Item(new FabricItemSettings().group(ModItemGroup.COINAGE)));

    public static final Item CELLPHONE = registerItem("cellphone",new CellphoneItem(new FabricItemSettings().group(ModItemGroup.EXPLOSIVES)));
    public static final Item VEST = registerItem("vest_item",new ArmorItem(ModArmorMaterials.VEST, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.EXPLOSIVES)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(DJHMod.MODID, name), item);
    }

    public static void registerModItems(){
        DJHMod.LOGGER.info("registering mod items for "+DJHMod.MODID);
    }

}
