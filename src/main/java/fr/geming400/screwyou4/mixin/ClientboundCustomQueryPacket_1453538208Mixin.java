package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.ClientboundCustomQueryPacket.class)
public class ClientboundCustomQueryPacket_1453538208Mixin {
        @Inject(at = @At("HEAD"), method = "payload()Lnet/minecraft/network/protocol/login/custom/CustomQueryPayload;", cancellable = true)
    private void payload__567071282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-567071282L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1609405797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1609405797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_544911939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(544911939L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2071005564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2071005564L))
            info.setReturnValue("\u59653 ^]=vPyu6k$\u84E2u|&\uBEF7\uB2C9(O\uC21C`2\u34E8Jc3&)deh<\"zV 4P\u300Ahn*J:tVq\u4130 \u8A23H_6}]S\u6679>m\u9600$CUF[,iK");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2010890298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2010890298L))
            info.setReturnValue(-1059775111);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1157826344(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1157826344L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/login/ClientLoginPacketListener;)V", cancellable = true)
    private void handle__2010620889(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2010620889L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "transactionId()I", cancellable = true)
    private void transactionId__1851102068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1851102068L))
            info.setReturnValue(-280755821);
    }


}
