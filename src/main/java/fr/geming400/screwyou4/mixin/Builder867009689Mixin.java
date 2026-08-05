package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerConfig.Builder.class)
public class Builder867009689Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig;", cancellable = true)
    private void build__66724380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-66724380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnRange(I)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private void spawnRange_1645860884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1645860884L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnPotentialsDefinition(Lnet/minecraft/util/random/WeightedList;)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private void spawnPotentialsDefinition_380461414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(380461414L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lootTablesToEject(Lnet/minecraft/util/random/WeightedList;)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private void lootTablesToEject_380461414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(380461414L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ticksBetweenSpawn(I)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private void ticksBetweenSpawn_1645860884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1645860884L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "totalMobs(F)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private void totalMobs__1977893641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977893641L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerConfig$Builder());
    }

    @Inject(at = @At("HEAD"), method = "simultaneousMobsAddedPerPlayer(F)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private void simultaneousMobsAddedPerPlayer__1977893641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977893641L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerConfig$Builder());
    }

    @Inject(at = @At("HEAD"), method = "simultaneousMobs(F)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private void simultaneousMobs__1977893641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977893641L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerConfig$Builder());
    }

    @Inject(at = @At("HEAD"), method = "totalMobsAddedPerPlayer(F)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private void totalMobsAddedPerPlayer__1977893641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977893641L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerConfig$Builder());
    }

    @Inject(at = @At("HEAD"), method = "itemsToDropWhenOminous(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private void itemsToDropWhenOminous_1776026793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1776026793L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerConfig$Builder());
    }


}
