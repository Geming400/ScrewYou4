package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.Frame.class)
public class Frame1253479183Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_344852915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(344852915L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2023902708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2023902708L))
            info.setReturnValue(".5438r`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1810831274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1810831274L))
            info.setReturnValue(1455355182);
    }

    @Inject(at = @At("HEAD"), method = "depth()I", cancellable = true)
    private void depth_1425858578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1425858578L))
            info.setReturnValue(2026385296);
    }

    @Inject(at = @At("HEAD"), method = "discard()V", cancellable = true)
    private void discard_153240548(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(153240548L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "frameControl()Lnet/minecraft/commands/execution/Frame$FrameControl;", cancellable = true)
    private void frameControl_416887538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(416887538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "returnValueConsumer()Lnet/minecraft/commands/CommandResultCallback;", cancellable = true)
    private void returnValueConsumer_50211162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(50211162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "returnSuccess(I)V", cancellable = true)
    private void returnSuccess_1044073646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1044073646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "returnFailure()V", cancellable = true)
    private void returnFailure__93513784(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-93513784L))
            info.cancel();
    }


}
