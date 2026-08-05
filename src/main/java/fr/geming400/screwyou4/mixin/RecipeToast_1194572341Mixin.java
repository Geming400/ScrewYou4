package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.toasts.RecipeToast.class)
public class RecipeToast_1194572341Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/gui/components/toasts/ToastManager;J)V", cancellable = true)
    private void update__673554690(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-673554690L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addOrUpdate(Lnet/minecraft/client/gui/components/toasts/ToastManager;Lnet/minecraft/world/item/crafting/display/RecipeDisplay;)V", cancellable = true)
    private static void addOrUpdate__1785871218(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1785871218L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWantedVisibility()Lnet/minecraft/client/gui/components/toasts/Toast$Visibility;", cancellable = true)
    private void getWantedVisibility_857329147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857329147L))
            info.setReturnValue(net.minecraft.client.gui.components.toasts.Toast.Visibility.SHOW);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;J)V", cancellable = true)
    private void extractRenderState__1096318158(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1096318158L))
            info.cancel();
    }


}
