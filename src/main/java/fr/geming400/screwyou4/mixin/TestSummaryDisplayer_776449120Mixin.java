package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestCommand.TestSummaryDisplayer.class)
public class TestSummaryDisplayer_776449120Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__132177149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-132177149L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1546872644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1546872644L))
            info.setReturnValue("AiSjz;O^:rhqbt#Cr?R5HjR}q%O,[,EBoE)ISZq\u0DA3vR3SGK\uA084L(\uC041s_N0k\")I:U1;\"2G");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1333801210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1333801210L))
            info.setReturnValue(-961047805);
    }

    @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void source_329267731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(329267731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tracker()Lnet/minecraft/gametest/framework/MultipleTestTracker;", cancellable = true)
    private void tracker_2056640791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2056640791L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "testFailed(Lnet/minecraft/gametest/framework/GameTestInfo;Lnet/minecraft/gametest/framework/GameTestRunner;)V", cancellable = true)
    private void testFailed__41117855(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-41117855L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "testPassed(Lnet/minecraft/gametest/framework/GameTestInfo;Lnet/minecraft/gametest/framework/GameTestRunner;)V", cancellable = true)
    private void testPassed__1000716530(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1000716530L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "testStructureLoaded(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private void testStructureLoaded_459641813(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(459641813L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "testAddedForRerun(Lnet/minecraft/gametest/framework/GameTestInfo;Lnet/minecraft/gametest/framework/GameTestInfo;Lnet/minecraft/gametest/framework/GameTestRunner;)V", cancellable = true)
    private void testAddedForRerun__989344214(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-989344214L))
            info.cancel();
    }


}
