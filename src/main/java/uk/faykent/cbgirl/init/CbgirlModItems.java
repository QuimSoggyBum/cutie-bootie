/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package uk.faykent.cbgirl.init;

import uk.faykent.cbgirl.item.DiaperSkullUsedItem;
import uk.faykent.cbgirl.item.DiaperSkullItem;
import uk.faykent.cbgirl.item.DiaperSkullAUsedItem;
import uk.faykent.cbgirl.item.DiaperSkullAItem;
import uk.faykent.cbgirl.item.DiaperPridev1UsedItem;
import uk.faykent.cbgirl.item.DiaperPridev1Item;
import uk.faykent.cbgirl.item.DiaperPridev1AUsedItem;
import uk.faykent.cbgirl.item.DiaperPridev1AItem;
import uk.faykent.cbgirl.item.DiaperCammiePinkUsedItem;
import uk.faykent.cbgirl.item.DiaperCammiePinkItem;
import uk.faykent.cbgirl.item.DiaperCammiePinkAUsedItem;
import uk.faykent.cbgirl.item.DiaperCammiePinkAItem;
import uk.faykent.cbgirl.item.DiaperCammieBlueUsedItem;
import uk.faykent.cbgirl.item.DiaperCammieBlueItem;
import uk.faykent.cbgirl.item.DiaperCammieBlueAUsedItem;
import uk.faykent.cbgirl.item.DiaperCammieBlueAItem;
import uk.faykent.cbgirl.CbgirlMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

public class CbgirlModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CbgirlMod.MODID);
	public static final DeferredItem<Item> DIAPER_CAMMIE_PINK = REGISTRY.register("diaper_cammie_pink", DiaperCammiePinkItem::new);
	public static final DeferredItem<Item> DIAPER_CAMMIE_PINK_USED = REGISTRY.register("diaper_cammie_pink_used", DiaperCammiePinkUsedItem::new);
	public static final DeferredItem<Item> DIAPER_CAMMIE_PINK_A_LEGGINGS = REGISTRY.register("diaper_cammie_pink_a_leggings", DiaperCammiePinkAItem.Leggings::new);
	public static final DeferredItem<Item> DIAPER_CAMMIE_PINK_A_USED_LEGGINGS = REGISTRY.register("diaper_cammie_pink_a_used_leggings", DiaperCammiePinkAUsedItem.Leggings::new);
	public static final DeferredItem<Item> DIAPER_CAMMIE_BLUE_A_LEGGINGS = REGISTRY.register("diaper_cammie_blue_a_leggings", DiaperCammieBlueAItem.Leggings::new);
	public static final DeferredItem<Item> DIAPER_CAMMIE_BLUE_A_USED_LEGGINGS = REGISTRY.register("diaper_cammie_blue_a_used_leggings", DiaperCammieBlueAUsedItem.Leggings::new);
	public static final DeferredItem<Item> DIAPER_CAMMIE_BLUE = REGISTRY.register("diaper_cammie_blue", DiaperCammieBlueItem::new);
	public static final DeferredItem<Item> DIAPER_CAMMIE_BLUE_USED = REGISTRY.register("diaper_cammie_blue_used", DiaperCammieBlueUsedItem::new);
	public static final DeferredItem<Item> DIAPER_SKULL_A_LEGGINGS = REGISTRY.register("diaper_skull_a_leggings", DiaperSkullAItem.Leggings::new);
	public static final DeferredItem<Item> DIAPER_SKULL_A_USED_LEGGINGS = REGISTRY.register("diaper_skull_a_used_leggings", DiaperSkullAUsedItem.Leggings::new);
	public static final DeferredItem<Item> DIAPER_SKULL = REGISTRY.register("diaper_skull", DiaperSkullItem::new);
	public static final DeferredItem<Item> DIAPER_SKULL_USED = REGISTRY.register("diaper_skull_used", DiaperSkullUsedItem::new);
	public static final DeferredItem<Item> DIAPER_PRIDEV_1 = REGISTRY.register("diaper_pridev_1", DiaperPridev1Item::new);
	public static final DeferredItem<Item> DIAPER_PRIDEV_1_USED = REGISTRY.register("diaper_pridev_1_used", DiaperPridev1UsedItem::new);
	public static final DeferredItem<Item> DIAPER_PRIDEV_1_A_LEGGINGS = REGISTRY.register("diaper_pridev_1_a_leggings", DiaperPridev1AItem.Leggings::new);
	public static final DeferredItem<Item> DIAPER_PRIDEV_1_A_USED_LEGGINGS = REGISTRY.register("diaper_pridev_1_a_used_leggings", DiaperPridev1AUsedItem.Leggings::new);
	// Start of user code block custom items
	// End of user code block custom items
}