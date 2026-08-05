package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.LastSeenMessages.class)
public class LastSeenMessages373119815Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1758632074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758632074L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__762340160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-762340160L))
            info.setReturnValue("ia;\u5380EY\u1DD36DL&<v\u4977TA4\u3094\u313CTN\uC832iMLr8?#Mk:3[#Sv<lZNtp6!W8]FMx$b.A1GPV(Vh;QO\"Gu^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_411382557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411382557L))
            info.setReturnValue(833782022);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_1999456631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1999456631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateSignature(Lnet/minecraft/util/SignatureUpdater$Output;)V", cancellable = true)
    private void updateSignature__1140240146(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1140240146L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack(Lnet/minecraft/network/chat/MessageSignatureCache;)Lnet/minecraft/network/chat/LastSeenMessages$Packed;", cancellable = true)
    private void pack_1862342872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1862342872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "computeChecksum()B", cancellable = true)
    private void computeChecksum_411375334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411375334L))
            info.setReturnValue(92);
    }


}
