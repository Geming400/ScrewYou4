package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.FailedTestTracker.class)
public class FailedTestTracker_886212965Mixin {
        @Inject(at = @At("HEAD"), method = "forgetFailedTests()V", cancellable = true)
    private static void forgetFailedTests__2074369096(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2074369096L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLastFailedTests()Ljava/util/stream/Stream;", cancellable = true)
    private static void getLastFailedTests_1418436761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1418436761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rememberFailedTest(Lnet/minecraft/core/Holder$Reference;)V", cancellable = true)
    private static void rememberFailedTest_586196115(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(586196115L))
            info.cancel();
    }


}
