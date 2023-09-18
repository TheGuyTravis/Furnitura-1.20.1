package net.travis.furnitura.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.travis.furnitura.FurnituraMod;
import net.travis.furnitura.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup FURNITURA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FurnituraMod.MOD_ID, "furnitura_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.furnitura_group"))
                    .icon(() -> new ItemStack(Items.NETHER_BRICK)).entries((displayContext, entries) -> {
                        entries.add(Items.DIAMOND);

                        entries.add(ModBlocks.OAK_DRAWER);

                    }).build());

    public static void registerItemGroups() {

    }
}
