package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.PlayerHurtEntityTrigger.TriggerInstance.class)
public class TriggerInstance2090796856Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1182170588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1182170588L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1433746915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1433746915L))
            info.setReturnValue("]\uC1A8-bo)hyL4sPCuAc\u7EB3]N.QT;OQdLzBbI\u2186]SY0B] 5ub#h\u9C34)L>A([L");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1646818349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1646818349L))
            info.setReturnValue(-1333215978);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/storage/loot/LootContext;Lnet/minecraft/world/damagesource/DamageSource;FFZ)Z", cancellable = true)
    private void matches__455114014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-455114014L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__1943997334(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1943997334L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_860143815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(860143815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerHurtEntity(Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerHurtEntity_1117513115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1117513115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerHurtEntity(Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerHurtEntity_431458916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(431458916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerHurtEntity()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerHurtEntity_1123839276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1123839276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerHurtEntity(Ljava/util/Optional;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerHurtEntity_1713492106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1713492106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerHurtEntityWithDamage(Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerHurtEntityWithDamage_621403078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(621403078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerHurtEntityWithDamage(Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerHurtEntityWithDamage__1210872470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1210872470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "damage()Ljava/util/Optional;", cancellable = true)
    private void damage__1674614955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1674614955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entity()Ljava/util/Optional;", cancellable = true)
    private void entity__2114346039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2114346039L))
            info.setReturnValue(null);
    }


}
