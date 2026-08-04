package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.LastSeenMessages.Update.class)
public class Update_1000508038Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1908947000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1908947000L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__134951938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-134951938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1038770779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1038770779L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset()I", cancellable = true)
    private void offset_1038770283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1038770283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write_647014916(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(647014916L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checksum()B", cancellable = true)
    private void checksum_1038763556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1038763556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acknowledged()Ljava/util/BitSet;", cancellable = true)
    private void acknowledged_1393180830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1393180830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verifyChecksum(Lnet/minecraft/network/chat/LastSeenMessages;)Z", cancellable = true)
    private void verifyChecksum__1366293708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1366293708L))
            info.setReturnValue(null);
    }


}
