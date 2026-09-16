package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.DeathScreen.class)
public class DeathScreen_952287758Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_822604099(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(822604099L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAllowedInPortal()Z", cancellable = true)
    private void isAllowedInPortal__1244447755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1244447755L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_411781581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411781581L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_363191379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(363191379L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1939167399(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1939167399L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen_1688110156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1688110156L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__1941225006(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1941225006L))
            info.cancel();
    }


}
