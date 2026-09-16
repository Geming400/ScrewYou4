package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.debug.DebugOptionsScreen.OptionList.class)
public class OptionList2108308434Mixin {
        @Inject(at = @At("HEAD"), method = "refreshEntries()V", cancellable = true)
    private void refreshEntries_214273648(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(214273648L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateSearch(Ljava/lang/String;)V", cancellable = true)
    private void updateSearch_1923388318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1923388318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractWidgetRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractWidgetRenderState__1098974448(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1098974448L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRowWidth()I", cancellable = true)
    private void getRowWidth_315087222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(315087222L))
            info.setReturnValue(1150207760);
    }


}
