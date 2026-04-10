package uk.faykent.cbgirl.procedures;

import uk.faykent.cbgirl.network.CbgirlModVariables;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

public class WetBarDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(CbgirlModVariables.PLAYER_VARIABLES).overlay_nappy_on
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("c:nappies_dry")))
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("c:nappies_used")))) {
			if (!(Minecraft.getInstance().options.hideGui)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}