package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestTicker.class)
public class GameTestTicker_458279632Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_496554370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(496554370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private void add__1846848289(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1846848289L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_496554370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(496554370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRunner(Lnet/minecraft/gametest/framework/GameTestRunner;)V", cancellable = true)
    private void setRunner__1594241635(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1594241635L))
            info.cancel();
    }


}
