package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.JUnitLikeTestReporter.class)
public class JUnitLikeTestReporter_370244854Mixin {
        @Inject(at = @At("HEAD"), method = "save(Ljava/io/File;)V", cancellable = true)
    private void save__197686625(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-197686625L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finish()V", cancellable = true)
    private void finish_408519592(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(408519592L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onTestSuccess(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private void onTestSuccess__1934883067(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1934883067L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onTestFailed(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private void onTestFailed__1934883067(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1934883067L))
            info.cancel();
    }


}
