package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.stats.RecipeBook.class)
public class RecipeBook397492395Mixin {
        @Inject(at = @At("HEAD"), method = "isOpen(Lnet/minecraft/world/inventory/RecipeBookType;)Z", cancellable = true)
    private void isOpen_1076003592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1076003592L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setBookSettings(Lnet/minecraft/stats/RecipeBookSettings;)V", cancellable = true)
    private void setBookSettings_644313569(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(644313569L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFiltering(Lnet/minecraft/world/inventory/RecipeBookType;)Z", cancellable = true)
    private void isFiltering__159068484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-159068484L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setBookSetting(Lnet/minecraft/world/inventory/RecipeBookType;ZZ)V", cancellable = true)
    private void setBookSetting__651179629(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-651179629L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBookSettings()Lnet/minecraft/stats/RecipeBookSettings;", cancellable = true)
    private void getBookSettings__652158403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-652158403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFiltering(Lnet/minecraft/world/inventory/RecipeBookType;Z)V", cancellable = true)
    private void setFiltering__1586207210(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1586207210L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setOpen(Lnet/minecraft/world/inventory/RecipeBookType;Z)V", cancellable = true)
    private void setOpen_1937950394(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1937950394L))
            info.cancel();
    }


}
