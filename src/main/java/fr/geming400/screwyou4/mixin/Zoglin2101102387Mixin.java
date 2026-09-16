package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Zoglin.class)
public class Zoglin2101102387Mixin {
        @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getTarget_2064503017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064503017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__562567342(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-562567342L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_1285814534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1285814534L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent__1440116793(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1440116793L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_1915200461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915200461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBaby()Z", cancellable = true)
    private void isBaby__219992118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-219992118L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__818762919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-818762919L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed_153030273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153030273L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1198653617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1198653617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget__1278205763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1278205763L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1487130561(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1487130561L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBaby(Z)V", cancellable = true)
    private void setBaby_1509707848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1509707848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAdult()Z", cancellable = true)
    private void isAdult_209402938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209402938L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1443766600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1443766600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAttackAnimationRemainingTicks()I", cancellable = true)
    private void getAttackAnimationRemainingTicks__545934029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-545934029L))
            info.setReturnValue(-704700454);
    }


}
