package lum.vertical_slabs.creativemodetab;

import lum.vertical_slabs.VerticalSlabs;
import lum.vertical_slabs.block.ModBlocks;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModTabs {
    public static final CreativeModeTab VERTICAL_SLABS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(VerticalSlabs.MOD_ID, "vertical_slabs"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PLACEHOLDER))
                    .title(Component.translatable("itemGroup.vertical_slabs.vertical_slabs"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.PLACEHOLDER);
                    })
                    .build());

    public static void registerModCreativeModTabs() {

    }
}
