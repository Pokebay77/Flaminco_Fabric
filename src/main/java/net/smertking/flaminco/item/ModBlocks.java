package net.smertking.flaminco.item;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.smertking.flaminco.Flaminco;

public class ModBlocks {

    public static final Block COPPERF_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .requiresTool()
            .strength(5.0f,30.0f)
            .strength(4f)
            .sounds(BlockSoundGroup.METAL));

    public static final Block IRONF_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .requiresTool()
            .strength(5.0f,30.0f)
            .strength(4f)
            .sounds(BlockSoundGroup.METAL));

    public static final Block GOLDF_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .requiresTool()
            .strength(5.0f,30.0f)
            .strength(4f)
            .sounds(BlockSoundGroup.METAL));

    public static final Block DIAMONDF_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .requiresTool()
            .strength(5.0f,30.0f)
            .strength(4f)
            .sounds(BlockSoundGroup.METAL));


    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Flaminco.MOD_ID, "copperf_block"), COPPERF_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Flaminco.MOD_ID, "ironf_block"), IRONF_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Flaminco.MOD_ID, "goldf_block"), GOLDF_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Flaminco.MOD_ID, "diamondf_block"), DIAMONDF_BLOCK);
    }
}


