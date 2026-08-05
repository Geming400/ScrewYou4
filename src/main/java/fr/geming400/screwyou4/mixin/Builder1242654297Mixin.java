package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.DamagePredicate.Builder.class)
public class Builder1242654297Mixin {
        @Inject(at = @At("HEAD"), method = "type(Lnet/minecraft/advancements/predicates/DamageSourcePredicate;)Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;", cancellable = true)
    private void type_1842310590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1842310590L))
            info.setReturnValue(new net.minecraft.advancements.predicates.DamagePredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "type(Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;)Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;", cancellable = true)
    private void type__882407033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882407033L))
            info.setReturnValue(new net.minecraft.advancements.predicates.DamagePredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/DamagePredicate;", cancellable = true)
    private void build_1508452224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1508452224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blocked(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;", cancellable = true)
    private void blocked__1694017140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1694017140L))
            info.setReturnValue(new net.minecraft.advancements.predicates.DamagePredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "dealtDamage(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;", cancellable = true)
    private void dealtDamage__979870232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-979870232L))
            info.setReturnValue(new net.minecraft.advancements.predicates.DamagePredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "sourceEntity(Lnet/minecraft/advancements/predicates/entity/EntityPredicate;)Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;", cancellable = true)
    private void sourceEntity_1768762917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1768762917L))
            info.setReturnValue(new net.minecraft.advancements.predicates.DamagePredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "damageInstance()Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;", cancellable = true)
    private static void damageInstance__1080475583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1080475583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "takenDamage(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;", cancellable = true)
    private void takenDamage__979870232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-979870232L))
            info.setReturnValue(new net.minecraft.advancements.predicates.DamagePredicate$Builder());
    }


}
