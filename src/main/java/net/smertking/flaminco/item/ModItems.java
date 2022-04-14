package net.smertking.flaminco.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.smertking.flaminco.Flaminco;

public class ModItems {

    //Items
    public static final Item COPPER_FLAMINCO = new Item(new Item.Settings().group(ModItemGroup.FLAMINCO));
    public static final Item IRON_FLAMINCO = new Item(new Item.Settings().group(ModItemGroup.FLAMINCO));
    public static final Item GOLD_FLAMINCO = new Item(new Item.Settings().group(ModItemGroup.FLAMINCO));
    public static final Item DIAMOND_FLAMINCO = new Item(new Item.Settings().group(ModItemGroup.FLAMINCO));

    //Blocks
    public static final BlockItem COPPERF_BLOCK = new BlockItem(ModBlocks.COPPERF_BLOCK, new Item.Settings().group(ModItemGroup.FLAMINCO));
    public static final BlockItem IRONF_BLOCK = new BlockItem(ModBlocks.IRONF_BLOCK, new Item.Settings().group(ModItemGroup.FLAMINCO));
    public static final BlockItem GOLDF_BLOCK = new BlockItem(ModBlocks.GOLDF_BLOCK, new Item.Settings().group(ModItemGroup.FLAMINCO));
    public static final BlockItem DIAMONDF_BLOCK = new BlockItem(ModBlocks.DIAMONDF_BLOCK, new Item.Settings().group(ModItemGroup.FLAMINCO));

    public static void registerItems() {

        //Items
        Registry.register(Registry.ITEM, new Identifier(Flaminco.MOD_ID, "copper_flaminco"), COPPER_FLAMINCO);
        Registry.register(Registry.ITEM, new Identifier(Flaminco.MOD_ID, "iron_flaminco"), IRON_FLAMINCO);
        Registry.register(Registry.ITEM, new Identifier(Flaminco.MOD_ID, "gold_flaminco"), GOLD_FLAMINCO);
        Registry.register(Registry.ITEM, new Identifier(Flaminco.MOD_ID, "diamond_flaminco"), DIAMOND_FLAMINCO);

        //Blocks
        Registry.register(Registry.ITEM, new Identifier(Flaminco.MOD_ID, "copperf_block"), COPPERF_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Flaminco.MOD_ID, "ironf_block"), IRONF_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Flaminco.MOD_ID, "goldf_block"), GOLDF_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Flaminco.MOD_ID, "diamondf_block"), DIAMONDF_BLOCK);
    }

}
