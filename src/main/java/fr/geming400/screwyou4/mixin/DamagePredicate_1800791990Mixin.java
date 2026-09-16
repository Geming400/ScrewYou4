package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.DamagePredicate.class)
public class DamagePredicate_1800791990Mixin {
        @Inject(at = @At("HEAD"), method = "type()Ljava/util/Optional;", cancellable = true)
    private void type__1507698019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1507698019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_892165721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(892165721L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1723751782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1723751782L))
            info.setReturnValue("1_-`j\u6609;\u5245");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1936823216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1936823216L))
            info.setReturnValue(731111483);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/damagesource/DamageSource;FFZ)Z", cancellable = true)
    private void matches_482318272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482318272L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "blocked()Ljava/util/Optional;", cancellable = true)
    private void blocked_551827279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(551827279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sourceEntity()Ljava/util/Optional;", cancellable = true)
    private void sourceEntity_261265217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(261265217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dealtDamage()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void dealtDamage_59847466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59847466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "takenDamage()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void takenDamage__1206527191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1206527191L))
            info.setReturnValue(null);
    }


}
