package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.progress.LevelLoadProgressTracker.class)
public class LevelLoadProgressTracker_1423190993Mixin {
        @Inject(at = @At("HEAD"), method = "get()F", cancellable = true)
    private void get__948138787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-948138787L))
            info.setReturnValue(5.207533E8F);
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;II)V", cancellable = true)
    private void update_1925044618(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1925044618L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "start(Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;I)V", cancellable = true)
    private void start_896322556(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(896322556L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finish(Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;)V", cancellable = true)
    private void finish__495398540(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-495398540L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateFocus(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void updateFocus_281933378(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(281933378L))
            info.cancel();
    }


}
