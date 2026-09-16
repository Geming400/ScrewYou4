package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.LastSeenMessages.class)
public class LastSeenMessages373119815Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__535506453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-535506453L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1143543340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143543340L))
            info.setReturnValue("|pd&?SoG3v=FOcLAg\uFDFA\uC33D-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_930471906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(930471906L))
            info.setReturnValue(-843812777);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_670033415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(670033415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateSignature(Lnet/minecraft/util/SignatureUpdater$Output;)V", cancellable = true)
    private void updateSignature__1977403681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1977403681L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack(Lnet/minecraft/network/chat/MessageSignatureCache;)Lnet/minecraft/network/chat/LastSeenMessages$Packed;", cancellable = true)
    private void pack__21265487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-21265487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "computeChecksum()B", cancellable = true)
    private void computeChecksum_236119436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236119436L))
            info.setReturnValue(-27);
    }


}
