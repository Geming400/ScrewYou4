package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.DataComponentMatchers.Builder.class)
public class Builder1756340773Mixin {
        @Inject(at = @At("HEAD"), method = "exact(Lnet/minecraft/core/component/DataComponentExactPredicate;)Lnet/minecraft/advancements/predicates/DataComponentMatchers$Builder;", cancellable = true)
    private void exact_611903932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611903932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/DataComponentMatchers;", cancellable = true)
    private void build__312144238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-312144238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "any(Lnet/minecraft/core/component/DataComponentType;)Lnet/minecraft/advancements/predicates/DataComponentMatchers$Builder;", cancellable = true)
    private void any_1121341933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1121341933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/advancements/predicates/DataComponentMatchers$Builder;", cancellable = true)
    private static void components__951139925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-951139925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "partial(Lnet/minecraft/core/component/predicates/DataComponentPredicate$Type;Lnet/minecraft/core/component/predicates/DataComponentPredicate;)Lnet/minecraft/advancements/predicates/DataComponentMatchers$Builder;", cancellable = true)
    private void partial_433956114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(433956114L))
            info.setReturnValue(null);
    }


}
