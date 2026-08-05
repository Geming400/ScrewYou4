package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.MessageSignature.class)
public class MessageSignature_1999255525Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__910200009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-910200009L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_863795053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(863795053L))
            info.setReturnValue("|9>'dAE;g6U'ጾ*=ᲪvOPXc耧)uD9:V<)CAiE`\"iJW!LaNq퍟ꘂꪐjr$b?牁鵍M=⧜%p*n䏘Xp[S:K;V");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2037517770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2037517770L))
            info.setReturnValue(999223690);
    }

    @Inject(at = @At("HEAD"), method = "bytes()[B", cancellable = true)
    private void bytes__1109877142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1109877142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/network/chat/MessageSignature;)V", cancellable = true)
    private static void write_1872615399(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1872615399L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/network/chat/MessageSignature;", cancellable = true)
    private static void read_2130311929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2130311929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verify(Lnet/minecraft/util/SignatureValidator;Lnet/minecraft/util/SignatureUpdater;)Z", cancellable = true)
    private void verify_1111645636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1111645636L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "asByteBuffer()Ljava/nio/ByteBuffer;", cancellable = true)
    private void asByteBuffer__736709864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-736709864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack(Lnet/minecraft/network/chat/MessageSignatureCache;)Lnet/minecraft/network/chat/MessageSignature$Packed;", cancellable = true)
    private void pack__771338679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-771338679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checksum()I", cancellable = true)
    private void checksum_2037517770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2037517770L))
            info.setReturnValue(999223690);
    }

    @Inject(at = @At("HEAD"), method = "describe(Lnet/minecraft/network/chat/MessageSignature;)Ljava/lang/String;", cancellable = true)
    private static void describe__198172863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-198172863L))
            info.setReturnValue("N*6]d꒧&Z i)&,)Eo䂄cT^衴%g.(Bp.ju04z`kJ>`oEjx?WzrJPmᡖ`ObrV24c& RV|-,W&m`ਾ솂LQD5UmJ)h#9n綖j둕1&]SGs");
    }


}
