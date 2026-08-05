package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.LastSeenMessages.Update.class)
public class Update_1000508038Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_91881769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(91881769L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1770931562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1770931562L))
            info.setReturnValue("if TuK\\");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1557860128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1557860128L))
            info.setReturnValue(362405125);
    }

    @Inject(at = @At("HEAD"), method = "offset()I", cancellable = true)
    private void offset__2071339080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2071339080L))
            info.setReturnValue(861326346);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write__428478621(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-428478621L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checksum()B", cancellable = true)
    private void checksum_1532828609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1532828609L))
            info.setReturnValue(-105);
    }

    @Inject(at = @At("HEAD"), method = "acknowledged()Ljava/util/BitSet;", cancellable = true)
    private void acknowledged_321850342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(321850342L))
            info.setReturnValue(new java.util.BitSet());
    }

    @Inject(at = @At("HEAD"), method = "verifyChecksum(Lnet/minecraft/network/chat/LastSeenMessages;)Z", cancellable = true)
    private void verifyChecksum_2109117456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109117456L))
            info.setReturnValue(false);
    }


}
