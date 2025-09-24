package at.samispeedfire.tutorialmod.item;

import at.samispeedfire.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> SERVER = ITEMS.register("server",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMD_EPYC = ITEMS.register("amd_epyc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAINBOARD = ITEMS.register("mainboard",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}