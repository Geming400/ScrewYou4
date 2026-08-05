package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.SelectableRecipe.SingleInputSet.class)
public class SingleInputSet682399722Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_720661968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720661968L))
            info.setReturnValue(-1760943629);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2067911981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2067911981L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__453060253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453060253L))
            info.setReturnValue("%S>rWq䲴A6巈+鼬");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_720662464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720662464L))
            info.setReturnValue(-1964091048);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_720678305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720678305L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/world/item/crafting/SelectableRecipe$SingleInputSet;", cancellable = true)
    private static void empty_142237992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(142237992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries__1986230758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1986230758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noRecipeCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void noRecipeCodec_1943400094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1943400094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acceptsInput(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void acceptsInput__1878032442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1878032442L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "selectByInput(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/crafting/SelectableRecipe$SingleInputSet;", cancellable = true)
    private void selectByInput_965711125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965711125L))
            info.setReturnValue(null);
    }


}
