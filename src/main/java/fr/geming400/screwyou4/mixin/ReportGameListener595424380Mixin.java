package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.ReportGameListener.class)
public class ReportGameListener595424380Mixin {
        @Inject(at = @At("HEAD"), method = "testFailed(Lnet/minecraft/gametest/framework/GameTestInfo;Lnet/minecraft/gametest/framework/GameTestRunner;)V", cancellable = true)
    private void testFailed__222142594(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-222142594L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "testPassed(Lnet/minecraft/gametest/framework/GameTestInfo;Lnet/minecraft/gametest/framework/GameTestRunner;)V", cancellable = true)
    private void testPassed__1181741269(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1181741269L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "testStructureLoaded(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private void testStructureLoaded_278617074(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(278617074L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "testAddedForRerun(Lnet/minecraft/gametest/framework/GameTestInfo;Lnet/minecraft/gametest/framework/GameTestInfo;Lnet/minecraft/gametest/framework/GameTestRunner;)V", cancellable = true)
    private void testAddedForRerun__1170368953(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1170368953L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reportPassed(Lnet/minecraft/gametest/framework/GameTestInfo;Ljava/lang/String;)V", cancellable = true)
    private static void reportPassed__821471726(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-821471726L))
            info.cancel();
    }


}
