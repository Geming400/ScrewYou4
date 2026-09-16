package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestSequence.class)
public class GameTestSequence_1429498585Mixin {
        @Inject(at = @At("HEAD"), method = "tickAndContinue(I)V", cancellable = true)
    private void tickAndContinue_364421893(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(364421893L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickAndFailIfNotComplete(I)V", cancellable = true)
    private void tickAndFailIfNotComplete_1352453691(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1352453691L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "thenTrigger()Lnet/minecraft/gametest/framework/GameTestSequence$Condition;", cancellable = true)
    private void thenTrigger_356809021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(356809021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thenExecute(Ljava/lang/Runnable;)Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void thenExecute__1117297067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1117297067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thenWaitAtLeast(JLjava/lang/Runnable;)Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void thenWaitAtLeast_885437131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(885437131L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thenExecuteFor(ILjava/lang/Runnable;)Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void thenExecuteFor_1401627447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1401627447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thenFail(Ljava/util/function/Supplier;)V", cancellable = true)
    private void thenFail_1675326266(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1675326266L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "thenIdle(I)Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void thenIdle_624379321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(624379321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thenWaitUntil(JLjava/lang/Runnable;)Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void thenWaitUntil__1146249293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1146249293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thenWaitUntil(Ljava/lang/Runnable;)Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void thenWaitUntil_717071137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(717071137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thenSucceed()V", cancellable = true)
    private void thenSucceed__2033046714(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2033046714L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "thenExecuteAfter(ILjava/lang/Runnable;)Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void thenExecuteAfter_1848643018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848643018L))
            info.setReturnValue(null);
    }


}
