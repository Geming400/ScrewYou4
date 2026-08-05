package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GlobalTestReporter.class)
public class GlobalTestReporter_2124665288Mixin {
        @Inject(at = @At("HEAD"), method = "finish()V", cancellable = true)
    private static void finish__875417409(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-875417409L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "replaceWith(Lnet/minecraft/gametest/framework/TestReporter;)V", cancellable = true)
    private static void replaceWith__779430680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-779430680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onTestFailed(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private static void onTestFailed_276951165(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(276951165L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onTestSuccess(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private static void onTestSuccess_717716353(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(717716353L))
            info.cancel();
    }


}
