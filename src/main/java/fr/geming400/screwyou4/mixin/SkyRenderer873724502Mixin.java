package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.SkyRenderer.class)
public class SkyRenderer873724502Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1240850927(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1240850927L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderDarkDisc()V", cancellable = true)
    private void renderDarkDisc_1067651016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1067651016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderSunriseAndSunset(Lcom/mojang/blaze3d/vertex/PoseStack;FI)V", cancellable = true)
    private void renderSunriseAndSunset_414210138(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(414210138L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderEndFlash(Lcom/mojang/blaze3d/vertex/PoseStack;FFF)V", cancellable = true)
    private void renderEndFlash__1029084940(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1029084940L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderSkyDisc(I)V", cancellable = true)
    private void renderSkyDisc_750829922(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(750829922L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderSunMoonAndStars(Lcom/mojang/blaze3d/vertex/PoseStack;FFFLnet/minecraft/world/level/MoonPhase;FF)V", cancellable = true)
    private void renderSunMoonAndStars__1050681395(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1050681395L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderEndSky()V", cancellable = true)
    private void renderEndSky_451534605(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(451534605L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/multiplayer/ClientLevel;FLnet/minecraft/client/Camera;Lnet/minecraft/client/renderer/state/level/SkyRenderState;)V", cancellable = true)
    private void extractRenderState_220160134(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(220160134L))
            info.cancel();
    }


}
