package uk.faykent.cbgirl.procedures;

import uk.faykent.cbgirl.network.CbgirlModVariables;

import net.minecraft.world.entity.Entity;

public class WetLevel4Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(CbgirlModVariables.PLAYER_VARIABLES).overlay_min >= 4) {
			return true;
		}
		return false;
	}
}