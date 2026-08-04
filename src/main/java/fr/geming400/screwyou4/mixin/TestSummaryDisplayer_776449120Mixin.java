package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestCommand.TestSummaryDisplayer.class)
public class TestSummaryDisplayer_776449120Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2133005918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133005918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__359010856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-359010856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_814711861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(814711861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void source__1508995186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1508995186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "testStructureLoaded(Lnet/minecraft/gametest/framework/GameTestInfo;)V", cancellable = true)
    private void testStructureLoaded__1528678801(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1528678801L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "testAddedForRerun(Lnet/minecraft/gametest/framework/GameTestInfo;Lnet/minecraft/gametest/framework/GameTestInfo;Lnet/minecraft/gametest/framework/GameTestRunner;)V", cancellable = true)
    private void testAddedForRerun__1040298803(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1040298803L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "testPassed(Lnet/minecraft/gametest/framework/GameTestInfo;Lnet/minecraft/gametest/framework/GameTestRunner;)V", cancellable = true)
    private void testPassed__1870535312(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1870535312L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "testFailed(Lnet/minecraft/gametest/framework/GameTestInfo;Lnet/minecraft/gametest/framework/GameTestRunner;)V", cancellable = true)
    private void testFailed__1870535312(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1870535312L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tracker()Lnet/minecraft/gametest/framework/MultipleTestTracker;", cancellable = true)
    private void tracker__1686439969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1686439969L))
            info.setReturnValue(null);
    }


}
