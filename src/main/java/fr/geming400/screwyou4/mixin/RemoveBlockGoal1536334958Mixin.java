package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.RemoveBlockGoal.class)
public class RemoveBlockGoal1536334958Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1574609697(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1574609697L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1574609697(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1574609697L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1574613541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1574613541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1574609697(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1574609697L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playBreakSound(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void playBreakSound__1931027098(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1931027098L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playDestroyProgressSound(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void playDestroyProgressSound_1084784141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1084784141L))
            info.cancel();
    }


}
