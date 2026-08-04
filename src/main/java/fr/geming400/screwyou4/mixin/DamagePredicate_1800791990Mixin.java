package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.DamagePredicate.class)
public class DamagePredicate_1800791990Mixin {
        @Inject(at = @At("HEAD"), method = "type()Ljava/util/Optional;", cancellable = true)
    private void type_2046253411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2046253411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1108663048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1108663048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_665332014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(665332014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1839054731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1839054731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/damagesource/DamageSource;FFZ)Z", cancellable = true)
    private void matches_1179497101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1179497101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blocked()Ljava/util/Optional;", cancellable = true)
    private void blocked_2046253411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2046253411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sourceEntity()Ljava/util/Optional;", cancellable = true)
    private void sourceEntity_2046253411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2046253411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "takenDamage()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void takenDamage_1104324627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1104324627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dealtDamage()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void dealtDamage_1104324627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1104324627L))
            info.setReturnValue(null);
    }


}
