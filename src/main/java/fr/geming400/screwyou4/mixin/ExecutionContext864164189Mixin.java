package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.ExecutionContext.class)
public class ExecutionContext864164189Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_902438928(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(902438928L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tracer()Lnet/minecraft/commands/execution/TraceCallbacks;", cancellable = true)
    private void tracer__1324494898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1324494898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tracer(Lnet/minecraft/commands/execution/TraceCallbacks;)V", cancellable = true)
    private void tracer__334482348(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-334482348L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forkLimit()I", cancellable = true)
    private void forkLimit_902426435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902426435L))
            info.setReturnValue(-1812668676);
    }

    @Inject(at = @At("HEAD"), method = "queueNext(Lnet/minecraft/commands/execution/CommandQueueEntry;)V", cancellable = true)
    private void queueNext_561987389(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(561987389L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "profiler()Lnet/minecraft/util/profiling/ProfilerFiller;", cancellable = true)
    private void profiler__1950760026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1950760026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "runCommandQueue()V", cancellable = true)
    private void runCommandQueue_902438928(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(902438928L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "queueInitialFunctionCall(Lnet/minecraft/commands/execution/ExecutionContext;Lnet/minecraft/commands/functions/InstantiatedFunction;Lnet/minecraft/commands/ExecutionCommandSource;Lnet/minecraft/commands/CommandResultCallback;)V", cancellable = true)
    private static void queueInitialFunctionCall__1587829749(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1587829749L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementCost()V", cancellable = true)
    private void incrementCost_902438928(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(902438928L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "frameControlForDepth(I)Lnet/minecraft/commands/execution/Frame$FrameControl;", cancellable = true)
    private void frameControlForDepth__1460955031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1460955031L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "discardAtDepthOrHigher(I)V", cancellable = true)
    private void discardAtDepthOrHigher_2078081161(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2078081161L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "queueInitialCommandExecution(Lnet/minecraft/commands/execution/ExecutionContext;Ljava/lang/String;Lcom/mojang/brigadier/context/ContextChain;Lnet/minecraft/commands/ExecutionCommandSource;Lnet/minecraft/commands/CommandResultCallback;)V", cancellable = true)
    private static void queueInitialCommandExecution_962446215(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(962446215L))
            info.cancel();
    }


}
