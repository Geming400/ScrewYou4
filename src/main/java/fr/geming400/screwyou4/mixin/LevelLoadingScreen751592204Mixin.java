package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.LevelLoadingScreen.class)
public class LevelLoadingScreen751592204Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/multiplayer/LevelLoadTracker;Lnet/minecraft/client/gui/screens/LevelLoadingScreen$Reason;)V", cancellable = true)
    private void update__1858356262(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1858356262L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_789866943(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(789866943L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_789866943(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(789866943L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__208095168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-208095168L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractChunksForRendering(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIIILnet/minecraft/server/level/progress/ChunkLoadStatusView;)V", cancellable = true)
    private static void extractChunksForRendering_2115138894(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2115138894L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_789870787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(789870787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen_789870787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(789870787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__208095168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-208095168L))
            info.cancel();
    }


}
