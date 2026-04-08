package uk.faykent.cbgirl.procedures;

import uk.faykent.cbgirl.network.CbgirlModVariables;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class TestOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal((entity.getDisplayName().getString() + "is NBT:" + ("" + entity.getPersistentData().getDouble("wetCount")).replace(".0", "") + "is Global:"
					+ ("" + entity.getData(CbgirlModVariables.PLAYER_VARIABLES).overlay_min).replace(".0", "") + " ")), false);
	}
}