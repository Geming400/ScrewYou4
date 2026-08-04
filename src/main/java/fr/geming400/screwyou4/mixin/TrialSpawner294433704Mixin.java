package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.trialspawner.TrialSpawner.class)
public class TrialSpawner294433704Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/world/level/storage/ValueInput;)V", cancellable = true)
    private void load_525670337(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(525670337L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "store(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void store__924697648(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-924697648L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getState()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerState;", cancellable = true)
    private void getState_915715868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(915715868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setState(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerState;)V", cancellable = true)
    private void setState_1077132627(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1077132627L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isOminous()Z", cancellable = true)
    private void isOminous_332712287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(332712287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlayerDetector(Lnet/minecraft/world/level/block/entity/trialspawner/PlayerDetector;)V", cancellable = true)
    private void setPlayerDetector_179400788(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(179400788L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "overrideEntityToSpawn(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V", cancellable = true)
    private void overrideEntityToSpawn_1442369131(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1442369131L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTargetCooldownLength()I", cancellable = true)
    private void getTargetCooldownLength_332695950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(332695950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeOminous(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void removeOminous__1092813826(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1092813826L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntitySelector()Lnet/minecraft/world/level/block/entity/trialspawner/PlayerDetector$EntitySelector;", cancellable = true)
    private void getEntitySelector_1714739420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1714739420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ejectReward(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void ejectReward_672294684(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(672294684L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRequiredPlayerRange()I", cancellable = true)
    private void getRequiredPlayerRange_332695950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(332695950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerDetector()Lnet/minecraft/world/level/block/entity/trialspawner/PlayerDetector;", cancellable = true)
    private void getPlayerDetector_213488800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(213488800L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "activeConfig()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig;", cancellable = true)
    private void activeConfig__639300365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-639300365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyOminous(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void applyOminous__1092813826(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1092813826L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canSpawnInLevel(Lnet/minecraft/server/level/ServerLevel;)Z", cancellable = true)
    private void canSpawnInLevel__683971792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-683971792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overridePeacefulAndMobSpawnRule()V", cancellable = true)
    private void overridePeacefulAndMobSpawnRule_332708443(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(332708443L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickClient(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void tickClient_223492288(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(223492288L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void tickServer_282533154(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(282533154L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnMob(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Ljava/util/Optional;", cancellable = true)
    private void spawnMob__610286893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-610286893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addBecomeOminousParticles(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void addBecomeOminousParticles_977312590(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(977312590L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSpawnParticles(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/particles/SimpleParticleType;)V", cancellable = true)
    private static void addSpawnParticles_1130104031(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1130104031L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDetectPlayerParticles(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;ILnet/minecraft/core/particles/ParticleOptions;)V", cancellable = true)
    private static void addDetectPlayerParticles__2114341690(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2114341690L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addEjectItemParticles(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void addEjectItemParticles_977312590(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(977312590L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStateData()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerStateData;", cancellable = true)
    private void getStateData__1042935406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1042935406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "normalConfig()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig;", cancellable = true)
    private void normalConfig__639300365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-639300365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ominousConfig()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig;", cancellable = true)
    private void ominousConfig__639300365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-639300365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markUpdated()V", cancellable = true)
    private void markUpdated_332708443(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(332708443L))
            info.cancel();
    }


}
