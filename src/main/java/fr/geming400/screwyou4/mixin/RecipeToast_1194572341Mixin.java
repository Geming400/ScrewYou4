package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.toasts.RecipeToast.class)
public class RecipeToast_1194572341Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/gui/components/toasts/ToastManager;J)V", cancellable = true)
    private void update__1126223595(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1126223595L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWantedVisibility()Lnet/minecraft/client/gui/components/toasts/Toast$Visibility;", cancellable = true)
    private void getWantedVisibility_1786750532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1786750532L))
            info.setReturnValue(net.minecraft.client.gui.components.toasts.Toast.Visibility.HIDE);
    }

    @Inject(at = @At("HEAD"), method = "addOrUpdate(Lnet/minecraft/client/gui/components/toasts/ToastManager;Lnet/minecraft/world/item/crafting/display/RecipeDisplay;)V", cancellable = true)
    private static void addOrUpdate_620360097(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(620360097L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;J)V", cancellable = true)
    private void extractRenderState__322878580(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-322878580L))
            info.cancel();
    }


}
