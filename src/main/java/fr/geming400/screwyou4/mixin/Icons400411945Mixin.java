package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.toasts.TutorialToast.Icons.class)
public class Icons400411945Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/components/toasts/TutorialToast$Icons;", cancellable = true)
    private static void values__1063409419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1063409419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/components/toasts/TutorialToast$Icons;", cancellable = true)
    private static void valueOf_517553276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(517553276L))
            info.setReturnValue(net.minecraft.client.gui.components.toasts.TutorialToast.Icons.RIGHT_CLICK);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractRenderState__815473717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-815473717L))
            info.cancel();
    }


}
