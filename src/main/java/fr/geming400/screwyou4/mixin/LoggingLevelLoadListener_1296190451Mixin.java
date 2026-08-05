package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.progress.LoggingLevelLoadListener.class)
public class LoggingLevelLoadListener_1296190451Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;II)V", cancellable = true)
    private void update_1287525731(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1287525731L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "start(Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;I)V", cancellable = true)
    private void start__783182912(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-783182912L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finish(Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;)V", cancellable = true)
    private void finish__849979965(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-849979965L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateFocus(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void updateFocus__1312541931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1312541931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forDedicatedServer()Lnet/minecraft/server/level/progress/LoggingLevelLoadListener;", cancellable = true)
    private static void forDedicatedServer_730738074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(730738074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forSingleplayer()Lnet/minecraft/server/level/progress/LoggingLevelLoadListener;", cancellable = true)
    private static void forSingleplayer_730738074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(730738074L))
            info.setReturnValue(null);
    }


}
