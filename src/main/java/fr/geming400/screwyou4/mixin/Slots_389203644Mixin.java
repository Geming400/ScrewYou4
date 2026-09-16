package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.InventoryChangeTrigger.TriggerInstance.Slots.class)
public class Slots_389203644Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__519422625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-519422625L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1159627168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1159627168L))
            info.setReturnValue("[B\u2E97uz\u6C4BmV8vca\u3B7C\u3B93:S=I8{??!\u2781m%\uA2A0IWW\"fBm5>Ev-(@8,!\u1875[di;!x\u635EF\uADEE\uADBA^\u60D5Us}{^2v2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_946555734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(946555734L))
            info.setReturnValue(66917743);
    }

    @Inject(at = @At("HEAD"), method = "matches(III)Z", cancellable = true)
    private void matches_1171994622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1171994622L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void empty__965588324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-965588324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "full()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void full_364024986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(364024986L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "occupied()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void occupied__1942823189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1942823189L))
            info.setReturnValue(null);
    }


}
