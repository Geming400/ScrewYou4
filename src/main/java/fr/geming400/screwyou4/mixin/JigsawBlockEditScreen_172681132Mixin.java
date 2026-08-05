package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.JigsawBlockEditScreen.class)
public class JigsawBlockEditScreen_172681132Mixin {
        @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize__823198338(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-823198338L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_210955870(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(210955870L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__787006241(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-787006241L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isValidIdentifier(Ljava/lang/String;)Z", cancellable = true)
    private static void isValidIdentifier_1325046372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1325046372L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isInGameUi()Z", cancellable = true)
    private void isInGameUi_210959714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(210959714L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__743954583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-743954583L))
            info.setReturnValue(false);
    }


}
