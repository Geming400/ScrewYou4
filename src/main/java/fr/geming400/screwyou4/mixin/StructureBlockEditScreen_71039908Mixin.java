package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.StructureBlockEditScreen.class)
public class StructureBlockEditScreen_71039908Mixin {
        @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize__924839562(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-924839562L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_109314646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(109314646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen_109318490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109318490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__888647465(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-888647465L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInGameUi()Z", cancellable = true)
    private void isInGameUi_109318490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109318490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__845595807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-845595807L))
            info.setReturnValue(null);
    }


}
