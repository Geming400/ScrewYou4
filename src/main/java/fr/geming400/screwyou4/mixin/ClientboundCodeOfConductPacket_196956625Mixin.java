package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.configuration.ClientboundCodeOfConductPacket.class)
public class ClientboundCodeOfConductPacket_196956625Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_352824214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(352824214L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__711669644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711669644L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_967380149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967380149L))
            info.setReturnValue("_iYif#T_ZkkY')G^f ,\"K;;sg9c,\uD000PJez<;`I@\uB1C2\u3CC6)j\u081AUHo.d'0 \u4C9A_<@\u7873:*Zk@\u954A\u0734BB");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_754308715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(754308715L))
            info.setReturnValue(1481359946);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__98755239(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-98755239L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/configuration/ClientConfigurationPacketListener;)V", cancellable = true)
    private void handle_694876286(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(694876286L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codeOfConduct()Ljava/lang/String;", cancellable = true)
    private void codeOfConduct__1140580007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1140580007L))
            info.setReturnValue("-S\uA926`1$");
    }


}
