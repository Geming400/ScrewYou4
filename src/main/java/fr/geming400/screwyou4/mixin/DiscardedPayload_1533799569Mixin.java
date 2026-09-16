package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.custom.DiscardedPayload.class)
public class DiscardedPayload_1533799569Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/common/custom/CustomPacketPayload$Type;", cancellable = true)
    private void type_1324996277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1324996277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_625173300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625173300L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1990744203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1990744203L))
            info.setReturnValue(",|U9\u13B2h\uFB74;P3fmz5b]%J^Cwa&NXS=\uCF0Cnh\u9A23mBnix>G>(>Gk\uD534f7p**k\u6E72[hO*K)G#CH2TZE8e");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2091151659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091151659L))
            info.setReturnValue(-828173307);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1058978318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1058978318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/resources/Identifier;I)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void codec_35871179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(35871179L))
            info.setReturnValue(null);
    }


}
