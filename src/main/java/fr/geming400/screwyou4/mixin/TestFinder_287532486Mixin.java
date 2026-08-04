package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestFinder.class)
public class TestFinder_287532486Mixin {
        @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/gametest/framework/TestFinder$Builder;", cancellable = true)
    private static void builder_1056239914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1056239914L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void source__1997911820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1997911820L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findTests()Ljava/util/stream/Stream;", cancellable = true)
    private void findTests_76826170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(76826170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findTestPos()Ljava/util/stream/Stream;", cancellable = true)
    private void findTestPos_76826170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(76826170L))
            info.setReturnValue(null);
    }


}
