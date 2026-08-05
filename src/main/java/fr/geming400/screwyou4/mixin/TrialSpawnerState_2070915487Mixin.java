package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerState.class)
public class TrialSpawnerState_2070915487Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerState;", cancellable = true)
    private static void values_1372952497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1372952497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerState;", cancellable = true)
    private static void valueOf_42945172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(42945172L))
            info.setReturnValue(net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerState.ACTIVE);
    }

    @Inject(at = @At("HEAD"), method = "lightLevel()I", cancellable = true)
    private void lightLevel_2109177732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109177732L))
            info.setReturnValue(510920231);
    }

    @Inject(at = @At("HEAD"), method = "spinningMobSpeed()D", cancellable = true)
    private void spinningMobSpeed_2109172927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109172927L))
            info.setReturnValue(3.055490076579108E7D);
    }

    @Inject(at = @At("HEAD"), method = "isCapableOfSpawning()Z", cancellable = true)
    private void isCapableOfSpawning_2109194069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109194069L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasSpinningMob()Z", cancellable = true)
    private void hasSpinningMob_2109194069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109194069L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "emitParticles(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void emitParticles_1999974070(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1999974070L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_935455015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(935455015L))
            info.setReturnValue("m\u4CFA\u178Ce\"`QD\"\uC5FF'ka\u2F09h\u907B\u71F2GHiO\u2584^'a{E\u358Cl03y&v\u4F8ErN=qU-^fnm\uCB96 !\uD78FXwlEzqH,z<d+q4mUkMUL_\uCC85\u1630hg3)Rl;w=_N-#63gK?e");
    }


}
