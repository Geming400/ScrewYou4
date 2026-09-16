package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.toasts.AdvancementToast.class)
public class AdvancementToast_593884651Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/gui/components/toasts/ToastManager;J)V", cancellable = true)
    private void update__1726911285(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1726911285L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSoundEvent()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getSoundEvent__1013916693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1013916693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWantedVisibility()Lnet/minecraft/client/gui/components/toasts/Toast$Visibility;", cancellable = true)
    private void getWantedVisibility_1186062842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1186062842L))
            info.setReturnValue(net.minecraft.client.gui.components.toasts.Toast.Visibility.SHOW);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;J)V", cancellable = true)
    private void extractRenderState__923566270(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-923566270L))
            info.cancel();
    }


}
