package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.MobEffectsPredicate.Builder.class)
public class Builder29999494Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/MobEffectsPredicate;", cancellable = true)
    private void build__1661467278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1661467278L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "and(Lnet/minecraft/core/Holder;Lnet/minecraft/advancements/predicates/MobEffectsPredicate$MobEffectInstancePredicate;)Lnet/minecraft/advancements/predicates/MobEffectsPredicate$Builder;", cancellable = true)
    private void and__37227661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-37227661L))
            info.setReturnValue(new net.minecraft.advancements.predicates.MobEffectsPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "and(Lnet/minecraft/core/Holder;)Lnet/minecraft/advancements/predicates/MobEffectsPredicate$Builder;", cancellable = true)
    private void and__1049296241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1049296241L))
            info.setReturnValue(new net.minecraft.advancements.predicates.MobEffectsPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "effects()Lnet/minecraft/advancements/predicates/MobEffectsPredicate$Builder;", cancellable = true)
    private static void effects_1594828831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1594828831L))
            info.setReturnValue(null);
    }


}
