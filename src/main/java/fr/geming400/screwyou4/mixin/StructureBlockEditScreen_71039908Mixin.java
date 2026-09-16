package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.StructureBlockEditScreen.class)
public class StructureBlockEditScreen_71039908Mixin {
        @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize__1046576574(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1046576574L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1297055389(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1297055389L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_39986276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39986276L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1057919549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1057919549L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen_806862306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(806862306L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isInGameUi()Z", cancellable = true)
    private void isInGameUi__441446523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-441446523L))
            info.setReturnValue(true);
    }


}
