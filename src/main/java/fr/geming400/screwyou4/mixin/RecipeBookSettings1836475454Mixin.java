package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.stats.RecipeBookSettings.class)
public class RecipeBookSettings1836475454Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/stats/RecipeBookSettings;", cancellable = true)
    private void copy_769389614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(769389614L))
            info.setReturnValue(new net.minecraft.stats.RecipeBookSettings());
    }

    @Inject(at = @At("HEAD"), method = "isOpen(Lnet/minecraft/world/inventory/RecipeBookType;)Z", cancellable = true)
    private void isOpen_142649775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(142649775L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setFiltering(Lnet/minecraft/world/inventory/RecipeBookType;Z)V", cancellable = true)
    private void setFiltering_910467713(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(910467713L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFiltering(Lnet/minecraft/world/inventory/RecipeBookType;)Z", cancellable = true)
    private void isFiltering_142649775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(142649775L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setOpen(Lnet/minecraft/world/inventory/RecipeBookType;Z)V", cancellable = true)
    private void setOpen_910467713(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(910467713L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSettings(Lnet/minecraft/world/inventory/RecipeBookType;)Lnet/minecraft/stats/RecipeBookSettings$TypeSettings;", cancellable = true)
    private void getSettings_1770426617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1770426617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceFrom(Lnet/minecraft/stats/RecipeBookSettings;)V", cancellable = true)
    private void replaceFrom_331866722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(331866722L))
            info.cancel();
    }


}
