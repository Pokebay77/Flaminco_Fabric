package net.smertking.flaminco.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.smertking.flaminco.Flaminco;

public class ModItems {

    public static final Item COPPER_FLAMINCO = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item IRON_FLAMINCO = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item GOLD_FLAMINCO = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item DIAMOND_FLAMINCO = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Flaminco.MOD_ID, "copper_flaminco"), COPPER_FLAMINCO);
        Registry.register(Registry.ITEM, new Identifier(Flaminco.MOD_ID, "iron_flaminco"), IRON_FLAMINCO);
        Registry.register(Registry.ITEM, new Identifier(Flaminco.MOD_ID, "gold_flaminco"), GOLD_FLAMINCO);
        Registry.register(Registry.ITEM, new Identifier(Flaminco.MOD_ID, "diamond_flaminco"), DIAMOND_FLAMINCO);
    }

}
