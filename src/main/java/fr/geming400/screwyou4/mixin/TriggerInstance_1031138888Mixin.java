package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.EntityHurtPlayerTrigger.TriggerInstance.class)
public class TriggerInstance_1031138888Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1878316150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1878316150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__104321088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-104321088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1069401629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1069401629L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/damagesource/DamageSource;FFZ)Z", cancellable = true)
    private void matches_409843999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409843999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "damage()Ljava/util/Optional;", cancellable = true)
    private void damage_1276600309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1276600309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1276600309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1276600309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityHurtPlayer(Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityHurtPlayer_2071630769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071630769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityHurtPlayer()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityHurtPlayer__1990077010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1990077010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityHurtPlayer(Lnet/minecraft/advancements/predicates/DamagePredicate;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityHurtPlayer_2028624616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2028624616L))
            info.setReturnValue(null);
    }


}
