package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.KilledTrigger.TriggerInstance.class)
public class TriggerInstance_938773490Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1970681548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1970681548L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__196686486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-196686486L))
            info.setReturnValue("꜐tR8&rYN[3h)2mZ}'eSi塚âmZ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_977036231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(977036231L))
            info.setReturnValue(-529611241);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/storage/loot/LootContext;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void matches__1214850446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1214850446L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__1201167239(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1201167239L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entity()Ljava/util/Optional;", cancellable = true)
    private void entity_1184234911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184234911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1184234911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184234911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerKilledEntityNearSculkCatalyst()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerKilledEntityNearSculkCatalyst__2082442408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2082442408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "killingBlow()Ljava/util/Optional;", cancellable = true)
    private void killingBlow_1184234911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184234911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerKilledEntity(Ljava/util/Optional;Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerKilledEntity_1473113607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1473113607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerKilledEntity(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerKilledEntity__764210947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764210947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerKilledEntity(Ljava/util/Optional;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerKilledEntity_1654925238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1654925238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerKilledEntity()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerKilledEntity__2082442408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2082442408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerKilledEntity(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerKilledEntity_732171628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(732171628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerKilledEntity(Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerKilledEntity__320097209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-320097209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerKilledEntity(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerKilledEntity__1729838319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1729838319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityKilledPlayer(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityKilledPlayer_732171628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(732171628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityKilledPlayer(Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityKilledPlayer__320097209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-320097209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityKilledPlayer(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityKilledPlayer__764210947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764210947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityKilledPlayer()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityKilledPlayer__2082442408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2082442408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityKilledPlayer(Ljava/util/Optional;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityKilledPlayer_1654925238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1654925238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityKilledPlayer(Ljava/util/Optional;Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityKilledPlayer_1473113607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1473113607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityKilledPlayer(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityKilledPlayer__1729838319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1729838319L))
            info.setReturnValue(null);
    }


}
