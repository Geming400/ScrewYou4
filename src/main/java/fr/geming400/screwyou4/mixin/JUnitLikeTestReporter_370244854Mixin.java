package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.JUnitLikeTestReporter.class)
public class JUnitLikeTestReporter_370244854Mixin {
        @Inject(at = @At("HEAD"), method = "save(Ljava/io/File;)V", cancellable = true)
    private void save_1921373698(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1921373698L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finish()V", cancellable = true)
    private void finish_1665129205(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1665129205L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onTestSuccess(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private void onTestSuccess__1036704329(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1036704329L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onTestFailed(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private void onTestFailed__1477469517(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1477469517L))
            info.cancel();
    }


}
