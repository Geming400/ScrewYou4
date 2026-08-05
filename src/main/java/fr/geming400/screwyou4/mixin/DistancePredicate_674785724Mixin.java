package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.DistancePredicate.class)
public class DistancePredicate_674785724Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2060297982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2060297982L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__460674252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-460674252L))
            info.setReturnValue("HN(HJeDh47mMy∜{#L)]R!8Dsk#RJ%㱀|=JPPmfD*,0}쥋XkPl`ꂼ|9<+K<Dn`$5[휞5ꯪ#༳7xe^;z.");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_713048465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(713048465L))
            info.setReturnValue(1308189667);
    }

    @Inject(at = @At("HEAD"), method = "matches(DDDDDD)Z", cancellable = true)
    private void matches__831014158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-831014158L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "x()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void x__21681639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-21681639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "z()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void z__21681639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-21681639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void y__21681639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-21681639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "absolute()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void absolute__21681639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-21681639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "absolute(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/DistancePredicate;", cancellable = true)
    private static void absolute_1779818431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779818431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontal()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void horizontal__21681639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-21681639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontal(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/DistancePredicate;", cancellable = true)
    private static void horizontal_1779818431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779818431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vertical(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/DistancePredicate;", cancellable = true)
    private static void vertical_1779818431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779818431L))
            info.setReturnValue(null);
    }


}
