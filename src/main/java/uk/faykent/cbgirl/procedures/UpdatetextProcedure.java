package uk.faykent.cbgirl.procedures;

import uk.faykent.cbgirl.network.CbgirlModVariables;

import net.minecraft.world.entity.Entity;

public class UpdatetextProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return ("" + entity.getData(CbgirlModVariables.PLAYER_VARIABLES).overlay_min).replace(".0", "");
	}
}