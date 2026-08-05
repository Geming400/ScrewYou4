package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.toasts.TutorialToast.Icons.class)
public class Icons400411945Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/components/toasts/TutorialToast$Icons;", cancellable = true)
    private static void values_928272599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(928272599L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/components/toasts/TutorialToast$Icons;", cancellable = true)
    private static void valueOf_356304724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(356304724L))
            info.setReturnValue(net.minecraft.client.gui.components.toasts.TutorialToast.Icons.SOCIAL_INTERACTIONS);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractRenderState_1615585777(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1615585777L))
            info.cancel();
    }


}
