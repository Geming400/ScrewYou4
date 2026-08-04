package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.toasts.AdvancementToast.class)
public class AdvancementToast_593884651Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/gui/components/toasts/ToastManager;J)V", cancellable = true)
    private void update__1274242380(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1274242380L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;J)V", cancellable = true)
    private void extractRenderState__1697005848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1697005848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSoundEvent()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getSoundEvent_1684097548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1684097548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWantedVisibility()Lnet/minecraft/client/gui/components/toasts/Toast$Visibility;", cancellable = true)
    private void getWantedVisibility_256641457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(256641457L))
            info.setReturnValue(null);
    }


}
