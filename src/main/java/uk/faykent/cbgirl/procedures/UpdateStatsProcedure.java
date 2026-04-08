package uk.faykent.cbgirl.procedures;

import uk.faykent.cbgirl.network.CbgirlModVariables;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

@EventBusSubscriber
public class UpdateStatsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (!(entity.getData(CbgirlModVariables.PLAYER_VARIABLES).overlay_min == entity.getPersistentData().getDouble("wetCount"))) {
				{
					CbgirlModVariables.PlayerVariables _vars = entity.getData(CbgirlModVariables.PLAYER_VARIABLES);
					_vars.overlay_min = entity.getPersistentData().getDouble("wetCount");
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((entity.getData(CbgirlModVariables.PLAYER_VARIABLES).overlay_min + " : " + entity.getPersistentData().getDouble("wetCount"))), true);
			}
			if (!(entity.getData(CbgirlModVariables.PLAYER_VARIABLES).overlay_nappy_on == entity.getPersistentData().getBoolean("NappyOn"))) {
				{
					CbgirlModVariables.PlayerVariables _vars = entity.getData(CbgirlModVariables.PLAYER_VARIABLES);
					_vars.overlay_nappy_on = entity.getPersistentData().getBoolean("NappyOn");
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}