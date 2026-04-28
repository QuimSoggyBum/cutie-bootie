package uk.faykent.cbgirl.procedures;

import uk.faykent.cbgirl.network.CbgirlModVariables;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

public class CutieBootieBoostersRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("c:nappies_dry")))) {
			if (entity.getData(CbgirlModVariables.PLAYER_VARIABLES).overlay_min < 1) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((Component.translatable("chat.cbgirl.title").getString() + "" + Component.translatable("item.cbgirl.booster.diaperdry").getString())), false);
			}
			if (entity.getData(CbgirlModVariables.PLAYER_VARIABLES).overlay_min >= 1 && entity.getData(CbgirlModVariables.PLAYER_VARIABLES).overlay_min < 6) {
				entity.getPersistentData().putDouble("wetCount", (entity.getData(CbgirlModVariables.PLAYER_VARIABLES).overlay_min - 1));
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("c:nappies_used")))) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((Component.translatable("chat.cbgirl.title").getString() + "" + Component.translatable("item.cbgirl.booster.diaperused").getString())), false);
		}
	}
}