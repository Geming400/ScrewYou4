package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundTabListPacket.class)
public class ClientboundTabListPacket1891381434Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_2047249024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2047249024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_982755166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(982755166L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1633162337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1633162337L))
            info.setReturnValue("RO0>O8n\u8EADW\u8EB7d\u698A\uA8FCeTw9sh#4-2*F_;_qQA7ihF\u39BB>P}$\uC3A3b\u4D63E=:D[L\uA60E\uC23Ec`+JTxu -)o8;(6OV>*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1846233771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1846233771L))
            info.setReturnValue(-1721178265);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1595669571(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1595669571L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_299903840(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(299903840L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "header()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void header_1845466010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1845466010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "footer()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void footer_1606792488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1606792488L))
            info.setReturnValue(null);
    }


}
