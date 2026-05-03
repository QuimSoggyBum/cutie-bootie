package uk.faykent.cbgirl.procedures;

import uk.faykent.cbgirl.init.CbgirlModItems;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

public class DiaperSackRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("c:nappies_dry")))
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("c:nappies_used")))) {
			entity.getPersistentData().putString("RemoteNappyTrigger", "");
			entity.getPersistentData().putDouble("msgBank", 0);
			entity.getPersistentData().putDouble("msgBanke", 0);
			entity.getPersistentData().putDouble("wetCount", 0);
			entity.getPersistentData().putDouble("messCount", 0);
			entity.getPersistentData().putBoolean("NappyOn", false);
			entity.getPersistentData().putBoolean("NappyDry", true);
			entity.getPersistentData().putBoolean("NappyMess", false);
			entity.getPersistentData().putDouble("NappyLevel", 50);
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CbgirlModItems.DIAPER_SACK_USED.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(1, new ItemStack(Blocks.AIR));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Blocks.AIR));
				}
			}
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
		}
	}
}