package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerConfig.class)
public class TrialSpawnerConfig2073380234Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1164753966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164753966L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1451163537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1451163537L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1664234971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1664234971L))
            info.setReturnValue(1941724228);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig$Builder;", cancellable = true)
    private static void builder__1312157775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1312157775L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerConfig.Builder());
    }

    @Inject(at = @At("HEAD"), method = "spawnRange()I", cancellable = true)
    private void spawnRange__1624960466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1624960466L))
            info.setReturnValue(1750655025);
    }

    @Inject(at = @At("HEAD"), method = "lootTablesToEject()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void lootTablesToEject__1864158567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1864158567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ticksBetweenItemSpawners()J", cancellable = true)
    private void ticksBetweenItemSpawners__576437471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-576437471L))
            info.setReturnValue(-2507673210736782358L);
    }

    @Inject(at = @At("HEAD"), method = "ticksBetweenSpawn()I", cancellable = true)
    private void ticksBetweenSpawn__767700185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-767700185L))
            info.setReturnValue(-220079320);
    }

    @Inject(at = @At("HEAD"), method = "spawnPotentialsDefinition()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void spawnPotentialsDefinition__617266221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-617266221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "simultaneousMobsAddedPerPlayer()F", cancellable = true)
    private void simultaneousMobsAddedPerPlayer__1661008831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1661008831L))
            info.setReturnValue(1.070295E8F);
    }

    @Inject(at = @At("HEAD"), method = "calculateTargetSimultaneousMobs(I)I", cancellable = true)
    private void calculateTargetSimultaneousMobs__392549010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-392549010L))
            info.setReturnValue(24629177);
    }

    @Inject(at = @At("HEAD"), method = "totalMobs()F", cancellable = true)
    private void totalMobs__555321418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-555321418L))
            info.setReturnValue(1.070295E8F);
    }

    @Inject(at = @At("HEAD"), method = "withSpawning(Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig;", cancellable = true)
    private void withSpawning__897601111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-897601111L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculateTargetTotalMobs(I)I", cancellable = true)
    private void calculateTargetTotalMobs_1542643689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1542643689L))
            info.setReturnValue(195393335);
    }

    @Inject(at = @At("HEAD"), method = "itemsToDropWhenOminous()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void itemsToDropWhenOminous__471469195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-471469195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "totalMobsAddedPerPlayer()F", cancellable = true)
    private void totalMobsAddedPerPlayer_1886905688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1886905688L))
            info.setReturnValue(1.070295E8F);
    }

    @Inject(at = @At("HEAD"), method = "simultaneousMobs()F", cancellable = true)
    private void simultaneousMobs__936250785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-936250785L))
            info.setReturnValue(1.070295E8F);
    }


}
