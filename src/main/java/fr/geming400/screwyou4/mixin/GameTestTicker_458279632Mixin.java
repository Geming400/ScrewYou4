package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestTicker.class)
public class GameTestTicker_458279632Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear__327548075(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-327548075L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private void add__1735758080(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1735758080L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_328595973(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(328595973L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRunner(Lnet/minecraft/gametest/framework/GameTestRunner;)V", cancellable = true)
    private void setRunner_707209807(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(707209807L))
            info.cancel();
    }


}
