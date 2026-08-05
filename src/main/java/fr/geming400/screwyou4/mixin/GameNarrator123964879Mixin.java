package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.GameNarrator.class)
public class GameNarrator123964879Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_162239618(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(162239618L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "destroy()V", cancellable = true)
    private void destroy_162239618(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(162239618L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isActive()Z", cancellable = true)
    private void isActive_162243462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(162243462L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sayChatQueued(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void sayChatQueued__1777214058(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1777214058L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saySystemQueued(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void saySystemQueued__1777214058(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1777214058L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saySystemChatQueued(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void saySystemChatQueued__1777214058(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1777214058L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saySystemNow(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void saySystemNow__1777214058(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1777214058L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saySystemNow(Ljava/lang/String;)V", cancellable = true)
    private void saySystemNow_1276326028(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1276326028L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateNarratorStatus(Lnet/minecraft/client/NarratorStatus;)V", cancellable = true)
    private void updateNarratorStatus_1638097710(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1638097710L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkStatus(Z)V", cancellable = true)
    private void checkStatus_1353581708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1353581708L))
            info.cancel();
    }


}
