package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.MobEffectsPredicate.Builder.class)
public class Builder29999494Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/MobEffectsPredicate;", cancellable = true)
    private void build__1824202336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1824202336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "and(Lnet/minecraft/core/Holder;Lnet/minecraft/advancements/predicates/MobEffectsPredicate$MobEffectInstancePredicate;)Lnet/minecraft/advancements/predicates/MobEffectsPredicate$Builder;", cancellable = true)
    private void and__1873388900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1873388900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "and(Lnet/minecraft/core/Holder;)Lnet/minecraft/advancements/predicates/MobEffectsPredicate$Builder;", cancellable = true)
    private void and__1225460104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1225460104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effects()Lnet/minecraft/advancements/predicates/MobEffectsPredicate$Builder;", cancellable = true)
    private static void effects__2085857439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2085857439L))
            info.setReturnValue(null);
    }


}
