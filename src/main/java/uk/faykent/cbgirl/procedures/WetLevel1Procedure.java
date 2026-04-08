package uk.faykent.cbgirl.procedures;

import uk.faykent.cbgirl.network.CbgirlModVariables;

import net.minecraft.world.entity.Entity;

public class WetLevel1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(CbgirlModVariables.PLAYER_VARIABLES).overlay_min >= 1) {
			return true;
		}
		return false;
	}
}