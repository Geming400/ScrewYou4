package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.progress.LevelLoadProgressTracker.class)
public class LevelLoadProgressTracker_1423190993Mixin {
        @Inject(at = @At("HEAD"), method = "get()F", cancellable = true)
    private void get_1461450355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1461450355L))
            info.setReturnValue(2.73673E8F);
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;II)V", cancellable = true)
    private void update_1414526273(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1414526273L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "start(Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;I)V", cancellable = true)
    private void start__656182370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-656182370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finish(Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;)V", cancellable = true)
    private void finish__722979423(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-722979423L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateFocus(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void updateFocus__1185541389(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1185541389L))
            info.cancel();
    }


}
