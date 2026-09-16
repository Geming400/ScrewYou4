package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.ExecutionContext.class)
public class ExecutionContext864164189Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1250411240(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1250411240L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "queueNext(Lnet/minecraft/commands/execution/CommandQueueEntry;)V", cancellable = true)
    private void queueNext_309905433(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(309905433L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forkLimit()I", cancellable = true)
    private void forkLimit_1355423434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355423434L))
            info.setReturnValue(-1041632119);
    }

    @Inject(at = @At("HEAD"), method = "tracer()Lnet/minecraft/commands/execution/TraceCallbacks;", cancellable = true)
    private void tracer__1465885151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1465885151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tracer(Lnet/minecraft/commands/execution/TraceCallbacks;)V", cancellable = true)
    private void tracer__422612895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-422612895L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "profiler()Lnet/minecraft/util/profiling/ProfilerFiller;", cancellable = true)
    private void profiler_1628875485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1628875485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "queueInitialCommandExecution(Lnet/minecraft/commands/execution/ExecutionContext;Ljava/lang/String;Lcom/mojang/brigadier/context/ContextChain;Lnet/minecraft/commands/ExecutionCommandSource;Lnet/minecraft/commands/CommandResultCallback;)V", cancellable = true)
    private static void queueInitialCommandExecution_572799655(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(572799655L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runCommandQueue()V", cancellable = true)
    private void runCommandQueue__449449985(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-449449985L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "discardAtDepthOrHigher(I)V", cancellable = true)
    private void discardAtDepthOrHigher__1547090675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1547090675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementCost()V", cancellable = true)
    private void incrementCost_2123516340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2123516340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "queueInitialFunctionCall(Lnet/minecraft/commands/execution/ExecutionContext;Lnet/minecraft/commands/functions/InstantiatedFunction;Lnet/minecraft/commands/ExecutionCommandSource;Lnet/minecraft/commands/CommandResultCallback;)V", cancellable = true)
    private static void queueInitialFunctionCall__300343948(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-300343948L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "frameControlForDepth(I)Lnet/minecraft/commands/execution/Frame$FrameControl;", cancellable = true)
    private void frameControlForDepth__1165816141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1165816141L))
            info.setReturnValue(null);
    }


}
