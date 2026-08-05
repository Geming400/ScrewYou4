package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.ReportGameListener.class)
public class ReportGameListener595424380Mixin {
        @Inject(at = @At("HEAD"), method = "testPassed(Lnet/minecraft/gametest/framework/GameTestInfo;Lnet/minecraft/gametest/framework/GameTestRunner;)V", cancellable = true)
    private void testPassed__2051560051(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2051560051L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "testFailed(Lnet/minecraft/gametest/framework/GameTestInfo;Lnet/minecraft/gametest/framework/GameTestRunner;)V", cancellable = true)
    private void testFailed__2051560051(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2051560051L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "testStructureLoaded(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private void testStructureLoaded__1709703540(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1709703540L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "testAddedForRerun(Lnet/minecraft/gametest/framework/GameTestInfo;Lnet/minecraft/gametest/framework/GameTestInfo;Lnet/minecraft/gametest/framework/GameTestRunner;)V", cancellable = true)
    private void testAddedForRerun__1221323542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1221323542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reportPassed(Lnet/minecraft/gametest/framework/GameTestInfo;Ljava/lang/String;)V", cancellable = true)
    private static void reportPassed_317349454(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(317349454L))
            info.cancel();
    }


}
