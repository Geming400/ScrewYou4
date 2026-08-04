package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerConfig.class)
public class TrialSpawnerConfig2073380234Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__836074803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-836074803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_937920259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937920259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2111642976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111642976L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private static void builder__1524280426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1524280426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "simultaneousMobsAddedPerPlayer()F", cancellable = true)
    private void simultaneousMobsAddedPerPlayer_2111639597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111639597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculateTargetSimultaneousMobs(I)I", cancellable = true)
    private void calculateTargetSimultaneousMobs__1007682583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1007682583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lootTablesToEject()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void lootTablesToEject_1566896368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1566896368L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ticksBetweenItemSpawners()J", cancellable = true)
    private void ticksBetweenItemSpawners_2111643441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111643441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSpawning(Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig;", cancellable = true)
    private void withSpawning__1495937994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1495937994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "simultaneousMobs()F", cancellable = true)
    private void simultaneousMobs_2111639597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111639597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "totalMobsAddedPerPlayer()F", cancellable = true)
    private void totalMobsAddedPerPlayer_2111639597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111639597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ticksBetweenSpawn()I", cancellable = true)
    private void ticksBetweenSpawn_2111642480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111642480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemsToDropWhenOminous()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void itemsToDropWhenOminous__1413095749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1413095749L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnPotentialsDefinition()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void spawnPotentialsDefinition_1566896368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1566896368L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculateTargetTotalMobs(I)I", cancellable = true)
    private void calculateTargetTotalMobs__1007682583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1007682583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnRange()I", cancellable = true)
    private void spawnRange_2111642480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111642480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "totalMobs()F", cancellable = true)
    private void totalMobs_2111639597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111639597L))
            info.setReturnValue(null);
    }


}
