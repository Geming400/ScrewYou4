package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Zoglin.class)
public class Zoglin2101102387Mixin {
        @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getTarget_1368864272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1368864272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAttackAnimationRemainingTicks()I", cancellable = true)
    private void getAttackAnimationRemainingTicks_2139364633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139364633L))
            info.setReturnValue(-110774075);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_1651672056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1651672056L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBaby()Z", cancellable = true)
    private void isBaby_2139380970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139380970L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_2139377126(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2139377126L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain__600888051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-600888051L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__345132971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-345132971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget__549825198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-549825198L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed_2139380970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139380970L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent__986412584(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-986412584L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__548115465(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-548115465L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1400883942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1400883942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_858456343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(858456343L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAdult()Z", cancellable = true)
    private void isAdult_2139380970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139380970L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setBaby(Z)V", cancellable = true)
    private void setBaby__964248080(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-964248080L))
            info.cancel();
    }


}
