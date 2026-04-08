/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package uk.faykent.cbgirl.init;

import uk.faykent.cbgirl.CbgirlMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CbgirlModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CbgirlMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(CbgirlModItems.DIAPER_CAMMIE_PINK_A_LEGGINGS.get());
			tabData.accept(CbgirlModItems.DIAPER_CAMMIE_PINK_A_USED_LEGGINGS.get());
			tabData.accept(CbgirlModItems.DIAPER_CAMMIE_BLUE_A_LEGGINGS.get());
			tabData.accept(CbgirlModItems.DIAPER_CAMMIE_BLUE_A_USED_LEGGINGS.get());
		}
	}
}