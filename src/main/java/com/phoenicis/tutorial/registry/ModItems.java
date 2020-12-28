package com.phoenicis.tutorial.registry;

import com.phoenicis.tutorial.Tutorial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;

public class ModItems {
    // Items
    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    // Block Items
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        // Items
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "ruby"), RUBY);

        // Block Items
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "ruby_block"), RUBY_BLOCK);

    }
}
