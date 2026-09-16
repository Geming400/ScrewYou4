package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.prediction.BlockStatePredictionHandler.class)
public class BlockStatePredictionHandler357191849Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1757383580(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1757383580L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPredicting()Z", cancellable = true)
    private void isPredicting_91400461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(91400461L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "retainKnownServerState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/player/LocalPlayer;)V", cancellable = true)
    private void retainKnownServerState_1271637234(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1271637234L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endPredictionsUpTo(ILnet/minecraft/client/multiplayer/ClientLevel;)V", cancellable = true)
    private void endPredictionsUpTo__1869625009(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1869625009L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateKnownServerState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void updateKnownServerState_357037847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(357037847L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "currentSequence()I", cancellable = true)
    private void currentSequence_288243317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(288243317L))
            info.setReturnValue(634414551);
    }

    @Inject(at = @At("HEAD"), method = "startPredicting()Lnet/minecraft/client/multiplayer/prediction/BlockStatePredictionHandler;", cancellable = true)
    private void startPredicting_983246342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(983246342L))
            info.setReturnValue(new net.minecraft.client.multiplayer.prediction.BlockStatePredictionHandler());
    }

    @Inject(at = @At("HEAD"), method = "onTeleport()V", cancellable = true)
    private void onTeleport__711522446(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-711522446L))
            info.cancel();
    }


}
