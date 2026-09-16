package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ServerboundClientInformationPacket.class)
public class ServerboundClientInformationPacket2029719886Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2109379820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2109379820L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1121093618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1121093618L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1494823885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1494823885L))
            info.setReturnValue("\u474FPHLEP'JhO)u\uA987P4Q)RjCBp0Wss'5j$9SW\u977F/@R6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1707895319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707895319L))
            info.setReturnValue(2020921096);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ServerCommonPacketListener;)V", cancellable = true)
    private void handle_504077788(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(504077788L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1734008023(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1734008023L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "information()Lnet/minecraft/server/level/ClientInformation;", cancellable = true)
    private void information__1513627286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1513627286L))
            info.setReturnValue(null);
    }


}
