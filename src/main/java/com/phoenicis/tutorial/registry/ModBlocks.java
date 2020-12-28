package com.phoenicis.tutorial.registry;

import com.phoenicis.tutorial.Tutorial;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().luminance(10).strength(5f, 30f).sounds(BlockSoundGroup.ANVIL).jumpVelocityMultiplier(10f));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Tutorial.MOD_ID, "ruby_block"), RUBY_BLOCK);
    }
}
