package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.stats.RecipeBookSettings.class)
public class RecipeBookSettings1836475454Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/stats/RecipeBookSettings;", cancellable = true)
    private void copy__1317468125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1317468125L))
            info.setReturnValue(new net.minecraft.stats.RecipeBookSettings());
    }

    @Inject(at = @At("HEAD"), method = "isOpen(Lnet/minecraft/world/inventory/RecipeBookType;)Z", cancellable = true)
    private void isOpen__1779980645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1779980645L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "replaceFrom(Lnet/minecraft/stats/RecipeBookSettings;)V", cancellable = true)
    private void replaceFrom_1183863460(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1183863460L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setOpen(Lnet/minecraft/world/inventory/RecipeBookType;Z)V", cancellable = true)
    private void setOpen__918033843(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-918033843L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFiltering(Lnet/minecraft/world/inventory/RecipeBookType;)Z", cancellable = true)
    private void isFiltering_1279914575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1279914575L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setFiltering(Lnet/minecraft/world/inventory/RecipeBookType;Z)V", cancellable = true)
    private void setFiltering__147224151(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-147224151L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSettings(Lnet/minecraft/world/inventory/RecipeBookType;)Lnet/minecraft/stats/RecipeBookSettings$TypeSettings;", cancellable = true)
    private void getSettings_1276294464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1276294464L))
            info.setReturnValue(null);
    }


}
