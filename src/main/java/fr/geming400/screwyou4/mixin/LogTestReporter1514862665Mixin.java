package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.LogTestReporter.class)
public class LogTestReporter1514862665Mixin {
        @Inject(at = @At("HEAD"), method = "onTestFailed(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private void onTestFailed__790265255(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-790265255L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onTestSuccess(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private void onTestSuccess__790265255(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-790265255L))
            info.cancel();
    }


}
