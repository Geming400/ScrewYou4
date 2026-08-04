package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundDisconnectPacket.class)
public class ClientboundDisconnectPacket1691042233Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_12017145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(12017145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1218412804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1218412804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_555582258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(555582258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1729304975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1729304975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reason()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void reason__485866932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-485866932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1925856150(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1925856150L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle_230792679(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(230792679L))
            info.cancel();
    }


}
