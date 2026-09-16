package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.LastSeenMessagesValidator.class)
public class LastSeenMessagesValidator_980130425Mixin {
        @Inject(at = @At("HEAD"), method = "addPending(Lnet/minecraft/network/chat/MessageSignature;)V", cancellable = true)
    private void addPending_454311685(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(454311685L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trackedMessagesCount()I", cancellable = true)
    private void trackedMessagesCount__882967579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882967579L))
            info.setReturnValue(-684939414);
    }

    @Inject(at = @At("HEAD"), method = "applyOffset(I)V", cancellable = true)
    private void applyOffset__1349644667(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1349644667L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyUpdate(Lnet/minecraft/network/chat/LastSeenMessages$Update;)Lnet/minecraft/network/chat/LastSeenMessages;", cancellable = true)
    private void applyUpdate_736265159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(736265159L))
            info.setReturnValue(null);
    }


}
