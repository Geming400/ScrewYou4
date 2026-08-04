package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.ItemSlotDisplay.class)
public class ItemSlotDisplay2057899963Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type__1522231808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1522231808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__851555074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-851555074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_922439988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(922439988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2096162705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2096162705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve_475784275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(475784275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isEnabled_628130583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(628130583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/core/Holder;", cancellable = true)
    private void item__688191561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-688191561L))
            info.setReturnValue(null);
    }


}
