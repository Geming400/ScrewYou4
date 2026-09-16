package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.MessageSignature.Packed.class)
public class Packed_1709533675Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_800907406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(800907406L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1815010097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1815010097L))
            info.setReturnValue("BEuk&(J9dh8h1b{}5D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2028081531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2028081531L))
            info.setReturnValue(186501373);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id__985650283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-985650283L))
            info.setReturnValue(442467260);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/network/chat/MessageSignature$Packed;)V", cancellable = true)
    private static void write__874182042(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-874182042L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/network/chat/MessageSignature$Packed;", cancellable = true)
    private static void read_45877413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(45877413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/network/chat/MessageSignatureCache;)Ljava/util/Optional;", cancellable = true)
    private void unpack_208648522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(208648522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fullSignature()Lnet/minecraft/network/chat/MessageSignature;", cancellable = true)
    private void fullSignature__1757871758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1757871758L))
            info.setReturnValue(null);
    }


}
