package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.FireworksPredicate.class)
public class FireworksPredicate_1392007179Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_483380910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(483380910L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2132536593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2132536593L))
            info.setReturnValue("\u513FyX2R,BO)zVs\"|*\u8C20-Ww|J\uABEC;X'9nm*YwM?Z',oI7#'3ZNoUSVlozzP?]dB'};^K!F5\u3FA7X=c");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1949359269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1949359269L))
            info.setReturnValue(-218782272);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__1186445584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1186445584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches__76130166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-76130166L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/component/Fireworks;)Z", cancellable = true)
    private void matches_2136312046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2136312046L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "explosions()Ljava/util/Optional;", cancellable = true)
    private void explosions__1974771786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1974771786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flightDuration()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void flightDuration_924146292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(924146292L))
            info.setReturnValue(null);
    }


}
