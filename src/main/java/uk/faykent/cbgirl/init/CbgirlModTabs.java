/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package uk.faykent.cbgirl.init;

import uk.faykent.cbgirl.CbgirlMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CbgirlModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CbgirlMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CUTIE_BOOTIE = REGISTRY.register("cutie_bootie",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.cbgirl.cutie_bootie")).icon(() -> new ItemStack(CbgirlModItems.DIAPER_PRIDEV_1.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CbgirlModItems.DIAPER_CAMMIE_PINK.get());
				tabData.accept(CbgirlModItems.DIAPER_CAMMIE_BLUE.get());
				tabData.accept(CbgirlModItems.DIAPER_SKULL.get());
				tabData.accept(CbgirlModItems.DIAPER_PRIDEV_1.get());
				tabData.accept(CbgirlModItems.DIAPER_CLASSICO.get());
				tabData.accept(CbgirlModItems.DIAPER_BIO_MASS.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(CbgirlModItems.DIAPER_CAMMIE_PINK_A_LEGGINGS.get());
		}
	}
}