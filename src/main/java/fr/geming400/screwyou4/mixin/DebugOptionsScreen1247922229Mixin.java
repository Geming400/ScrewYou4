package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.debug.DebugOptionsScreen.class)
public class DebugOptionsScreen1247922229Mixin {
        @Inject(at = @At("HEAD"), method = "getOptionList()Lnet/minecraft/client/gui/screens/debug/DebugOptionsScreen$OptionList;", cancellable = true)
    private void getOptionList__1989931893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1989931893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractBlurredBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractBlurredBackground_560006941(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(560006941L))
            info.cancel();
    }


}
