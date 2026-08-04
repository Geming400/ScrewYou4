package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GlobalTestReporter.class)
public class GlobalTestReporter_2124665288Mixin {
        @Inject(at = @At("HEAD"), method = "finish()V", cancellable = true)
    private static void finish__2132027022(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2132027022L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "replaceWith(Lnet/minecraft/gametest/framework/TestReporter;)V", cancellable = true)
    private static void replaceWith__2003095474(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2003095474L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onTestFailed(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private static void onTestFailed__180462385(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-180462385L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onTestSuccess(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private static void onTestSuccess__180462385(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-180462385L))
            info.cancel();
    }


}
