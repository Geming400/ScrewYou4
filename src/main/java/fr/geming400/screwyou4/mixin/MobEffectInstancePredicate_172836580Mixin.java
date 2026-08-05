package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.MobEffectsPredicate.MobEffectInstancePredicate.class)
public class MobEffectInstancePredicate_172836580Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1558348838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558348838L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__962623396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-962623396L))
            info.setReturnValue("5K/7gskz<U@ғa5CT5ٔRUe 7孤굧iOχzw)jjLr[4&WK%,yyᶓNOSuPR%Xcf!猊E⍘HdB0VMdVឍ|V陿o$%fr,[..ㆬ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_211099321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211099321L))
            info.setReturnValue(-229597527);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/effect/MobEffectInstance;)Z", cancellable = true)
    private void matches_328708656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(328708656L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "duration()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void duration_21601521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(21601521L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visible()Ljava/util/Optional;", cancellable = true)
    private void visible_418298001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(418298001L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "amplifier()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void amplifier_21601521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(21601521L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ambient()Ljava/util/Optional;", cancellable = true)
    private void ambient_418298001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(418298001L))
            info.setReturnValue(null);
    }


}
