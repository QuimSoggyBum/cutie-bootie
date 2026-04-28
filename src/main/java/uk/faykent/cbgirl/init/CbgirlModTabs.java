/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package uk.faykent.cbgirl.init;

import uk.faykent.cbgirl.CbgirlMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

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
				tabData.accept(CbgirlModItems.PACK_OF_CAMMIE_PINKS.get());
				tabData.accept(CbgirlModItems.PACK_OF_CAMMIE_BLUE.get());
				tabData.accept(CbgirlModItems.PACK_OF_REARZ_REBEL.get());
				tabData.accept(CbgirlModItems.PACK_OF_CUTIE_BOOTIES_PRIDE_V_1.get());
				tabData.accept(CbgirlModItems.PACK_OF_CLASSICO_V_2.get());
				tabData.accept(CbgirlModItems.PACK_OF_BIO_MASS.get());
				tabData.accept(CbgirlModItems.CUTIE_BOOTIE_BOOSTERS.get());
			}).withSearchBar().build());
}