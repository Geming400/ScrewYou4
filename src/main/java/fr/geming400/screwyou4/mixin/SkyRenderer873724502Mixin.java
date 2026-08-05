package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.SkyRenderer.class)
public class SkyRenderer873724502Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_911999241(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(911999241L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderEndSky()V", cancellable = true)
    private void renderEndSky_911999241(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(911999241L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/multiplayer/ClientLevel;FLnet/minecraft/client/Camera;Lnet/minecraft/client/renderer/state/level/SkyRenderState;)V", cancellable = true)
    private void extractRenderState__1206387168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1206387168L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderEndFlash(Lcom/mojang/blaze3d/vertex/PoseStack;FFF)V", cancellable = true)
    private void renderEndFlash_502110879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(502110879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderSunMoonAndStars(Lcom/mojang/blaze3d/vertex/PoseStack;FFFLnet/minecraft/world/level/MoonPhase;FF)V", cancellable = true)
    private void renderSunMoonAndStars__1561832596(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1561832596L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderSkyDisc(I)V", cancellable = true)
    private void renderSkyDisc_2087641474(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2087641474L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderDarkDisc()V", cancellable = true)
    private void renderDarkDisc_911999241(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(911999241L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderSunriseAndSunset(Lcom/mojang/blaze3d/vertex/PoseStack;FI)V", cancellable = true)
    private void renderSunriseAndSunset_32429036(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(32429036L))
            info.cancel();
    }


}
