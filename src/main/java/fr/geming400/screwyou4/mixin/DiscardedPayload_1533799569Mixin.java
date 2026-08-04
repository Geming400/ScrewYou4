package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.custom.DiscardedPayload.class)
public class DiscardedPayload_1533799569Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/common/custom/CustomPacketPayload$Type;", cancellable = true)
    private void type__782795217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-782795217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1375655469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1375655469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_398339593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(398339593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1572062310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1572062310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__909266985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-909266985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/resources/Identifier;I)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void codec_234591029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(234591029L))
            info.setReturnValue(null);
    }


}
