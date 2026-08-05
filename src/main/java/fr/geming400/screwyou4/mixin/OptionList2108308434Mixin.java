package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.debug.DebugOptionsScreen.OptionList.class)
public class OptionList2108308434Mixin {
        @Inject(at = @At("HEAD"), method = "extractWidgetRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractWidgetRenderState_1148621062(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1148621062L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRowWidth()I", cancellable = true)
    private void getRowWidth_2146570680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2146570680L))
            info.setReturnValue(1454898496);
    }

    @Inject(at = @At("HEAD"), method = "refreshEntries()V", cancellable = true)
    private void refreshEntries_2146583173(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2146583173L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateSearch(Ljava/lang/String;)V", cancellable = true)
    private void updateSearch__1034297713(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1034297713L))
            info.cancel();
    }


}
