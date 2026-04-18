package uk.faykent.cbgirl.client.screens;

import uk.faykent.cbgirl.procedures.WetLevel6Procedure;
import uk.faykent.cbgirl.procedures.WetLevel5Procedure;
import uk.faykent.cbgirl.procedures.WetLevel4Procedure;
import uk.faykent.cbgirl.procedures.WetLevel3Procedure;
import uk.faykent.cbgirl.procedures.WetLevel2Procedure;
import uk.faykent.cbgirl.procedures.WetLevel1Procedure;
import uk.faykent.cbgirl.procedures.WetBarDisplayOverlayIngameProcedure;

import org.checkerframework.checker.units.qual.h;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@EventBusSubscriber({Dist.CLIENT})
public class WetBarOverlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getGuiGraphics().guiWidth();
		int h = event.getGuiGraphics().guiHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (WetBarDisplayOverlayIngameProcedure.execute(entity)) {
			event.getGuiGraphics().blit(ResourceLocation.parse("cbgirl:textures/screens/wettemp.png"), w - 23, h - 18, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().blit(ResourceLocation.parse("cbgirl:textures/screens/wettemp.png"), w - 23, h - 27, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().blit(ResourceLocation.parse("cbgirl:textures/screens/wettemp.png"), w - 23, h - 36, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().blit(ResourceLocation.parse("cbgirl:textures/screens/wettemp.png"), w - 23, h - 45, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().blit(ResourceLocation.parse("cbgirl:textures/screens/wettemp.png"), w - 23, h - 54, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().blit(ResourceLocation.parse("cbgirl:textures/screens/wettemp.png"), w - 23, h - 63, 0, 0, 16, 16, 16, 16);

			if (WetLevel1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("cbgirl:textures/screens/wetfull.png"), w - 23, h - 18, 0, 0, 16, 16, 16, 16);
			}
			if (WetLevel2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("cbgirl:textures/screens/wetfull.png"), w - 23, h - 27, 0, 0, 16, 16, 16, 16);
			}
			if (WetLevel3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("cbgirl:textures/screens/wetfull.png"), w - 23, h - 36, 0, 0, 16, 16, 16, 16);
			}
			if (WetLevel4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("cbgirl:textures/screens/wetfull.png"), w - 23, h - 45, 0, 0, 16, 16, 16, 16);
			}
			if (WetLevel5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("cbgirl:textures/screens/wetfull.png"), w - 23, h - 54, 0, 0, 16, 16, 16, 16);
			}
			if (WetLevel6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(ResourceLocation.parse("cbgirl:textures/screens/wetfull.png"), w - 23, h - 63, 0, 0, 16, 16, 16, 16);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}