package com.phoenicis.tutorial;

import com.phoenicis.tutorial.registry.ModBlocks;
import com.phoenicis.tutorial.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Tutorial implements ModInitializer {

    public static final String MOD_ID = "pht";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
