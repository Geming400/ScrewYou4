package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestSequence.class)
public class GameTestSequence_1429498585Mixin {
        @Inject(at = @At("HEAD"), method = "thenWaitUntil(Ljava/lang/Runnable;)Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void thenWaitUntil_376949741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(376949741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thenWaitUntil(JLjava/lang/Runnable;)Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void thenWaitUntil_1194889319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1194889319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thenSucceed()V", cancellable = true)
    private void thenSucceed_1467773323(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1467773323L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickAndContinue(I)V", cancellable = true)
    private void tickAndContinue__1651551740(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1651551740L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickAndFailIfNotComplete(I)V", cancellable = true)
    private void tickAndFailIfNotComplete__1651551740(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1651551740L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "thenExecuteAfter(ILjava/lang/Runnable;)Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void thenExecuteAfter_327837094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(327837094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thenFail(Ljava/util/function/Supplier;)V", cancellable = true)
    private void thenFail_187082527(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(187082527L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "thenIdle(I)Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void thenIdle__834633432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-834633432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thenExecute(Ljava/lang/Runnable;)Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void thenExecute_376949741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(376949741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thenExecuteFor(ILjava/lang/Runnable;)Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void thenExecuteFor_327837094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(327837094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thenTrigger()Lnet/minecraft/gametest/framework/GameTestSequence$Condition;", cancellable = true)
    private void thenTrigger__339707208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-339707208L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thenWaitAtLeast(JLjava/lang/Runnable;)Lnet/minecraft/gametest/framework/GameTestSequence;", cancellable = true)
    private void thenWaitAtLeast_1194889319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1194889319L))
            info.setReturnValue(null);
    }


}
