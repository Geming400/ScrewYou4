package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.LevelLoadingScreen.class)
public class LevelLoadingScreen751592204Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/multiplayer/LevelLoadTracker;Lnet/minecraft/client/gui/screens/LevelLoadingScreen$Reason;)V", cancellable = true)
    private void update__1391556061(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1391556061L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1977607686(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1977607686L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_621908546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(621908546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractChunksForRendering(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIIILnet/minecraft/server/level/progress/ChunkLoadStatusView;)V", cancellable = true)
    private static void extractChunksForRendering__2016460380(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2016460380L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_162495826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(162495826L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1738471846(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1738471846L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen_1487414603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1487414603L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__2141920559(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2141920559L))
            info.cancel();
    }


}
