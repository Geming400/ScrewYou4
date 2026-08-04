package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.PlayerHurtEntityTrigger.TriggerInstance.class)
public class TriggerInstance2090796856Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__818658181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-818658181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_955336881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955336881L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2129059598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2129059598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/storage/loot/LootContext;Lnet/minecraft/world/damagesource/DamageSource;FFZ)Z", cancellable = true)
    private void matches_292864303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(292864303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__49143872(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-49143872L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entity()Ljava/util/Optional;", cancellable = true)
    private void entity__1958709018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1958709018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerHurtEntity(Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerHurtEntity__743518703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-743518703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerHurtEntity(Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerHurtEntity_831926158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(831926158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerHurtEntity(Ljava/util/Optional;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerHurtEntity__1488018691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1488018691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerHurtEntity()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerHurtEntity__930419041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-930419041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerHurtEntityWithDamage(Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerHurtEntityWithDamage__1163678558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1163678558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerHurtEntityWithDamage(Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerHurtEntityWithDamage_831926158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(831926158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__1958709018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1958709018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "damage()Ljava/util/Optional;", cancellable = true)
    private void damage__1958709018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1958709018L))
            info.setReturnValue(null);
    }


}
