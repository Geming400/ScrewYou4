package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.GuiMessageTag.class)
public class GuiMessageTag_841609680Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2067845358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2067845358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__293850296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-293850296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_879872421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(879872421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "system()Lnet/minecraft/client/multiplayer/chat/GuiMessageTag;", cancellable = true)
    private static void system_281102095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281102095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "text()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void text__1335299486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1335299486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "systemSinglePlayer()Lnet/minecraft/client/multiplayer/chat/GuiMessageTag;", cancellable = true)
    private static void systemSinglePlayer_281102095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281102095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "icon()Lnet/minecraft/client/multiplayer/chat/GuiMessageTag$Icon;", cancellable = true)
    private void icon_1382319868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1382319868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "logTag()Ljava/lang/String;", cancellable = true)
    private void logTag__293850792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-293850792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "indicatorColor()I", cancellable = true)
    private void indicatorColor_879871925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(879871925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatNotSecure()Lnet/minecraft/client/multiplayer/chat/GuiMessageTag;", cancellable = true)
    private static void chatNotSecure_281102095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281102095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatModified(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/chat/GuiMessageTag;", cancellable = true)
    private static void chatModified_102617625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(102617625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatError()Lnet/minecraft/client/multiplayer/chat/GuiMessageTag;", cancellable = true)
    private static void chatError_281102095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281102095L))
            info.setReturnValue(null);
    }


}
