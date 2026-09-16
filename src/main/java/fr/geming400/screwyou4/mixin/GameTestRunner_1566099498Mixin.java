package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestRunner.class)
public class GameTestRunner_1566099498Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__60065862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-60065862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1151764454(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1151764454L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addListener(Lnet/minecraft/gametest/framework/GameTestBatchListener;)V", cancellable = true)
    private void addListener__79890924(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-79890924L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rerunTest(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private void rerunTest__1479816861(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1479816861L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTestInfos()Ljava/util/List;", cancellable = true)
    private void getTestInfos__985604298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-985604298L))
            info.setReturnValue(null);
    }


}
