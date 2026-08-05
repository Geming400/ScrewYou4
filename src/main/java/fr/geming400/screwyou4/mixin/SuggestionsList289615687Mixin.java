package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.CommandSuggestions.SuggestionsList.class)
public class SuggestionsList289615687Mixin {
        @Inject(at = @At("HEAD"), method = "select(I)V", cancellable = true)
    private void select_1503532659(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1503532659L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cycle(I)V", cancellable = true)
    private void cycle_1503532659(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1503532659L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__627020027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-627020027L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "useSuggestion()V", cancellable = true)
    private void useSuggestion_327890426(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(327890426L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractRenderState_1504789519(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1504789519L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(II)Z", cancellable = true)
    private void mouseClicked__706259938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-706259938L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(D)Z", cancellable = true)
    private void mouseScrolled_1498918898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1498918898L))
            info.setReturnValue(true);
    }


}
