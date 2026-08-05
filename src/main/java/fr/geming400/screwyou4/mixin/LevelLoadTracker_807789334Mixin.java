package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.LevelLoadTracker.class)
public class LevelLoadTracker_807789334Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;II)V", cancellable = true)
    private void update_1309642959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1309642959L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "start(Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;I)V", cancellable = true)
    private void start_280920897(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(280920897L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finish(Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;)V", cancellable = true)
    private void finish__1110800199(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1110800199L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverProgress()F", cancellable = true)
    private void serverProgress_1769563432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1769563432L))
            info.setReturnValue(3.017782E8F);
    }

    @Inject(at = @At("HEAD"), method = "isLevelReady()Z", cancellable = true)
    private void isLevelReady__1015217885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1015217885L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setServerChunkStatusView(Lnet/minecraft/server/level/progress/ChunkLoadStatusView;)V", cancellable = true)
    private void setServerChunkStatusView__377050765(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-377050765L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerCompiledSectionCallback()Ljava/lang/Runnable;", cancellable = true)
    private void getPlayerCompiledSectionCallback__1466634380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1466634380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadingPacketsReceived()V", cancellable = true)
    private void loadingPacketsReceived__636246856(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-636246856L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startClientLoad(Lnet/minecraft/client/player/LocalPlayer;Lnet/minecraft/client/multiplayer/ClientLevel;)V", cancellable = true)
    private void startClientLoad__178350401(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-178350401L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickClientLoad()V", cancellable = true)
    private void tickClientLoad__1739399750(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1739399750L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateFocus(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void updateFocus__333468281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-333468281L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasProgress()Z", cancellable = true)
    private void hasProgress__1322077627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1322077627L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "statusView()Lnet/minecraft/server/level/progress/ChunkLoadStatusView;", cancellable = true)
    private void statusView__1201388841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1201388841L))
            info.setReturnValue(null);
    }


}
