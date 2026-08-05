package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.LastSeenMessagesTracker.class)
public class LastSeenMessagesTracker990401453Mixin {
        @Inject(at = @At("HEAD"), method = "offset()I", cancellable = true)
    private void offset_1028663699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1028663699L))
            info.setReturnValue(509656562);
    }

    @Inject(at = @At("HEAD"), method = "getAndClearOffset()I", cancellable = true)
    private void getAndClearOffset_1028663699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1028663699L))
            info.setReturnValue(509656562);
    }

    @Inject(at = @At("HEAD"), method = "generateAndApplyUpdate()Lnet/minecraft/network/chat/LastSeenMessagesTracker$Update;", cancellable = true)
    private void generateAndApplyUpdate_1854641213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1854641213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPending(Lnet/minecraft/network/chat/MessageSignature;Z)Z", cancellable = true)
    private void addPending__1937262518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1937262518L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "ignorePending(Lnet/minecraft/network/chat/MessageSignature;)V", cancellable = true)
    private void ignorePending_1171664900(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1171664900L))
            info.cancel();
    }


}
