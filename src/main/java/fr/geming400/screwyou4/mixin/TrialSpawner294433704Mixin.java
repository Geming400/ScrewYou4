package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.trialspawner.TrialSpawner.class)
public class TrialSpawner294433704Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/world/level/storage/ValueInput;)V", cancellable = true)
    private void load_1286505755(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1286505755L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "store(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void store_2063021617(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2063021617L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getState()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerState;", cancellable = true)
    private void getState__620110495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-620110495L))
            info.setReturnValue(net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerState.COOLDOWN);
    }

    @Inject(at = @At("HEAD"), method = "setState(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerState;)V", cancellable = true)
    private void setState_74777700(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(74777700L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "normalConfig()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig;", cancellable = true)
    private void normalConfig__1516199300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516199300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tickServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void tickServer_129733090(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(129733090L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickClient(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void tickClient__1640588152(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1640588152L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markUpdated()V", cancellable = true)
    private void markUpdated_1489348077(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1489348077L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnMob(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Ljava/util/Optional;", cancellable = true)
    private void spawnMob__627216530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-627216530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOminous()Z", cancellable = true)
    private void isOminous__2055570177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2055570177L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "removeOminous(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void removeOminous__807186364(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-807186364L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRequiredPlayerRange()I", cancellable = true)
    private void getRequiredPlayerRange__1619426457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1619426457L))
            info.setReturnValue(92042287);
    }

    @Inject(at = @At("HEAD"), method = "activeConfig()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig;", cancellable = true)
    private void activeConfig_2009875163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2009875163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateData()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerStateData;", cancellable = true)
    private void getStateData_1049280973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1049280973L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerStateData());
    }

    @Inject(at = @At("HEAD"), method = "canSpawnInLevel(Lnet/minecraft/server/level/ServerLevel;)Z", cancellable = true)
    private void canSpawnInLevel_577144412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(577144412L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getTargetCooldownLength()I", cancellable = true)
    private void getTargetCooldownLength__2026418698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2026418698L))
            info.setReturnValue(-835391763);
    }

    @Inject(at = @At("HEAD"), method = "ominousConfig()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig;", cancellable = true)
    private void ominousConfig_1143190463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143190463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ejectReward(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void ejectReward_1943446460(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1943446460L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSpawnParticles(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/particles/SimpleParticleType;)V", cancellable = true)
    private static void addSpawnParticles_762161740(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(762161740L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addEjectItemParticles(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void addEjectItemParticles_747395160(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(747395160L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBecomeOminousParticles(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void addBecomeOminousParticles_1184915609(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1184915609L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDetectPlayerParticles(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;ILnet/minecraft/core/particles/ParticleOptions;)V", cancellable = true)
    private static void addDetectPlayerParticles__2082302402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2082302402L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "overrideEntityToSpawn(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V", cancellable = true)
    private void overrideEntityToSpawn_533102106(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(533102106L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "overridePeacefulAndMobSpawnRule()V", cancellable = true)
    private void overridePeacefulAndMobSpawnRule_1566665352(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1566665352L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerDetector()Lnet/minecraft/world/level/block/entity/trialspawner/PlayerDetector;", cancellable = true)
    private void getPlayerDetector_1635291741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1635291741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyOminous(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void applyOminous_201524890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(201524890L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntitySelector()Lnet/minecraft/world/level/block/entity/trialspawner/PlayerDetector$EntitySelector;", cancellable = true)
    private void getEntitySelector_2134052868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2134052868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlayerDetector(Lnet/minecraft/world/level/block/entity/trialspawner/PlayerDetector;)V", cancellable = true)
    private void setPlayerDetector__316903509(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-316903509L))
            info.cancel();
    }


}
