package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerStateData.class)
public class TrialSpawnerStateData_990474981Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset__738962008(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-738962008L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerStateData$Packed;)V", cancellable = true)
    private void apply__795541546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-795541546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerStateData$Packed;", cancellable = true)
    private void pack__535825943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-535825943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOSpin()D", cancellable = true)
    private void getOSpin_172030794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(172030794L))
            info.setReturnValue(6.83496100129942E8D);
    }

    @Inject(at = @At("HEAD"), method = "getSpin()D", cancellable = true)
    private void getSpin__1205630899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1205630899L))
            info.setReturnValue(6.834961007708344E8D);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerState;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_336681662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(336681662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "countAdditionalPlayers(Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void countAdditionalPlayers__888379942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-888379942L))
            info.setReturnValue(1168472134);
    }

    @Inject(at = @At("HEAD"), method = "isReadyToEjectItems(Lnet/minecraft/server/level/ServerLevel;FI)Z", cancellable = true)
    private void isReadyToEjectItems__870247028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-870247028L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isReadyToSpawnNextMob(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig;I)Z", cancellable = true)
    private void isReadyToSpawnNextMob__224096899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-224096899L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "resetStatistics()V", cancellable = true)
    private void resetStatistics_125270277(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(125270277L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "haveAllCurrentMobsDied()Z", cancellable = true)
    private void haveAllCurrentMobsDied__651585852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-651585852L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isCooldownFinished(Lnet/minecraft/server/level/ServerLevel;)Z", cancellable = true)
    private void isCooldownFinished__577444987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-577444987L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreateDisplayEntity(Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawner;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerState;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getOrCreateDisplayEntity__1394861760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1394861760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryDetectPlayers(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawner;)V", cancellable = true)
    private void tryDetectPlayers_1158598780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1158598780L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasFinishedSpawningAllMobs(Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig;I)Z", cancellable = true)
    private void hasFinishedSpawningAllMobs__1528813015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1528813015L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasMobToSpawn(Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawner;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void hasMobToSpawn__679002521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-679002521L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDispensingItems(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerConfig;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void getDispensingItems__442553981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-442553981L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isReadyToOpenShutter(Lnet/minecraft/server/level/ServerLevel;FI)Z", cancellable = true)
    private void isReadyToOpenShutter_1113468128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1113468128L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "resetAfterBecomingOminous(Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawner;Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void resetAfterBecomingOminous_1631452861(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1631452861L))
            info.cancel();
    }


}
