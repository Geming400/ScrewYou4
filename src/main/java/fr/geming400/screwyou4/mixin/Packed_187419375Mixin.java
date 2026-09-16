package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerStateData.Packed.class)
public class Packed_187419375Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__721206894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-721206894L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_957842899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(957842899L))
            info.setReturnValue("Dh*CAtM\u7975N|U\u6617R\uBDCFz+J");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_744771465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744771465L))
            info.setReturnValue(-899833361);
    }

    @Inject(at = @At("HEAD"), method = "nextSpawnData()Ljava/util/Optional;", cancellable = true)
    private void nextSpawnData_1270349486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1270349486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nextMobSpawnsAt()J", cancellable = true)
    private void nextMobSpawnsAt__277890371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-277890371L))
            info.setReturnValue(2713711319696888219L);
    }

    @Inject(at = @At("HEAD"), method = "cooldownEndsAt()J", cancellable = true)
    private void cooldownEndsAt_224583103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(224583103L))
            info.setReturnValue(-3988466444756566650L);
    }

    @Inject(at = @At("HEAD"), method = "detectedPlayers()Ljava/util/Set;", cancellable = true)
    private void detectedPlayers_509824576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(509824576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "totalMobsSpawned()I", cancellable = true)
    private void totalMobsSpawned__1688277967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1688277967L))
            info.setReturnValue(-1237240359);
    }

    @Inject(at = @At("HEAD"), method = "currentMobs()Ljava/util/Set;", cancellable = true)
    private void currentMobs__1023712508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1023712508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ejectingLootTable()Ljava/util/Optional;", cancellable = true)
    private void ejectingLootTable_1810959665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1810959665L))
            info.setReturnValue(null);
    }


}
