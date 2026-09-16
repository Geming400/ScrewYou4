package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.CommandSuggestions.SuggestionsList.class)
public class SuggestionsList289615687Mixin {
        @Inject(at = @At("HEAD"), method = "select(I)V", cancellable = true)
    private void select_1057529455(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1057529455L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_258562056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(258562056L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(II)Z", cancellable = true)
    private void mouseClicked__290054628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-290054628L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(D)Z", cancellable = true)
    private void mouseScrolled__2124949725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2124949725L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "cycle(I)V", cancellable = true)
    private void cycle_1829825241(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1829825241L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "useSuggestion()V", cancellable = true)
    private void useSuggestion__2115804689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2115804689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractRenderState__926269975(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-926269975L))
            info.cancel();
    }


}
