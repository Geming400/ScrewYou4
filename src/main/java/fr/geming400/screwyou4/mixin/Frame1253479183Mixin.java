package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.Frame.class)
public class Frame1253479183Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1655975854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1655975854L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_118019208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(118019208L))
            info.setReturnValue("5Hj<嵨A|");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1291741925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1291741925L))
            info.setReturnValue(-2110364188);
    }

    @Inject(at = @At("HEAD"), method = "depth()I", cancellable = true)
    private void depth_1291741429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1291741429L))
            info.setReturnValue(-1907216769);
    }

    @Inject(at = @At("HEAD"), method = "returnSuccess(I)V", cancellable = true)
    private void returnSuccess__1827571141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1827571141L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "returnFailure()V", cancellable = true)
    private void returnFailure_1291753922(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1291753922L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "returnValueConsumer()Lnet/minecraft/commands/CommandResultCallback;", cancellable = true)
    private void returnValueConsumer_1334684643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1334684643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "frameControl()Lnet/minecraft/commands/execution/Frame$FrameControl;", cancellable = true)
    private void frameControl__486585310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-486585310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "discard()V", cancellable = true)
    private void discard_1291753922(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1291753922L))
            info.cancel();
    }


}
