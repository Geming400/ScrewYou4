package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerState.class)
public class TrialSpawnerState_2070915487Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerState;", cancellable = true)
    private static void values_138183123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(138183123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerState;", cancellable = true)
    private static void valueOf_1445214316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1445214316L))
            info.setReturnValue(net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerState.WAITING_FOR_PLAYERS);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__2135843188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2135843188L))
            info.setReturnValue("/XAu$\uACCD\uFC86-\uBC6Bky/Zg6Ynq|Uri<;LA8|3ByvCA5hW-mp\u7F20^(|7I 0rZAM:M\u4199'mv");
    }

    @Inject(at = @At("HEAD"), method = "lightLevel()I", cancellable = true)
    private void lightLevel_377267254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(377267254L))
            info.setReturnValue(-1542641518);
    }

    @Inject(at = @At("HEAD"), method = "isCapableOfSpawning()Z", cancellable = true)
    private void isCapableOfSpawning__745914219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-745914219L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "spinningMobSpeed()D", cancellable = true)
    private void spinningMobSpeed__1557204062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1557204062L))
            info.setReturnValue(6.222033007090535E8D);
    }

    @Inject(at = @At("HEAD"), method = "hasSpinningMob()Z", cancellable = true)
    private void hasSpinningMob_706054437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(706054437L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "emitParticles(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void emitParticles__880619056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-880619056L))
            info.cancel();
    }


}
