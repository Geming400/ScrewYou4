package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.BossHealthOverlay.class)
public class BossHealthOverlay973120953Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_1011395692(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1011395692L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/network/protocol/game/ClientboundBossEventPacket;)V", cancellable = true)
    private void update_42212606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(42212606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldCreateWorldFog()Z", cancellable = true)
    private void shouldCreateWorldFog_1011399536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1011399536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldDarkenScreen()Z", cancellable = true)
    private void shouldDarkenScreen_1011399536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1011399536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractRenderState_285205665(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(285205665L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldPlayMusic()Z", cancellable = true)
    private void shouldPlayMusic_1011399536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1011399536L))
            info.setReturnValue(null);
    }


}
