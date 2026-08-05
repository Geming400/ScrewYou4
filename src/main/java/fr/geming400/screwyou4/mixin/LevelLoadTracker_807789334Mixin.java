package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.LevelLoadTracker.class)
public class LevelLoadTracker_807789334Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;II)V", cancellable = true)
    private void update_799124614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(799124614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "start(Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;I)V", cancellable = true)
    private void start__1271584029(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1271584029L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finish(Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;)V", cancellable = true)
    private void finish__1338381082(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1338381082L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasProgress()Z", cancellable = true)
    private void hasProgress_846067916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846067916L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setServerChunkStatusView(Lnet/minecraft/server/level/progress/ChunkLoadStatusView;)V", cancellable = true)
    private void setServerChunkStatusView_1421958836(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1421958836L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadingPacketsReceived()V", cancellable = true)
    private void loadingPacketsReceived_846064072(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(846064072L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startClientLoad(Lnet/minecraft/client/player/LocalPlayer;Lnet/minecraft/client/multiplayer/ClientLevel;)V", cancellable = true)
    private void startClientLoad__1472283668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1472283668L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickClientLoad()V", cancellable = true)
    private void tickClientLoad_846064072(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(846064072L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateFocus(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void updateFocus__1800943048(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1800943048L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isLevelReady()Z", cancellable = true)
    private void isLevelReady_846067916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846067916L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "serverProgress()F", cancellable = true)
    private void serverProgress_846048696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846048696L))
            info.setReturnValue(1.925977E8F);
    }

    @Inject(at = @At("HEAD"), method = "statusView()Lnet/minecraft/server/level/progress/ChunkLoadStatusView;", cancellable = true)
    private void statusView_2093976878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2093976878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerCompiledSectionCallback()Ljava/lang/Runnable;", cancellable = true)
    private void getPlayerCompiledSectionCallback_2140305362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2140305362L))
            info.setReturnValue(null);
    }


}
