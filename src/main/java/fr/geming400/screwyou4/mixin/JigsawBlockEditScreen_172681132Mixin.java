package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.JigsawBlockEditScreen.class)
public class JigsawBlockEditScreen_172681132Mixin {
        @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize__944935350(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-944935350L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1398696613(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1398696613L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1159560773(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1159560773L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_141627500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141627500L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isValidIdentifier(Ljava/lang/String;)Z", cancellable = true)
    private static void isValidIdentifier__1450579767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450579767L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isInGameUi()Z", cancellable = true)
    private void isInGameUi__339805299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-339805299L))
            info.setReturnValue(true);
    }


}
