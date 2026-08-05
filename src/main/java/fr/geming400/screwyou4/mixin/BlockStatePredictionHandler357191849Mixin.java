package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.prediction.BlockStatePredictionHandler.class)
public class BlockStatePredictionHandler357191849Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_395466588(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(395466588L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "currentSequence()I", cancellable = true)
    private void currentSequence_395454095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(395454095L))
            info.setReturnValue(-761585449);
    }

    @Inject(at = @At("HEAD"), method = "startPredicting()Lnet/minecraft/client/multiplayer/prediction/BlockStatePredictionHandler;", cancellable = true)
    private void startPredicting_1755668113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1755668113L))
            info.setReturnValue(new net.minecraft.client.multiplayer.prediction.BlockStatePredictionHandler());
    }

    @Inject(at = @At("HEAD"), method = "onTeleport()V", cancellable = true)
    private void onTeleport_395466588(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(395466588L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endPredictionsUpTo(ILnet/minecraft/client/multiplayer/ClientLevel;)V", cancellable = true)
    private void endPredictionsUpTo_763208400(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(763208400L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "retainKnownServerState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/player/LocalPlayer;)V", cancellable = true)
    private void retainKnownServerState__2052944414(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2052944414L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPredicting()Z", cancellable = true)
    private void isPredicting_395470432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(395470432L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "updateKnownServerState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void updateKnownServerState_2133453411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2133453411L))
            info.setReturnValue(false);
    }


}
