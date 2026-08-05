package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.LastSeenMessagesValidator.class)
public class LastSeenMessagesValidator_980130425Mixin {
        @Inject(at = @At("HEAD"), method = "applyUpdate(Lnet/minecraft/network/chat/LastSeenMessages$Update;)Lnet/minecraft/network/chat/LastSeenMessages;", cancellable = true)
    private void applyUpdate_566460222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566460222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyOffset(I)V", cancellable = true)
    private void applyOffset__2100919900(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2100919900L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trackedMessagesCount()I", cancellable = true)
    private void trackedMessagesCount_1018392670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018392670L))
            info.setReturnValue(-190726548);
    }

    @Inject(at = @At("HEAD"), method = "addPending(Lnet/minecraft/network/chat/MessageSignature;)V", cancellable = true)
    private void addPending_1161393871(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1161393871L))
            info.cancel();
    }


}
