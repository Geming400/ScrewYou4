package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.KilledTrigger.TriggerInstance.class)
public class TriggerInstance_938773490Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_30147221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(30147221L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1709197014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1709197014L))
            info.setReturnValue("kq(&u|,9Yv}pf #O&yl=K'Y5629/-%\u1E77s\uD488y=0q\"@\u61A9\u403F`\u5D8B\uC65A\"ezh^_vypG1d{U>w=tQQQ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1496125580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1496125580L))
            info.setReturnValue(1376467008);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/storage/loot/LootContext;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void matches__609505889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609505889L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate_1198946595(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1198946595L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__291879552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-291879552L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "killingBlow()Ljava/util/Optional;", cancellable = true)
    private void killingBlow__517311179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-517311179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entity()Ljava/util/Optional;", cancellable = true)
    private void entity_1028597890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1028597890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerKilledEntity(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerKilledEntity_2138090460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2138090460L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerKilledEntity(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerKilledEntity_1963885259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1963885259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerKilledEntity(Ljava/util/Optional;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerKilledEntity__1565343019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1565343019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerKilledEntity()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerKilledEntity_1046993271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1046993271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerKilledEntity(Ljava/util/Optional;Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerKilledEntity_681562312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(681562312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerKilledEntity(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerKilledEntity_1872466834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1872466834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerKilledEntity(Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerKilledEntity__1773546266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1773546266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityKilledPlayer(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityKilledPlayer__645196341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-645196341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityKilledPlayer(Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityKilledPlayer_210282470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(210282470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityKilledPlayer(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityKilledPlayer_1404354268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1404354268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityKilledPlayer()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityKilledPlayer_1812868215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1812868215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityKilledPlayer(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityKilledPlayer_1828937874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1828937874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityKilledPlayer(Ljava/util/Optional;Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityKilledPlayer__926622264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-926622264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityKilledPlayer(Ljava/util/Optional;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityKilledPlayer__1605757483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1605757483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerKilledEntityNearSculkCatalyst()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void playerKilledEntityNearSculkCatalyst__973577884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-973577884L))
            info.setReturnValue(null);
    }


}
