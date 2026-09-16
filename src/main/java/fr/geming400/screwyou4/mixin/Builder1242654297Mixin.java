package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.DamagePredicate.Builder.class)
public class Builder1242654297Mixin {
        @Inject(at = @At("HEAD"), method = "type(Lnet/minecraft/advancements/predicates/DamageSourcePredicate;)Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;", cancellable = true)
    private void type_1331191032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1331191032L))
            info.setReturnValue(new net.minecraft.advancements.predicates.DamagePredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "type(Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;)Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;", cancellable = true)
    private void type_538091201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(538091201L))
            info.setReturnValue(new net.minecraft.advancements.predicates.DamagePredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/DamagePredicate;", cancellable = true)
    private void build__598014894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-598014894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blocked(Ljava/lang/Boolean;)Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;", cancellable = true)
    private void blocked_443376248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(443376248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sourceEntity(Lnet/minecraft/advancements/predicates/entity/EntityPredicate;)Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;", cancellable = true)
    private void sourceEntity__1014066681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1014066681L))
            info.setReturnValue(new net.minecraft.advancements.predicates.DamagePredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "dealtDamage(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;", cancellable = true)
    private void dealtDamage__873739279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873739279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "takenDamage(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;", cancellable = true)
    private void takenDamage__1022287854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1022287854L))
            info.setReturnValue(new net.minecraft.advancements.predicates.DamagePredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "damageInstance()Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;", cancellable = true)
    private static void damageInstance__1884686179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1884686179L))
            info.setReturnValue(new net.minecraft.advancements.predicates.DamagePredicate.Builder());
    }


}
