package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestRunner.class)
public class GameTestRunner_1566099498Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1604374236(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1604374236L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1604374236(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1604374236L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rerunTest(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private void rerunTest__739028423(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-739028423L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addListener(Lnet/minecraft/gametest/framework/GameTestBatchListener;)V", cancellable = true)
    private void addListener__272080279(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-272080279L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTestInfos()Ljava/util/List;", cancellable = true)
    private void getTestInfos__1102530983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1102530983L))
            info.setReturnValue(null);
    }


}
