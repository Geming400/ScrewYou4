package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.GameNarrator.class)
public class GameNarrator123964879Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear__661862827(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-661862827L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "destroy()V", cancellable = true)
    private void destroy__1243684664(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1243684664L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isActive()Z", cancellable = true)
    private void isActive_1904555190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904555190L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sayChatQueued(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void sayChatQueued_1461543584(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1461543584L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkStatus(Z)V", cancellable = true)
    private void checkStatus__1793031130(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1793031130L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saySystemChatQueued(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void saySystemChatQueued__1018852367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1018852367L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saySystemNow(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void saySystemNow__341693030(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-341693030L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saySystemNow(Ljava/lang/String;)V", cancellable = true)
    private void saySystemNow__1564431728(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1564431728L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saySystemQueued(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void saySystemQueued__1156520087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1156520087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateNarratorStatus(Lnet/minecraft/client/NarratorStatus;)V", cancellable = true)
    private void updateNarratorStatus__1907571790(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1907571790L))
            info.cancel();
    }


}
