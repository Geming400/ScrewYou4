package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.LastSeenMessages.Packed.class)
public class Packed_1572120215Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_663493946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(663493946L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1952423557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1952423557L))
            info.setReturnValue("a7C\u7387aj0'*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2129472305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2129472305L))
            info.setReturnValue(1547940265);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write_143133556(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(143133556L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_1869033814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1869033814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/network/chat/MessageSignatureCache;)Ljava/util/Optional;", cancellable = true)
    private void unpack_71235062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(71235062L))
            info.setReturnValue(null);
    }


}
