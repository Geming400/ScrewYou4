package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.LastSeenMessages.Packed.class)
public class Packed_1572120215Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1337334823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1337334823L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_436660239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(436660239L))
            info.setReturnValue("TN>\"VuT/\u0308U+o}$5/\u4EB0,9uLW");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1610382956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1610382956L))
            info.setReturnValue(-2088188931);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write_1218627093(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1218627093L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries__1096510266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1096510266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/network/chat/MessageSignatureCache;)Ljava/util/Optional;", cancellable = true)
    private void unpack_417079364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(417079364L))
            info.setReturnValue(null);
    }


}
