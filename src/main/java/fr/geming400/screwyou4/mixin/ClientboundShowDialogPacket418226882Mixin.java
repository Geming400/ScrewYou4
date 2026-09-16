package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundShowDialogPacket.class)
public class ClientboundShowDialogPacket418226882Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_574094472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(574094472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__490399386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-490399386L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1188650407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1188650407L))
            info.setReturnValue("!R\uBE724\u90E1K5xCP0r(oYV7\u4B5D<2L*4\uA279w5 SpSt\"?{dQZ]^6{8F(GU; &\u3D07");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_975578973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(975578973L))
            info.setReturnValue(156507361);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_122515019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(122515019L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle_168170440(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(168170440L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dialog()Lnet/minecraft/core/Holder;", cancellable = true)
    private void dialog__298322826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-298322826L))
            info.setReturnValue(null);
    }


}
