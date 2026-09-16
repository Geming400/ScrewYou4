package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.MessageSignature.class)
public class MessageSignature_1999255525Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1090628760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1090628760L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1525288743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1525288743L))
            info.setReturnValue("BM\u0735^\u4933#e%X40gi\"^Q,G^}C\"$ra\u4200\u53ADp\u8D74<k%LYSS");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1738360177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1738360177L))
            info.setReturnValue(1340454216);
    }

    @Inject(at = @At("HEAD"), method = "bytes()[B", cancellable = true)
    private void bytes_576791189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(576791189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/network/chat/MessageSignature;)V", cancellable = true)
    private static void write__865976088(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-865976088L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/network/chat/MessageSignature;", cancellable = true)
    private static void read__2043034993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2043034993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verify(Lnet/minecraft/util/SignatureValidator;Lnet/minecraft/util/SignatureUpdater;)Z", cancellable = true)
    private void verify__379715989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-379715989L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "asByteBuffer()Ljava/nio/ByteBuffer;", cancellable = true)
    private void asByteBuffer_865229598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(865229598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack(Lnet/minecraft/network/chat/MessageSignatureCache;)Lnet/minecraft/network/chat/MessageSignature$Packed;", cancellable = true)
    private void pack_1640020258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1640020258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checksum()I", cancellable = true)
    private void checksum__1763384473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1763384473L))
            info.setReturnValue(1979406345);
    }

    @Inject(at = @At("HEAD"), method = "describe(Lnet/minecraft/network/chat/MessageSignature;)Ljava/lang/String;", cancellable = true)
    private static void describe__165492586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-165492586L))
            info.setReturnValue("o@/F)^6#Jd\u95E5lsuz9 Z6\u2C3Cis$0M^P}\u062CcR.\u20B7");
    }


}
