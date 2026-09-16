package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.RemoveBlockGoal.class)
public class RemoveBlockGoal1536334958Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__89830401(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-89830401L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1181528993(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1181528993L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_621894894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(621894894L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1406651300(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1406651300L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playBreakSound(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void playBreakSound__1282396862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1282396862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playDestroyProgressSound(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void playDestroyProgressSound__984830415(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-984830415L))
            info.cancel();
    }


}
