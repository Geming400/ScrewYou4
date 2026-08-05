package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerStateData.class)
public class TrialSpawnerStateData_990474981Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_1028749719(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1028749719L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerStateData$Packed;)V", cancellable = true)
    private void apply_715656964(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(715656964L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerStateData$Packed;", cancellable = true)
    private void pack__552574832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-552574832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "countAdditionalPlayers(Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void countAdditionalPlayers_1159229086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1159229086L))
            info.setReturnValue(-1848835308);
    }

    @Inject(at = @At("HEAD"), method = "isReadyToSpawnNextMob(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig;I)Z", cancellable = true)
    private void isReadyToSpawnNextMob__1236626985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1236626985L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isReadyToOpenShutter(Lnet/minecraft/server/level/ServerLevel;FI)Z", cancellable = true)
    private void isReadyToOpenShutter_2127855471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127855471L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "haveAllCurrentMobsDied()Z", cancellable = true)
    private void haveAllCurrentMobsDied_1028753563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1028753563L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "resetStatistics()V", cancellable = true)
    private void resetStatistics_1028749719(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1028749719L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasMobToSpawn(Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawner;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void hasMobToSpawn_857612173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857612173L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreateDisplayEntity(Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawner;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerState;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getOrCreateDisplayEntity_2106421840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106421840L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryDetectPlayers(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawner;)V", cancellable = true)
    private void tryDetectPlayers_528446184(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(528446184L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasFinishedSpawningAllMobs(Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig;I)Z", cancellable = true)
    private void hasFinishedSpawningAllMobs_872984712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872984712L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isCooldownFinished(Lnet/minecraft/server/level/ServerLevel;)Z", cancellable = true)
    private void isCooldownFinished_12069484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(12069484L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isReadyToEjectItems(Lnet/minecraft/server/level/ServerLevel;FI)Z", cancellable = true)
    private void isReadyToEjectItems_2127855471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127855471L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDispensingItems(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void getDispensingItems__1906448813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1906448813L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpin()D", cancellable = true)
    private void getSpin_1028732421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1028732421L))
            info.setReturnValue(7.313380092524438E7D);
    }

    @Inject(at = @At("HEAD"), method = "getOSpin()D", cancellable = true)
    private void getOSpin_1028732421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1028732421L))
            info.setReturnValue(7.313380092524438E7D);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerState;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_940651811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(940651811L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "resetAfterBecomingOminous(Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawner;Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void resetAfterBecomingOminous__646528554(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-646528554L))
            info.cancel();
    }


}
