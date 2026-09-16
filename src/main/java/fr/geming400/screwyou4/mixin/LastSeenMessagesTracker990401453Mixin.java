package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.LastSeenMessagesTracker.class)
public class LastSeenMessagesTracker990401453Mixin {
        @Inject(at = @At("HEAD"), method = "offset()I", cancellable = true)
    private void offset__2081445664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2081445664L))
            info.setReturnValue(599777339);
    }

    @Inject(at = @At("HEAD"), method = "ignorePending(Lnet/minecraft/network/chat/MessageSignature;)V", cancellable = true)
    private void ignorePending__1874100183(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1874100183L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAndClearOffset()I", cancellable = true)
    private void getAndClearOffset_18982164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(18982164L))
            info.setReturnValue(-44665900);
    }

    @Inject(at = @At("HEAD"), method = "generateAndApplyUpdate()Lnet/minecraft/network/chat/LastSeenMessagesTracker$Update;", cancellable = true)
    private void generateAndApplyUpdate_1866456392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866456392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPending(Lnet/minecraft/network/chat/MessageSignature;Z)Z", cancellable = true)
    private void addPending_1912993492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1912993492L))
            info.setReturnValue(true);
    }


}
