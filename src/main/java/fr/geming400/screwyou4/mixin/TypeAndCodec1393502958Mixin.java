package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.custom.CustomPacketPayload.TypeAndCodec.class)
public class TypeAndCodec1393502958Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/common/custom/CustomPacketPayload$Type;", cancellable = true)
    private void type__923091827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-923091827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1515952079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1515952079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_258042983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(258042983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1431765700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1431765700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void codec__1640464214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1640464214L))
            info.setReturnValue(null);
    }


}
