/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package uk.faykent.cbgirl.init;

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
	// Start of user code block custom items
	// End of user code block custom items
}