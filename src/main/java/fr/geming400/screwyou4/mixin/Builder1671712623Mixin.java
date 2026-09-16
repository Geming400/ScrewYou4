package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.ChatReport.Builder.class)
public class Builder1671712623Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/client/multiplayer/chat/report/ChatReport$Builder;", cancellable = true)
    private void copy__864195822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864195822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/client/multiplayer/chat/report/ReportingContext;)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void build_352318113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(352318113L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isReported(I)Z", cancellable = true)
    private void isReported__1954641924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1954641924L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasContent()Z", cancellable = true)
    private void hasContent__689708025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-689708025L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toggleReported(I)V", cancellable = true)
    private void toggleReported__210496094(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-210496094L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkBuildable()Lnet/minecraft/client/multiplayer/chat/report/Report$CannotBuildReason;", cancellable = true)
    private void checkBuildable_1547014539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1547014539L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reportedMessages()Lit/unimi/dsi/fastutil/ints/IntSet;", cancellable = true)
    private void reportedMessages__1789320213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1789320213L))
            info.setReturnValue(null);
    }


}
