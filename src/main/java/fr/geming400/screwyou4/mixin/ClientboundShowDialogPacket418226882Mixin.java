package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundShowDialogPacket.class)
public class ClientboundShowDialogPacket418226882Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1260798206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1260798206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1803739141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1803739141L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__717233093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-717233093L))
            info.setReturnValue("|gaNHD:\u1BAD/.T,bt\u03258{G7@\u4635d\u7199m=tbgot?q]p58v\uCB75r([a_V2Vbi>.)\u10DAV%^D}\u8264tQ|FNV\uD50A-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_456489624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(456489624L))
            info.setReturnValue(-1768568957);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1096295795(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1096295795L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle__1042022672(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1042022672L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dialog()Lnet/minecraft/core/Holder;", cancellable = true)
    private void dialog_1967102654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1967102654L))
            info.setReturnValue(null);
    }


}
