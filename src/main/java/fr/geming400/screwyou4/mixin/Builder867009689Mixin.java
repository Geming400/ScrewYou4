package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerConfig.Builder.class)
public class Builder867009689Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig;", cancellable = true)
    private void build_666042194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(666042194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnRange(I)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private void spawnRange__1877761326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1877761326L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerConfig.Builder());
    }

    @Inject(at = @At("HEAD"), method = "lootTablesToEject(Lnet/minecraft/util/random/WeightedList;)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private void lootTablesToEject__1659148017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1659148017L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerConfig.Builder());
    }

    @Inject(at = @At("HEAD"), method = "spawnPotentialsDefinition(Lnet/minecraft/util/random/WeightedList;)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private void spawnPotentialsDefinition_1570829897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1570829897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ticksBetweenSpawn(I)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private void ticksBetweenSpawn_699468235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(699468235L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerConfig.Builder());
    }

    @Inject(at = @At("HEAD"), method = "totalMobs(F)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private void totalMobs__475125120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-475125120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "simultaneousMobsAddedPerPlayer(F)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private void simultaneousMobsAddedPerPlayer__290428661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-290428661L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerConfig.Builder());
    }

    @Inject(at = @At("HEAD"), method = "itemsToDropWhenOminous(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private void itemsToDropWhenOminous__186870429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-186870429L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerConfig.Builder());
    }

    @Inject(at = @At("HEAD"), method = "simultaneousMobs(F)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private void simultaneousMobs_34564905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(34564905L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerConfig.Builder());
    }

    @Inject(at = @At("HEAD"), method = "totalMobsAddedPerPlayer(F)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private void totalMobsAddedPerPlayer__509213662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-509213662L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerConfig.Builder());
    }


}
