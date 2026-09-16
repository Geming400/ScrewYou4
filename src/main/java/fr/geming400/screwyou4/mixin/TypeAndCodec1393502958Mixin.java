package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.custom.CustomPacketPayload.TypeAndCodec.class)
public class TypeAndCodec1393502958Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/common/custom/CustomPacketPayload$Type;", cancellable = true)
    private void type_1184699667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184699667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_484876690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484876690L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2131040813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2131040813L))
            info.setReturnValue("tnJ(#0\uD24F^\u45BAJL:[As!GhD@!J\u20A9DPxp*04D,\uAE459{X<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1950855049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1950855049L))
            info.setReturnValue(1852426089);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void codec__2062443436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2062443436L))
            info.setReturnValue(null);
    }


}
