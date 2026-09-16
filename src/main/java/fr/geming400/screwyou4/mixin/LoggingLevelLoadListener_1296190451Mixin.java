package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.progress.LoggingLevelLoadListener.class)
public class LoggingLevelLoadListener_1296190451Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;II)V", cancellable = true)
    private void update_1798044076(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1798044076L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "start(Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;I)V", cancellable = true)
    private void start_769322014(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(769322014L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finish(Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;)V", cancellable = true)
    private void finish__622399082(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-622399082L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateFocus(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void updateFocus_154932836(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(154932836L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forSingleplayer()Lnet/minecraft/server/level/progress/LoggingLevelLoadListener;", cancellable = true)
    private static void forSingleplayer_1617266092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1617266092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forDedicatedServer()Lnet/minecraft/server/level/progress/LoggingLevelLoadListener;", cancellable = true)
    private static void forDedicatedServer_2048233827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2048233827L))
            info.setReturnValue(null);
    }


}
