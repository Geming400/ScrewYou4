package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.ChatReport.Builder.class)
public class Builder1671712623Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/client/multiplayer/chat/report/ChatReport$Builder;", cancellable = true)
    private void copy_257069415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(257069415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/client/multiplayer/chat/report/ReportingContext;)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void build_1133829811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1133829811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toggleReported(I)V", cancellable = true)
    private void toggleReported__1409337701(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1409337701L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasContent()Z", cancellable = true)
    private void hasContent_1709991206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1709991206L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isReported(I)Z", cancellable = true)
    private void isReported__1409333857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1409333857L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "reportedMessages()Lit/unimi/dsi/fastutil/ints/IntSet;", cancellable = true)
    private void reportedMessages_1067156490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067156490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkBuildable()Lnet/minecraft/client/multiplayer/chat/report/Report$CannotBuildReason;", cancellable = true)
    private void checkBuildable__2063593941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2063593941L))
            info.setReturnValue(null);
    }


}
