package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.BossHealthOverlay.class)
public class BossHealthOverlay973120953Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset__756316035(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-756316035L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/network/protocol/game/ClientboundBossEventPacket;)V", cancellable = true)
    private void update__1311587883(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1311587883L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldPlayMusic()Z", cancellable = true)
    private void shouldPlayMusic__180928686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-180928686L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractRenderState_836865275(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(836865275L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldDarkenScreen()Z", cancellable = true)
    private void shouldDarkenScreen_726002930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726002930L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldCreateWorldFog()Z", cancellable = true)
    private void shouldCreateWorldFog__1610169643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1610169643L))
            info.setReturnValue(true);
    }


}
