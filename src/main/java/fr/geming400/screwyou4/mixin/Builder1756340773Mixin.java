package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.DataComponentMatchers.Builder.class)
public class Builder1756340773Mixin {
        @Inject(at = @At("HEAD"), method = "exact(Lnet/minecraft/core/component/DataComponentExactPredicate;)Lnet/minecraft/advancements/predicates/DataComponentMatchers$Builder;", cancellable = true)
    private void exact__596403941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-596403941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/DataComponentMatchers;", cancellable = true)
    private void build__2081712320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2081712320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "any(Lnet/minecraft/core/component/DataComponentType;)Lnet/minecraft/advancements/predicates/DataComponentMatchers$Builder;", cancellable = true)
    private void any__373360039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-373360039L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/advancements/predicates/DataComponentMatchers$Builder;", cancellable = true)
    private static void components_955415553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955415553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "partial(Lnet/minecraft/core/component/predicates/DataComponentPredicate$Type;Lnet/minecraft/core/component/predicates/DataComponentPredicate;)Lnet/minecraft/advancements/predicates/DataComponentMatchers$Builder;", cancellable = true)
    private void partial_899656017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(899656017L))
            info.setReturnValue(null);
    }


}
