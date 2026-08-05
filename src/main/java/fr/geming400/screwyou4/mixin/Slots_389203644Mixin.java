package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.InventoryChangeTrigger.TriggerInstance.Slots.class)
public class Slots_389203644Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1774715902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1774715902L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__746256332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-746256332L))
            info.setReturnValue("aK㹀sS8GJ:驯-;\"tM璬rHWd}v(Z娏o#pZ7bȴRPrS굱2-Il");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_427466385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(427466385L))
            info.setReturnValue(1090134031);
    }

    @Inject(at = @At("HEAD"), method = "matches(III)Z", cancellable = true)
    private void matches__390884917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-390884917L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void empty_237968585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(237968585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "full()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void full_237968585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(237968585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "occupied()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void occupied_237968585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(237968585L))
            info.setReturnValue(null);
    }


}
