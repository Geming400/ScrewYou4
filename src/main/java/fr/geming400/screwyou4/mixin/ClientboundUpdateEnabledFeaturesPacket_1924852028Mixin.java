package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.configuration.ClientboundUpdateEnabledFeaturesPacket.class)
public class ClientboundUpdateEnabledFeaturesPacket_1924852028Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_245826939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(245826939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__984603010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-984603010L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_789392052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(789392052L))
            info.setReturnValue("\"{uK#\u1D72\u02E7bGp@]&c-`G(\uFC80L\uB833J5{>h+XwG1{T.a,w\u61D6S|o4\u143A\uF91C[T\u24CD;f\u5075K_C\u5BCB9rsR:&R\u9DC55M7G9-\u029EK\uFC161Yu\uAE7AU\u2264UF7sPjwL\u6F3De}}5v\u5D5D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1963114769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1963114769L))
            info.setReturnValue(436481052);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/configuration/ClientConfigurationPacketListener;)V", cancellable = true)
    private void handle_911725841(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(911725841L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1692046356(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1692046356L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "features()Ljava/util/Set;", cancellable = true)
    private void features_95816541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(95816541L))
            info.setReturnValue(null);
    }


}
