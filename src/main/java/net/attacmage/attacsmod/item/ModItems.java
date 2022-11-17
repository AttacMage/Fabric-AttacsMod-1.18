package net.attacmage.attacsmod.item;

import net.attacmage.attacsmod.AttacsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item ELECTRO_ESSENCE = registerItem("electro_essence",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item ELECTRO_WHOLE = registerItem("electro_whole",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(AttacsMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        AttacsMod.LOGGER.info("Registering mod items for " + AttacsMod.MOD_ID);
    }


}
