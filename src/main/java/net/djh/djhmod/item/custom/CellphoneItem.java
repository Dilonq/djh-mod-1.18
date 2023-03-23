package net.djh.djhmod.item.custom;

import net.djh.djhmod.item.ModItems;
import net.fabricmc.loader.impl.lib.sat4j.core.Vec;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.explosion.*;
import net.minecraft.entity.damage.*;
import net.minecraft.world.*;

public class CellphoneItem extends Item {

    public int frequency;
    public CellphoneItem(Settings settings){
        super(settings);
        frequency = 0;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        trigger(world, user, hand);
        return super.use(world, user, hand);
    }

    private void trigger(World world, PlayerEntity user, Hand hand){

    }

}
