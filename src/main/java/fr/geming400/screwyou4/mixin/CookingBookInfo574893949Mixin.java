package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.AbstractCookingRecipe.CookingBookInfo.class)
public class CookingBookInfo574893949Mixin {
        @Inject(at = @At("HEAD"), method = "group()Ljava/lang/String;", cancellable = true)
    private void group__560566522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-560566522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1960406208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960406208L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__560566026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-560566026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_613156691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(613156691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "category()Ljava/lang/Object;", cancellable = true)
    private void category__1860752168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1860752168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "category()Lnet/minecraft/world/item/crafting/CookingBookCategory;", cancellable = true)
    private void category__1580791870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1580791870L))
            info.setReturnValue(null);
    }


}
