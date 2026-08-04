package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.MessageSignature.Packed.class)
public class Packed_1709533675Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1199921363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1199921363L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_574073699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(574073699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1747796416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1747796416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_1747795920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1747795920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/network/chat/MessageSignature$Packed;)V", cancellable = true)
    private static void write__1981782393(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1981782393L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/network/chat/MessageSignature$Packed;", cancellable = true)
    private static void read__150379269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-150379269L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/network/chat/MessageSignatureCache;)Ljava/util/Optional;", cancellable = true)
    private void unpack_554492824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(554492824L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fullSignature()Lnet/minecraft/network/chat/MessageSignature;", cancellable = true)
    private void fullSignature_465048891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(465048891L))
            info.setReturnValue(null);
    }


}
