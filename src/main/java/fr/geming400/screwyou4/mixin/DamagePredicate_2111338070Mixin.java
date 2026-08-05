package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.DamagePredicate.class)
public class DamagePredicate_2111338070Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__798116968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-798116968L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_975878094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(975878094L))
            info.setReturnValue("@)(c3ANT\u74EF3a\uA593lR8)\uC659nrnRI");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2145366485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2145366485L))
            info.setReturnValue(899417834);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/component/DataComponentGetter;)Z", cancellable = true)
    private void matches__349978005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-349978005L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "damage()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void damage_1960103011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960103011L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "durability(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/core/component/predicates/DamagePredicate;", cancellable = true)
    private static void durability__506889521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-506889521L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "durability()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void durability_1960103011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960103011L))
            info.setReturnValue(null);
    }


}
