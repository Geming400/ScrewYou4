package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.configuration.ClientboundCodeOfConductPacket.class)
public class ClientboundCodeOfConductPacket_196956625Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1482068464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1482068464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1582468883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1582468883L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__938503351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-938503351L))
            info.setReturnValue("'Y]q)^d?1m;w3tOw>w\uC30F9x-/3\u30E57\uB73C!{Zu^VmF");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_235219366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235219366L))
            info.setReturnValue(-1482510619);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_875025537(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(875025537L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/configuration/ClientConfigurationPacketListener;)V", cancellable = true)
    private void handle__816169562(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-816169562L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codeOfConduct()Ljava/lang/String;", cancellable = true)
    private void codeOfConduct__938503847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-938503847L))
            info.setReturnValue("Z?.!+7V<ie+c!`+x\u7A9Delro4Qu;h&\uD6B3*m\u96F0XV$;AL|y0alhp");
    }


}
