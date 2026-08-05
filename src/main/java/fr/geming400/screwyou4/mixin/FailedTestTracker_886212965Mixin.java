package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.FailedTestTracker.class)
public class FailedTestTracker_886212965Mixin {
        @Inject(at = @At("HEAD"), method = "forgetFailedTests()V", cancellable = true)
    private static void forgetFailedTests_924487951(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(924487951L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rememberFailedTest(Lnet/minecraft/core/Holder$Reference;)V", cancellable = true)
    private static void rememberFailedTest_1963580087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1963580087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLastFailedTests()Ljava/util/stream/Stream;", cancellable = true)
    private static void getLastFailedTests_675506897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(675506897L))
            info.setReturnValue(null);
    }


}
