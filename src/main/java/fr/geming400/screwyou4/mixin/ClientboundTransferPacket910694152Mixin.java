package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundTransferPacket.class)
public class ClientboundTransferPacket910694152Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1066561742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1066561742L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2067884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2067884L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1681117677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681117677L))
            info.setReturnValue("_(te&p;l'<T4\uC5A2&G5Q !9o]V\u3468=b\u59C4RcGzG l*6p&h9lFR,\u2D67*}lr\uC4DB?a\u5BACU9tJ67dBS>0NW]$Q@zW&#?i|]HWHPUc\u6218;= \uBEAEx#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1468046243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1468046243L))
            info.setReturnValue(1747456124);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle_660637710(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(660637710L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_614982289(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(614982289L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "port()I", cancellable = true)
    private void port_1973124365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1973124365L))
            info.setReturnValue(545942113);
    }

    @Inject(at = @At("HEAD"), method = "host()Ljava/lang/String;", cancellable = true)
    private void host__687727047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-687727047L))
            info.setReturnValue("\uB246z<1\uB77502>Wq&\u4BA0v;:Paa9LVr,9@IT");
    }


}
