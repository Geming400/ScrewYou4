package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.stats.RecipeBook.class)
public class RecipeBook397492395Mixin {
        @Inject(at = @At("HEAD"), method = "isOpen(Lnet/minecraft/world/inventory/RecipeBookType;)Z", cancellable = true)
    private void isOpen__1296333284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1296333284L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setFiltering(Lnet/minecraft/world/inventory/RecipeBookType;Z)V", cancellable = true)
    private void setFiltering__528515346(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-528515346L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBookSetting(Lnet/minecraft/world/inventory/RecipeBookType;ZZ)V", cancellable = true)
    private void setBookSetting_1799123416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1799123416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBookSettings()Lnet/minecraft/stats/RecipeBookSettings;", cancellable = true)
    private void getBookSettings__669593445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-669593445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBookSettings(Lnet/minecraft/stats/RecipeBookSettings;)V", cancellable = true)
    private void setBookSettings__1107116337(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1107116337L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFiltering(Lnet/minecraft/world/inventory/RecipeBookType;)Z", cancellable = true)
    private void isFiltering__1296333284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1296333284L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setOpen(Lnet/minecraft/world/inventory/RecipeBookType;Z)V", cancellable = true)
    private void setOpen__528515346(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-528515346L))
            info.cancel();
    }


}
