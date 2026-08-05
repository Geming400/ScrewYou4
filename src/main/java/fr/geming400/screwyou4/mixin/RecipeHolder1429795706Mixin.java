package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.RecipeHolder.class)
public class RecipeHolder1429795706Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/world/item/crafting/Recipe;", cancellable = true)
    private void value_431856216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(431856216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1479659827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1479659827L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_294335235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(294335235L))
            info.setReturnValue(" ?p桓GyF");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1468057952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1468057952L))
            info.setReturnValue(1974588841);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void id__2056680277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2056680277L))
            info.setReturnValue(null);
    }


}
