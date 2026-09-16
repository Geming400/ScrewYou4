package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestFinder.class)
public class TestFinder_287532486Mixin {
        @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/gametest/framework/TestFinder$Builder;", cancellable = true)
    private static void builder_448061935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(448061935L))
            info.setReturnValue(new net.minecraft.gametest.framework.TestFinder.Builder());
    }

    @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void source__159648903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-159648903L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findTests()Ljava/util/stream/Stream;", cancellable = true)
    private void findTests__1536451758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1536451758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findTestPos()Ljava/util/stream/Stream;", cancellable = true)
    private void findTestPos__875436431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-875436431L))
            info.setReturnValue(null);
    }


}
