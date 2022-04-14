package net.smertking.flaminco.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.smertking.flaminco.Flaminco;

public class ModItemGroup {

    public static final ItemGroup FLAMINCO = FabricItemGroupBuilder.build(new Identifier(Flaminco.MOD_ID,"flaminco"),()-> new ItemStack(ModItems.DIAMOND_FLAMINCO));

}
