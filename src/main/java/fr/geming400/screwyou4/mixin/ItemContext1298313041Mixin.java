package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.InteractionResult.ItemContext.class)
public class ItemContext1298313041Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1611141996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1611141996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_162853066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(162853066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1336575783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1336575783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heldItemTransformedTo()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void heldItemTransformedTo_1821731701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1821731701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wasItemInteraction()Z", cancellable = true)
    private void wasItemInteraction_1336591624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1336591624L))
            info.setReturnValue(null);
    }


}
